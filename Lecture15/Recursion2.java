package Lecture15;
public class Recursion2 {



    // towerOfHanoi 
    public static void towerofHanoi(int n, String Src, String Helper, String Dest) {

        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + Src + " to " + Dest);
            return;
        }

        towerofHanoi(n - 1, Src, Dest, Helper);
        System.out.println("transfer disk " + n + " from " + Src + " to " + Dest);

        towerofHanoi(n - 1, Helper, Src, Dest);

    }


    // reverse a string
    public static void reverseString(String str,int idx){

        if (idx==0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        reverseString(str, idx-1);
    }




    public static void main(String[] args) {
        // int n = 3;
        // towerofHanoi(n, "Src", "helper", "des");

        // String str="abcdefg";
        // reverseString(str,str.length()-1);

    }
}

