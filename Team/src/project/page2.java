package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTabbedPane;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JList;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.ScrollPaneConstants;

public class page2 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JLabel lblcontury,lblsweet,lblbody,lblprice;
	private JComboBox conturycbB,sweetcbB,bodycbB,pricecbB;
	private JLabel lblcategory;
	private JComboBox categorycbB;
	private JScrollPane scrollPane;
	private JLabel lbl[];
	private JPanel panel_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page2 frame = new page2();
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
	public page2() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 993, 679);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		scrollPane.setColumnHeaderView(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 10));
		
		lblcategory = new JLabel("\uC640\uC778 \uC885\uB958");
		panel.add(lblcategory);
		
		categorycbB = new JComboBox();
		panel.add(categorycbB);
		
		lblcontury = new JLabel("\uAD6D\uAC00");
		panel.add(lblcontury);
		
		conturycbB = new JComboBox();
		panel.add(conturycbB);
		
		lblsweet = new JLabel("\uB2F9");
		panel.add(lblsweet);
		
		sweetcbB = new JComboBox();
		panel.add(sweetcbB);
		
		lblbody = new JLabel("\uBC14\uB514");
		panel.add(lblbody);
		
		bodycbB = new JComboBox();
		panel.add(bodycbB);
		
		lblprice = new JLabel("\uAC00\uACA9");
		panel.add(lblprice);
		
		pricecbB = new JComboBox();
		panel.add(pricecbB);
		
		panel_2 = new JPanel();
		scrollPane.setViewportView(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		
		lbl = new JLabel[15];
		for(int i=0; i<lbl.length;i++) {
			lbl[i]=new JLabel("No image");
			panel_2.add(lbl[i],panel.CENTER_ALIGNMENT);
		}					// ���õ� JcomboBox�� ���ǿ� ���� �̹����� ��ȸ��.
		
		String[] sweetList = {"1","2","3","4","5","��� "};
		for(int i=0;i<sweetList.length;i++) {
		sweetcbB.addItem(sweetList[i]+"�ܰ�");
		}
		String[] bodyList = {"1","2","3","4","5","��� "};
		for(int j=0;j<bodyList.length;j++) {
		bodycbB.addItem(bodyList[j]+"�ܰ�");
		}
		String[] priceList = {"���� ����","1��~3��","3��~5��","5��~10��","10��~20��","20��~50��","50��~100��","100�� �̻�","��� ����"};
		for(int k=0;k<priceList.length;k++) {
		pricecbB.addItem(priceList[k]);
		}
		String[] conturyList = {"������","������","�̱�","���¸�","ȣ��","ĥ��","����","��� ����"};
		for(int l=0;l<conturyList.length;l++) {
			conturycbB.addItem(conturyList[l]);
		}
		String[] categoryList = {"�������","ȭ��Ʈ����","��������","������","����Ŭ��","��� ����"};
		for(int m=0;m<categoryList.length;m++) {
			categorycbB.addItem(categoryList[m]);
			
			
			//�̹��� ũ�� ����ȭ
			//�̹����� ȭ�� ������ �Ѿ �� ��ũ�� Ȱ��ȭ
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//DB���� �����͸� �޾ƿ� JcomboBox�� ����
		//�̹����� �����Ϳ� �°� �� ����
		//�̹����� ������ (�ش� ��) ����â���� �Ѿ�� �޼ҵ�
		
		
		
	}

}
