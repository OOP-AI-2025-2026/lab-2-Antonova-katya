package ua.opnu;


public class TimeSpan {

    int hours;
    int minutes;

   TimeSpan(int hours, int minutes) {
        if (hours < 0) {
            hours = 0;
        }
        if (minutes < 0 || minutes > 59) {
            minutes = 0;
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    int getHours() {
       return hours;
    }

    int getMinutes() {
       return minutes;
    }

    void add(int hours, int minutes) {
        if ( hours < 0 || minutes < 0 || minutes > 59) {
            return;
        }
        int totalMinutes = getTotalMinutes() + hours * 60 + minutes;
        hours = totalMinutes / 60;
        minutes = totalMinutes % 60;
        this.hours = hours;
        this.minutes = minutes;
    }

    void addTimeSpan(TimeSpan timespan) {
       add(timespan.getHours(), timespan.getMinutes());
    }

    double getTotalHours() {
       return hours + minutes / 60.0;
    }

    int getTotalMinutes() {
       return hours * 60 + minutes;
    }

    void subtract(TimeSpan span) {
        int totalMinutes = getTotalMinutes() - span.getTotalMinutes();
        if (totalMinutes < 0) {
            return;
        }
        hours = totalMinutes / 60;
        minutes = totalMinutes % 60;
    }

    void scale(int factor) {
        if (factor <= 0) {
            return;
        }
        int totalMinutes = getTotalMinutes() * factor;
        hours = totalMinutes / 60;
        minutes = totalMinutes % 60;
    }
}