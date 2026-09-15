import java.util.Scanner;
import java.util.ArrayList;
public class MoneySaver {
public static void main(String[] args) {

    ArrayList<Activities> activitiesList = new ArrayList<>();
    activitiesList.add(new Activities("Movie", 15.0, 2.0));
    activitiesList.add(new Activities("Concert", 50.0, 3.0));

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter your budget for the weekend: ");
    double budget = input.nextDouble();
    System.out.println("Please enter what time is it now (in 24 hour format): ");
    double currentTime = input.nextDouble();
    System.out.println("Please enter what personality type you are (1 for introvert, 2 for extrovert): ");
    int personalityType = input.nextInt();

    new Coupon("SAVE15", 0.15, "Concert", 50.0, 3.0);

    boolean hasCoupon = false;


    if (currentTime < 23.0 && currentTime > 7.0){
        
        if (budget == 0){
            if (personalityType == 1){
                System.out.println("You are an introvert. Here are some free activities you can do: ");
                // somehow list all instances of the Activities class where cost == 0
            }
            else if (personalityType == 2){
                System.out.println("You are an extrovert. Here are some free activities you can do: ");
                // somehow list all instances of the Activities class where cost == 0
            }
            else{
                System.out.println("Invalid personality type. Please enter 1 for introvert or 2 for extrovert.");
            }


        }
        if (budget > 0 && budget < 15){
            System.out.println("You have a budget of $" + budget + ". Here are your options: ");
            // somehow list all instances of the Activities class where cost <= budget
            Activities.printCheap();
        }
        if (budget >= 15 && budget < 50){
            System.out.println("You have a budget of $" + budget + ". Here are your options: ");
            // somehow list all instances of the Activities class where cost <= budget
        }
        if (budget >= 50){





            System.out.println("You have a budget of $" + budget + ". Here are your options: ");
            // somehow list all instances of the Activities class where cost <= budget
        }



    }




    else{

    }








}}