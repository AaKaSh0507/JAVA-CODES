public class CopyConstructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Aakash Malik";
        s1.roll = 0003;
        s1.password = "abcd";
        Student s2 = new Student(s1);
    }
}

class Student{
    int roll;
    String name;
    String password;

    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }

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