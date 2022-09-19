import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BillSplit implements ActionListener {
    JFrame f;
    JButton Split, Cancel;
    JTextField t1, t2, t3;
    JTextArea txt1,txt2,txt3;
    static double a = 0, b = 0, result = 0;

    BillSplit() {
        f = new JFrame("Bill Splitter");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        Split = new JButton("Split");
        Cancel = new JButton("Cancel");
        t1.setBounds(30, 90, 280, 30);
        t2.setBounds(30, 170, 280, 30);
        t3.setBounds(30, 250, 280, 30);
        txt1 = new JTextArea("Enter Amount to Split");
        txt1.setEditable(false);


        txt2 = new JTextArea("Split into");
        txt3= new JTextArea("Amount per person");
        txt2.setEditable(false);
        txt3.setEditable(false);
        txt1.setBackground(Color.cyan);
        txt2.setBackground(Color.cyan);
        txt3.setBackground(Color.cyan);

        txt1.setBounds(30,50,280,30);
        txt2.setBounds(30,130,280,30);
        txt3.setBounds(30,210,280,30);
        Split.setBounds(60,380,100,40);
        Cancel.setBounds(180,380,100,40);
        f.add(txt1);
        f.add(t1);
        f.add(txt2);
        f.add(txt2);
        f.add(t2);
        f.add(txt3);
        f.add(t3);
        f.add(Split);
        f.add(Cancel);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Split.addActionListener(this);
        Cancel.addActionListener(this);



    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==Split){
            if (t1.getText()==null){
                t3.setText("Please enter valid amount to split");
                return;
            }
            if (t2.getText()==null){
                t3.setText("Please enter valid number to split");
                return;
            }
            a=Double.parseDouble(t1.getText());
            b=Double.parseDouble(t2.getText());

            result=a/b;
            t3.setText(""+result);
        }
        if (e.getSource()==Cancel){
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }

    public static void main(String...s)
    {
        new BillSplit();
    }
}