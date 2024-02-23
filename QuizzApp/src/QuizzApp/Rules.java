package QuizzApp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener
{

    JButton Start , Back ;
    Rules()
    {

        JLabel l1 = new JLabel("Welcome to Quizz Test");
        l1.setForeground(new Color(22, 99, 54));
        l1.setFont(new Font("Raleway", Font.BOLD, 28));
        l1.setBounds(250, 100, 450, 30);
        add(l1);

        JLabel l2 = new JLabel("Rules:");
        l2.setForeground(new Color(22, 99, 54));
        l2.setFont(new Font("Raleway", Font.BOLD, 28));
        l2.setBounds(100, 150, 700, 22);
        add(l2);

        JLabel rules = new JLabel();
        rules.setForeground(new Color(22, 99, 54));
        rules.setFont(new Font("Raleway", Font.PLAIN, 16));
        rules.setBounds(100, 160, 700, 350);
        rules.setText( "<html>"+
                "1. Participation in the quiz is free and open to all persons above 18 years old." + "<br><br>" +
                "2. There are a total 10 questions. " + "<br><br>" +
                "3. You only have 15 seconds to answer the question." + "<br><br>" +
                "4. No cell phones or other secondary devices in the room or test area." + "<br><br>" +
                "5. No talking." + "<br><br>" +
                "6. No one else can be in the room with you." + "<br><br>" +
                "<html>");
        add(rules);

        Back = new JButton("Back");
        Back.setBounds(200, 490, 120, 30);
        Back.setBackground(new Color(22, 99, 54));
        Back.setForeground(Color.white);
        Back.setFont(new Font("Raleway", Font.BOLD, 16));
        Back.addActionListener(this);
        add(Back);

        Start = new JButton("Start");
        Start.setBounds(450, 490, 120, 30);
        Start.setBackground(new Color(22, 99, 54));
        Start.setForeground(Color.white);
        Start.setFont(new Font("Raleway", Font.BOLD, 16));
        Start.addActionListener(this);
        add(Start);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/back.png"));
        Image i = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(10, 10, 800, 600);
        add(image);

        setSize(850,650);
        setLayout(null);
        setLocation(350,80);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == Start)
        {

        }
        else if (e.getSource() == Back)
        {
            new Login().setVisible(true);
            setVisible(false);
        }

    }

    public static void main(String [] args)
    {
        new Rules() ;
    }


}
