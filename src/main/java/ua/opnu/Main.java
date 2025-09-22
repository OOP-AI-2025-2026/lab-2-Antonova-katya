package ua.opnu;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Антонова Катерина", 2);

        student.addCourse("Організація баз даних та знань");
        student.addCourse("Об'єктно-орієнтовне програмування");
        student.addCourse("Теорія алгоритмів");

        System.out.println(student.getName() + ": кількість вивчаємих дисциплін - " + student.getCourseCount());
        System.out.println(student.getName() + ": рік навчання - " + student.getYear());
        System.out.println(student.getName() + ": заплатила за навчання - " + student.getTuition() + " грн");

    }
}