import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class book implements ActionListener
{
JFrame f;
JLabel l1,l2,l3,l4,l5,l6,l12;
JButton b1,b2,b3,b4,b5,b6;
JPanel p,p1,p2,p3;

book()
{
f=new JFrame("Student Library");
f.setVisible(true);
f.setSize(2080,2080);
f.setLocation(0,0);
f.setLayout(null);

//p1=new JPanel();
//p1.setLayout(null);
//p1.setBackground(Color.green);
//p1.setBounds(0,200,800,800);
//f.add(p1);

//p=new JPanel();
//p.setLayout(null);
//p.setBackground(Color.pink);
//p.setBounds(150,60,700,100);
//f.add(p);

l1=new JLabel("");
l1.setBounds(0,0,2000,1200);
f.add(l1);
ImageIcon img=new ImageIcon("bb.jpg");
l1.setIcon(img);

l12=new JLabel("LIBRARY MANAGEMENT SYSTEM");
l12.setFont(new Font("Cooper", Font.BOLD,60));
l12.setBounds(405,10,2000,100);
l12.setForeground(Color.WHITE);
l1.add(l12);


p=new JPanel();
p.setLayout(null);
p.setBackground(new Color(120,80,60));
p.setBounds(0,0,2000,100);
f.add(p);


p1=new JPanel();
p1.setLayout(null);
p1.setBackground(new Color(130,80,50));
p1.setBounds(1000,100,950,1200);
f.add(p1);


/*p2=new JPanel();
p2.setLayout(null);
p2.setBackground(Color.cyan);
p2.setBounds(100,280,140,100);
l1.add(p2);*/

/*l2=new JLabel("ADD BOOKS");
l2.setFont(new Font("Cooper", Font.BOLD,20));
l2.setBounds(1355,230,200,100);
l2.setForeground(Color.WHITE);
l1.add(l2);

l3=new JLabel("VIEW ORDERS");
l3.setFont(new Font("Cooper",Font.BOLD,20));
l3.setBounds(485,325,200,100);
l3.setForeground(Color.WHITE);
l1.add(l3);

l4=new JLabel("UPDATE BOOKS");
l4.setFont(new Font("Cooper",Font.BOLD,20));
l4.setBounds(1155,320,200,100);
l4.setForeground(Color.WHITE);
l1.add(l4);

l3=new JLabel("SEARCH BOOKS");
l3.setFont(new Font("Cooper",Font.BOLD,20));
l3.setBounds(1450,240,200,100);
l3.setForeground(Color.WHITE);
l1.add(l3);*/

//b1=new JButton("ADD BOOKS");
b1=new JButton(new ImageIcon("add.png"));
b1.setBounds(1300,200,300,100);
//b1.setFont(new Font("Cooper",Font.Bold,15));
f.add(b1);
b1.addActionListener(this);

//b2=new JButton("VIEW BOOKS");
b2=new JButton(new ImageIcon("searc.png"));
b2.setBounds(1300,350,300,100);
//b2.setFont(new Font("Cooper",Font.Bold,15));
f.add(b2);
b2.addActionListener(this);


//b3=new JButton("ISSUE BOOK");
b3=new JButton(new ImageIcon("up.png"));
b3.setBounds(1300,500,300,100);
//b3.setFont(new Font("Cooper",Font.Bold,15));
f.add(b3);
b3.addActionListener(this);

b4=new JButton(new ImageIcon("view.png"));
//b4=new JButton("VIEW ISSUED BOOKS");
b4.setBounds(1300,650,300,100);
//b4.setFont(new Font("Cooper",Font.Bold,15));
f.add(b4);
b4.addActionListener(this);


b5=new JButton(new ImageIcon("Screenshot (554).png"));
b5.setBounds(1350,850,200,60);
//b3.setFont(new Font("Cooper",Font.Bold,15));
f.add(b5);
b5.addActionListener(this);

}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
	add aa=new add();

}
if(ae.getSource()==b2)
{
	search aa=new search();
	
}
if(ae.getSource()==b3)
{
	update aa=new update();
}
if(ae.getSource()==b4)
{
	view aa=new view();
}
if(ae.getSource()==b5)
{
	welcome w=new welcome();
}
if(ae.getSource()==b6)
{
	
}
}

/*public static void main(String ar[])
{
book bb=new book();
}*/
}