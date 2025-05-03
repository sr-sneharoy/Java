import java.io.*;

public class J38_FileHandling {
    public static void main(String[] args) {
        // File handling in Java
        // 1. File class
        // 2. FileReader and FileWriter classes
        // 3. BufferedReader and BufferedWriter classes
        // 4. PrintWriter class
        // 5. FileInputStream and FileOutputStream classes

        // Writeing to a file using FileWriter and BufferedWriter
        try {
            FileWriter fw = new FileWriter("example.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello, World!");
            bw.newLine();
            bw.write("This is a file handling example.");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        

        // Example: Reading a file using FileReader and BufferedReader
        try {
            FileReader fr = new FileReader("example.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
