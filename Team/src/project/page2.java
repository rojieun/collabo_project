package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicEditorPaneUI;
import javax.swing.plaf.basic.BasicSliderUI;

import com.jgoodies.forms.layout.ConstantSize;

import javax.swing.JTabbedPane;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import java.awt.CardLayout;
import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import java.awt.GridBagLayout;
import javax.swing.JLayeredPane;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;



public class page2 extends JFrame implements ActionListener,MouseListener{

	private JPanel contentPane,panel;
	private JLabel lblcontury,lblsweet,lblbody,lblprice;
	private JComboBox conturycbB,sweetcbB,bodycbB,pricecbB;
	private JLabel lblcategory;
	private JComboBox categorycbB;
	private JScrollPane scrollPane;
	private JLabel lbl[];
	private JPanel main_panel;
	private DB db = new DB();
	private JPanel panel_1;
	private JTextField SelectField;
	private JButton btnSel;
	private boolean flag = true;
	private String word[] = {"레드와인","화이트와인"};
	private int pos;
	private JComboBox comboBox;
	
	
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
	
	//http://blog.naver.com/battledocho/220006953063 각종 명령어 뜻
	
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
		
		
		panel = new JPanel();
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
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		scrollPane.setRowHeaderView(tabbedPane);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		btnSel = new JButton("\uAC80\uC0C9");
		panel_1.add(btnSel);
		
		SelectField = new JTextField();
		panel_1.add(SelectField);
		SelectField.setColumns(10);
		
		comboBox = new JComboBox();
		panel_1.add(comboBox);
		
		
		
		image(60);
		
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
			
			}
		sweetcbB.addActionListener(this);
		//sweetcbB.addItemListener(this);
		bodycbB.addActionListener(this);
		//bodycbB.addItemListener(this);
		pricecbB.addActionListener(this);
		//pricecbB.addItemListener(this);
		conturycbB.addActionListener(this);
		//conturycbB.addItemListener(this);
		categorycbB.addActionListener(this);
		//categorycbB.addItemListener(this);
		btnSel.addActionListener(this);
		
		
		//검색창https://blog.naver.com/artisan_ryu/40210625781
	}
			
	public void image(int sum) {
		lbl = new JLabel[sum];
		main_panel = new JPanel();
		scrollPane.setViewportView(main_panel);
		main_panel.setLayout(new GridLayout(3, 3, 0, 0));
		for(int i=0; i<lbl.length;i++) {
			lbl[i]=new JLabel("No image");
			int width = lbl[i].getWidth(); 
			int height = lbl[i].getHeight();
			lbl[i].setSize(width, height);
			main_panel.add(lbl[i],main_panel.CENTER_ALIGNMENT);
			lbl[i].addMouseListener((MouseListener) this);
		}	
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 선택된 JcomboBox의 조건에 따라 이미지가 조회됨.	
		//DB에서 데이터를 받아와 JcomboBox랑 연동
		//이미지를 데이터에 맞게 값 조정
		//이미지를 누르면 (해당 라벨) 정보창으로 넘어가는 메소드
		 Exception ex = new Exception();
		Object jbx = e.getSource();
		JButton jbtn = (JButton) e.getSource();
		boolean flag = true;
		
		if(categorycbB.getSelectedItem().equals("화이트와인")) {		
			image(1);
		}
		
		if(categorycbB.getSelectedItem().equals("로제와인")) {
			image(5);
		}

		if(btnSel==jbtn) {
		  try{

		   // 입력창에 뭐든지 들어갔을 경우

		   if(!SelectField.getText().equals("")){

		    for(int i=0; i<word.length; i++){

		   // 입력값과 배열이 같을 경우

		     if(SelectField.getText().contains(word[i])){
		    	 System.out.println("검색");

		     }

		    }

		    if(flag){

		     //값이 배열과 다를 경우
		    	

		    }       

		   }

		  // 입력창에 아무것도 들어가지 않을 경우.

		   else{

		    throw ex;

		   }

		  }catch(Exception e1){


		   JOptionPane.showMessageDialog(null, "경고");

		  	}

		  }
		
		}
	
	
	

	@Override
	public void mouseClicked(MouseEvent e) {		 
				page1 page1 = new page1();
				page1.setVisible(true);
	}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	
}




/*@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	page1 page1 = new page1();
	page1.setVisible(true);
}*/
/**///for문

/*lbl[i].addComponentListener(new ComponentListener() {
	@Override
	public void componentShown(ComponentEvent e) {		
	}
	@Override
	public void componentResized(ComponentEvent e) {
		ImageIcon icon = new ImageIcon();
		Image img = icon.getImage();
		try {
			//lbl[i].setSize(width, height);
		//getScaledInstance	이미지 유지해서 가져오기
		lbl[i].setIcon(new ImageIcon(img.getScaledInstance(width, height,Image.SCALE_SMOOTH)));
		panel_2.add(lbl[i]);
		//SCALE_SMOOTH = 속도보다 화질 우선 / SCALE_FAST = 화질보다 속도 우선
		} catch(NullPointerException a) {}
		}
	@Override
	public void componentMoved(ComponentEvent e) {
	}
	@Override
	public void componentHidden(ComponentEvent e) {				
	}
});*/
/*//참조 https://blog.naver.com/gjduddnr5923/140181030248
GridBagConstraints constraint = new GridBagConstraints(); 
GridBagLayout gbl_main_panel = new GridBagLayout();
gbl_main_panel.columnWidths = new int[] {2};
gbl_main_panel.rowHeights = new int[] {2};
gbl_main_panel.columnWeights = new double[]{Double.MIN_VALUE};
gbl_main_panel.rowWeights = new double[]{Double.MIN_VALUE};
main_panel.setLayout(gbl_main_panel);
constraint.fill=GridBagConstraints.BOTH;
constraint.weightx = 1.0;
constraint.gridwidth = 1;  //REMAINDER = 이 구성 요소가 열이나 행의 마지막 구성 요소임을 지정합니다.
constraint.gridheight = 1;
constraint.weighty = 1;*/