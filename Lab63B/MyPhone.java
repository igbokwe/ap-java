public class MyPhone extends MyDevice
   {
   
   private String carrier;    // cell phone service provider
   
   public MyPhone()
      {
     super();
      carrier = new String( "unlocked" );
      } // end zero argument constructor
      
   public MyPhone( double initialPrice, int initialMemory, 
                   boolean initialIsInStock, String initialCarrier )
      {
     super(  initialPrice, initialMemory, 
                initialIsInStock );
      carrier = initialCarrier;
      } // end four argument constructor
   public String getSerialNumberPrefix(){
     return "Phone";
   }
   public String toString()
      {
      System.out.println("Phone statistics");
       return super.toString()+ "\n" + "Carrier:"+ carrier;
      } // end method toString()
   } // end class MyPhone