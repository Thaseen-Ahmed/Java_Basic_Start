
class Base{
   public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am from Base and Setting X now");
        this.x = x;
    }

    public void printme(){
        System.out.println("This is the constructor");
    }
}

class Derived extends Base{
  public int y;

  public int getY(){
      System.out.println("I am From Derived class ");
      return y;
  }
  public void setY(int y){
      this.y=y;
  }

}

//class Animal{
//    public void Eating(String n){
//        System.out.println("The Animal " + n + " is eating");
//    }
//    public void Hunting(String n){
//        System.out.println("The Animal " + n + "  eating");
//    }
//    public void Walking(String n){
//        System.out.println("The Animal "+n+" is Walking ");
//    }
//
//
//}
//
//class Dog extends Animal{
//    public void Bark(String n){
//        System.out.println("The Dog "+n+" is Barking");
//    }
//}


public class _45_Inheritance_in_java {
    public static void main(String[] args) {

        Base bs=new Base();
//        bs.setX(89);
//        System.out.println(bs.getX());

        Derived dr=new Derived();
//        dr.setX(342);
//        System.out.println(dr.getX());
//
//        dr.setY(6784);
//        System.out.println(dr.getY());
//
//         Dog dg=new Dog();
//         dg.Eating("Puppy");
//         dg.Walking("Puppy");
//         dg.Bark("Puppy");
//         dg.Hunting("Leopard");
//
//
//        System.out.println("The Animal Value is :");
//
//         Animal ani = new Animal();
//         ani.Hunting("Tiger");
//         ani.Eating("Elephant");


    }
}
