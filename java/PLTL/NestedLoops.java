/*
 * 
 * Names:
 * Eric Barba
 * Joaquin Moya
 * Grecia Luna
 * Lany Cortez
 * Adan Ruiz
 * 
 */

 
public class NestedLoops{
    public static void main(String[] args){
        
        System.out.println("Nested Loops:");

        for(int i = 1; i<= 5; i++){

            for(int j = 1; j <= i; j++){
            System.out.print(j + " ");
            }
            System.out.println("");
        }

        System.out.println("-----------------------------");

        for(int i = 1; i<= 5; i++){

            for(int j = 5; j >= i; j--){
            System.out.print(i + " ");
            }
            System.out.println("");
        }

        System.out.println("-----------------------------");

        for(int i = 5; i>= 1; i--){

            for(int j = 1; j <= i; j++){
            System.out.print(i + " ");
            }
            System.out.println("");
        }  

        System.out.println("-----------------------------");

        for(int i = 5; i>= 1; i--){

            for(int j = 1; j <= i; j++){
            System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}