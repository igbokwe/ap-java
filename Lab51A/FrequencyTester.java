import java.util.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class FrequencyTester{
  public static void main(String args[]) {

Scanner keyboard = new Scanner(System.in);
System.out.println("enter an integer");
int ozInt = keyboard.nextInt();

 int[] ozArray = new int[ozInt]; 
    for (int i = 0; i<ozArray.length; i++) { 
      ozArray[i] = ThreadLocalRandom.current().nextInt(1,10);
       System.out.println (ozArray[i]); 
    }
    



 Frequency ozFreq = new Frequency ();
 
 ozFreq.getFreqDest(ozArray);
 ozFreq.printFreqHist(ozArray);

   

  //   System.out.println(Arrays.asList(counter)); // method 1




  }
  
}