package HW_5;
// не пойму почему класс Cat красный

  public class Cat extends Animal {
     private final int MaxRunLenght = 200;
     private final int MaxJumpHeight = 2;


     @Override
     void run(int lenght){
         if((lenght >=0) && (lenght <= MaxRunLenght))
             System.out.println("Кот пробежал "+ MaxRunLenght +" метров");
         else System.out.println("run: false");
     }

     @Override
     void swim(int lenght){
         System.out.println("Koт не умеет плавать");

     }

     @Override
     void jump(double height){
         if ((height >=0) && (height <= MaxJumpHeight))
             System.out.println("Кот прыгнул на "+ MaxJumpHeight +" метра");
         else System.out.println("jump: false");
     }
 }

