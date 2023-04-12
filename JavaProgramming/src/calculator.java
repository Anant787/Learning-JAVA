
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator extends JFrame implements ActionListener {

    JTextField tf1,tf2,tf3,tf4,tf5;

    Calculator(){
        JLabel l1=new JLabel("Marks 1");
        JLabel l2=new JLabel("Marks 2");
        JLabel l3=new JLabel("Marks 3");
        JLabel l4=new JLabel("Marks 4");
        JLabel l5=new JLabel("Result");
        

        JButton b1= new JButton("Calculate");
        JButton b2= new JButton("EXIT");
    

        tf1 = new JTextField(10);
        tf2 = new JTextField(10);
        tf3 = new JTextField(10);
        tf4 = new JTextField(10);
        tf5 = new JTextField(10);
        

        setLayout(new FlowLayout());

        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(tf3);
        add(l4);
        add(tf4);
        add(b1);
        
        add(l5);
        add(tf5);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e){
        String command  = e.getActionCommand();
        int res = 0;
        int m1 = Integer.parseInt(tf1.getText());
        int m2 = Integer.parseInt(tf2.getText());
        int m3 = Integer.parseInt(tf3.getText());
        int m4 = Integer.parseInt(tf4.getText());
        if(command.equals("Calculate")){
            res = (m1+m2+m3+m4)/4;
            tf5.setText(Integer.toString(res));
        }

        if(command.equals("EXIT"))
        {
            System.exit(0);
        }


    } 
    public static void main(String[] args) {

        Calculator obj =new Calculator();

        obj.setSize(1920,1080);
        obj.setVisible(true);
        

    }
    
}
