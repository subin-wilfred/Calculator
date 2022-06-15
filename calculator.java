import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculator implements ActionListener{
	boolean isOperator=false;
	boolean isAdd=false;
	boolean isSub=false;
	boolean isMul=false;
	boolean isDiv=false;
	String firstValue;
	JFrame jf;
	JLabel displayLabel;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton button6;
	JButton button5;
	JButton button4;
	JButton button3;
	JButton button2;
	JButton button1;
	JButton button0;
	JButton buttonDec;
	JButton buttonEq;
	JButton buttonAdd;
	JButton buttonSub;
	JButton buttonMul;
	JButton buttonDiv;
	JButton buttonClear;
	public Calculator() {
		jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setSize(600, 600);
		jf.setLocation(350, 100);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBackground(Color.black);
	
		displayLabel = new JLabel();
		displayLabel.setBounds(30,50,540,40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setForeground(Color.white);
		displayLabel.setOpaque(true);
		jf.add(displayLabel);
		
		button7= new JButton("7");
		button7.setBounds(30, 130, 80, 80);
		button7.setFont(new Font("Arial",Font.PLAIN,40));
		button7.addActionListener(this);
		jf.add(button7);
		
		button8= new JButton("8");
		button8.setBounds(130, 130, 80, 80);
		button8.setFont(new Font("Arial",Font.PLAIN,40));
		button8.addActionListener(this);
		jf.add(button8);
		
		button9= new JButton("9");
		button9.setBounds(230, 130, 80, 80);
		button9.setFont(new Font("Arial",Font.PLAIN,40));
		button9.addActionListener(this);
		jf.add(button9);
		
		buttonAdd= new JButton("+");
		buttonAdd.setBounds(330, 130, 80, 80);
		buttonAdd.setFont(new Font("Arial",Font.PLAIN,40));
		buttonAdd.addActionListener(this);
		jf.add(buttonAdd);
		
		button4= new JButton("4");
		button4.setBounds(30, 230, 80, 80);
		button4.setFont(new Font("Arial",Font.PLAIN,40));
		button4.addActionListener(this);
		jf.add(button4);
		
		button5= new JButton("5");
		button5.setBounds(130, 230, 80, 80);
		button5.setFont(new Font("Arial",Font.PLAIN,40));
		button5.addActionListener(this);
		jf.add(button5);
		
		button6= new JButton("6");
		button6.setBounds(230, 230, 80, 80);
		button6.setFont(new Font("Arial",Font.PLAIN,40));
		button6.addActionListener(this);
		jf.add(button6);

		buttonSub= new JButton("-");
		buttonSub.setBounds(330, 230, 80, 80);
		buttonSub.setFont(new Font("Arial",Font.PLAIN,40));
		buttonSub.addActionListener(this);
		jf.add(buttonSub);
		
		button1= new JButton("1");
		button1.setBounds(30, 330, 80, 80);
		button1.setFont(new Font("Arial",Font.PLAIN,40));
		button1.addActionListener(this);
		jf.add(button1);
		
		button2= new JButton("2");
		button2.setBounds(130, 330, 80, 80);
		button2.setFont(new Font("Arial",Font.PLAIN,40));
		button2.addActionListener(this);
		jf.add(button2);
		
		button3= new JButton("3");
		button3.setBounds(230, 330, 80, 80);
		button3.setFont(new Font("Arial",Font.PLAIN,40));
		button3.addActionListener(this);
		jf.add(button3);
		
		buttonMul= new JButton("*");
		buttonMul.setBounds(330, 330, 80, 80);
		buttonMul.setFont(new Font("Arial",Font.PLAIN,40));
		buttonMul.addActionListener(this);
		jf.add(buttonMul);
		
		buttonDec= new JButton(".");
		buttonDec.setBounds(30, 430, 80, 80);
		buttonDec.setFont(new Font("Arial",Font.PLAIN,40));
		buttonDec.addActionListener(this);
		jf.add(buttonDec);
		
		button0= new JButton("0");
		button0.setBounds(130, 430, 80, 80);
		button0.setFont(new Font("Arial",Font.PLAIN,40));
		button0.addActionListener(this);
		jf.add(button0);
		
		buttonEq= new JButton("=");
		buttonEq.setBounds(230, 430, 80, 80);
		buttonEq.setFont(new Font("Arial",Font.PLAIN,40));
		buttonEq.addActionListener(this);
		jf.add(buttonEq);
		
		buttonDiv= new JButton("/");
		buttonDiv.setBounds(330, 430, 80, 80);
		buttonDiv.setFont(new Font("Arial",Font.PLAIN,40));
		buttonDiv.addActionListener(this);
		jf.add(buttonDiv);
		
		buttonClear= new JButton("C");
		buttonClear.setBounds(430, 430, 80, 80);
		buttonClear.setFont(new Font("Arial",Font.PLAIN,40));
		buttonClear.addActionListener(this);
		jf.add(buttonClear);
		
	}
	
	public static void main(String args[]) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button0) {
			if(isOperator) {
				displayLabel.setText("0");
				isOperator=false;
			}
			else
			displayLabel.setText(displayLabel.getText()+"0");
		}
		else if(e.getSource()==button1) {
			if(isOperator) {
				displayLabel.setText("1");
				isOperator=false;
			}
			else
			displayLabel.setText(displayLabel.getText()+"1");
		}
		else if(e.getSource()==button2) {
			if(isOperator) {
				displayLabel.setText("2");
				isOperator=false;
			}
			else
			displayLabel.setText(displayLabel.getText()+"2");
		}
		else if(e.getSource()==button3) {
			if(isOperator) {
				displayLabel.setText("3");
				isOperator=false;
			}
			else
			displayLabel.setText(displayLabel.getText()+"3");
		}
		else if(e.getSource()==button4) {
			if(isOperator) {
				displayLabel.setText("4");
				isOperator=false;
			}
			else
			displayLabel.setText(displayLabel.getText()+"4");
		}
		else if(e.getSource()==button5) {
			if(isOperator) {
				displayLabel.setText("5");
				isOperator=false;
			}
			else
			displayLabel.setText(displayLabel.getText()+"5");
		}
		else if(e.getSource()==button6) {
			if(isOperator) {
				displayLabel.setText("6");
				isOperator=false;
			}
			else
			displayLabel.setText(displayLabel.getText()+"6");
		}
		else if(e.getSource()==button7) {
			if(isOperator) {
				displayLabel.setText("7");
				isOperator=false;
			}
			else
			displayLabel.setText(displayLabel.getText()+"7");
		}
		else if(e.getSource()==button8) {
			if(isOperator) {
				displayLabel.setText("8");
				isOperator=false;
			}
			else
			displayLabel.setText(displayLabel.getText()+"8");
		}
		else if(e.getSource()==button9) {
			if(isOperator) {
				displayLabel.setText("9");
				isOperator=false;
			}
			else
			displayLabel.setText(displayLabel.getText()+"9");
		}
		else if(e.getSource()==buttonDec) {
			displayLabel.setText(displayLabel.getText()+".");
		}
		else if(e.getSource()==buttonClear) {
			displayLabel.setText("");
		}
		else if(e.getSource()==buttonAdd) {
			isOperator=true;
			isAdd=true;
			firstValue=displayLabel.getText();
		}
		else if(e.getSource()==buttonSub) {
			isOperator=true;
			isSub=true;
			firstValue=displayLabel.getText();
		}
		else if(e.getSource()==buttonMul) {
			isOperator=true;
			isMul=true;
			firstValue=displayLabel.getText();
		}
		else if(e.getSource()==buttonDiv) {
			isOperator=true;
			isDiv=true;
			firstValue=displayLabel.getText();
		}
		else if(e.getSource()==buttonEq) {
			if(isAdd) {
				String secondValue=displayLabel.getText();
				float firstValF= Float.parseFloat(firstValue);
				float secondValF= Float.parseFloat(secondValue);
				float result= firstValF+secondValF;
				displayLabel.setText(result+"");
			}
			else if(isSub) {
				String secondValue=displayLabel.getText();
				float firstValF= Float.parseFloat(firstValue);
				float secondValF= Float.parseFloat(secondValue);
				float result= firstValF-secondValF;
				displayLabel.setText(result+"");
			}
			else if(isMul) {
				String secondValue=displayLabel.getText();
				float firstValF= Float.parseFloat(firstValue);
				float secondValF= Float.parseFloat(secondValue);
				float result= firstValF*secondValF;
				displayLabel.setText(result+"");
			}
			else if(isDiv) {
				String secondValue=displayLabel.getText();
				float firstValF= Float.parseFloat(firstValue);
				float secondValF= Float.parseFloat(secondValue);
				float result= firstValF/secondValF;
				displayLabel.setText(result+"");
			}
		}
	}
}