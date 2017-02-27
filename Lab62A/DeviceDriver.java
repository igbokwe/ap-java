import java.util.ArrayList;
public class DeviceDriver{
public static void main(String args[]) {
  
 
  MyComputer chormebook = new MyComputer();
  MyComputer appleComputer= new MyComputer(20000.99 , 8 , false);
  MyPhone iphone= new MyPhone();
  MyPhone virginMoblie= new MyPhone(1200.99 , 13, true , "at&t" ); 
  MyGameSystem ps3 =new  MyGameSystem();
  MyGameSystem psp= new  MyGameSystem(439.99 , 16 , true ,  52);
   
  
  System.out.println("*************Printing  Individual Computers*************");
   System.out.println(chormebook.toString());
   
  System.out.println( appleComputer.toString());
 System.out.println(  iphone.toString());
  System.out.println( virginMoblie.toString());
   System.out.println(ps3.toString()); 
  System.out.println( psp.toString()); 
 
  
  // Phone Object to Add to Shopping Cart
 //  MyPhone addPhone = new MyPhone();
  
   MyComputer[]  shoppingCart =  new MyComputer[2];
   shoppingCart[0]=chormebook;
   shoppingCart[1]=appleComputer;
  // shoppingCart[2]= addPhone;
   
    System.out.println("*******Printing My ShoppingCart*******");
    //for (int i=0;i<shoppingCart.length;i++)
     for (MyComputer computer : shoppingCart)  
    {
    System.out.println( computer.toString());
    System.out.println( computer.shipItem());
     //System.out.println(computer);
    }
    
   //Computer Object to Add to Wishlist
  // MyComputer addComputer = new MyComputer();
    
    ArrayList <MyGameSystem>wishList = new ArrayList<MyGameSystem>();
    wishList.add(ps3);
    wishList.add(psp);
  // wishList.add(newComputer);
    System.out.println("\n\n");
    System.out.println("*******Printing My Wishlist*******");
       for (MyGameSystem gameSystem : wishList)
    {
  System.out.println( gameSystem .toString());
    System.out.println(gameSystem .shipItem());
    }
   
  }
}
    /*
    The program won't compile if you  add a MyPhone object to shopingCart array which is an array of MyComputer objetcts 
    and it also wont compile if you add a MyComputer object to the wishList ArrayList which is an array of
    MyGameSystem objects. because both the array and arraylist dont allow you to add objects of different types */
     
  