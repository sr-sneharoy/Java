import javax.swing.*;

public class J26_GUI_Basic {
  public static void main(String[] args){
    JFrame j1 = new JFrame("Welcome Here.....");  // to create a frame

    j1.setSize(500, 500);  // to set frame size

    j1.setVisible(true);  // to show the frame  => by default its value is false

    j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // to give functionality to the close button
  }
}
