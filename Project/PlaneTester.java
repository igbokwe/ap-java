import java.util.ArrayList;
import java.util.Scanner;
public class PlaneTester{
public static void main(String[] args){

  PlaneMethod method = new PlaneMethod();
  int[][] plane = new int [6][40];
Scanner input = new Scanner(System.in);

plane = method.planeMethod();
    boolean stop = false;
    while (stop == false){
       System.out.println("\n Key: \n 3=Seat is unavalible \n 1=Assigned Seat \n 0=Seat is Avalible");
      System.out.println("HOME MENU: \n 1:ASSIGN_SEATS- \n 2:CHANGE_SEATS- \n 3:SHOW SEATING- \n 4:HELP- \n 5:QUIT-");
      int command = input.nextInt();
      if (command == 1){
        System.out.println("Are you flying alone or together? \n 1:ALONE \n 2:TOGETHER");
        int command2 = input.nextInt();
        
        
        
        
        if (command2 == 1){
           System.out.println("\n---PREFERENCE LIST--- \n Enter which Flight class your going on and Seating Preference  \n 1:FIRST_CLASS - NO PREFERENCE \n 2:FIRST_CLASS - WINDOW SEAT \n 3:FIRST_CLASS - AISLE SEAT \n 4: ECONOMY - NO PREFERENCE \n 5:ECONOMY - WINDOW SEAT \n 6:ECONOMY - MIDDLE SEAT \n 7:ECONOMY - AISLE SEAT");
          int command3 = input.nextInt();
          if (command3 == 1){
            plane = method.assignSeats(plane, 1);
            method.print(plane);
          }
          if (command3 == 4){
            plane = method.assignSeats(plane, 4);
            method.print(plane);
          }
          if (command3 == 3){
            plane = method.assignSeats(plane, 3);
            method.print(plane);
          }
          if (command3 == 2){
            plane = method.assignSeats(plane, 2);
            method.print(plane);
          }
          if (command3 == 5){
            plane = method.assignSeats(plane, 5);
            method.print(plane);
          }
          if (command3 == 6){
            plane = method.assignSeats(plane, 6);
            method.print(plane);
          }
          if (command3 == 7){
            plane = method.assignSeats(plane, 7);
            method.print(plane);
          }
          
          
          /* FLYING TOGETHER*/ 
          
          
          
          
        }
        if (command2 == 2){
          System.out.println("\n---PREFERENCE LIST--- \n Enter which Flight class your going on  \n 1:FIRST_CLASS = UP TO 4 PEOPLE \n 2:ECONOMY = UP TO 6 PEOPLE");
          int command3 = input.nextInt();
          System.out.println("HOW MANY PEOPLE ARE YOU FLYING WITH?");
          int people = input.nextInt();
          if (command3 == 1 && people <= 4){
            plane = method.assignSeatsTogether(plane,people,true);//return true if the user enters 1  and the number of passengers is 4 or less
            method.print(plane);
          }
          if (command3 == 2 && people <= 6){
            plane = method.assignSeatsTogether(plane,people,false);//return false if the user enters 2  and the number of passengers is 6 or less
            method.print(plane);
          }
                                                
        }
      }
  
        
      
                /* END OF ASSIGN SEAT
                   START OF RE-ARRANGE */
      
      
      
      
      if (command == 2){
        System.out.println("WHAT SEAT ARE YOU CURRENTLY IN?");
        System.out.println("Columns:");
        int x1 = input.nextInt();
        System.out.println("ROW:");
        int y1 = input.nextInt();
        System.out.println("NOW ENTER WHERE YOU WOULD LIKE TO MOVE");
        System.out.println("Row:");
        int x2 = input.nextInt();
        System.out.println("Columns:");
        int y2 = input.nextInt();
       plane = method.changeSeat(plane, x1, x2, y1, y2);
        method.print(plane);
        
      }
      if (command == 3){
        method.print(plane);
      }
      if (command == 4){//prints out instruction and key 
        System.out.println("HELP:\n READING THE MAP: \n  - 0 REPRESENTS THAT THE SEAT IS NOT TAKEN\n  - 1 REPRESENTS THE ASSIGNED SEAT \n  - 3 REPESENTS THAT THE SEAT IS NOT AVALIABLE \n ASSIGNING A SEAT: \n  - READ THE TEXT AND REPLY WITH THE \n  NUMBER THAT REPRESENTS YOUR \n  DESIRED CHOICE");
      }
      if (command == 5){
        stop = true;
      }
    }
  }
}
    