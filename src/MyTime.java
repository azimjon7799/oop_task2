public class MyTime {
    private int hour, minute, second;

    public MyTime(){
    }

    public MyTime(int hour, int minute, int second) {
        if (hour < 0 || hour > 59) {
            throw new IllegalArgumentException("hour must be between 0 and 59");
        }
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("minute must be between 0 and 59");
        }
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("second must be between 0 and 59");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        if (hour < 0 || hour > 59) {
            throw new IllegalArgumentException("hour must be between 0 and 59");
        }
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("minute must be between 0 and 59");
        }
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("second must be between 0 and 59");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond(){
        return new MyTime(this.hour, this.minute, this.second + 1);
    }

    public MyTime nextMinute(){
        return new MyTime(this.hour, this.minute + 1, this.second);
    }

    public MyTime nextHour(){
        return new MyTime(this.hour + 1, this.minute, this.second);
    }

    public MyTime previousSecond(){
        return new MyTime(this.hour, this.minute, this.second - 1);
    }

    public MyTime previousMinute(){
        return new MyTime(this.hour, this.minute - 1, this.second);
    }

    public MyTime previousHour(){
        return new MyTime(this.hour - 1, this.minute, this.second);
    }

    public static void main(String[] args) {
        MyTime newTime = new MyTime();
        newTime.second = 18;
        newTime.minute = 20;
        newTime.hour = 1;
        System.out.println(newTime.toString());
    }
}