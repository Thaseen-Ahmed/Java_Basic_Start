
class MymainEmployee{
    private int id;
    private String name;
//    This is Constructor
//    Constructor Overloading
    public MymainEmployee(){
        id=45;
        name="P S Thaseen Ahmed";
    }
    public MymainEmployee(String Myname,int MyId){
        id=MyId;
        name=Myname;
    }

    public void setName(String n){
        this.name =n;
    }
    public String getName(){
        return name;
    }

    public void  setId(int i){
        this.id= i;
    }
    public int getId(){
        return id;
    }


}

public class _42_Constructors_java {
    public static void main(String[] args) {

        MymainEmployee Ahmed = new MymainEmployee("PS Thaseen Ahmed",326);
//        MymainEmployee Ahmed = new MymainEmployee();
        Ahmed.setName("Code with Thaseen");
//        Ahmed.setId(106);
        System.out.println(Ahmed.getName());
        System.out.println(Ahmed.getId());

    }
}
