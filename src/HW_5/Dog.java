package HW_5;

   public class Dog extends Animal {
  private final int MaхRunLenght = 500;
  private final double MaxJumpHeight = 0.5;
  private  final  int MaxSwimLenght = 10;

  @Override
  void run(int lenght){
   if ((lenght >=0) && (lenght <= MaхRunLenght))
   System.out.println("Собака пробежала "+ MaхRunLenght +" метров");
   else System.out.println("swim: false");
  }
 @Override
  void jump(double height){
   if ((height >=0) && (height <= MaxJumpHeight))
    System.out.println("Собака прыгнула на "+ MaxJumpHeight + " метра");
   else System.out.println(" jump: false");
  }

  @Override
  void swim(int height){
   if((height >=0) && (height <=MaxSwimLenght))
    System.out.println("Собака проплыла " + MaxSwimLenght + " метров");
   else System.out.println("swim: false");
  }

 }



