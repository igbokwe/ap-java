public class MyComputer 
   {
   private double price;
   private int memory;
   private boolean isInStock;
   
   public MyComputer()
      {
      price = 0.0;
      memory = 0;
      isInStock = false;
      } // end zero argument constructor
      
   public MyComputer( double initialPrice, int initialMemory, boolean initialIsInStock )
      {
      price = initialPrice;
      memory = initialMemory;
      isInStock = initialIsInStock;
      } // end two argument constructor

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
      return "Computer statistics:\n" +
             "Price: $" + price + "\t" +
             "Memory: " + memory + "\t" +
             "In Stock: " + isInStock;
      } // end method toString()
      
   } // end class MyComputer