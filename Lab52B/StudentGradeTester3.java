import java.util.Scanner;
import java.util.ArrayList;

    public class StudentGradeTester3 {

      public static void main(String[] args) {
        ArrayList<StudentGrade> studentRoster = new ArrayList<StudentGrade>();
      
     // StudentGrade[] studentRoster = new StudentGrade[5];  // Array of studens grades

 
      for ( int students = 0 ; students <5 ; students ++){
        
        String name2; int [] array; int [] array2;
        Scanner scanner = new Scanner(System.in);
          
        System.out.print("Enter Name = ");
        name2= (scanner.nextLine());

        System.out.println("Enter 5 Test Grades");
        array = new int[5];
        for (int c = 0; c < 5; c++){
             array[c] = Integer.parseInt(scanner.nextLine());         
         }
        
         
         System.out.println("Enter 6 Quiz Grades");
         array2 = new int[6];
          for (int c = 0; c < 6; c++){
               array2[c] = Integer.parseInt(scanner.nextLine());
          }
          
          
          System.out.println("Enter Homework Grade = ");
          int homeworkgrade = Integer.parseInt(scanner.nextLine());
          
          System.out.println("Enter MF Grade = ");
           int mf = Integer.parseInt(scanner.nextLine());
          
          System.out.println("Enter PF Grade = ");
          int pf= Integer.parseInt(scanner.nextLine());
          
          System.out.println("Enter MCF Grade = ");
          int mcf = Integer.parseInt(scanner.nextLine());
              

          StudentGrade student = new StudentGrade(name2,array2, array,homeworkgrade,mf,pf,mcf);
           studentRoster.add(student) ;
        }

   
              
          for ( int students = 0 ; students < 5; students++ ){
            studentRoster.get(students).gradesReport();
                 }
            
           }
        
      }
          
   

   
