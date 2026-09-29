public class WorkSchedule{
    private int id;
    private String name;
    private float weeklyHours;
    private float dailyHours;

    public WorkSchedule(int id, String name, float weeklyHours, float dailyHours){
        this.id = id;
        this.name = name;
        this.weeklyHours = weeklyHours;
        this.dailyHours = dailyHours;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
    this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
    this.name = name;
    }

    public float getWeeklyHours(){
        return weeklyHours;
    }

    public void setWeeklyHours(float weeklyHours){
    this.weeklyHours = weeklyHours;
    }

    public float getDailyHours(){
        return dailyHours;
    }

    public void setDailyHours(float dailyHours){
    this.dailyHours = dailyHours;
    }

    public float calculateWorkDays(){
        return (weeklyHours / dailyHours);
    }

    public boolean isValidSchedule(){
        if(dailyHours => 24 || dailyHours <= 0 || weeklyHours <= 0){
            return false;
        }
        else {
            return true;
        }
        
    }
}
