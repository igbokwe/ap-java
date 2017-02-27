/*Error occurs because it is a array of MyDevice and 
 you can only call methods in MyDevice and  the method getSerialNumberPrefix() isn't
 in MyDevice.
 */
import java.util.ArrayList;
public class DeviceDriver{
public static void main(String args[]) {
  
  // Create Item Objects
  System.out.println("*************Printing  Individual Items*************");
  MyComputer chormebook = new MyComputer();
  MyComputer appleComputer= new MyComputer(20000.99 , 8 , false);
  MyPhone iphone= new MyPhone();
  MyPhone virginMoblie= new MyPhone(1200.99 , 13, true , "at&t" ); 
  MyGameSystem ps3 =new  MyGameSystem();
  MyGameSystem psp= new  MyGameSystem(439.99 , 16 , true ,  52);
  MyBook aloziedog = new MyBook(56.00,"Alozie's Dog" ,"Alozie Igbokwe",true);
 
  
  // Print Item details.
  System.out.println(chormebook);
  System.out.println(appleComputer);
  System.out.println(iphone); 
  System.out.println(virginMoblie);
  System.out.println(ps3); 
  System.out.println(psp); 
  System.out.println(aloziedog ); 
  
   
   // Add items to shopping cart
   Shippable[] shoppingCart =  new Shippable[4];
   shoppingCart[0]=appleComputer;
   shoppingCart[1]=iphone;
   shoppingCart[2]=psp;
   shoppingCart[3]=aloziedog;
   
   // Print out items in shopping cart
   System.out.println("\n******Printing My ShoppingCart*******");
   for(Shippable item : shoppingCart) 
   {
      System.out.println(item);
   }
    
    //Wishlist N/A Lab63B
    ArrayList <MyDevice>wishList = new ArrayList<MyDevice>();
    wishList.add(ps3);
    wishList.add(psp);
    wishList.add(new MyComputer());
    wishList.add(new MyPhone());
    System.out.println("\n\n");
    System.out.println("*******Printing My Wishlist*******");
    for(MyDevice computer : wishList)
    { 
       System.out.println(computer.getSerialNumberPrefix());
    }
   
  }
}
    /*
   It works becuse you add and call the  method getSerialNumberPrefix()in MyDevice and each class , 
   which is MyPhone ,MyComputer , and MyGameSystem prints out its own code 
   in the getSerialNumberPrefix() method.
   */
   
   
   
  
  