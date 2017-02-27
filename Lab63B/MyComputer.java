public class MyComputer extends MyDevice
   {
  
   
   public MyComputer()
      {
     super();
      } // end zero argument constructor
      
   public MyComputer( double initialPrice, int initialMemory, boolean initialIsInStock )
      {
     super( initialPrice,initialMemory,initialIsInStock );
      } // end two argument constructor
 
   public String getSerialNumberPrefix(){
     return "MyComputer";
   }
   public String toString()
      {
      System.out.println("Computer statistics");
       return super.toString();
      } // end method toString()
      
   } // end class MyComputer