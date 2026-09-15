public class Activities extends MoneySaver {
    private String activityName;
    private double cost;
    private double duration;
    
    Activities(String activityName, double cost, double duration){
        this.activityName = activityName;
        this.cost = cost;
        this.duration = duration;

    }

    public static void printCheap(){
        for (Activities a: allActivities){
            if (a.getCost() < 15.0){
                System.out.println(a.getActivityName() + ": $" + a.getCost() + ", Duration: " + a.getDuration() + " hours");
            }
        }
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