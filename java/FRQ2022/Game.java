public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;

    /** Postcondition: All instance variables have been initialized */
    public Game() {
        levelOne = new Level();      // ChatGPT told me to do this :)
        levelTwo = new Level();     // ChatGPT told me to do this :)
        levelThree = new Level();  // ChatGPT told me to do this :)
        levelOne.setCompleted(false);
        levelTwo.setCompleted(false);
        levelThree.setCompleted(false);
        levelOne.setPoints(200);
        levelTwo.setPoints(100);
        levelThree.setPoints(500);
    }

    /** Returns true if this game is a bonus game and returns false otherwise */
    public boolean isBonus() {
        int min = 1;
        int max = 2;
        int randomInt = (int) (Math.random() * (max - min + 1)) + min;
        if (randomInt == 1) {
            return true;
        } else {return false;}
    }

    /** simulates the plat of this game (consisting of three levels) and updates all relevent game data */
    public void play() {
        int randomInt1 = (int) (Math.random() * (2 - 1 + 1)) + 1;  /* level one is a 50/50 chance of winning */
        if (randomInt1 == 1) {
            levelOne.setCompleted(true);
            int randomInt2 = (int) (Math.random() * (3 - 1 + 1)) + 1; /* the chance lowers as the levels go on */
            if (randomInt2 == 1) {
                levelTwo.setCompleted(true);
                int randomInt3 = (int) (Math.random() * (4 - 1 + 1)) + 1;
                if (randomInt3 == 1) {
                    levelThree.setCompleted(true);
                } else {levelThree.setCompleted(false);}
            } else {levelTwo.setCompleted(false);}
        } else {levelOne.setCompleted(false);}
    }

    /** Returns the score earned in the most recently played game, as described in part (a) */
    public int getScore() {
        int score = 0; 
        if (levelOne.goalReached() == true) {
            score = levelOne.getPoints() + score;
        }
        if (levelOne.goalReached() == true && levelTwo.goalReached() == true) {  /* level 2 points only if level one and two completed */
            score = levelTwo.getPoints() + score;
        }
        if (levelOne.goalReached() == true && levelTwo.goalReached() == true && levelThree.goalReached() == true) {  /* level 3 points only if level one, two and three completed */
            score = levelThree.getPoints() + score;     /* ChatGPT recommended using if statements inside if statements for this code, so thhe code didn't repeat */
        } 
        if (isBonus() == true) {
            score = score * 3;  /* bonus game multiplies score by 3 */
        }
        return score;
    }
    /** Simulates the play of the nunm games and returns the highest score eanred, as described in part (b)
     * Precondition: num > 0
     */
    public int playManyTimes(int num){
        int i = 0;
        int scroes = 0;  /* placeholder for the biggest score */
        int scoreDisp = 0;
        while (i < num) {  /* loop as many times as argument */
            play();
            scoreDisp = getScore();
            if (scoreDisp > scroes) {  /* checks if the newest score is bigger than the previous score */
                scroes = scoreDisp;
            }
            i++;
        }
        return scroes;
    }

    public static void main(String[] args) {
        Game game = new Game();    // ChatGPT told me to do this :)
        game.play();
        int scorePrtin = game.getScore();
        int highestScore = game.playManyTimes(5);
        System.out.println("Single play:");
        System.out.println(scorePrtin);
        System.out.println("5 plays:");
        System.out.println(highestScore);
        
    }  //ChatGPT is my new friend

    // There may be instance variables, constructors, and methods that are not shown.
}