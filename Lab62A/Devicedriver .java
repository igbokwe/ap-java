import java.util.ArrayList;
public class DeviceDriver{
  public static void main(String args[]) {
   System.out.println("*************Printing  Individual Computers*************");
  MyComputer chormebook = new MyComputer();
  MyComputer appleComputer= new MyComputer(20000.99 , 8 , false);
  MyPhone iphone= new MyPhone();
  MyPhone virginMoblie= new MyPhone(1200.99 , 13, true , "at&t" ); 
  MyGameSystem ps3 =new  MyGameSystem();
  MyGameSystem psp= new  MyGameSystem(439.99 , 16 , true ,  52);
   System.out.println(chormebook);
   System.out.println(appleComputer); 
  System.out.println(iphone); 
  System.out.println(virginMoblie); 
  System.out.println(ps3); 
  System.out.println(psp);
  MyDevice[]  shoppingCart =  new MyDevice[3];
    shoppingCart[0]=chormebook;
   shoppingCart[1]=appleComputer;
   shoppingCart[2]= new MyPhone();
    System.out.println("*******Printing My ShoppingCart*******");
    for (MyDevice computer : shoppingCart)
      
    {
      
     System.out.println(computer);
    }
    ArrayList <MyDevice>wishList = new ArrayList<MyDevice>();
    wishList.add( new MyPhone(350 , 20, true , "Verizon") );
    wishList.add( new MyComputer() );
    System.out.println("\n\n");
    System.out.println("*******Printing My Wishlist*******");
       for (MyDevice computer : wishList)
    {
     System.out.println(computer);
    }
    
     System.out.println("item has been ship");
  }
}
    
  
  
  