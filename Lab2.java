import java.util.*;
import java.io.File;
public class Lab2 {
    public static void main(String[] args) throws Exception {
      File file = new File("MusicData.csv");
      Scanner scan= new Scanner(file).useDelimiter("\\s*,\\s*");
      String lobby;
      String s;
      String [][] data=new String[200][4]; 
      for(int i=0;i<70;i++){
        for(int k=0;k<4;k++){
              data[i][k]=scan.next();

            }  
        s=scan.nextLine();
        
      }
      String[][] report=artists(data);
    }
    public static String[][] artists(String [][] data){
      int count = 0;
      String[][] report = new String[200][2];
      for(int m=0;m<70;m++){
        for(int n=1;n<m;n++){
         
          if(data[m][2] ==data[n][2]){
            count++;
            System.out.println(count);
            break;
          }
          if(m==n){
            report[m][0]=data[m][2];
          System.out.println(report[m][0]);}
        }
      }
      
      
    return report;
    }
}
    
    
  
     
  


