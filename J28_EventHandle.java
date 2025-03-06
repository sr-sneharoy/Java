import javax.swing.*;
import java.awt.event.*;

class Log implements ActionListener {
  J28_EventHandle ref;

  Log(J28_EventHandle ref) {
    this.ref = ref;
  }

  public void actionPerformed(ActionEvent e1) {
    if (e1.getSource() == ref.b1) { // Login Button
      String s1 = ref.t1.getText();
      String s2 = ref.t2.getText(); 
      if (s1.equals("sneha") && s2.equals("HWorld")) {
        ref.l4.setText("Login Successful!!!");
      } else {
        ref.l4.setText("Login Unsuccessful!!!");
      } 
    } else if (e1.getSource() == ref.b2) { // Clear Button
      ref.t1.setText("");
      ref.t2.setText("");
      ref.l4.setText("");
    }
  }
}

public class J28_EventHandle extends JFrame {
  JLabel l1, l2, l3, l4;
  JTextField t1;
  JPasswordField t2;
  JButton b1, b2;

  J28_EventHandle(String str) {
    super(str);
  }

  void setComponents() {
    l1 = new JLabel("Hello There!!!");
    l2 = new JLabel("Username");
    l3 = new JLabel("Password");
    l4 = new JLabel();
    t1 = new JTextField();
    t2 = new JPasswordField();
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

    // Event Handling with Reference to J28_EventHandle
    Log eventHandler = new Log(this);
    b1.addActionListener(eventHandler);
    b2.addActionListener(eventHandler);
  }

  public static void main(String[] args) {
    J28_EventHandle j1 = new J28_EventHandle("Hello World!!!");

    j1.setSize(600, 400);
    j1.setComponents();
    j1.setVisible(true);
    j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
