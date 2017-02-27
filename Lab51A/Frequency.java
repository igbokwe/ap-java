import java.util.*;
public class Frequency{ 
 
  public void getFreqDest(int ozArray[]){
HashMap<Integer,Integer> ozMap = new HashMap<Integer,Integer>();
       
        for(int i=0; i<ozArray.length; i++){
            if(ozMap.containsKey(ozArray[i])){
                ozMap.put(ozArray[i], ozMap.get(ozArray[i]) + 1);
            } else {
                ozMap.put(ozArray[i], 1);
            }
        }
        System.out.println(ozMap);
        
}
  public void printFreqHist(int ozArray[]){
    
     
    
    HashMap<Integer,Integer> ozMap = new HashMap<Integer,Integer>();
    
      for(int i=0; i<ozArray.length; i++){
            if(ozMap.containsKey(ozArray[i])){
                ozMap.put(ozArray[i], ozMap.get(ozArray[i]) + 1);
            } else {
                ozMap.put(ozArray[i], 1);
            }
        }
      
    System.out.println("  " );
    
    for (int i=ozArray.length; i>=0; i-- ) {
       System.out.format(" |");
    for (int j=0; j<=9; j++ ) {
      if(ozMap.containsKey(j)){
        if (ozMap.get(j) >i) {
          System.out.print ("* ");
         }
         else {
           System.out.print("  " );
         }
      }  
      else{
           System.out.print("  ");
      }     
    }
      System.out.println("");
    }
    
    System.out.println("  ------------------");
    System.out.println("  0 1 2 3 4 5 6 7 8 9");
  }
  

}
