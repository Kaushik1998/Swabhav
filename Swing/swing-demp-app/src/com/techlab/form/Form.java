package com.techlab.form;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MyFrame extends JFrame implements ActionListener {

	// Components of the Form
	private Container c;
	private JLabel title;
	private JLabel name;
	private JTextField nameField;
	private JLabel lastName;
	private JTextField lastNameTextField;
	private JLabel gender;
	private JRadioButton male;
	private JRadioButton female;
	private ButtonGroup gengp;
	private JLabel organization;
	private JTextArea organizationField;
	private JCheckBox term;
	private JButton sub;
	private JButton reset;
	private JTextArea tout;
	private JLabel organizationJoined;
	private JTextArea resadd;
	private JComboBox date;
	private JLabel age;
	private JLabel course;
	private JComboBox courseComboBox;

	private String age_list[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
			"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };

	private String courses[] = { "Java", "Python", "JavaScript", "C" };

	// constructor, to initialize the components
	// with default values.
	public MyFrame() {
		setTitle("Registration Form");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);

		c = getContentPane();
		c.setLayout(null);

		// title = new JLabel("Registration Form");
		// title.setFont(new Font("Arial", Font.PLAIN, 30));
		// title.setSize(300, 30);
		// title.setLocation(300, 30);
		// c.add(title);

		name = new JLabel("First Name");
		name.setFont(new Font("Arial", Font.PLAIN, 15));
		name.setSize(100, 20);
		name.setLocation(50 - 15, 50);
		c.add(name);

		nameField = new JTextField();
		nameField.setFont(new Font("Arial", Font.PLAIN, 15));
		nameField.setSize(190, 20);
		nameField.setLocation(100, 50);
		c.add(nameField);

		lastName = new JLabel("Last Name");
		lastName.setFont(new Font("Arial", Font.PLAIN, 15));
		lastName.setSize(100, 20);
		lastName.setLocation(50 - 15, 50 + 50);
		c.add(lastName);

		lastNameTextField = new JTextField();
		lastName.setFont(new Font("Arial", Font.PLAIN, 15));
		lastNameTextField.setSize(150, 20);
		lastNameTextField.setLocation(100, 50 + 50);
		c.add(lastNameTextField);

		gender = new JLabel("Gender");
		gender.setFont(new Font("Arial", Font.PLAIN, 15));
		gender.setSize(100, 20);
		gender.setLocation(50 - 15, 150);
		c.add(gender);

		male = new JRadioButton("Male");
		male.setFont(new Font("Arial", Font.PLAIN, 15));
		male.setSelected(true);
		male.setSize(75, 20);
		male.setLocation(100, 150);
		c.add(male);

		female = new JRadioButton("Female");
		female.setFont(new Font("Arial", Font.PLAIN, 15));
		female.setSelected(false);
		female.setSize(80, 20);
		female.setLocation(180, 150);
		c.add(female);

		age = new JLabel("Age");
		age.setSize(100, 20);
		age.setLocation(50 - 15, 200);
		c.add(age);

		date = new JComboBox(age_list);
		date.setFont(new Font("Arial", Font.PLAIN, 15));
		date.setSize(50, 20);
		date.setLocation(100, 200);
		c.add(date);
		
		course=new JLabel("Select a Course");
		course.setSize(100,20);
		course.setLocation(50-15,250);
		c.add(course);
		
		courseComboBox = new JComboBox(courses);
		courseComboBox.setSize(70, 20);
		courseComboBox.setLocation(100+35, 250);
		c.add(courseComboBox);

		gengp = new ButtonGroup();
		gengp.add(male);
		gengp.add(female);

		organization = new JLabel("Organization");
		organization.setFont(new Font("Arial", Font.PLAIN,15));
		organization.setSize(100, 20);
		organization.setLocation(50-15, 300);
		c.add(organization);

		organizationField = new JTextArea();
		organizationField.setFont(new Font("Arial", Font.PLAIN, 15));
		organizationField.setSize(300, 20);
		organizationField.setLocation(100+35, 300);
		organizationField.setLineWrap(true); 
		c.add(organizationField);

		sub = new JButton("Submit");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(150, 350);
		sub.addActionListener(this);
		c.add(sub);

		organizationJoined = new JLabel("");
		organizationField.setFont(new Font("Arial", Font.PLAIN, 20));
		organizationJoined.setSize(500, 25);
		organizationJoined.setLocation(100, 400);
		c.add(organizationJoined);

		setVisible(true);
	}

	// method actionPerformed()
	// to get the action performed
	// by the user and act accordingly
	public void actionPerformed(ActionEvent e) {
		organizationJoined.setText("Welcome here to swabhav");
	}
}

public class Form {

	public static void main(String[] args) {
		new MyFrame();
	}
}
