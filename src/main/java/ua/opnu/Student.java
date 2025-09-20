package ua.opnu;

public class Student {

    String name;
    int year;
    String[] courses;
    int courseCount;

    Student(String name, int year) {
        this.name = name;
        this.year = year;
        this.courses = new String[100];
        this.courseCount = 0;
    }

    void addCourse(String courseName) {
        courses[courseCount] = courseName;
        courseCount++;
    }

    void dropAll() {
        courseCount = 0;
    }

    int getCourseCount() {
        return courseCount;
    }

    String getName() {
        return name;
    }

    int getTuition() {
        return year * 20000;
    }

    int getYear() {
        return year;
    }
}
