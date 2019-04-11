import javax.swing.text.StringContent;

public class Main {

    public static void main(String[] args) {

        // Call your methods here
        System.out.println("10,000 at 2% interest = " + calculateInteres(10000.0, 2.0));
        System.out.println("10,000 at 2% interest = " + calculateInteres(10000.0, 3.0));
        System.out.println("10,000 at 2% interest = " + calculateInteres(10000.0, 4.0));
        System.out.println("10,000 at 2% interest = " + calculateInteres(10000.0, 5.0));

        // In order for your to have a bunch of code
        // You can use for loop
        /*
        for(init, termination,increment){}
         */

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop" + i + " Hello! ");
        }

        // using the for statement, call the calculateInterest method
        // The amount of 10000 with an interestRate of 2,3,4,5,6,7 and 8
        // and print the results to the console window.
        System.out.println("************************************************");

        // loop To go forward
        for (int i = 2; i < 9; i++) {
            // System.out.println(" 10.000 " + i + " % interest = " + calculateInteres(10000.0, i));
            // to avoid the decimal multiple zero you can use the "String.format"
            System.out.println("10,0000 at " + i + "% interest = " + String.format("%.2f", calculateInteres(10000.0, i)));
        }


        System.out.println("******************************************************************");


        // How to do the verse loop instead of 2 to 8 , it will switch on 8 to 2

        // Loop to go back word "The key is the condition >= "
        for (int i = 8; i >= 2; i--) {

            System.out.println("10,0000 at " + i + "% interest = " + String.format("%.2f", calculateInteres(10000.0, i)));
        }


    }

    // Overloading Methods
    public static double calculateInteres(double amount, double interesRate) {
        return (amount * (interesRate / 100));
    }


}
