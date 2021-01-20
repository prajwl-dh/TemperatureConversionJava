package com.prajwal;

//importing the scanner class
import java.util.*;

//starting of the  public class
public class temperatureconversion
{
    //starting of main
    public static void main(String[] args)
    {
        int userinput;

        while (true)
        {
            //printing  the program outline
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
                FtoC();
            }

            else if (userinput == 2)
            {
                CtoF();
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
    
    //function to convert Fahrenheit into Celsius
    static void FtoC()
    {
        float tempF;
        float celcTemp;

        System.out.print("Please enter the temperature in Fahrenheit: ");
        Scanner fahrenheitReader = new Scanner(System.in);
        tempF = fahrenheitReader.nextFloat();

        celcTemp = (tempF - 32)*5/9;

        System.out.printf("%.1f degree Fahrenheit is %.1f degree Celsius.\n", tempF, celcTemp);
        System.out.println(" ");
    }
    
    //function to convert Celsius into Fahrenheit
    static void CtoF()
    {
        float tempC;
        float fTemp;

        System.out.print("Please enter the temperature in Celsius: ");
        Scanner celsiusReader = new Scanner(System.in);
        tempC = celsiusReader.nextFloat();

        fTemp = (float) ((1.8 * tempC) + 32);

        System.out.printf("%.1f degree Celsius is %.1f degree Fahrenheit", tempC, fTemp);
        System.out.println(" ");
    }
}
