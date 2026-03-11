import java.awt.*;
import java.awt.event.*;


public class Calculator implements ActionListener{
        int p,z;
        String s1,s2,s3,s4,s5;
        Frame f;
        Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bdvd,bmult,beqq,bclear;
        Panel P;
        TextField t1;
        GridLayout G;

        calculator(){
            f=new Frame("Calculator");
            f.setLayout(new FlowLayout());
            P=new Panel();

            b0=new Button("0");
            b0.addActionListener(this);

            b1=new Button("1");
            b1.addActionListener(this);

            b2=new Button("2");
            b2.addActionListener(this);

            b3=new Button("3");
            b3.addActionListener(this);

            b4=new Button("4");
            b4.addActionListener(this);

            b5=new Button("5");
            b5.addActionListener(this);

            b6=new Button("6");
            b6.addActionListener(this);

            b7=new Button("7");
            b7.addActionListener(this);

            b8=new Button("8");
            b8.addActionListener(this);

            b9=new Button("9");
            b9.addActionListener(this);

            badd=new Button("+");
            badd.addActionListener(this);

            bsub=new Button("-");
            bsub.addActionListener(this);

            bmult=new Button("x");
            bmult.addActionListener(this);

            bdvd=new Button("/");
            bdvd.addActionListener(this);

            beqq=new Button("=");
            beqq.addActionListener(this);

            bclear=new Button("Clear");
            bclear.addActionListener(this);

        }
}