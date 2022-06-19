package Unit_4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Swing_In_Java {

	public static void main(String[] args) {

		Swing_In_Java name = new Swing_In_Java();

	}

}

class SwingInJava extends JFrame {
	
	JTable jt1;
	
	JList list;
	
	JComboBox jb1;

	JTextArea ta1;
	
	JTextField t1;
	JTextField t2;
	
	JRadioButton r1;
	JRadioButton r2;
	
	JCheckBox c1;
	JCheckBox c2;
	
	JButton b1;
	JButton b2;

	JLabel l1;

	SwingInJava() {
		

		String data[][] = { { "101", "Amit", "670000" }, 
			{ "102", "Jai", "780000" }, { "101", "Sachin", "700000" } };
		String column[] = { "ID", "NAME", "SALARY" };

		
		jt1 = new JTable(data,column);
		
		//String array to store weekdays
        String week[]= { "Monday","Tuesday","Wednesday",
                         "Thursday","Friday","Saturday","Sunday"};
		
		list = new JList<>(week);
		
		jb1 = new JComboBox<>(week);
		
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		
		c1 = new JCheckBox("Dancer!");
		c2 = new JCheckBox("Singer!");
		
		//large content
		ta1 = new JTextArea(10,30);

		//number,small string
		t1 = new JTextField(20);
		t2 = new JTextField(20);

		b1 = new JButton("Sum");
		b2 = new JButton("Sub");

		l1 = new JLabel();

		add(ta1);
		
		add(jt1);
		
		add(jb1);
		
		add(t1);
		add(t2);
		
		add(r1);
		add(r2);
		
		add(c1);
		add(c2);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		add(b1);
		add(b2);
		add(l1);

		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = ta1.getText();

				int a1 = Integer.parseInt(s1);
				int a2 = Integer.parseInt(s2);
				
				if(e.getSource() == b1) {
					Integer sum = a1 + a2;
					l1.setText(sum.toString());
				}
				
				if(e.getSource() == b2) {
					Integer sum = a1 - a2;
					l1.setText(sum.toString());
				}
				
				if(r1.isSelected()) {
					l1.setText("is a Male");
				}
				
				if(r2.isSelected()) {
					l1.setText("is a Female");
				}
				
				if(c1.isSelected()) {
					l1.setText("is a Dancer!");
				}
				if(c2.isSelected()) {
					l1.setText("is a Singer!");
				}
				
				if(c2.isSelected() && c1.isSelected()) {
					l1.setText("is a Singer and a Dancer!");
				}
				
				
				if(list.getSelectedIndex() != -1) {
					String data = "Day selected: "+list.getSelectedValue();
					l1.setText(data);
				}
				
				if(jb1.getSelectedIndex() != -1) {
					String data = "Day selected: "+jb1.getSelectedItem();
					l1.setText(data);
				}

			}
		};


		b1.addActionListener(al);
		b2.addActionListener(al);

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}