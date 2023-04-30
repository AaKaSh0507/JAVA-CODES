public class Inheritance {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
    }
}

//Base Class

class Animal {
    String color;
    void eat(){
        System.out.println("EATS");
    }

    void breathe(){
        System.out.println("BREATHES");
    }
}

// Derived Class

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("SWIMS IN OCEAN");
    }
}
