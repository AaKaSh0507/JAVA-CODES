public class TypeOfConstructors {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Aakash");
        Student s3 = new Student(0003);

    }
}

class Student{
    int roll;
    String name;
    int password;

    Student(){
        System.out.println("This is non-parameterized constructor");
    }

    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }
}