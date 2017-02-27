abstract class MyDevice implements Shippable{
   private double price;
   private int memory;
   private boolean isInStock;
   private String stockMsg ="Your item is currently out of stock, it will ship when it is back in stock";
   
   public MyDevice()
      {
      price = 0.0;
      memory = 0;
      isInStock = false;
      } // end zero argument constructor
      
   public MyDevice( double initialPrice, int initialMemory, boolean initialIsInStock )
      {
      price = initialPrice;
      memory = initialMemory;
      isInStock = initialIsInStock;
      stockMsg=this.shipItem();
      } // end two argument constructor
    public abstract  String getSerialNumberPrefix();
     public String shipItem()
     //  public void shipItem()
      {
      if( isInStock == true )
         {
         return "Your item has been shipped.";
       // System.out.println("Your item has been shipped.");
        } // end if
     // else
       //  {
       //  return "Your item is currently out of stock, it will ship when it is back in stock";   
        // } // end else
      return "Your item is currently out of stock, it will ship when it is back in stock";  
      } // end method shipItem
     
      public String toString(){
       return"Price: $" + price + "\t" +
             "Memory: " + memory + "\t" +
             "In Stock: " + isInStock+"\n"  +stockMsg;
      }
}
