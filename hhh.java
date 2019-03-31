import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class hh implements ActionListener
{
JFrame f;
JLabel l1,l2,l3,l4,l5;
JButton b1,b2;
JPanel p,p1;
hh()
{
f=new JFrame("Student Library");
f.setVisible(true);
f.setSize(2080,2080);
f.setLocation(0,0);
f.setLayout(new BorderLayout());

p1=new JPanel();
p1.setLayout(null);
p1.setBackground(new Color(120,80,60));
p1.setBounds(0,0,2080,150);
f.add(p1);

p=new JPanel();
p.setLayout(null);
p.setBackground(new Color(120,80,60));
p.setBounds(0,850,2080,200);
f.add(p);

l1=new JLabel("libb.jpg");
l1.setBounds(0,400,2080,800);
f.add(l1);
ImageIcon img=new ImageIcon("lib.jpg");
l1.setIcon(img);

l2=new JLabel("-:Welcome To Online Library Management:-");
l2.setFont(new Font("Lucida Calligraphy", Font.BOLD,60));
l2.setForeground(Color.WHITE);
l2.setBounds(200,30,2000,100);
p1.add(l2);

l3=new JLabel("By: SAMAN NAZIM");
l3.setFont(new Font("Cooper", Font.BOLD,40));
l3.setForeground(Color.WHITE);
l3.setBounds(100,30,2000,100);
p.add(l3);

l4=new JLabel("Supervisor: ");
l4.setFont(new Font("Cooper", Font.BOLD,40));
l4.setForeground(Color.WHITE);
l4.setBounds(1300,30,2000,100);
p.add(l4);

b1=new JButton(new ImageIcon("Screenshot (638).png"));
b1.setBounds(800,10,210,100);
//b1.setFont(new Font("Cooper",Font.Bold,15));
p.add(b1);
b1.addActionListener(this);

b2=new JButton("STUDENT");
//b2=new JButton(new ImageIcon("saa.png"));
b2.setBounds(900,800,200,150);
b2.setFont(new Font("Cooper",Font.BOLD,15));
p.add(b2);
b2.addActionListener(this);





}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
	welcome w=new welcome();

}
if(ae.getSource()==b2)
{
	//lib b=new lib();
}

}

public static void main(String ar[])
{
hh a=new hh();
}}