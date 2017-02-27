public class MyGameSystem
   {
   private double price;
   private int memory;
   private boolean isInStock;
   private int  numberOfGames;
   
   public MyGameSystem()
      {
  price = 0.0;
      memory = 0;
      isInStock = false;
       numberOfGames =0;
      } // end zero argument constructor
      
   public MyGameSystem( double initialPrice, int initialMemory, boolean initialIsInStock, int initialNumberOfGames)
      {
    price = initialPrice;
      memory = initialMemory;
      isInStock = initialIsInStock;
       numberOfGames= initialNumberOfGames;
       
      } // end four argument constructo
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

   public String  toString() {
      {
       
           return "MyGameSystem statistics:" + "\n" +
             "Price: $" + price + "\t" +
             "Memory: " + memory + "\t" +
             "In Stock: " + isInStock + "\t" +  "NumberOfGames:"+ numberOfGames;
      } // end method toString()
      
   } 
}