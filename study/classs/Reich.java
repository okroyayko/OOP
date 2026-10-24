package study.classs;

public class Reich extends Person {
    double gpa;
    @Override
    void isRunning(){
        System.out.println(this.first + "zig heildgddf");
    }
    Reich(String first, String last, double gpa) {
        super(first, last);
        this.gpa = gpa;
    }
    void showgpa(){
        System.out.println(this.first + "'s gpa is: " + this.gpa);
    }
}
