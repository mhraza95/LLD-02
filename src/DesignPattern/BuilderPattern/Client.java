package DesignPattern.BuilderPattern;

public class Client {

    public static void main(String[] args) {

        Student s = new StudentBuilder().setName("abc").setAge(240).setEmail("xyz@gmail.com").getStudent();

        System.out.println(s.toString());
    }
}
