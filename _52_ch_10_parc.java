
class Circle{
    public int radius;
    Circle(){
        System.out.println("I am an Non-Parameterized Constructor");
    }
    Circle(int r){
        System.out.println("I am Circle parameterized Constructor");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;

    }


}
class Cylinder extends Circle{
    public int height;
    Cylinder(int r,int h){
        super(r);
        this.height=h;
        System.out.println("The Height and Radius  of Cylindr is "+h + " and "+r);
//        System.out.println("Volume of Cyliner is "+(Math.PI*r*r*h));

    }



    public double volume(){
            return Math.PI*this.radius*this.radius*height;

    }
}




public class _52_ch_10_parc {
    public static void main(String[] args) {

        Circle objc=new Circle();
        Cylinder obj=new Cylinder(3,8);
        obj.volume();
    }
}
