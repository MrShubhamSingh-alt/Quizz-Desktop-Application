package QuizzApp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JTextField textField1;
    JButton Next, Back;

    Login() {

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i = i1.getImage().getScaledInstance(550, 500, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(450, 10, 530, 500);
        add(image);

        JLabel l1 = new JLabel("Quizz Test");
        l1.setForeground(new Color(22, 99, 54));
        l1.setFont(new Font("Raleway", Font.BOLD, 40));
        l1.setBounds(130, 80, 200, 30);
        add(l1);

        JLabel l2 = new JLabel("Enter Your Name");
        l2.setForeground(new Color(22, 99, 54));
        l2.setFont(new Font("Raleway", Font.BOLD, 18));
        l2.setBounds(150, 150, 200, 30);
        add(l2);

        textField1 = new JTextField();
        textField1.setBounds(40, 190, 350, 30);
        textField1.setFont(new Font("Raleway", Font.BOLD, 18));
        add(textField1);

        Back= new JButton("Back");
        Back.setBounds(70, 270, 120, 30);
        Back.setBackground(new Color(22, 99, 54));
        Back.setForeground(Color.white);
        Back.setFont(new Font("Raleway", Font.BOLD, 16));
        Back.addActionListener(this);
        add(Back);

        Next = new JButton("Next");
        Next.setBounds(250, 270, 120, 30);
        Next.setBackground(new Color(22, 99, 54));
        Next.setForeground(Color.white);
        Next.setFont(new Font("Raleway", Font.BOLD, 16));
        Next.addActionListener(this);
        add(Next);


        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(1000, 500);
        setVisible(true);
        setLocation(200, 150);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == Next)
        {
            new Rules().setVisible(true);
            setVisible(false);
        }
        else if(e.getSource() == Back)
        {
            System.exit(0);
        }
    }


    public static void main(String[] args)
    {

        new Login();
    }
}

