import java.util.Scanner;

public class ConversionApp{
    public static void main(String[] args) throws Exception{
        Scanner statusScanner = new Scanner(System.in);
        Scanner choiceScanner = new Scanner(System.in);
        Scanner poundsScanner = new Scanner(System.in);
        Scanner inchesScanner = new Scanner(System.in);
        Scanner milesScanner = new Scanner(System.in);
        Scanner feetScanner = new Scanner(System.in);
        Scanner fahrenheitScanner = new Scanner(System.in);
        
        String status = "";
        while (!"exit".equals(status)){
            System.out.println("Hello! Welcome to the Conversion App. Please choose one of the following conversions to do: ");
            System.out.println("1. Pounds to Kilograms");
            System.out.println("2. Inches to Millimeters");
            System.out.println("3. Miles to Kilometers");
            System.out.println("4. Feet to Yards");
            System.out.println("5. Fahrenheit to Celsius");
            //gives the user multiple choices for conversions
            int choice = choiceScanner.nextInt();
            System.out.println();

            if ((choice != 1) && (choice != 2) && (choice != 3) && (choice != 4) && (choice != 5)){
                System.out.println("That is not an input that is recognized. Please try again.");
            }
            
            if (choice == 1){
                //pounds to kilograms
                System.out.println("You chose Pounds to Kilograms.");
                System.out.println("Please enter a number of Pounds: ");
                double pounds = poundsScanner.nextDouble();
                double kilograms = pounds * 0.45359237; //the math for the conversion
                System.out.println(pounds + " pounds is " + Math.round(kilograms * 100.0) / 100.0 + " kilograms.");
            }

            if (choice == 2){ 
                //inches to feet
                System.out.println("You chose Inches of Millimeters.");
                System.out.println("Please enter a number for Inches.");
                double inches = inchesScanner.nextDouble();
                double millimeters = inches * 25.4; //the math for the conversion
                System.out.println(inches + " inches is " + Math.round(millimeters * 100.0)/100.0 + " millimeters.");
            }

            if (choice == 3){
                //miles to kilometers
                System.out.println("You chose Miles to Kilometers.");
                System.out.println("Please enter a number of Miles.");
                double miles = milesScanner.nextDouble();
                double kilometers = miles / 0.6214; //the math for the conversion
                System.out.println(miles + " miles is " + Math.round(kilometers * 100.0)/100.0 + " kilometers.");
            }

            if (choice ==4) {
                //feet to yards
                System.out.println("You chose Feet to Yards");
                System.out.println("Please enter a number of Feet.");
                double feet = feetScanner.nextDouble();
                double yards = feet / 3; //the math for the conversion
                System.out.print(feet + " feet is " + yards + " yards.");
            }

            if (choice ==5) {
                //Fahrenheit to celsius
                System.out.println("You chose Fahrenheit to Celsius");
                System.out.println("Please enter a temperature for Fahrenheit.");
                double fahrenheit = fahrenheitScanner.nextDouble();
                double celsius = ((fahrenheit - 32) * 5 / 9); //the math for the conversion

                System.out.println(fahrenheit + " fahrenheit is " + celsius + " celsius.");
            }

            System.out.println();
            System.out.println("If you wish to convert again, please enter again. If you wish to exit, please enter exit.");
            status = statusScanner.nextLine();
            System.out.println();
    }
    if ("exit".equals(status)){
        System.out.println("Goodbye!");
    }
        


}
}
