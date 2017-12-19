package collaboproject2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.RowData;

public class WineShopMasterProduct extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTable table;
	private JTextField txtwinetype;
	private JButton btnchk, btnedit, btndel;
	private DefaultTableModel model;
	private Vector<WineVO> vec;
	private Vector<Object> rowData;
	private WineVO vo;
	private WineDAO dao;
	private JLabel lblNewLabel_1;
	private JTextField txtwineno;
	
	//제품조회: 관리자 모드-회원조회에서 제품관리를 누를 시 들어오게 함
	//winetbl에서 조회해서 넣어야 함.  
	public WineShopMasterProduct() {
		setTitle("와인관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("와인 타입");
		panel.add(lblNewLabel);
		
		txtwinetype = new JTextField();
		panel.add(txtwinetype);
		txtwinetype.setColumns(10);
		
		lblNewLabel_1 = new JLabel("와인 번호");
		panel.add(lblNewLabel_1);
		
		txtwineno = new JTextField();
		panel.add(txtwineno);
		txtwineno.setColumns(5);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		btnedit = new JButton("수정");
		panel_1.add(btnedit);
		
		btndel = new JButton("삭제");
		panel_1.add(btndel);
		
		btnchk = new JButton("와인조회");
		panel_1.add(btnchk);
		
		btnchk.addActionListener(this);
		btnedit.addActionListener(this);
		btndel.addActionListener(this);
		
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		String columnNames[]= {"고유번호","제품명","가격","회사"};
		model=new DefaultTableModel(columnNames, 0);
		
		table = new JTable();
		table.setModel(model);

		scrollPane.setViewportView(table);
		showList();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn=(JButton) e.getSource();
		//winetbl 조회용 winedao, winevo객체 생성
	
		
		//btnchk: 와인조회 버튼, textfield에 wine이름 넣으면 정보를 보여줌
		if(btn==btnchk) {
			//와인타입 검색어가 있다면 
			if(txtwinetype!=null) {
			
			//stackoverflow에서 알아낸 table refresh-우선 새 defaulttable에 담아서 다 지우고
			DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
			tableModel.setRowCount(0);
			//검색한 와인 정보 보여주기
			//레드나 타입으로 검색하게
			//시간이 나면 생각해 보는걸로
			
			vo=dao.getRow(txtwinetype.getText());
			rowData=new Vector<>();
			rowData.addElement(vo.getNo());
			rowData.addElement(vo.getName());
			rowData.addElement(vo.getPrice());
			rowData.addElement(vo.getCompany());
			model.addRow(rowData);
			} else if(txtwinetype==null){
				showList();
			}
		}else if(btn==btnedit) {
			//선택된 번호가 있는 와인의 가격을 고친다 -sql가격도 바뀜
			String price=JOptionPane.showInputDialog("수정할 와인의 가격은");
			dao.wineUpdate(Integer.parseInt(txtwineno.getText()) , Integer.parseInt(price));
			DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
			tableModel.setRowCount(0);
			showList();
		}else if(btn==btndel) {
			
			//사용자가 선택한 행 가져오기
			int row=table.getSelectedRow();
			//model에서 삭제하기
			model.removeRow(row);
			//winetbl에서 삭제하기-아직 구현하지 않음. 필요할까?. 발표전에 필요하면 추가
		}
	}
	public void showList() {
		dao=new WineDAO();
		vec=dao.getList();
		//vo
		for(WineVO vo : vec) {
			rowData=new Vector<>();
			rowData.addElement(vo.getNo());
			rowData.addElement(vo.getName());
			rowData.addElement(vo.getPrice());
			rowData.addElement(vo.getCompany());
			model.addRow(rowData);
			
		}
	}
}
