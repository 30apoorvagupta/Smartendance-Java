package smartendance;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Smartendance {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Smartendance window = new Smartendance();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Smartendance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSmartendance = new JLabel("SMARTENDANCE");
		lblSmartendance.setFont(new Font("Cambria", Font.BOLD, 22));
		lblSmartendance.setBounds(131, 0, 172, 35);
		frame.getContentPane().add(lblSmartendance);
		
		JLabel lblTotalNumberOf = new JLabel("Total number of classes in the semester:");
		lblTotalNumberOf.setFont(new Font("Arial", Font.PLAIN, 13));
		lblTotalNumberOf.setBounds(10, 53, 258, 22);
		frame.getContentPane().add(lblTotalNumberOf);
		
		JLabel lblTotalNumberOf_1 = new JLabel("Total number of classes held upto date:");
		lblTotalNumberOf_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblTotalNumberOf_1.setBounds(10, 86, 258, 22);
		frame.getContentPane().add(lblTotalNumberOf_1);
		
		JLabel lblTotalNumberOf_2 = new JLabel("Total number of classes bunked:");
		lblTotalNumberOf_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblTotalNumberOf_2.setBounds(10, 119, 258, 22);
		frame.getContentPane().add(lblTotalNumberOf_2);
		
		JLabel lblNewLabel = new JLabel("Your Attendance:");
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 193, 172, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNuberOfClasses = new JLabel("Classes that can be bunked:");
		lblNuberOfClasses.setBounds(10, 228, 243, 22);
		frame.getContentPane().add(lblNuberOfClasses);
		
		textField = new JTextField();
		textField.setBounds(312, 54, 48, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(312, 86, 48, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(312, 120, 48, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblHelloo = new JLabel("");
		lblHelloo.setForeground(Color.RED);
		lblHelloo.setFont(new Font("Arial", Font.BOLD, 20));
		lblHelloo.setBounds(214, 193, 89, 28);
		frame.getContentPane().add(lblHelloo);
		
		JLabel label = new JLabel("");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Arial Black", Font.PLAIN, 16));
		label.setBounds(214, 228, 115, 22);
		frame.getContentPane().add(label);
		
		JButton btnCalculateAttendance = new JButton("CALCULATE ATTENDANCE");
		btnCalculateAttendance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t1= textField.getText();
				String t2= textField_1.getText();
				String t3= textField_2.getText();
				float tcs = Float.parseFloat(t1);
				float tcd = Float.parseFloat(t2);
				float tcb = Float.parseFloat(t3);
				
				float avg = ((tcd-tcb)/tcd)*100;
				int bunk = (int)Math.floor(0.25*tcs);
				int bunk1=(int) (bunk-tcb);
				
				lblHelloo.setText(String.format("%.2f",avg)+"%");
				label.setText(bunk1+"");
			}
	});
		btnCalculateAttendance.setBounds(67, 153, 293, 23);
		frame.getContentPane().add(btnCalculateAttendance);
	}
}

