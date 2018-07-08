package fanshe.field;


public class Student {
    public Student(){

    }
    //**********字段*************//
    public String name;
    public String firstname;
    protected int age;
    char sex;
    private String phoneNum;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
