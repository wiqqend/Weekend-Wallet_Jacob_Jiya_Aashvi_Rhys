import java.util.Scanner;
public class MoneySaver {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter your budget for the weekend: ");
    double budget = input.nextDouble();
    System.out.println("Please enter what time is it now (in 24 hour format): ");
    double currentTime = input.nextDouble();
    System.out.println("Please enter what personality type you are (1 for introvert, 2 for extrovert): ");
    int personalityType = input.nextInt();
//Arraylist Activites 
    Activities.getActivitiesList().add(new Activities("Hiking", 0.0, 3.0, 1));
    Activities.getActivitiesList().add(new Activities("Movie", 15.0, 2.0, 2));
    Activities.getActivitiesList().add(new Activities("Concert", 50.0, 3.0, 2));
    Activities.getActivitiesList().add(new Activities("Bowling", 20.0, 2.0, 2));
    Activities.getActivitiesList().add(new Activities("Museum", 10.0, 1.5, 1));
    Activities.getActivitiesList().add(new Activities("Beach", 0.0, 4.0, 1));
    Activities.getActivitiesList().add(new Activities("Amusement Park", 80.0, 5.0, 2));
    Activities.getActivitiesList().add(new Activities("Online Shopping", budget, 1.0, 1 ));
    Activities.getActivitiesList().add(new Activities("Facetime with friends", 0.0, 1.0, 2));
    Activities.getActivitiesList().add(new Activities("Personal Development", 0.0, .5, 1));




    

    new Coupon("SAVE15", 0.15, "Concert", 50.0, 3.0);

    boolean hasCoupon = false;


    if (currentTime < 23.0 && currentTime > 7.0){
        
        if (budget == 0){
            if (personalityType == 1){
                System.out.println("You are an introvert. Here are some free activities you can do: ");
                // somehow list all instances of the Activities class where cost == 0
                Activities.printFreeActivities();
            }
            else if (personalityType == 2){
                System.out.println("You are an extrovert. Here are some free activities you can do: ");
                // somehow list all instances of the Activities class where cost == 0
                Activities.printFreeActivities();
            }
            else{
                System.out.println("Invalid personality type. Please enter 1 for introvert or 2 for extrovert.");
            }


        }
        if (budget > 0 && budget < 15){
            System.out.println("You have a budget of $" + budget + ". Here are your options: ");
            // somehow list all instances of the Activities class where cost <= budget
            Activities.printCheapunder15();
        }
        if (budget >= 15 && budget < 50){
            System.out.println("You have a budget of $" + budget + ". Here are your options: ");
            // somehow list all instances of the Activities class where cost <= budget
            Activities.printCheapunder50();
        }
        if (budget >= 50){





            System.out.println("You have a budget of $" + budget + ". Here are your options: ");
            // somehow list all instances of the Activities class where cost <= budget
            Activities.printover50();
        }



    }




    else{

    } 







input.close();
}}