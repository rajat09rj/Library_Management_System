import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class welcome implements ActionListener
{
JFrame f;
JLabel l1,l2,l3,l4,l5;
JButton b1,b2;
JPanel p,p1;
welcome()
{
f=new JFrame("Student Library");
f.setVisible(true);
f.setSize(800,600);
f.setLocation(500,250);
f.setLayout(new BorderLayout());

p1=new JPanel();
p1.setLayout(null);
p1.setBackground(new Color(20,40,40));
p1.setBounds(0,0,1000,150);
f.add(p1);

p=new JPanel();
p.setLayout(null);
p.setBackground(new Color(150,30,50));
p.setBounds(0,0,100,200);
f.add(p);

/*l1=new JLabel("");
l.setBounds(0,0,800,300);
f.add(l);
ImageIcon img=new ImageIcon("books-1680953_1920.jpg");
l.setIcon(img);*/

l2=new JLabel("-:MODE OF SELECTION:-");
l2.setFont(new Font("Cooper", Font.BOLD,40));
l2.setForeground(Color.WHITE);
l2.setBounds(150,30,2000,100);
p1.add(l2);

/*l3=new JLabel("By: SAMAN NAZIM");
l3.setFont(new Font("Cooper", Font.BOLD,40));
l3.setForeground(Color.WHITE);
l3.setBounds(100,30,2000,100);
p.add(l3);

l4=new JLabel("Supervisor: ");
l4.setFont(new Font("Cooper", Font.BOLD,40));
l4.setForeground(Color.WHITE);
l4.setBounds(1300,30,2000,100);
p.add(l4);*/

b1=new JButton(new ImageIcon("Screenshot (623).png"));
b1.setBounds(100,200,235,233);
//b1.setFont(new Font("Cooper",Font.Bold,15));
p.add(b1);
b1.addActionListener(this);

b2=new JButton("STUDENT");
b2=new JButton(new ImageIcon("ss.png"));
b2.setBounds(400,200,230,230);
b2.setFont(new Font("Cooper",Font.BOLD,15));
p.add(b2);
b2.addActionListener(this);





}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
	libb b=new libb();
}
if(ae.getSource()==b2)
{
	first b=new first();
}

}

//public static void main(String ar[])
//{
//welcome w=new welcome();
//}
}