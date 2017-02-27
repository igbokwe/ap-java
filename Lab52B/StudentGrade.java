

    public class StudentGrade {
      
         private  String name;            
          private int homeworkAverage;
          private  int midtermScore;
         private int peformaceFinalScore;
         private int mutiplechoiceFinalScore;
         private int testAverage ;
         private int quizAverage;
         private int overallAverage;
        private int dropedScore ;
        private int replacedScore;
        
        private static int header ; // report header counter
      
          
      public StudentGrade(String name2,int[]array2,int[]array,int homeworkgrade, int mf, int pf, int mcf){
        homeworkAverage = homeworkgrade;
         midtermScore = mf;
         peformaceFinalScore = pf;
          mutiplechoiceFinalScore = mcf;
       name=name2;
        
         
        
         int dex = 0;
         int dex2=0;
         int sum=0;
         int sum2=0;
         
        // int [] newarray = new int [array2.length - 1];
         
          replacedScore = Integer.MAX_VALUE;
          
          for(int b =0;b<array.length;b++) {
                if(replacedScore > array[b]) {
                  replacedScore = array[b]; 
                  dex = b;
               }
            }
           array[dex] = mcf;  
           
            
            for (int c = 0; c <array.length; c++){
                sum= sum+array[c];
             }
           
            testAverage=sum/array.length; 
            
                       
           dropedScore = Integer.MAX_VALUE;
          
            for(int f =0;f<array2.length;f++) {
               if(dropedScore > array2[f]) {
                dropedScore= array2[f];
                dex2 =f ;
              }
            }
            
            
           
            
          

for(int x=0; x < array2.length; x++)
{
  if(!(array2[x] == dropedScore))
   {     
     sum2=sum2 + array2[x];  
   }
}
             

              
             quizAverage=sum2/(array2.length -1);
             
            
              
                        
            overallAverage =this.average() ; //calculate average
      
             
                              

       
      }
      public void gradesReport(){
        
        if (header == 0 ) {
           System.out.print("Name     ");  
          System.out.print("TestAvg ");
          System.out.print("QuizAvg ");  
           System.out.print("MidTerm ");
           System.out.print("PerfFinal ");
           System.out.print("McFinal ");
            System.out.print("QuizDroped ");   
           System.out.print("TestRepl ");
           System.out.println("FinalAverage ");
           
           
            System.out.print("_________ ");
            System.out.print("________ ");
            System.out.print("________ ");
            System.out.print("________ ");
            System.out.print("________ ");
            System.out.print("________ ");
            System.out.print("________ ");
            System.out.print("________ ");
            System.out.println("_________ ");
             
             header= 1 ;
        
        }
        
        
              System.out.format("%10s",name);
               System.out.format("%9d", testAverage);              
             System.out.format("%9d", quizAverage);  
              System.out.format("%9d",midtermScore);
       System.out.format("%9d",peformaceFinalScore);
            System.out.format("%9d", mutiplechoiceFinalScore); 
               System.out.format("%9d",dropedScore);
              System.out.format("%9d",  replacedScore);  
               System.out.format("%9d%n", overallAverage); 
            //     System.out.print(dropedScore);
            //  System.out.print(replacedScore);  
            //   System.out.print( overallAverage); 
      }
           
        public int average () {
          double g = .05;
            double f = .30;
           double e= .40;
           double n = .15;
           
           int ozAverageInt;
           
            
           
           
            Double ozAverage = ((testAverage *e + quizAverage *f + homeworkAverage*g + midtermScore*g + peformaceFinalScore*g+  mutiplechoiceFinalScore*n) );
            

            ozAverageInt=ozAverage.intValue();
            return ozAverageInt;
    }
   
        
    }