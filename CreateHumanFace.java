import javax.swing.*;
import java.awt.Graphics;
import java.awt.Canvas;
import java.awt.Color;
public class CreateHumanFace extends Canvas{
    public void paint(Graphics g)
    {
        //Setting the Background color.
        setBackground(Color.LIGHT_GRAY);
        
        //Drawing the string "Human Face".
        g.setColor(Color.GREEN);
        g.drawString("Human Face",370,50);
        
        //Done by.
        g.setColor(Color.BLUE);
        g.drawString("Art by : Rohith Reddy.G.K",330,400);
        
        //Drawing the face.
        g.setColor(Color.YELLOW);
        g.drawOval(300,100,200,220);
        g.fillOval(300,100,200,220);
        
        //Drawing left eye.
        g.setColor(Color.BLACK);
        g.drawOval(350,150,20,30);
        g.fillOval(350,150,20,30);
        
        //Drawing the sclera of left eye.
        g.setColor(Color.WHITE);
        g.drawOval(354,165,12,15);
        g.fillOval(354,165,12,15);
        
        //Drawing the pupil of left eye.
        g.setColor(Color.BLACK);
        g.drawOval(356,167,8,10);
        g.fillOval(356,167,8,10);
        
        //Drawing an left eye arc.
        g.setColor(Color.BLACK);
        g.drawArc(345,140,30,25,-180,-180);
        
        //Drawing right eye.
        g.setColor(Color.BLACK);
        g.drawOval(430,150,20,30);
        g.fillOval(430,150,20,30);
        
        //Drawing the sclera of right eye.
        g.setColor(Color.WHITE);
        g.drawOval(434,165,12,15);
        g.fillOval(434,165,12,15);
        
        //Drawing the pupil of right eye.
        g.setColor(Color.BLACK);
        g.drawOval(436,167,8,10);
        g.fillOval(436,167,8,10);
        
        //Drawing an right eye arc.
        g.setColor(Color.BLACK);
        g.drawArc(425,140,30,25,-180,-180);
        
        //Drawing a vertical line as nose.
        g.setColor(Color.BLACK);
        g.drawLine(400,195,400,235);
        
        //Drawing a horizontal line for mouth.
        g.setColor(Color.BLACK);
        g.drawLine(375,260,430,260);
        
        //Drawing an arc showcasing the lips.
        g.setColor(Color.RED);
        g.drawArc(375,238,55,45,180,180);
        g.fillArc(375,238,55,45,180,180);
        
        //Drawing an inverted arc as a chin.
        g.setColor(Color.BLACK);
        g.drawArc(391,295,20,15,-180,-180);
        
        //Drawing an outline for face.
        g.setColor(Color.BLACK);
        g.drawOval(300,100,200,220);
    }
    public static void main(String[] args) {
        JFrame f=new JFrame();
        CreateHumanFace hf=new CreateHumanFace();
        f.setTitle("Creating Human Face using built-in methods of Graphics class.");
        f.add(hf);
        hf.setBounds(0,0,1000,1000);
        f.setLayout(null);
        f.setSize(800,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
