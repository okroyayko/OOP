package study.classs;

public class Person {
    String first;
    String last;

    Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public Person() {
    }

    void showName(){
        System.out.println(this.first + " " + this.last);
    }
    void isRunning(){
        System.out.println(this.first + " is running");
    }
}
