//This is a simple java Login Application Page created using "Swing concept".
//java
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class LoginPage 
{
    public static void main(String[] args) 
    {
        JFrame f=new JFrame("Login Page");
        ImageIcon i=new ImageIcon("C:\\Users\\Varun\\OneDrive\\Pictures\\Email Icon.png");
        Image resize=i.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH);
        ImageIcon resized=new ImageIcon(resize);
        JLabel l=new JLabel("EMAIL LOGIN PAGE",resized,JLabel.LEFT);
        l.setBounds(180,50,250,150);
        JLabel l1=new JLabel("Enter your Email ID:");
        l1.setBounds(100,150,150,100);
        JTextField t1=new JTextField("abc@gmail.com",30);
        t1.setBounds(100,220,300,40);
        JLabel l2=new JLabel("Enter your password:");
        l2.setBounds(100,230,150,100);
        JPasswordField p1=new JPasswordField(20);
        p1.setBounds(100,300,300,40);
        JLabel l3=new JLabel("Forgot password");
        l3.setBounds(100,320,150,100);
        JButton bp1=new JButton("👁");
        bp1.setBounds(450,300,50,35);
        JButton b1=new JButton("Submit");
        b1.setBounds(100,400,100,50);
        JButton b2=new JButton("Cancel");
        b2.setBounds(350,400,100,50);
       
        //Buttons creation starts from here.
        
        bp1.addActionListener(new ActionListener()
        {
            public boolean isPasswordVisible=false;
            public void actionPerformed(ActionEvent e)
            {
                if(isPasswordVisible)
                {
                    p1.setEchoChar('*');
                }
                else
                {
                    p1.setEchoChar((char) 0);
                }
                isPasswordVisible=!isPasswordVisible;
            }
        });
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String s1=t1.getText();
                String s2=p1.getText();
                System.out.println("Hi"+" "+s1+" "+"Welcome.\n");
                System.out.println("Here are your deatils:");
                System.out.println("Email ID:"+" "+s1+"\n"+"Pssword:"+" "+s2);
            }
        });
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("\nYou have canceled your details.\nPlaese re-fill the form again.");
            }
        });
        f.add(l);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(p1);
        f.add(l3);
        f.add(bp1);
        f.add(b1);
        f.add(b2);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
