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

            bclear=new Button("CLR");
            bclear.addActionListener(this);

            t1 = new TextField(20);
            f.add(t1);

            G =new GridLayout(4,4);
            P.setLayout(G);

            P.add(b0);
            P.add(b1);
            P.add(b2);
            P.add(b3);
            P.add(b4);
            P.add(b5);
            P.add(b6);
            P.add(b7);
            P.add(b8);
            P.add(b9);
            P.add(bsub);
            P.add(badd);
            P.add(bmult);
            P.add(bdvd);
            P.add(bclear);
            P.add(beqq);

            f.add(P);
            f.setSize(200,180);
            f.setVisible(true);
            f.setBackground(Color.lightGray);
            f.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b0){
            s3=t1.getText();
            s4="0";
            s5=s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b1){
            s3=t1.getText();
            s4="1";
            s5=s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b2){
            s3=t1.getText();
            s4="2";
            s5=s3+s4;
            t1.setText(s5);
        } if(e.getSource()==b3){
            s3=t1.getText();
            s4="3";
            s5=s3+s4;
            t1.setText(s5);
        } if(e.getSource()==b4){
            s3=t1.getText();
            s4="4";
            s5=s3+s4;
            t1.setText(s5);
        } if(e.getSource()==b5){
            s3=t1.getText();
            s4="5";
            s5=s3+s4;
            t1.setText(s5);
        } if(e.getSource()==b6){
            s3=t1.getText();
            s4="6";
            s5=s3+s4;
            t1.setText(s5);
        } if(e.getSource()==b7){
            s3=t1.getText();
            s4="7";
            s5=s3+s4;
            t1.setText(s5);
        } if(e.getSource()==b8){
            s3=t1.getText();
            s4="8";
            s5=s3+s4;
            t1.setText(s5);
        } if(e.getSource()==b9){
            s3=t1.getText();
            s4="9";
            s5=s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==badd){
            s1=t1.getText();
            t1.setText("");
            p=1;
        }
        if(e.getSource()==bsub){
            s1=t1.getText();
            t1.setText("");
            p=2;
        }
        if(e.getSource()==bmult){
            s1=t1.getText();
            t1.setText("");
            p=3;
        }
        if(e.getSource()==bdvd){
            s1=t1.getText();
            t1.setText("");
            p=4;
        }

    }
}