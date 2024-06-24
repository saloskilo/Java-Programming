package Lecture6;

public class Assignment {
    public static void main(String[] args) {
        // butterfly pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------");
        // Rhombus
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("---------------------");

        // Diamond shape
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------");
        // Hollow Rhombus
        for (int i = 1 ; i <= 5; i++ ) {
			for (int j = 1 ; j <= 5 - i; j++ ) 
			{
				System.out.print(" ");
			}
			for (int k = 1 ; k <= 5; k++ ) 
			{
				if (i == 1 || i == 5 || k == 1 || k == 5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
        System.out.println("---------------------");
        // Print half Pyramid 
        for (int i = 1; i <=5; i++) {
    for (int j = 5; j >=i  ;j--) {
        
        System.out.print(" ");
    }
    for (int j = 1; j<=i  ;j++) {
        
        System.out.print(j+ " ");
    }
   System.out.println(); 
}
       System.out.println("---------------------");

}

}
