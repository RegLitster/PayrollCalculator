package com.pluralsight;

import java.util.Scanner;

public class PayrollCal {
    public static void main(String[] args) {

        Scanner keyborad = new Scanner(System.in);

        System.out.println("Hello, Please enter your name:");
        String name = keyborad.nextLine();

        System.out.println("Please enter your hours worked:");
        float hours = keyborad.nextFloat();

        System.out.println("Please enter your hourly rate:");
        float hourlyRate = keyborad.nextFloat();
        float totalHours = hours*hourlyRate;

 //       System.out.println("Please enter your overtime hours");
        float overtimeHours = keyborad.nextFloat();

//        if (overtimeHours >= 0) {
//            totalHours = hours * hourlyRate + overtimeHours * 1.5;
//        }
//            else {
                System.out.printf("Thank you %s. You're gross pay is %.2f:", name, totalHours);
//            }





            /*
Create a Java application named PayrollCalculator that prompts the user to enter:

- their name
- their hours worked (a floating point number)
- their pay rate (a floating point number) Calculate their gross pay.
Display the employee's name and their gross pay.

Step 2

1. Ensure all your changes are committed and pushed to GitHub
2. Send your repository URL to your Instructor

(Optional)
You learned about if statements in your pre-work, so although we have not
discussed them in class, you should be able to figure out how to pay 1.5x
overtime after 40 hours. You can use W3Schools guide as a reference
https://www.w3schools.com/java/java_conditions.asp
*/











    }
}
