

class Niamul {
 public String name ;
 public int id;
 public String city;

public Niamul ()
{
   System.out.println("Hello from Parent");

}

public void display()
{
    System.out.println("Hello From ParentDisplay ");
}
}
class Bashir extends Niamul{
public String vill;
public String PostOffice;
public int Code;

public Bashir(){
    super();
    System.out.println("Hello From Child");
}

public void childDisplay (){

    System.out.println("Hello How are You from Child");
    System.out.println(" This is The information " + name + " " + id + " " + city + " " + vill + " " +PostOffice + " " +Code);
}

}

public class Inheritance {

    public static void main (String a[]){
    Bashir obj1 = new Bashir();
    obj1.name="Khan";
    obj1.city="Joypurhat";
    obj1.id= 4560;
    obj1.vill="Matrai";
    obj1.PostOffice="Kalai";
    obj1.Code=1234;

   obj1.childDisplay();
    }
    
}
