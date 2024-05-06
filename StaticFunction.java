
class Mobile {

 public static String Brand;
 public  int price ;
 public String name;

 public static void display ( Mobile obj2){
  System.out.println(Mobile.Brand + " " + obj2.name +"  " + obj2.price);
 }

}

public class StaticFunction {

    public static void main (String a[])
    {
        System.out.println("Hello How Are you");
       
        Mobile  obj1 = new Mobile();
        obj1.name ="Nokia110";
        obj1.price = 1300;
        Mobile.Brand = "Nokia";
        System.out.println(obj1.name + " " + obj1.price + " " + Mobile.Brand);
        Mobile.display(obj1);
        
    }

}