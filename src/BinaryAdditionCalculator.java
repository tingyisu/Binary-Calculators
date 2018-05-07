import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BinaryAdditionCalculator {

	private JFrame frame;
	private JTextField binaryNumber2;
	private JTextField binaryNumber1;
	private JTextField answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BinaryAdditionCalculator window = new BinaryAdditionCalculator();
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
	public BinaryAdditionCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1250, 651);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBinaryAdditionCalculator = new JLabel("Binary Addition Calculator");
		lblBinaryAdditionCalculator.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblBinaryAdditionCalculator.setBounds(303, 14, 612, 83);
		frame.getContentPane().add(lblBinaryAdditionCalculator);
		
		JLabel lblEnterYourFirst = new JLabel("Enter your 1st binary number: ");
		lblEnterYourFirst.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblEnterYourFirst.setBounds(26, 111, 545, 57);
		frame.getContentPane().add(lblEnterYourFirst);
		
		JLabel lblEnterYourSecond = new JLabel("Enter your 2nd binary number:");
		lblEnterYourSecond.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblEnterYourSecond.setBounds(637, 119, 618, 41);
		frame.getContentPane().add(lblEnterYourSecond);
		
		binaryNumber2 = new JTextField();
		binaryNumber2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		binaryNumber2.setBounds(640, 167, 536, 84);
		frame.getContentPane().add(binaryNumber2);
		binaryNumber2.setColumns(10);
		
		binaryNumber1 = new JTextField();
		binaryNumber1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		binaryNumber1.setBounds(26, 172, 531, 79);
		frame.getContentPane().add(binaryNumber1);
		binaryNumber1.setColumns(10);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblAnswer.setBounds(26, 441, 129, 50);
		frame.getContentPane().add(lblAnswer);
		
		answer = new JTextField();
		answer.setFont(new Font("Tahoma", Font.PLAIN, 40));
		answer.setBounds(167, 410, 1009, 113);
		frame.getContentPane().add(answer);
		answer.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("+");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(584, 175, 41, 67);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int number = BinaryAddition.binaryAddition(binaryNumber1.getText(), binaryNumber2.getText()); 
					answer.setText("" + number);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter valid binary numbers.");
				}
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnAdd.setBounds(496, 296, 206, 86);
		frame.getContentPane().add(btnAdd);
	}
}
