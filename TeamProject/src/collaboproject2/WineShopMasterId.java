package collaboproject2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class WineShopMasterId extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtaccountid;
	private JTable table;
	private JButton btnaccount, btnok;
	private JButton btnproduct;
//회원관리 클래스. 물품조회 클래스는 따로 연동.
//WineShopCustomer에서 관리자가 로그인 시 연동됨
//회원 당 구매기록 확인, 제품 조회 
//jtable로
//단독으로 사용하지 않기에 main없음
	/**
	 * Create the frame.
	 */
	public WineShopMasterId() {
		setTitle("회원관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel label1 = new JLabel("회원ID");
		panel.add(label1);
		
		txtaccountid = new JTextField();
		panel.add(txtaccountid);
		txtaccountid.setColumns(10);
		
		btnaccount = new JButton("회원조회");
		panel.add(btnaccount);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		btnproduct = new JButton("제품조회");
		panel_1.add(btnproduct);
		
		btnok = new JButton("확인");
		panel_1.add(btnok);
		
		btnaccount.addActionListener(this);
		btnproduct.addActionListener(this);
		btnok.addActionListener(this);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"\uD68C\uC6D0 ID", "\uAD6C\uB9E4 \uC640\uC778", "\uAD6C\uB9E4\uC561", "\uACB0\uC81C \uD0C0\uC785"
			}
		));
		scrollPane.setViewportView(table);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn= (JButton) e.getSource();
		if(btn==btnaccount) {
			//회원조회 버튼 누를 시
			//검색어가 있다면: 그 회원 id 에 대한 조회 - 회원 ID, 구매와인, 구매금액, 결제타입
			//검색어가 없다면: 매장이 보유한 id 전체에 대한 조회

		}else if(btn==btnproduct) {
			//물건조회 버튼 누를 시
			//와인 검색 테이블로 넘어간다
			WineShopMasterProduct pro=new WineShopMasterProduct();
			pro.setVisible(true);
			
		}else if(btn==btnok) {
			//확인 누르면 초기 화면 - jtable에 아무것도 없는 화면으로 돌아가게 할 것
			table.clearSelection();
		}
	
}

}
