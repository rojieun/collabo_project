package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.Font;

public class page1 extends JFrame {

	private JPanel contentPane;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt1;
	private JTextField txt5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page1 frame = new page1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public page1() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1001, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btn1 = new JButton("\uC8FC\uBB38");
		panel_1.add(btn1);
		
		JButton btn2 = new JButton("\uCDE8\uC18C");
		panel_1.add(btn2);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.EAST);
		
		JButton btn3 = new JButton("\uC7A5\uBC14\uAD6C\uB2C8 \uB2F4\uAE30");
		
		JButton btn4 = new JButton("\uC7A5\uBC14\uAD6C\uB2C8 \uCDE8\uC18C");
		
		JPanel panel_3 = new JPanel();
		
		txt1 = new JTextField();
		txt1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uC81C\uD488\uBA85");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(btn3)
					.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
					.addComponent(btn4))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(txt1, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addContainerGap(23, Short.MAX_VALUE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(14))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txt1, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn3)
						.addComponent(btn4)))
		);
		
		JLabel lblNewLabel_2 = new JLabel("\uAE08\uC561");
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		panel_3.setLayout(new GridLayout(0, 2, 0, 20));
		panel_3.add(lblNewLabel_2);
		panel_3.add(txt2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC6D0\uC0B0\uC9C0");
		lblNewLabel_3.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		panel_3.add(lblNewLabel_3);
		
		txt3 = new JTextField();
		txt3.setColumns(10);
		panel_3.add(txt3);
		
		JLabel lblNewLabel_1 = new JLabel("\uC218\uB7C9");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		panel_3.add(lblNewLabel_1);
		panel_3.add(spinner);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lb1 = new JLabel("\uC774\uBBF8\uC9C0");
		lb1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		
		JLabel lb2 = new JLabel("\uC0C1\uC138 \uC815\uBCF4");
		lb2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		
		txt5 = new JTextField();
		txt5.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(txt5, GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(299)
							.addComponent(lb1)
							.addGap(16))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 620, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(295)
							.addComponent(lb2)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lb1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lb2)
					.addGap(10)
					.addComponent(txt5, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
	}
}
