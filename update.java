import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class update implements ActionListener
{
JFrame f;
JLabel l1,l2,l3,l4,l5,l6,l7;
JButton b1,b2,b3;
JTextField tf1,tf2,tf3,tf4,tf5;

JPanel p,p1;
update()
{
f=new JFrame("Student Library");
f.setVisible(true);
f.setSize(2080,2080);
//f.setLocation(0,0);
f.setLayout(new BorderLayout());

//p1=new JPanel();
//p1.setLayout(null);
//p1.setBackground(Color.green);
//p1.setBounds(0,200,800,800);
//f.add(p1);

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

l2=new JLabel("-:UPDATE BOOKS:-");
l2.setFont(new Font("Cooper",Font.BOLD,60));
l2.setForeground(Color.white);
l2.setBounds(300,10,1200,100);
p.add(l2);

l3=new JLabel("BOOK ID:");
l3.setBounds(200,100,200,100);
l3.setForeground(Color.white);
l3.setFont(new Font("Cooper",Font.BOLD,30));
p.add(l3);

l4=new JLabel("BOOK NAME:");
l4.setBounds(200,150,200,100);
l4.setForeground(Color.white);
l4.setFont(new Font("Cooper",Font.BOLD,30));
p.add(l4);

l5=new JLabel("AUTHOR NAME:");
l5.setBounds(200,200,250,100);
l5.setForeground(Color.white);
l5.setFont(new Font("Cooper",Font.BOLD,30));
p.add(l5);


l6=new JLabel("COST:");
l6.setBounds(200,250,200,100);
l6.setForeground(Color.white);
l6.setFont(new Font("Cooper",Font.BOLD,30));
p.add(l6);


l7=new JLabel("QUANTITY:");
l7.setBounds(200,300,200,100);
l7.setForeground(Color.white);
l7.setFont(new Font("Cooper",Font.BOLD,30));
p.add(l7);

tf1=new JTextField();
tf1.setBounds(650,140,300,30);
tf1.setForeground(new Color(200,20,10));
p.add(tf1);

tf2=new JTextField();
tf2.setBounds(650,190,300,30);
p.add(tf2);

tf3=new JTextField();
tf3.setBounds(650,240,300,30);
p.add(tf3);

tf4=new JTextField();
tf4.setBounds(650,290,300,30);
p.add(tf4);

tf5=new JTextField();
tf5.setBounds(650,340,300,30);
p.add(tf5);

b1=new JButton(new ImageIcon("up.png"));

//b1=new JButton("ADD BOOK");
b1.setBounds(90,450,300,100);
//b1.setFont(new Font("Cooper",Font.Bold,15));
p.add(b1);

b1.addActionListener(this);

//b2=new JButton("BACK");
b2=new JButton(new ImageIcon("Screenshot (563).png"));
b2.setBounds(750,450,300,100);
//b2.setFont(new Font("Cooper",Font.Bold,15));
p.add(b2);
b2.addActionListener(this);


//b3=new JButton("cancel");

b3= new JButton(new ImageIcon("Screenshot (564).png"));
b3.setBounds(421,450,300,100);
//b3.setFont(new Font("Cooper",Font.Bold,15));
p.add(b3);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
 JOptionPane.showMessageDialog(null," updated successfully");
     
	
}
if(ae.getSource()==b2)
{
book bb=new book();
}
if(ae.getSource()==b3)
{
	
}
}
/*public static void main(String ar[])
{
	update aa=new update();
}*/
}
