
import java.util.Scanner;

// The following equations estimate the calories burned when exercising (source):

// Women: Calories = ( (Age x 0.074) — (Weight x 0.05741) + (Heart Rate x 0.4472) — 20.4022 ) x Time / 4.184

// Men: Calories = ( (Age x 0.2017) + (Weight x 0.09036) + (Heart Rate x 0.6309) — 55.0969 ) x Time / 4.184

// Write a program using inputs age (years), weight (pounds), heart rate (beats per minute), and time (minutes), respectively. Make sure to create only one Scanner object to read all the inputs. Output calories burned for women and men.

// Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
// System.out.printf("%.2f", yourValue);

// Ex: If the input is:

// 49 155 148 60
// the output is:

// Women: 580.94 calories
// Men: 891.47 calories

public class calories_burned {
    
    public static void main(String[] args) {
        // System.out.println("Its working!");
        Scanner scnr = new Scanner(System.in);

        // Type your code here

        int age;
        int weight;
        int heartRate;
        int time;
        double womenCalories;
        double menCalories;


        // Read inputs
        System.out.println("Enter age:");
        age = scnr.nextInt();
        System.out.println("Enter weight:");
        weight = scnr.nextInt();
        System.out.println("Enter heart rate:");
        heartRate = scnr.nextInt();
        System.out.println("Enter time:");
        time = scnr.nextInt();



            // Women Calerie Burned Expresson
            womenCalories = ((age * 0.074) - (weight * 0.05741) + (heartRate * 0.4472) - 20.4022) * time / 4.184;

            // Men Calerie Burned Expresson
            menCalories = ((age * 0.2017) + (weight * 0.09036) + (heartRate * 0.6309) - 55.0969) * time / 4.184;




        // System.out.println("Women's Calrories Burned: " + womenCalories);
        System.out.printf("Women's Calories Burned: %.2f calories\n", womenCalories);
        
        
        // System.out.println("Men's Calrories Burned: " + menCalories);
        System.out.printf("Men's Calories Burned: %.2f calories\n", menCalories);


    }
}
