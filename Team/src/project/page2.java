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
		}					// 선택된 JcomboBox의 조건에 따라 이미지가 조회됨.
		
		String[] sweetList = {"1","2","3","4","5","모든 "};
		for(int i=0;i<sweetList.length;i++) {
		sweetcbB.addItem(sweetList[i]+"단계");
		}
		String[] bodyList = {"1","2","3","4","5","모든 "};
		for(int j=0;j<bodyList.length;j++) {
		bodycbB.addItem(bodyList[j]+"단계");
		}
		String[] priceList = {"만원 이하","1만~3만","3만~5만","5만~10만","10만~20만","20만~50만","50만~100만","100만 이상","모든 가격"};
		for(int k=0;k<priceList.length;k++) {
		pricecbB.addItem(priceList[k]);
		}
		String[] conturyList = {"프랑스","스페인","미국","이태리","호주","칠레","독일","모든 국가"};
		for(int l=0;l<conturyList.length;l++) {
			conturycbB.addItem(conturyList[l]);
		}
		String[] categoryList = {"레드와인","화이트와인","로제와인","샴페인","스파클링","모든 와인"};
		for(int m=0;m<categoryList.length;m++) {
			categorycbB.addItem(categoryList[m]);
			
			
			//이미지 크기 고정화
			//이미지가 화면 밖으로 넘어갈 시 스크롤 활성화
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//DB에서 데이터를 받아와 JcomboBox랑 연동
		//이미지를 데이터에 맞게 값 조정
		//이미지를 누르면 (해당 라벨) 정보창으로 넘어가는 메소드
		
		
		
	}

}
