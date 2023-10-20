---
title: JS Itunes API
comments: true
layout: default
description: API's are a primary source for obtaining data from the internet.  There is imformation in API's for almost any interest.
permalink: /frontend/home_table 
categories: [C7.0]
courses: { csa: {week: 3} }
type: hacks
---

<style>
  .text > tr {
    font-size: 18px;
    border-bottom: 1px solid green;
  }
</style>
<!-- Input box and button for filter -->
<div>
  <input type="text" id="filterInput" placeholder="Enter iTunes filter" style="border-radius: 11px; height: 30px; width: 260px; font-size: 16px">
  <!-- <button onclick="fetchData()">Search</button> -->
</div>

<!-- HTML table fragment for page -->
<table>
  <thead>
    <tr>
      <th>Album</th>
      <th>Artist</th>
      <th>Track</th>
      <th>Images</th>
      <th>Preview</th>
    </tr>
  </thead>
  <tbody id="result" class="text">
    <!-- generated rows -->
  </tbody>
</table>

<!-- Script is laid out in a sequence (no function) and will execute when the page is loaded -->
<script>
  // prepare HTML result container for new output
  const resultContainer = document.getElementById("result");

  // function to fetch data based on user input
  function fetchData() {
    // clear previous results
    resultContainer.innerHTML = "";

    // get user input
    const filterInput = document.getElementById("filterInput");
    const filter = filterInput.value;

    // prepare fetch options
    const url = "https://itunes.apple.com/search?term=" + encodeURIComponent(filter);
    const headers = {
      method: 'GET',
      mode: 'cors',
      cache: 'default',
      credentials: 'omit',
      headers: {
        'Content-Type': 'application/json'
      },
    };

    // fetch the API
    fetch(url, headers)
      .then(response => {
        // check for response errors
        if (response.status !== 200) {
          const errorMsg = 'Database response error: ' + response.status;
          console.log(errorMsg);
          const tr = document.createElement("tr");
          const td = document.createElement("td");
          td.innerHTML = errorMsg;
          tr.appendChild(td);
          resultContainer.appendChild(tr);
          return;
        }
        // valid response will have JSON data
        response.json().then(data => {
          console.log(data);

          // Music data
        for (const row of data.results) {
            row.likes = 0
            console.log(row);
            meedia.push(row)

            // tr for each row
            const tr = document.createElement("tr");
            // td for each column
            const album = document.createElement("td");
            const artist = document.createElement("td");
            const track = document.createElement("td");
            const image = document.createElement("td");
            const preview = document.createElement("td");
            const buttonn = document.createElement("td");

            // data is specific to the API
            if (row.collectionName){
              album.innerHTML = row.collectionName;
            } else {
              album.innerHTML = "";
            }
            artist.innerHTML = row.artistName;
            track.innerHTML = row.trackName; 
            // create preview image
            const img = document.createElement("img");
            img.src = row.artworkUrl100;
            image.appendChild(img);
            // create preview player
            const audio = document.createElement("audio");
            audio.controls = true;
            const source = document.createElement("source");
            source.src = row.previewUrl;
            source.type = "audio/mp4";
            audio.appendChild(source);
            preview.appendChild(audio);

            var updateBtn = document.createElement('input');
            updateBtn.type = "image";
            updateBtn.className = "button";
            updateBtn.src = "https://athriius.github.io/FreeMoviesHindiDub/images/like.png"
            updateBtn.style = "width: 30px; height: 30px";
            updateBtn.onclick =  function () {
              addLike(row.trackId);
            };
            buttonn.appendChild(updateBtn);

            // this builds td's into tr
            tr.appendChild(album);
            tr.appendChild(artist);
            tr.appendChild(track);
            tr.appendChild(image);
            tr.appendChild(preview);
            tr.appendChild(buttonn)

            // add HTML to container
            resultContainer.appendChild(tr);
          }
        })
      })
      .catch(err => {
        console.error(err);
        const tr = document.createElement("tr");
        const td = document.createElement("td");
        td.innerHTML = err;
        tr.appendChild(td);
        resultContainer.appendChild(tr);
      });
  }
</script>
<script>
  let meedia = []
  document.getElementById("filterInput").addEventListener("keypress", function(event) {
    if (event.key === "Enter") {
        fetchData();
    } 
  });
  function addLike(value) {
        for (var i=0;i<meedia.length;i+=1) {
            if (meedia[i].trackId === value) {
                meedia[i].likes += 1
                console.log("Likes: " + meedia[i].likes)
            }
        }
    }
</script>
