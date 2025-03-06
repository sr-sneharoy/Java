import javax.swing.*;

public class J27_JFrameChild extends JFrame {

  JLabel l1, l2, l3, l4;
  JTextField t1, t2;
  JButton b1, b2;

  J27_JFrameChild(String str){
    super(str);
  }

  J27_JFrameChild(){

  }
  void setComponents(){
    l1 = new JLabel("Hello There!!!");
    l2 = new JLabel("Username");
    l3 = new JLabel("Password");
    l4 = new JLabel();
    t1 = new JTextField(); 
    t2 = new JTextField(); 
    b1 = new JButton("Login");
    b2 = new JButton("Clear");
    setLayout(null);
    add(l1);
    add(l2);
    add(l3);
    add(l4);
    add(t1);
    add(t2);
    add(b1);
    add(b2);
    l1.setBounds(300, 50, 300, 30);
    l2.setBounds(100, 100, 200, 30);
    l3.setBounds(100, 150, 200, 30);
    l4.setBounds(100, 200, 300, 30);
    t1.setBounds(250, 100, 300, 30);
    t2.setBounds(250, 150, 300, 30);
    b1.setBounds(150, 250, 150, 30);
    b2.setBounds(350, 250, 150, 30);
  }

  public static void main(String[] args){
    J27_JFrameChild j1 = new J27_JFrameChild("Hello World!!!");  

    j1.setSize(600, 400); 
    j1.setVisible(true); 
    j1.setComponents(); 
    j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  }
}
