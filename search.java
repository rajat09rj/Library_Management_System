import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class search implements ActionListener
{
JFrame f;
JLabel l1,l2,l3,l4,l5,l6,l7;
JButton b1,b2,b3;
JTextField tf1,tf2,tf3,tf4,tf5;
JTable tb;

JPanel p,p1;
search()
{
f=new JFrame("Student Library");
f.setVisible(true);
f.setSize(2080,2080);
//f.setLocation(0,0);
f.setLayout(new BorderLayout());
 
      

p=new JPanel();
p.setLayout(null);
p.setBackground(new Color(120,80,60));
p.setBounds(390,165,1130,670);
f.add(p);

l1=new JLabel("");
l1.setBounds(100,100,200,200);
f.add(l1);
ImageIcon img=new ImageIcon("books-2463779_1920.jpg");
l1.setIcon(img);

l2=new JLabel("-:SEARCH BOOKS:-");
l2.setFont(new Font("Cooper",Font.BOLD,60));
l2.setForeground(Color.white);
l2.setBounds(300,10,1200,100);
p.add(l2);

l3=new JLabel("BOOK ID:");
l3.setBounds(300,200,200,100);
l3.setForeground(Color.white);
l3.setFont(new Font("Cooper",Font.BOLD,30));
p.add(l3);

tf1=new JTextField();
tf1.setBounds(500,240,300,30);
tf1.setFont(new Font("Cooper",Font.BOLD,20));
tf1.setForeground(new Color(120,80,50));
tf1.setHorizontalAlignment(JPasswordField.CENTER);
p.add(tf1);

b1=new JButton(new ImageIcon("searc.png"));

//b1=new JButton("ADD BOOK");
b1.setBounds(200,450,300,100);
//b1.setFont(new Font("Cooper",Font.Bold,15));
p.add(b1);

b1.addActionListener(this);


//b2=new JButton("BACK");
b2=new JButton(new ImageIcon("Screenshot (563).png"));
b2.setBounds(600,450,300,100);
//b2.setFont(new Font("Cooper",Font.Bold,15));
p.add(b2);
b2.addActionListener(this);

/*String data[][]={{"","","","",""},{"","","","",""},{"","","","",""}}; 
						  
    String column[]={"BOOK ID","BOOK NAME","AUTHER NAME","COST","QUANTITY"}; 
	
    JTable jt=new JTable(data,column);    
    jt.setBounds(400,300,350,100);          
    //JScrollPane sp=new JScrollPane(jt);    
    p.add(jt);*/      
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
try
{ 
String s1=tf1.getText();
String s2=tf2.getText();
String s3=tf3.getText();
String s4=tf4.getText();
String s5=tf5.getText();
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
Statement stat=con.createStatement();
ResultSet rs=stat.executeQuery("select * from admin_search where Book_Id='"+s1+"'");

 
int i =0;
if(rs.next())
{
s1 = rs.getString("Book_Id");
s2 = rs.getString("Book_Name");
s3 = rs.getString("Author_Name");
s4 = rs.getString("Cost"); 
s5 = rs.getString("Quantity");

 
         System.out.print(s1);
         System.out.print(s2);
         System.out.println(s3);
		  System.out.print(s4);
         System.out.print(s5);
         
         

String data[][]={{"","","","",""},{"","","","",""},{"","","","",""}}; 
						  
    String column[]={"BOOK ID","BOOK NAME","AUTHER NAME","COST","QUANTITY"}; 
	
    JTable jt=new JTable(data,column);    
    jt.setBounds(400,300,350,100);          
    JScrollPane sp=new JScrollPane(jt);    
    p.add(sp);
//DefaultTableModel model = new DefaultTableModel(tm.getData1(), tm.getColumnNames()); 
//table = new JTable(model);
i++; 
}
if(i <1)
{
JOptionPane.showMessageDialog(null, "No Record Found","Error",
JOptionPane.ERROR_MESSAGE);
}
if(i ==1)
{
System.out.println(i+" Record Found");
}
else
{
System.out.println(i+" Records Found");
}
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
JOptionPane.ERROR_MESSAGE);
}}
/*String s1=tf1.getText();

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
Statement stat=con.createStatement();
ResultSet rs=stat.executeQuery("select * from admin_search where Book_Id='"+s1+"'");
String s2="";
while(rs.next())
{
s2=rs.getString(0);
}
JOptionPane.showMessageDialog(null,"SEARCHED Successfully");

tf1.setText("");

}
catch(Exception e)
{
System.out.println(e);
}


 JOptionPane.showMessageDialog(null," completed!!!!");
	
}*/
if(ae.getSource()==b2)
{
	book bb=new book();

	
}
if(ae.getSource()==b3)
{
	
}
}
public static void main(String ar[])
{
	search aa=new search();
}
}
