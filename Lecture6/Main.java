package Lecture6;
// advance star pattern 
public class Main {
    public static void main(String[] args){

         // butterfly pattern

        //  upper portion 
         for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 4; j >=i; j--) {
                System.out.print(" ");
            }
            for (int j = 4; j>=i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower portion 
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >=i; j--) {
                System.out.print("*");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++) {
                System.out.print(" ");
            }
            for (int j = 4; j >=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("---------------------");

        // Rhombus 
        for(int i=1;i<=5;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             for(int j=4;j>=i;j--){
                System.out.print("*");
            }
             for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
