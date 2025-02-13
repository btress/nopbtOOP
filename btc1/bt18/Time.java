package bt18;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
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

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time nextSecond(){
        this.second+=1;
        return this;
    }

    public Time previousSecond(){
        this.second-=1;
        return this;
    }

    @Override
    public String toString() {
        String timeString = String.format("%d:%d:%d", hour, minute, second);
        Date time = null;
        try {
            time = new SimpleDateFormat("HH:mm:ss").parse(timeString);
        } catch (ParseException ex) {
            Logger.getLogger(Time.class.getName()).log(Level.SEVERE, null, ex);
        }
        timeString = new SimpleDateFormat("HH:mm:ss").format(time);
        return timeString;
    }

}
