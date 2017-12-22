package collaboproject2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

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
	private JButton btnaccount;
	private JButton btnproduct;
	private DefaultTableModel model;
	private WineShopDao dao;
	private Vector<WineShopVO> vec;
	private Vector<Object> rowData;
	//회원관리 클래스. 물품조회 클래스는 따로 연동.
	//WineShopCustomer에서 관리자가 로그인 시 연동됨
	//회원 당 구매기록 확인, 제품 조회 
	//jtable로
	//단독으로 사용하지 않기에 main없음

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
		
		btnaccount.addActionListener(this);
		btnproduct.addActionListener(this);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		String columnNames[]= {	"회원ID", "구매 와인", "구매액","결제 타입"};
		model=new DefaultTableModel(columnNames, 0);
		
		table = new JTable();
		table.setModel(model);
		
		scrollPane.setViewportView(table);
		showList();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn= (JButton) e.getSource();
		if(btn==btnaccount) {
			//회원조회 버튼 누를 시
			//검색어가 있다면: 그 회원 id 에 대한 조회 - 회원 ID, 구매와인, 구매금액, 결제타입
			//검색어가 없다면: 매장이 보유한 id 전체에 대한 조회
			if(txtaccountid.getText().length()>0) {
			//특정 회원 조회	
				//table refresh-우선 새 defaulttable에 담아서 다 지우고
				//DefaultTableModel moodel = (DefaultTableModel) table.getModel();
				model.setRowCount(0);
				//검색하고 특정 id  조회하게 
				String id=txtaccountid.getText();
				dao=new WineShopDao();
				vec=dao.getUser(id);
				for(WineShopVO vo : vec) {
					rowData=new Vector<>();
					rowData.addElement(vo.getId());
					rowData.addElement(vo.getPurwine());
					rowData.addElement(vo.getPurwine());
					rowData.addElement(vo.getPaytype());
					model.addRow(rowData);
				}
			}else {
			//전체조회
				//table refresh-우선 새 defaulttable에 담아서 다 지우고
				//DefaultTableModel moodel = (DefaultTableModel) table.getModel();
				model.setRowCount(0);
				//검색하고 다시 와인 전체를 조회하게 
				showList();
			}
		}else if(btn==btnproduct) {
			//물건조회 버튼 누를 시
			//와인 검색 테이블로 넘어간다
			WineShopMasterProduct pro=new WineShopMasterProduct();
			pro.setVisible(true);
			
		}

	}
	//전체조회 메소드
	public void showList() {
		dao=new WineShopDao();
		vec=dao.getList();
		for(WineShopVO vo : vec) {
			rowData=new Vector<>();
			rowData.addElement(vo.getId());
			rowData.addElement(vo.getPurwine());
			rowData.addElement(vo.getPurmoney());
			rowData.addElement(vo.getPaytype());
			model.addRow(rowData);
			
		}
	}

}
