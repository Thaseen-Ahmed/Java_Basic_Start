
//   Access Modifiers

//     1.Private
//     2.Default
//     3.Protected
//     4.Public

class MyEmployee{
    private int id;
    private String name;

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

public class _40_Ch_9_ {
    public static void main(String[] args) {

        MyEmployee captain = new MyEmployee();
//        captain.name="Ahmed P S ";
//        captain.id=235;
//        THE above will throw error due to private Access Modifier

        captain.setName("Ahmed P S");
        System.out.println(captain.getName());
        captain.setId(235);
        System.out.println(captain.getId());
    }
}
