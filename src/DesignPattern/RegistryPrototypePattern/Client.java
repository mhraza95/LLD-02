package DesignPattern.RegistryPrototypePattern;

public class Client {

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student copy = studentRegistry.get("wed_13_nov").clone();

        System.out.println(copy);
    }

    public static void fillRegistry(StudentRegistry registry) {
        Student original = new Student();
        original.setBatch("august");
        original.setPsp(70);

        registry.registry("wed_13_nov", original);
    }
}
