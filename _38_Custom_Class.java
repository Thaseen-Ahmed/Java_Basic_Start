class Employee1{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("and My name is "+name);
//        System.out.println("The Salary of "+ name + " is " + salary);
    }
    public int getSalary(){
        return salary;
    }
}

public class _38_Custom_Class {
    public static void main(String[] args) {

        System.out.println("This is Our Custom Class");
        Employee1 Thaseen = new Employee1();  //Instantiating a new Employee Object
        Employee1 Adnan = new Employee1();  //Instantiating a new Employee Object
//       Setting Attributes
        Thaseen.id=81;
        Thaseen.name="Thaseen Ahmed";
        Thaseen.salary=45000;

        Adnan.id=05;
        Adnan.name= "Mohammed Adnan";
        Adnan.salary=50000;

//       Printing the Properties
//        System.out.println(Thaseen.id);
//        System.out.println(Thaseen.name);
            Thaseen.printDetails();
            Adnan.printDetails();
            int salary=Thaseen.getSalary();
        System.out.println(salary);

    }
}
