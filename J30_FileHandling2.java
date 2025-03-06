//FileOutputStream  => 1) FileOutputStream(File f1)
//                  => 2) FileOutputStream(File f1, Boolean append)
//                  => 3) FileOutputStream(String path)
//                  => 4) FileOutputStream(String path, Boolean append)

import java.io.*;
public class J30_FileHandling2 {
  public static void main(String [] args) throws IOException{
    File h1 = new File("J30_File.txt");    
    FileOutputStream f1 = new FileOutputStream(h1);  // risky line  // by default Boolean append is "false"   
    f1.write('c');
    // f1.write('h');  // we cannot append here => 'c' will be delete and only char 'h' will be there
    // if append is true then it will be "ch"

    f1.close();

    String str = "Hello World!!!";
    char ch[] = str.toCharArray();  // convert to character array since we can only append characters

    FileOutputStream f2 = new FileOutputStream("J30_File2.txt", true);  
    for (int i = 0; i < ch.length; i++){
      f2.write(ch[i]);
    }
    f2.close();
  }
}
