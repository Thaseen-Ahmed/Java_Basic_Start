
    ;

    abstract class Pen{
        abstract void write();
        abstract void refill();
    }

    class FountainPen extends Pen{
        void write(){
            System.out.println("Write");
        }
        void refill(){
            System.out.println("Refill");
        }
        void changeNib(){
            System.out.println("Changing the nib");
        }
    }
    class Monkey{
        void jump(){
            System.out.println("Jumping...");
        }
        void bite(){
            System.out.println("Biting...");
        }
    }

    interface BasicAnimal{
        void eat();
        void sleep();
    }

    class Human extends Monkey implements BasicAnimal{
        void speak(){
            System.out.println("Hello sir!");
        }

        @Override
        public void eat() {
            System.out.println("Eating");
        }

        @Override
        public void sleep() {
            System.out.println("Sleeping");
        }
    }

    abstract class Telephone{
  abstract void ring(int num);
        abstract void lift(int num);
        abstract void disconnect(int num);

    }
    class SmartTelephone extends Telephone{
        public void ring(int num){
            System.out.println(num +" The Phone is Ringing...");
        }
        public void lift(int num){
            System.out.println(num+" the call is Picking up....");
        }
        public void disconnect(int num){
            System.out.println(num+" The Phone is Disconnected....");
        }
    }

    public class _60_Ques_on_Abtstract_and_Interfac {
        public static void main(String[] args) {
            // Q1 + Q2
            FountainPen pen = new FountainPen();
            pen.changeNib();

            // Q3
            Human harry = new Human();
            harry.sleep();

            // Q5
            Monkey m1 = new Human();
            m1.jump();
            m1.bite();
            // m1.speak(); --> Cannot use speak method because the reference is monkey which does not have speak method

            BasicAnimal lovish = new Human();
            // lovish.speak(); --> error
            lovish.eat();
            lovish.sleep();
            Telephone st=new SmartTelephone();
            st.disconnect(568456);
            st.lift(568456);
            st.ring(568456);


        }
    }


