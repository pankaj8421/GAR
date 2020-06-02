package j.core;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Filelinecount

{
   public static void main(String[] args) throws IOException 
   {
      File f1=new File("D://java/lang/String.java"); //Creation of File Descriptor for input file
      int linecount=0;            //Intializing linecount as zero
      FileReader fr=new FileReader(f1);  //Creation of File Reader object
      BufferedReader br = new BufferedReader(fr);    //Creation of File Reader object
      String s;              
      while((s=br.readLine())!=null && br.readLine()!="import" && br.readLine()!="*" && br.readLine()!="/*")    //Reading Content from the file line by line
      {
         linecount++;               //For each line increment linecount by one 
            
      }
      fr.close();
      System.out.println("Number of lines in the Files:"+linecount); //Print the line count
   }

}