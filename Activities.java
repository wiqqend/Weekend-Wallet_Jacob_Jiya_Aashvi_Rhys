import java.util.ArrayList;
import java.util.List;

public class Activities{
    private String activityName;
    private double cost;
    private double duration;
    private int personalityType;

    Activities(String activityName, double cost, double duration, int personalityType) {
        this.activityName = activityName;
        this.cost = cost;
        this.duration = duration;
        this.personalityType = personalityType;
    }
    

    private static final List<Activities> activitiesList = new ArrayList<>();

    public static void printCheapunder15() {
        for (Activities activity : activitiesList) {
            if (activity.getCost() < 15.0) {
                System.out.println(
                    activity.getActivityName() + ": $" +
                    activity.getCost() + ", Duration: " +
                    activity.getDuration() + " hours"
                );
            }
        }    }

    public static void printCheapunder50() {
        for (Activities activity : activitiesList) {
            if (activity.getCost() < 50.0) {
                System.out.println(
                    activity.getActivityName() + ": $" +
                    activity.getCost() + ", Duration: " +
                    activity.getDuration() + " hours"
                );
            }
        }    }

    public static void printFreeActivities() {
        for (Activities activity : activitiesList) {
            if (activity.getCost() == 0.0) {
                System.out.println(
                    activity.getActivityName() + ": $" +
                    activity.getCost() + ", Duration: " +
                    activity.getDuration() + " hours"
                );
            }
        }    }
    public static void printover50() {
        for (Activities activity : activitiesList) {
            if (activity.getCost() >= 50.0) {
                System.out.println(
                    activity.getActivityName() + ": $" +
                    activity.getCost() + ", Duration: " +
                    activity.getDuration() + " hours"
                );
            }
        }    }

    public static List<Activities> getActivitiesList() {
        return activitiesList;
    }
    public double getCost(){
        return cost;
    }

    public double getDuration(){
        return duration;
    }

    public String getActivityName(){
        return activityName;
    }


    public void setActivityName(String activityName){
        this.activityName = activityName;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    public void setDuration(double duration){
        this.duration = duration;
    }




}