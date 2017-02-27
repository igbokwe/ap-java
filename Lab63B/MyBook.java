public class MyBook implements Shippable
   {
  private double price ;
   private  String title;
   private String author;
   private boolean isInStock;
   private String stockMsg ="Your item is currently out of stock, it will ship when it is back in stock";
   // cell phone service provider
   
   public MyBook()
      {
      title = new String("");
      author =new String("");
      isInStock = false;
      price=0;
      } // end zero argument constructor
      
   public  MyBook( double initialPrice, String initialtitle,  
                   String initialauthor , boolean initialIsInStock)
      {
      price = initialPrice;
      title =  initialtitle;
      author = initialauthor ;
      isInStock = initialIsInStock;
      stockMsg=this.shipItem();
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
     return "Book info:\n" +
             "Price: $" + price + "\t" + "Title: " + title + "\t" +
             "Author: " + author + "\t" +
             "In Stock: " + isInStock + "\n"  +stockMsg;
      } // end method toString()
   } // end class MyPhone