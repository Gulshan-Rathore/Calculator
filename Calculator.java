import java.awt.*;
import java.awt.event.*;
public class Calculator implements ActionListener, WindowListener
{
    String s1,s2,s3,s4,s5;
    int c=0,n;
    double n1;
    static Frame f;
    static Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    static Panel p;
    static TextField t;
    Calculator()
    {
        f=new Frame("Calculator");
        p=new Panel();
        f.setLayout(new FlowLayout());
        p.setLayout(new GridLayout(5,4,20,20));
        f.setBackground(Color.BLUE);
        t=new TextField("0",18);
        t.setEditable(false);
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");
        b10=new Button("0");
        b11=new Button("C");
        b12=new Button("/");
        b13=new Button("x");
        b14=new Button("-");
        b15=new Button("+");
        b16=new Button("=");
        f.add(t);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b12);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b13);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b14);
        p.add(b10);
        p.add(b11);
        p.add(b16);
        p.add(b15);
        f.add(p);
        f.setSize(200,250);
        f.setVisible(true);
        f.addWindowListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)//1
        {
            s1=t.getText();
            s2="1";
            if(s1.equals("0")||s4.equals("0.0"))
                s3=s2;
            else
                s3=s1+s2;
            t.setText(s3);
        }
        if(e.getSource()==b2)//2
        {
            s1=t.getText();
            s2="2";
            if(s1.equals("0")||s4.equals("0.0"))
                s3=s2;
            else
                s3=s1+s2;
            t.setText(s3);
        }
        if(e.getSource()==b3)//3
        {
            s1=t.getText();
            s2="3";
            if(s1.equals("0")||s4.equals("0.0"))
                s3=s2;
            else
                s3=s1+s2;
            t.setText(s3);
        }
        if(e.getSource()==b4)//4
        {
            s1=t.getText();
            s2="4";
            if(s1.equals("0")||s4.equals("0.0"))
                s3=s2;
            else
                s3=s1+s2;
            t.setText(s3);
        }
        if(e.getSource()==b5)//5
        {
            s1=t.getText();
            s2="5";
            if(s1.equals("0")||s4.equals("0.0"))
                s3=s2;
            else
                s3=s1+s2;
            t.setText(s3);
        }
        if(e.getSource()==b6)//6
        {
            s1=t.getText();
            s2="6";
            if(s1.equals("0")||s4.equals("0.0"))
                s3=s2;
            else
                s3=s1+s2;
            t.setText(s3);
        }
        if(e.getSource()==b7)//7
        {
            s1=t.getText();
            s2="7";
            if(s1.equals("0")||s4.equals("0.0"))
                s3=s2;
            else
                s3=s1+s2;
            t.setText(s3);
        }
        if(e.getSource()==b8)//8
        {
            s1=t.getText();
            s2="8";
            if(s1.equals("0")||s4.equals("0.0"))
                s3=s2;
            else
                s3=s1+s2;
            t.setText(s3);
        }
        if(e.getSource()==b9)//9
        {
            s1=t.getText();
            s2="9";
            if(s1.equals("0")||s4.equals("0.0"))
                s3=s2;
            else
                s3=s1+s2;
            t.setText(s3);
        }
        if(e.getSource()==b10)//0
        {
            s1=t.getText();
            s2="0";
            if(s1.equals("0")||s4.equals("0.0"))
                s3=s2;
            else
                s3=s1+s2;
            t.setText(s3);
        }
        if(e.getSource()==b11)//clear
        {
            t.setText("0");
            s1="";
            s2="";
            s3="";
            s4="";
            s5="";
            c=0;
            n=0;
        }
        if(e.getSource()==b12)//divide
        {
            s4=t.getText();
            t.setText("");
            c=1;

        }
        if(e.getSource()==b13)//multiply
        {
            s4=t.getText();
            t.setText("");
            c=2;
        }
        if(e.getSource()==b14)//minus
        {
            s4=t.getText();
            if(s4.equals("")||s4.equals("0")||s4.equals("0.0")||s4.equals("-")||s4.equals("+"))
                t.setText("-");
            else
            {
                t.setText("");
                c=3;
            }
        }
        if(e.getSource()==b15)//plus
        {
            s4=t.getText();
            if(s4.equals("")||s4.equals("0")||s4.equals("0.0")||s4.equals("+")||s4.equals("-"))
                t.setText("+");
            else
            {
                t.setText("");
                c=3;
            }
        }
        if(e.getSource()==b16)//equals
        {
            s5=t.getText();
            if(c==1)
            {
                if(Double.parseDouble(s5)==0.0)
                    t.setText("Infinity");
                else
                {
                    n1=Double.parseDouble(s4)/Double.parseDouble(s5);
                    t.setText(String.valueOf(n1));
                }
            }
            else if(c==2)
            {
                n=Integer.parseInt(s4)*Integer.parseInt(s5);
                t.setText(String.valueOf(n));
            }
            else if(c==3)
            {
                n=Integer.parseInt(s4)-Integer.parseInt(s5);
                t.setText(String.valueOf(n));
            }
            else if(c==4)
            {
                n=Integer.parseInt(s4)+Integer.parseInt(s5);
                t.setText(String.valueOf(n));
            }
        }
    }
    public void windowClosing(WindowEvent we1)
    {
        System.exit(0);
    }
    public void windowDeactivated(WindowEvent we2)
    {
    }
    public void windowActivated(WindowEvent we3)
    {
    }
    public void windowDeiconified(WindowEvent we4)
    {
    }
    public void windowIconified(WindowEvent we5)
    {
    }
    public void windowClosed(WindowEvent we6)
    {
    }
    public void windowOpened(WindowEvent we7)
    {
    }
    public static void main(String args[])
    {
        new Calculator();
    }
}