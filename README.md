# ATM-Simulator-System
Introduction –

It is an desktop based Application. Made by using Swing , AWT and MYSQL Database.

**Login Page -**

The first frame of our project is Login Frame. In this Frame If the user is a registered then he has to enter his card number and Pin and press SIGN IN button. If the user is not registered then they have to press SIGN UP button. 
In this Frame we have an icon , some Text/Labels , some Input Field and some Buttons.

For Creating a Frame we use JFrame class of Swing Package is a part of Java Extenssion.

Syntax-
        public class Login extends JFrame{
            Login(){
                // setting title
                setTitle("AUTOMATED TELLER MACHINE");
                setLayout(null);
                //setting background colour
                getContentPane().setBackground(Color.white);
                //defining frame
                setSize(800, 480);
                setVisible(true);
                setLocation(350, 200);
            }
            public static void main(String args[]){
                new Login();
            }
        }


For adding a Image we use ImageIcon Class of java Swing.

Syntax-
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

To create Labels we use  JLabel Class of java Swing.

Syntax-
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

To create an Input Field we use JTextField and JPasswordField.

Syntax-
        JTextField cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Ariel", Font.BOLD, 14));
        add(cardTextField);

To create Buttons we use JButton class of Java Swing.

Syntax-
        JButton signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
**NOTE**
We use similar Syntax for each frame and to add components on each frame.

**SignUp Pages (SignUpOne , SignUpTwo, SignUp Three) -** 
When we click on SIGN UP Button a series of new frame will come in which we have to enter the details of user and facilites they want from the bank.
When the user finishes entering the required informations then the System will generate a Card number and Pin for the user.
After Getting the Card Number and PIN a new Deposit frame will come in which user have to diposit some amount.

**TRANSACTIONS FRAME - **
When user succesfully Sign In by enters correct CARD Number and PIN then TRANSACTIONS Frame will come.
In Transactions Frame there are several buttons like Deposit, Cash Withdrawl, Fast Cash, Mini Statement, Pin Change, Balence Enquiry and Exit.
On clicking any button the user will go to a new Frame which Perform a specific task.

**DEPOSIT FRAME - **
When user click on Deposit button then a new frame will come in which user have to enter the amount they want to deposit in their bank acount.

**WITHDRAWL FRAME - **
When user click on Withdraw button then a new frame will come in which user have to enter the amount they want to Withdraw from their bank acount.

**FAST CASH FRAME - **
When user click on Fast Cash button then a new frame will come. This new Frame consist Several Button and each button has a Amount written on it. The user have to press the button having the amount which they want withdraw.

**MINI STATEMENT FRAME - **
When user click on Mini Statement button then a new frame will come Which show the recent transactions done by the user.

**PIN CHANGE FRAME - **
When user click on PIN CHANGE button then a new frame will come having Two input field. User Have to enter the new pin They want to set for thier account.

**Database Connectivity - **

For database Connectivity We use JDBC and crated a Conn class.
JDBC stans for Java DataBase Connectivity. It is an API which defines how we can access a database. It provide method to Query and Update data in our Database.  

Code is as follows- 

import java.sql.*;
public class Conn {
    Connection c; //declaring connection variable
    Statement s; //declaring statement variable
    public Conn(){
        try {
            //creating Connection
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "abhayraj");
            //creating Statement
            s = c.createStatement();
        } catch (Exception e){
            //print Error
            System.out.println(e);
        }
    }
}

To execute a query we have to create a object of this Conn class in another class and using execteUpdate command.

Syntax-
        Conn conn = new Conn();
        String query = "Insert into bank values('"+pinnumber+"', '"+date+"', 'Deposit', '"+number+"')";
        conn.s.executeUpdate(query);

Reference –
I made this Project with the help of a Youtube Channel Named Code For InterView.

