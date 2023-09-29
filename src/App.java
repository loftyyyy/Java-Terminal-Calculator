import java.util.Scanner;
public class App{
    public static void main(String[] args){
        // int a, b, num;
        Scanner input = new Scanner(System.in);

        // System.out.println("Initial input: ");
        // a = input.nextInt();
        // System.out.println("Final number: ");
        // b = input.nextInt();

        // num = a * b;
        
        // if (num < 100) {
        //    System.out.println("The output is lesser than 100, since the output is : " + num); 
        // } else {
        //    System.out.println("The outut is greater than 100, since the output is : " + num); 
        // } 
        
        
        // Prints if x is odd or even
        // int x;
        
        // for(x = 0; x < 100; x++){
        //     if (x == 0) {
        //         continue;
        //     }else if(x % 2 == 0) {
        //         System.out.println(x + " is even");
        //     }
        //     else {
        //        System.out.println(x + " is odd"); 
        //     }    
        // }

        //addition-subtraction calculator
        String x;
        System.out.println("\r\n" + //
                "   ____      _            _       _             \r\n" + //
                "  / ___|__ _| | ___ _   _| | __ _| |_ ___  _ __ \r\n" + //
                " | |   / _` | |/ __| | | | |/ _` | __/ _ \\| '__|\r\n" + //
                " | |__| (_| | | (__| |_| | | (_| | || (_) | |   \r\n" + //
                "  \\____\\__,_|_|\\___|\\__,_|_|\\__,_|\\__\\___/|_|   \r\n" + //
                "                                                \r\n" + //
                "");

        System.out.println("Welcome to Rho's basic calculator made in UM Library 2:30 - 4:00PM 09/28/23. \n");
        System.out.println("What operation do you want to do? Plus(+), Minus(-), Multiplicaton(*), Division(/): ");

        x = input.nextLine();
        // Addition
        if ("+".equals(x)) {
            int y,z,num;
            System.out.println("What is your first number to be added? ");
            y = input.nextInt();
            System.out.println("What's your second number to be added? ");
            z = input.nextInt();

            num = y + z;

            System.out.println("The value " + y + " + " + z + " = " + num);
        // Subtraction
        }else if("-".equals(x)){
            int y,z,num;
            System.out.println("What is your first number to be subtracted? ");
            y = input.nextInt();
            System.out.println("What's your second number to be subtracted? ");
            z = input.nextInt();

            num = y - z;

            System.out.println("The value " + y + " - " + z + " = " + num);
        // Multiplication
        }else if ("*".equals(x)){
            int y,z,num;
            System.out.println("What's your first number to be multiplied? ");
            y = input.nextInt();
            System.out.println("What's your second number to be multiplied? ");
            z = input.nextInt();

            num = y * z;

            System.out.println("The value " + y + " * " + z + " = " + num);
        // Division
        }else if("/".equals(x)){
            int y,z;
            float num;
            System.out.println("What's your first number to be divided? ");
            y = input.nextInt();
            System.out.println("What's the second number to be divided? ");
            z = input.nextInt();

            num = y/z;

            System.out.println("The value " + y + " / " + z + " = "  + num);
        }else {
           System.out.println("Sytem Error! Retry"); 
        }

    }
}