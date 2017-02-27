public class MyPhone 
   {
   private double price;
   private int memory;
   private boolean isInStock;
   private String carrier;    // cell phone service provider
   
   public MyPhone()
      {
      price = 0.0;
      memory = 0;
      isInStock = false;
      carrier = new String( "unlocked" );
      } // end zero argument constructor
      
   public  MyPhone( double initialPrice, int initialMemory, 
                   boolean initialIsInStock, String initialCarrier )
      {
      price = initialPrice;
      memory = initialMemory;
      isInStock = initialIsInStock;
      carrier = initialCarrier;
      } // end four argument constructor

   public String shipItem()
      {
      if( isInStock == true )
         {
         return "Your item has been shipped."; 
        } // end if
      else
         {
         return "Your item is currently out of stock, it will ship when it is back in stock";   
         } // end else
      } // end method shipItem

   public String toString()
      {
      return "Phone statistics:\n" +
             "Price: $" + price + "\t" +
             "Memory: " + memory + "\t" +
             "In Stock: " + isInStock + "\t" +
             "Carrier: " + carrier;
      } // end method toString()
   } // end class MyPhone