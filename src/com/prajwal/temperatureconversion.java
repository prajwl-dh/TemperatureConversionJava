package com.prajwal;

//importing the scanner class
import java.util.Scanner;

public class temperatureconversion
{
    public static void main(String[] args)
    {
        int userinput;

        while (true)
        {
            System.out.println("****************************************************");
            System.out.println("Temperature Conversion Program");
            System.out.println("1. Convert F to C");
            System.out.println("2. Convert C to F");
            System.out.println("3. Exit the program");
            System.out.println("****************************************************");
            System.out.print("Please enter your selection: ");

            Scanner keyboard = new Scanner(System.in);
            userinput = keyboard.nextInt();

            if (userinput == 1)
            {
                int tempF;
                int celcTemp;

                System.out.print("Please enter the temperature in Fahrenheit: ");
                tempF = keyboard.nextInt();

                celcTemp = (tempF - 32)*5/9;

                System.out.println(tempF+" degree Fahrenheit" + " is "+ celcTemp + " degree Celsius.");
                System.out.println(" ");
            }

            else if (userinput == 2)
            {
                int tempC;
                int fTemp;

                System.out.print("Please enter the temperature in Celsius: ");
                tempC = keyboard.nextInt();

                fTemp = (int) ((1.8 * tempC) + 32);

                System.out.println(tempC+ " degree Celsius"+ " is "+ fTemp+ " degree Fahrenheit.");
                System.out.println(" ");

            }

            else if (userinput == 3)
            {
                System.out.println("\nThanks for using the program.");
                System.out.println("Have a great day ahead.");
                System.out.println("Program Closed.");
                System.exit(0);
            }

            else
            {
                System.out.println("Wrong input. Please try again.\n");
            }
        }
    }
}
