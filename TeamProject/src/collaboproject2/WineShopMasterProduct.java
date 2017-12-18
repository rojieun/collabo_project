package collaboproject2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

public class WineShopMasterProduct extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTable table;
	private JTextField txtwinename;
	private JButton btnchk, btnedit, btndel, btnconfirm;

	//제품조회: 관리자 모드-회원조회에서 제품관리를 누를 시 들어오게 함
	
	public WineShopMasterProduct() {
		setTitle("와인관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("와인 명");
		panel.add(lblNewLabel);
		
		txtwinename = new JTextField();
		panel.add(txtwinename);
		txtwinename.setColumns(10);
		
		btnchk = new JButton("와인조회");
		panel.add(btnchk);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		btnedit = new JButton("수정");
		panel_1.add(btnedit);
		
		btndel = new JButton("삭제");
		panel_1.add(btndel);
		
		btnconfirm = new JButton("확인");
		panel_1.add(btnconfirm);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"\uC81C\uD488\uBA85", "\uAC00\uACA9", "\uC218\uB7C9"
			}
		));
		scrollPane.setViewportView(table);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn=(JButton) e.getSource();
		
	}

}
