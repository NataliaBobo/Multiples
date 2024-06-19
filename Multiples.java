//Write a Java program to display all the multiples of 2, 3 and 7 within the range 71 to 150.

public class MultiplesFindings {
    public static void main(String[] args) {
        int begin= 71;
        int end = 150;

        System.out.println("Multiples of 2, 3, and 7 between " + begin + " and " + end + ":");
//request user to display multiples of 2 
        System.out.println("\nMultiples of 2:");
//Use of for... If statement 
        for (int i = begin ; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
//request user to display multiples of 3

        System.out.println("\nMultiples of 3:");
        for (int i = begin; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
//request user to display multiples of 7
        System.out.println("\nMultiple of 7:");
//the use of for... If statement
        for (int i = begin; i <= end; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
