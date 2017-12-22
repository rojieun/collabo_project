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
import javax.swing.JPasswordField;

public class WineShopCustomer extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtid;
	private JTextField txtage;
	private JButton btnlogin, btnsignup;
	private JPasswordField txtpw;

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
		setTitle("WineShop");
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
		
		txtpw = new JPasswordField();
		panel_1.add(txtpw);
		
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
			
			String id=txtid.getText();
			String pw=txtpw.getPassword().toString();
			int age=Integer.parseInt(txtage.getText());
			//20세 이상이어야 회원가입 가능하게
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
		
			//회원 정보에 있으면 
			//로그인 되고 다음 화면으로 넘어가게
			String id=txtid.getText();
			//passwordfield 는 gettext가 안 쓰이는 메소드라서 getpassword(return char) -> tostring
			String pw=txtpw.getPassword().toString();
			vo=dao.getRow(id);
			//id조회 가능하고
			//이후 추가: master경우 관리자 페이지로 넘어가게
			//일반 회원인 경우 쇼핑몰로 넘어가게
			if(vo!=null) {
				
				//입력한 id, pw가 master 라면
				if(vo.getId().equals("master")) { //text...equals...쓰자.. 
					if(vo.getPw().equals("12345")){
						//관리자 계정 로그인된 경우
						//관리 페이지로 이동
						WineShopMasterId master=new WineShopMasterId();
						master.setVisible(true);
					}}
				//입력한 id, pw가 customer라면
				else if( vo.getId().equals(id))	{
					if(vo.getPw().equals(pw))
						JOptionPane.showConfirmDialog(this, "로그인 성공");
					//이후 추가되는 다른 유저 구매 페이지로 넘어가게 해야
					}
				 
			
			}else {
				JOptionPane.showConfirmDialog(this, "아이디나 패스워드가 맞지 않습니다");
			}
		}
		
	}

}
