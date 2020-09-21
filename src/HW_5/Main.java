package HW_5;

public class Main {

    public static void main(String[] args) {
        System.out.println("Cat: ");
        Cat cat = new Cat();
        cat.run(200);
        cat.jump(2);
        cat.swim(0);

        System.out.println("Dog: ");
        Dog dog = new Dog ();
        dog.run(500);
        dog.jump(0.5);
        dog.swim(10);

    }
}
