package collaboproject2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class WineShopCustomer extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtid;
	private JTextField txtpw;
	private JTextField txtage;
	private JButton btnlogin, btnsignup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WineShopCustomer frame = new WineShopCustomer();
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
	public WineShopCustomer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 236);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_3 = new JLabel("Welcome to Wine Shop");
		lblNewLabel_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel);
		
		txtid = new JTextField();
		panel_1.add(txtid);
		txtid.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		panel_1.add(lblNewLabel_1);
		
		txtpw = new JTextField();
		panel_1.add(txtpw);
		txtpw.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_2);
		
		txtage = new JTextField();
		panel_1.add(txtage);
		txtage.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		btnlogin = new JButton("로그인");
		panel_2.add(btnlogin);
		
		btnsignup = new JButton("가입");
		panel_2.add(btnsignup);
		
		btnsignup.addActionListener(this);
		btnlogin.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn=(JButton) e.getSource();
		WineShopDao dao=new WineShopDao();
		WineShopVO vo=new WineShopVO();
		if(btn==btnsignup) {
			//회원가입 버튼 누를 시
			//회원가입 -> user add
			//비밀번호 안 보이게 개선해야함
			String id=txtid.getText();
			String pw=txtpw.getText();
			int age=Integer.parseInt(txtage.getText());
			if(age>20) {
			int result=dao.userInsert(id, pw, age);
			
			if(result>0) {
				JOptionPane.showConfirmDialog(this, "회원가입 성공");
			}else {
				JOptionPane.showConfirmDialog(this, "회원가입 실패");
			}}
			else {
				JOptionPane.showConfirmDialog(this, "저희 쇼핑몰에서는 미성년자에게 술을 판매하지 않습니다");
			}
		}else if(btn==btnlogin) {
			System.out.println("login");
			//회원 정보에 있으면 
			//로그인 되고 다음 화면으로 넘어가게
			String id=txtid.getText();
			String pw=txtpw.getText();
			vo=dao.getRow(id);
			//id조회 가능하고
			if(vo!=null) {
				System.out.println("null??");
				//입력한 id, pw가 DB에 있는 것과 같다면
				if(vo.getId().equals(id)) { //text...equals...쓰자.. 
					System.out.println("nn");
					if( vo.getPw().equals(pw))	{
						System.out.println("외");
						JOptionPane.showConfirmDialog(this, "로그인 성공");
					}}
			}else {
				JOptionPane.showConfirmDialog(this, "아이디나 패스워드가 맞지 않습니다");
			}
		}
		
	}

}
