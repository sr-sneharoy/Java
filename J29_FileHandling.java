// Files types => 1) Text File
//                2) Binary Files(image, video, audio)

// 3 Logical Steps of File Handling => 1) Opening a File
//                                     2) Processing
//                                     3) Closing a File

import java.io.*;

public class J29_FileHandling {
  public static void main(String [] args) throws IOException{
    File f1 = new File("J29_file.txt");

    System.out.println(f1.exists());
    System.out.println(f1.canWrite());
    System.out.println(f1.length());

    f1.createNewFile();  // creating a file => this line is the risky line => we need to tell compiler to be ready for IOException => we use throws IOException

    System.out.println(f1.exists());
    System.out.println(f1.canWrite());
    System.out.println(f1.length());
  }
}