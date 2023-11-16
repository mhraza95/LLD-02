package DesignPattern.RegistryPrototypePattern;

public class Student implements Prototype<Student> {

    private String name;
    private int age;
    private double psp;
    public String batch;
    public Student() {}

    public Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.psp = s.psp;
        this.batch = s.batch;
    }

    @Override
    public Student clone() {

        return new Student(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
}
