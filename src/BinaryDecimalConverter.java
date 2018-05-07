import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BinaryDecimalConverter {

	private JFrame frame;
	private JTextField binaryNumber;
	private JTextField decimalNumber;
	private JTextField answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BinaryDecimalConverter window = new BinaryDecimalConverter();
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
	public BinaryDecimalConverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 901, 766);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		binaryNumber = new JTextField();
		binaryNumber.setFont(new Font("Tahoma", Font.PLAIN, 38));
		binaryNumber.setBounds(26, 190, 399, 128);
		frame.getContentPane().add(binaryNumber);
		binaryNumber.setColumns(10);
		
		decimalNumber = new JTextField();
		decimalNumber.setFont(new Font("Tahoma", Font.PLAIN, 38));
		decimalNumber.setBounds(451, 190, 392, 128);
		frame.getContentPane().add(decimalNumber);
		decimalNumber.setColumns(10);
		
		JLabel lblBinaryNumber = new JLabel("Binary Decimal Converter");
		lblBinaryNumber.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblBinaryNumber.setBounds(171, 28, 611, 93);
		frame.getContentPane().add(lblBinaryNumber);
		
		JLabel binaryLabel = new JLabel("Enter a binary number: ");
		binaryLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		binaryLabel.setBounds(26, 127, 343, 55);
		frame.getContentPane().add(binaryLabel);
		
		JLabel decimalLabel = new JLabel("Enter a decimal number:");
		decimalLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		decimalLabel.setBounds(451, 136, 360, 37);
		frame.getContentPane().add(decimalLabel);
		
		JButton decimalButton = new JButton("To Decimal");
		decimalButton.setFont(new Font("Tahoma", Font.PLAIN, 40));
		decimalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int number = BinaryToDecimal.toDecimal(binaryNumber.getText());
					answer.setText("" + number);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter a valid decimal number.");
				}
			}
		});
		decimalButton.setBounds(26, 346, 399, 138);
		frame.getContentPane().add(decimalButton);
		
		JButton binaryButton = new JButton("To Binary");
		binaryButton.setFont(new Font("Tahoma", Font.PLAIN, 40));
		binaryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int number = DecimalToBinary.toBinary(Integer.parseInt(decimalNumber.getText()));
					answer.setText("" + number);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Please enter a valid binary number.");
				}
			}
		});
		binaryButton.setBounds(444, 346, 399, 138);
		frame.getContentPane().add(binaryButton);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblAnswer.setBounds(26, 568, 164, 49);
		frame.getContentPane().add(lblAnswer);
		
		answer = new JTextField();
		answer.setFont(new Font("Tahoma", Font.PLAIN, 40));
		answer.setBounds(171, 531, 659, 119);
		frame.getContentPane().add(answer);
		answer.setColumns(10);
	}
}
