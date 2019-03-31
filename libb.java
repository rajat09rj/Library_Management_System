import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*class CreateRectangularButton extends JButton{
public CreateRectangularButton(String label)
{
super(label);
setContentAreaFilled(false);
}
protected void paintComponent(Graphics g)
{
g.setColor(Color.black);
g.fillOval(0,0,100,100);
super.paintComponent(g);

}
protected void paintBorder(Graphics g)
{
g.setColor(Color.white);
g.drawOval(0,0,100,100);
}
}*/
class libb implements ActionListener
{
JFrame f;
JLabel l1,l2,l3;
JTextField t1;
JButton b,b1;
JPanel p,p1,p2,p3;
JPasswordField t2;


libb()
{
f=new JFrame("Student Library");
f.setVisible(true);
f.setSize(2080,2080);
f.setLocation(0,0);
//f.setBackground(Color.red);
f.setLayout(null);


l1=new JLabel("USER ID");
l1.setFont(new Font("Cooper",Font.BOLD,30));
l1.setBounds(600,400,250,100);
l1.setForeground(Color.WHITE);
//l1.setIcon(img);
f.add(l1);

l2=new JLabel("PASSWORD");
l2.setFont(new Font("Cooper",Font.BOLD,30));
l2.setBounds(600,500,250,100);
l2.setForeground(Color.WHITE);
f.add(l2);

l3=new JLabel("ADMIN LOGIN ");
l3.setFont(new Font("Lucida Calligraphy",Font.BOLD,70));
l3.setBounds(650,50,700,300);
l3.setForeground(Color.WHITE);
f.add(l3);

l3=new JLabel("");
l3.setBounds(0,0,2000,1150);
f.add(l3);
ImageIcon img=new ImageIcon("o.jpg");
l3.setIcon(img);

t1=new JTextField();
Font font1 = new Font("SansSerif", Font.BOLD, 25);
t1.setFont(font1);
t1.setHorizontalAlignment(JTextField.CENTER);
t1.setForeground(new Color(120,60,50));
t1.setBounds(900,430,400,50);
f.add(t1);

t2=new JPasswordField();
Font font2=new Font("SansSerif",Font.BOLD,25);
t2.setFont(font2);
t2.setHorizontalAlignment(JPasswordField.CENTER);
t2.setForeground(new Color(120,60,50));
t2.setBounds(900,520,400,50);
f.add(t2);


b1=new JButton(new ImageIcon("b.png"));
//b1=new JButton("LOGIN");
//b1=new CreateRectangularButton("LOGIN");
b1.setBounds(800,700,300,90);
//b1.setFont(new Font("Cooper",Font.BOLD,15));
l3.add(b1);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)

{
  if(ae.getSource()==b1)
	{
     try
	   {  
         String s1=t1.getText(); 
         String s2=t2.getText();	   
         Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");     
	     Statement stat=conn.createStatement();
	     ResultSet rs = stat.executeQuery("Select * from admin_login");  
	     //String s22="";
	    // String s33="";
		 
        
		rs.next();
         
         // s33=rs.getString(2);
		 s1=rs.getString("user_id");
		 s2=rs.getString("password");
		 
		 System.out.println(s1);
		 System.out.println(s2);
         
		 
           if(t1.getText().length()==0) 	   
           JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
	  
           else if(t2.getPassword().length==0) 
           JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
	  
           else
             {
              String user = t1.getText();   
             // char[] pass = 
              String pwd =  t2.getText();  
	   
             //if(admin_login(user,pwd))
             if(s1.equals(user)&& s2.equals(pwd))
			 {
             JOptionPane.showMessageDialog(null, "You have logged in successfully","Success", JOptionPane.INFORMATION_MESSAGE);
			  
             JOptionPane.showMessageDialog(null,"completed");
             book bb=new book();
			 
			 }
             else
             JOptionPane.showMessageDialog(null, "Login failed!  Incorrect login Credentials","Failed!!",JOptionPane.ERROR_MESSAGE);
             // JOptionPane.showMessageDialog(null, "Incorrect Login Credentials");
             }   
			
			 
             t1.setText("");
             t2.setText("");

        }
         catch(Exception e)
          {
            System.out.println(e);
          }
    }   
}

public static void main(String ar[])

{
	libb b=new libb();
}
}





