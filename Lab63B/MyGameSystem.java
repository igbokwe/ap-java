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
   public String getSerialNumberPrefix(){
     return "GameSystem";
   }
   public String  toString() {
      {
       
System.out.println("MyGameSystem statistics");
       return super.toString()+ "\n" + "NumberOfGames:"+ numberOfGames;
      } // end method toString()
      
   } 
}