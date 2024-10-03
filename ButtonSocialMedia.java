import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonSocialMedia {

    public static String s;
    public static String stxt;
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ButtonSocialMedia::frame1);
    }
    //frame 1 is describing about the buttons creation and adding actions to each of them.
    public static void frame1()
    {
        JFrame f=new JFrame();
        JLabel l=new JLabel("SOCIAL MEDIA PLATFORM:");
        l.setFont(new Font("Font",Font.BOLD,20));
        l.setBounds(210,30,500,100);
        //Button 1.
        JLabel l1=new JLabel("1.WhatsApp");
        l1.setFont(new Font("Font",Font.BOLD,15));
        l1.setBounds(100,100,300,50);
        ImageIcon i1=new ImageIcon("C:\\Users\\Varun\\OneDrive\\Pictures\\whatsapp.jpg");
        Image ia=i1.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ImageIcon ia1=new ImageIcon(ia);
        JButton b1=new JButton(ia1);
        b1.setBounds(100,150,100,100);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s="WhatsApp";
                frame2();
            }
        });
        //Button 2.
        JLabel l2=new JLabel("2.LinkedIn");
        l2.setFont(new Font("Font",Font.BOLD,15));
        l2.setBounds(500,100,300,50);
        ImageIcon i2=new ImageIcon("C:\\Users\\Varun\\OneDrive\\Pictures\\linkedIn.png");
        Image ib=i2.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ImageIcon ib1=new ImageIcon(ib);
        JButton b2=new JButton(ib1);
        b2.setBounds(500,150,100,100);
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s="LinkedIn";
                frame2();
            }
        });
        //Button 3.
        JLabel l3=new JLabel("3.Twitter");
        l3.setFont(new Font("Font",Font.BOLD,15));
        l3.setBounds(100,300,300,50);
        ImageIcon i3=new ImageIcon("C:\\Users\\Varun\\OneDrive\\Pictures\\twitter.png");
        Image ic=i3.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ImageIcon ic1=new ImageIcon(ic);
        JButton b3=new JButton(ic1);
        b3.setBounds(100,350,100,100);
        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s="Twitter";
                frame2();
            }
        });
        //Button 4.
        JLabel l4=new JLabel("4.Instagram");
        l4.setFont(new Font("Font",Font.BOLD,15));
        l4.setBounds(500,300,300,50);
        ImageIcon i4=new ImageIcon("C:\\Users\\Varun\\OneDrive\\Pictures\\instagram.png");
        Image id=i4.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ImageIcon id1=new ImageIcon(id);
        JButton b4=new JButton(id1);
        b4.setBounds(500,350,100,100);
        b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s="Instagram";
                frame2();
            }
        });
        //Button 5.
        JLabel l5=new JLabel("5.FaceBook");
        l5.setFont(new Font("Font",Font.BOLD,15));
        l5.setBounds(100,500,300,50);
        ImageIcon i5=new ImageIcon("C:\\Users\\Varun\\OneDrive\\Pictures\\facebook.png");
        Image ie=i5.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ImageIcon ie1=new ImageIcon(ie);
        JButton b5=new JButton(ie1);
        b5.setBounds(100,550,100,100);
        b5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s="FaceBook";
                frame2();
            }
        });
        //Button 6.
        JLabel l6=new JLabel("6.YouTube");
        l6.setFont(new Font("Font",Font.BOLD,15));
        l6.setBounds(500,500,300,50);
        ImageIcon i6=new ImageIcon("C:\\Users\\Varun\\OneDrive\\Pictures\\Youtube_logo.png");
        Image iff=i6.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ImageIcon iff1=new ImageIcon(iff);
        JButton b6=new JButton(iff1);
        b6.setBounds(500,550,100,100);
        b6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s="YouTube";
                frame2();
            }
        });
        f.setTitle("Social Media Platforms.");
        f.setLayout(null);
        f.add(l);
        f.add(l1);
        f.add(b1);
        f.add(l2);
        f.add(b2);
        f.add(l3);
        f.add(b3);
        f.add(l4);
        f.add(b4);
        f.add(l5);
        f.add(b5);
        f.add(l6);
        f.add(b6);
        f.setLocationRelativeTo(null);
        f.setSize(800,800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //frame 2 is create for taking "userName" as an input from user.
    public static void frame2()
    {
        JFrame f1=new JFrame();
        JLabel la=new JLabel("FILL THE FIELD:");
        la.setFont(new Font("B",Font.BOLD,20));
        la.setBounds(100,50,300,50);
        JLabel la1=new JLabel("Enter Your Name:");
        la1.setBounds(100,100,300,50);
        JTextField txt=new JTextField("ABC",20);
        txt.setBounds(230,110,200,30);
        JButton button=new JButton("Submit");
        button.setBounds(100,150,100,50);
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e1)
            {
                stxt=txt.getText();
                frame3();
            }
        });
        f1.setTitle("UserName.");
        f1.setLayout(null);
        f1.add(la);
        f1.add(la1);
        f1.add(txt);
        f1.add(button);
        f1.setLocationRelativeTo(null);
        f1.setSize(500,300);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //frame 3 is displaying a "Welcome" message by taking user input "name" from "frame 2" and "platform name" from "framr 1".
    public static void frame3()
    {
        JFrame f2=new JFrame();
        JLabel lb=new JLabel("Hello,"+" "+stxt+" "+"Welcome to"+" "+s+"!!");
        lb.setFont(new Font("C",Font.ITALIC,30));
        lb.setBounds(100,50,700,100);
        f2.setTitle("Welcome To Social Media.");
        f2.setLayout(null);
        f2.add(lb);
        f2.setSize(800,300);
        f2.setLocationRelativeTo(null);
        f2.setVisible(true);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

