import java.util.Arrays;
import java.util.ArrayList;


public class PlaneMethod{
  
     int place,x,y,windowIsle;
     boolean tester;
  
   // Creates a plane object that creates all the seats

 
     public int[][] planeMethod(){
    
    
    int[][] plane = {  
      { 0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
      { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
      { 3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
      { 3,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
      { 0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
      {0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0  }
    };
    return plane;
  }
  
  
  // Assign Seats based on Seating Preference 
  int[][] assignSeats(int [][] plane,int planeClass){
        if (planeClass ==  4){ // Checking if the user has no Seating Preference for Economy
           for (int row = 0; row<=plane.length; row++){
               for (int col = 7; col <=plane[0].length; col++){
                    if ( plane[row][col] == 0){
                        plane[row][col]=1;
                        // System.out.println("DEBUG ECONOMY NO PREF\n"+Arrays.deepToString(plane));
                        return plane;
                     }
               }
           }
         }
    
        if (planeClass == 1){//Checking if the user has no Seating Preference for first      
           for (int row = 0; row<=plane.length; row++){
              for (int col =0; col <=6; col++){
                  if ( plane[row][col] == 0){
                    plane[row][col]=1;
                   // System.out.println("DEBUG FIRST CLASS NO PREF\n"+Arrays.deepToString(plane));
                    return plane;
                 }
             }
         }
       }
    
    
    
 if (planeClass == 2 || planeClass == 3){//Checking  the user Seating Preference for First
      windowIsle= 0; x = 0; y = 0;
     
     if (planeClass == 2){
        x = 0;
        y = 5;}
      if (planeClass == 3){
        x = 1;
        y = 4;
       }
       
      
              for (int row = 0; row<= plane.length; row++){
                    for (int col = 7; col <=plane[0].length; col++){
                           if ( plane[x][col] == 0){
                                 System.out.println("row: "+x + " col:" + col);
                                 plane[x][col]=1;
                                
                                 
                                System.out.println("DEBUG FIRST CLASS\n");
                                 for(int[] rows : plane) {
                                       printRow(rows);
                                 }
                                 return plane;    
                                 
                           }
                           else if (plane[y][col] == 0){
                                    System.out.println("row: "+y+ " col:" + col);
                                  plane[y][col]=1;
                                  
                                     System.out.println("DEBUG FIRST CLASS\n");
                                     for(int[] rows : plane) {
                                           printRow(rows);
                                      }
                                  
                                  return plane;
                           }
                      }
                  }
                            
     }
    
  if (planeClass == 5 || planeClass == 6 || planeClass == 7){ //Checking  the user Seating Preference for Economy 
      windowIsle= 0; x = 0; y = 0;
     
      if (planeClass == 5){
        x = 0;
        y = 5;}
      if (planeClass == 6){
        x = 1;
        y = 4;}
      if (planeClass == 7){
        x = 2;
        y = 3;}
       
      
              for (int row = 0; row<= plane.length; row++){
                    for (int col = 7; col <=plane[0].length; col++){
                           if ( plane[x][col] == 0){
                                 System.out.println("row: "+x + " col:" + col);
                                 plane[x][col]=1;
                                
                                 
                              
                                 return plane;    
                                 
                           }
                           else if (plane[y][col] == 0){
                                    System.out.println("row: "+y+ " col:" + col);
                                  plane[y][col]=1;
                                  
                              
                                  
                                  return plane;
                           }
                      }
                  }
                            
     }  
    
    
    return plane;
 }
  
 
    
public void print (int [][] plane){
  System.out.println(" FIRST CLASS ------ | ECONOMY -----------------------------------------------------------------------------------------");
  
    for(int[] rows : plane) {
                                         
       for (int i :rows ) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
   } 
}
  //Assign Seats for Passengers going in groups
    
 int[][] assignSeatsTogether(int[][] plane,int people, boolean planeClass){
    int count;
    if (planeClass == true){
        
        count = 0; int place = -1; int place2=0;
         for (int col = 0; col<=7; col++){
         for (int row = 0; row <=plane[0].length; row++){
             for(int c=people; c>0; c--){
                 place+=1;
                 if ( plane[place][place2] == 3){
                    count += 1;
                    place+=1;
                 }
                if (plane[place][place2]== 1){
                   count = 0;
                   place+=1;      
               }
             plane[place][place2]=1;
             }
             return plane;
           
         }
         }
         }
    
        
    if (planeClass == false){
         for (int [] seat : plane){
        count = 0; place = 7;
       for (int row = 7; row<= plane.length; row++){
         for (int col = 0; col <=plane[0].length; col++){
          if (row < 40){
          if(count == people){
            for (int c = people; c > 0; c--){
              place -= 1;
             place= plane[row][col];
              plane[row][col]=1;
              }
            return plane;
          }
          if ( plane[row][col]== 0){
            count += 1;
            place += 1;}
          if(plane[row][col]== 1){
            count = 0;
            place += 1;
          }
          }

        }
      }
    }
    }
    
    System.out.println("Not enoough room");
    return plane;
  } 
 

  
 
 // Changes the seat foor the passenger if requested
  public int[][] changeSeat(int[][] plane, int x1, int x2, int y1, int y2){
    
    windowIsle = 0;
       for (int [] seat : plane){
          windowIsle += 1;
         if (windowIsle == y1){
           if (plane[x1-1][x1-1]== 1){
              plane[x1-1][x1-1]=0;}
          else{
              System.out.println("Seats are unavailable"); 
              return plane;
           }
         }
       }
      windowIsle = 0;
       for (int[] seat : plane){
          windowIsle += 1;
          if (windowIsle == y2){
            if (plane[x2-1][x2-1] == 0){
              plane[x2-1][x2-1]=1;}
           else{
             System.out.println("Seats are unavailable");
           }
         }
       }
    return plane; 
  }
  
  
  
 public static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
            System.out.print("");
        }
        System.out.println();
  }


}
          
  










                                           
                                           
    