public class MyGameSystem extends MyDevice
   {

   private int  numberOfGames;
   
   public MyGameSystem()
      {
   super();
       numberOfGames =0;
      } // end zero argument constructor
      
   public MyGameSystem( double initialPrice, int initialMemory, boolean initialIsInStock, int initialNumberOfGames)
      {
      super(  initialPrice, initialMemory, 
                initialIsInStock );
       numberOfGames= initialNumberOfGames;
       
      } // end four argument constructo
   public String shipItem( boolean Stock)
      {
      if( Stock == true )
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
       
System.out.println("MyGameSystem statistics");
       return super.toString()+ "\n" + "NumberOfGames:"+ numberOfGames;
      } // end method toString()
      
   } 
}