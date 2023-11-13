package DesignPattern.BuilderPattern;

public class StudentBuilder {

    String name;
    String email;
    int age;
    double psp;
    String phoneNo;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public double getPsp() {
        return psp;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setPsp(double psp) {
        this.psp = psp;
        return this;
    }

    public StudentBuilder setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    public Student getStudent() {

        return new Student(name, email, age, psp, phoneNo);
    }

    // just validating and creating object of student.
    public Student build() throws Exception {
        if(this.getAge() > 100){
            throw new Exception("Age should be less than 100");
        }
        if(this.getPsp() <0){
            throw new Exception("PSP should be > than 0");
        }
        // passed
        return new Student(name, email, age, psp, phoneNo); // new Student(new StudentBuilder());
    }
}
