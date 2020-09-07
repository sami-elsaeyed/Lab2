/*Data is input from a CSV file cointainng list of song title artist and number of streams.
 * Code orders list in alphabetical order and prints only unique elements of list based on artist name.
 * Counts total number of times each artist appears in Top 200 list but only prints once.
 * Outputs each unique artist followed by number of appearances.
 */
import java.util.*;
import java.io.File;
public class Lab2 {
    public static void main(String[] args) throws Exception {
      //Create Scanner,input file,2D Array
      File file = new File("MusicData.csv");
      Scanner scan= new Scanner(file).useDelimiter("\\s*,\\s*");
      String s;
      String [][] data=new String[200][4]; 
      //Nested 'for' loop to fill in array 
      for(int i=0;i<70;i++){
        for(int k=0;k<4;k++){
          data[i][k]=scan.next();
        }  
        s=scan.nextLine(); 
      }
      //Methods take care of ordering and getting rid of repetitons in the original list.
      sort(data);
      String[][] report=artists(data);
    }/*Method recieves 4 column array and creates a new array with two columns.
     * Artists that repeat are only entered into the new array once.
     * For each repetition the second column of that artist's row increments by one.
     * Prints new array name of artists and number of reptitions.
     * Returns new array to main method
     */
    public static String[][] artists(String [][] data){
      String[][] report = new String[200][2];
      //Double nested for loop
      for(int m=0;m<70;m++){
        boolean print=true;
        int repeat=0;
        //nested loop that prints unique artist names 
        for(int n=0;n<m;n++){
          if(data[m][2].equals(data[n][2])){
            print=false;
            break;
          }
        }
        if(print){
          report[m][0]=data[m][2];
          //nested loop that counts repetitons
          for(int k=0;k<70;k++){
            if(report[m][0].equals(data[k][2])){
            repeat++;
            }  
          }
          System.out.format("%-30s%-5d\n",report[m][0],repeat);
        }
      }
    return report;
    }/*Method recieves 4 column array
     * Bubble sort array in ascending alphabetical order.
     */
    public static void sort(String[][] data){
      boolean swapped;
      String temp;
      do{
        swapped=false;
        for(int d=0;d<69;d++){
          if(data[d][2].compareTo(data[d+1][2])>0){
            temp=data[d][2];
            data[d][2]=data[d+1][2];
            data[d+1][2]=temp;
            swapped=true;
          } 
        }
      }while(swapped);
    }
}

    
    
    

    
    
  
     
  


