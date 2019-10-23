import java.util.Scanner;  // Access the Scanner class
import java.io.*;          // Access PrintWriter and related classes
import java.io.*;                   //    PrintWriter file class
import java.text.DecimalFormat;     //    Padding methods
import java.util.Scanner;           //    partiallyFillArray method
import java.text.SimpleDateFormat;  //    getCurrentTime method
import java.util.Calendar;          //    getCurrentTime method
import java.util.Date;   

/**
  public static String leftPad (double number, 
                                 int width, 
                                 String mask, 
                                 String padding) {
      final String NO_RIGHT_PAD = "";  // No padding on the right
      String strPad;                   // String to be returned
   
      //  1. Convert number to a String and
      //  2. Use the string padding method to finish the job

      DecimalFormat fmt = new DecimalFormat(mask);
      strPad = padString(fmt.format(number), width, padding, NO_RIGHT_PAD);
      return strPad;
   } // end leftPad, 4 parameters
*/



public class project2 {

   public static void ExplainProgram(){
   System.out.println("This program calculated the reimbursements from specific gas mileages.");
   }
   
   public static void FileScan(String[] args) throws IOException{
   
      final String INPUT_FILE  = "DanielMartinez_2_01_Input.txt";
      final String OUTPUT_FILE = "DanielMartinez_2_01_Output.txt";
      
      int numInputLines = 0;           // Number of lines in the input file
      int numValidLines = 0;           // Number of valid lines in the input file
      int numInvalidLines = 0;         // Number of invalid lines read
     
      File inputDataFile = new File(INPUT_FILE);
      Scanner inputFile  = new Scanner(inputDataFile);
      
      FileWriter outputDataFile = new FileWriter(OUTPUT_FILE);
      PrintWriter outputFile = new PrintWriter(outputDataFile);
      
      while (inputFile.hasNext()) {
         numInputLines++;
      }//first loop
      
      double[] gasolina = new double[numInputLines];
      for(int i = 0; i<11; i++){
         gasolina[i] = inputFile.nextDouble();
         System.out.println(gasolina[i]);
         }
         
   
   }
   public static void main(String[] args) throws IOException {
   
   FileScan();
   }
 
 /*
   public static void FillData(){
   
      File inputDataFile = new File(INPUT_FILE);
      Scanner inputFile  = new Scanner(inputDataFile);
      
      FileWriter outputDataFile = new FileWriter(OUTPUT_FILE);
      PrintWriter outputFile = new PrintWriter(outputDataFile);
   
      double[] gasolina = new double[11];
   
      for(int i = 0; i<11; i++){
            gasolina[i] = inputFile.nextDouble();
         }
         
   }
   */

/* //Closing
   public static void main(String[] args) throws IOException {
   //ExplainProgram();
   
      final String INPUT_FILE  = "DanielMartinez_2_01_Input.txt";
      final String OUTPUT_FILE = "DanielMartinez_2_01_Output.txt";
      
      int numInputLines = 0;           // Number of lines in the input file
      int numValidLines = 0;           // Number of valid lines in the input file
      int numInvalidLines = 0;         // Number of invalid lines read
      
      double[] gasolina = new double[11];
      double gas;
      
      File inputDataFile = new File(INPUT_FILE);
      Scanner inputFile  = new Scanner(inputDataFile);
      
      FileWriter outputDataFile = new FileWriter(OUTPUT_FILE);
      PrintWriter outputFile = new PrintWriter(outputDataFile);
     
      outputFile.println("Mileage     Reimbursement");
      outputFile.println("-------     -------------");
      System.out.println("Mileage     Reimbursement");
      System.out.println("-------     -------------");
      
         for(int i = 0; i<11; i++){
         gasolina[i] = inputFile.nextDouble();
         }
      
      while (inputFile.hasNext()) {
         
      
      }//first loop
      
      
      for(int j = 0; j < 10; j++){
      if(gasolina[j]<400){
      System.out.printf("%.1f            ",gasolina[j]);
      outputFile.printf("%.1f            ",gasolina[j]);
         gasolina[j] *= .18;
         outputFile.printf("%.2f \n", gasolina[j]);
         System.out.printf("%.2f \n", gasolina[j]);
       }//if end
       else if((gasolina[j]>=400)&&(gasolina[j]<900)){
       System.out.print(gasolina[j] + "           ");
      outputFile.print(gasolina[j] + "           ");
         gasolina[j] = (gasolina[j]*.15) + 65;
         outputFile.printf("%.2f \n", gasolina[j]);
         System.out.printf("%.2f \n", gasolina[j]);
       }
       else if((gasolina[j]>=900)&&(gasolina[j]<1300)){
       System.out.print(gasolina[j] + "           ");
      outputFile.print(gasolina[j] + "           ");
         gasolina[j] = (gasolina[j]*.12) + 115;
         outputFile.printf("%.2f \n", gasolina[j]);
         System.out.printf("%.2f \n", gasolina[j]);
       }
       else if((gasolina[j]>=1300)&&(gasolina[j]<1900)){
       System.out.print(gasolina[j] + "           ");
      outputFile.print(gasolina[j] + "           ");
         gasolina[j] = (gasolina[j]*.10) + 140;
         outputFile.printf("%.2f \n", gasolina[j]);
         System.out.printf("%.2f \n", gasolina[j]);
       }
       else if((gasolina[j]>=1900)&&(gasolina[j]<2600)){
       System.out.print(gasolina[j] + "           ");
      outputFile.print(gasolina[j] + "           ");
         gasolina[j] = (gasolina[j]*.08) + 165;
         outputFile.printf("%.2f \n", gasolina[j]);
         System.out.printf("%.2f \n", gasolina[j]);
       }
       else if(gasolina[j]>=2600){
       System.out.print(gasolina[j] + "           ");
      outputFile.print(gasolina[j] + "           ");
         gasolina[j] = (gasolina[j]*.06) + 195;
         outputFile.printf("%.2f \n", gasolina[j]);
         System.out.printf("%.2f \n", gasolina[j]);
       }
      }

      
      inputFile.close();       
      outputFile.close();
      System.exit(0);	
      
   } // End main
   
 */  
 }// End of class
 