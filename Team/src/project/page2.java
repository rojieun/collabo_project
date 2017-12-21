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
	private String word[] = {"�������","ȭ��Ʈ����"};
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
	
	//http://blog.naver.com/battledocho/220006953063 ���� ��ɾ� ��
	
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
		
		
		//�˻�âhttps://blog.naver.com/artisan_ryu/40210625781
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
		// ���õ� JcomboBox�� ���ǿ� ���� �̹����� ��ȸ��.	
		//DB���� �����͸� �޾ƿ� JcomboBox�� ����
		//�̹����� �����Ϳ� �°� �� ����
		//�̹����� ������ (�ش� ��) ����â���� �Ѿ�� �޼ҵ�
		 Exception ex = new Exception();
		Object jbx = e.getSource();
		JButton jbtn = (JButton) e.getSource();
		boolean flag = true;
		
		if(categorycbB.getSelectedItem().equals("ȭ��Ʈ����")) {		
			image(1);
		}
		
		if(categorycbB.getSelectedItem().equals("��������")) {
			image(5);
		}

		if(btnSel==jbtn) {
		  try{

		   // �Է�â�� ������ ���� ���

		   if(!SelectField.getText().equals("")){

		    for(int i=0; i<word.length; i++){

		   // �Է°��� �迭�� ���� ���

		     if(SelectField.getText().contains(word[i])){
		    	 System.out.println("�˻�");

		     }

		    }

		    if(flag){

		     //���� �迭�� �ٸ� ���
		    	

		    }       

		   }

		  // �Է�â�� �ƹ��͵� ���� ���� ���.

		   else{

		    throw ex;

		   }

		  }catch(Exception e1){


		   JOptionPane.showMessageDialog(null, "���");

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
/**///for��

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
		//getScaledInstance	�̹��� �����ؼ� ��������
		lbl[i].setIcon(new ImageIcon(img.getScaledInstance(width, height,Image.SCALE_SMOOTH)));
		panel_2.add(lbl[i]);
		//SCALE_SMOOTH = �ӵ����� ȭ�� �켱 / SCALE_FAST = ȭ������ �ӵ� �켱
		} catch(NullPointerException a) {}
		}
	@Override
	public void componentMoved(ComponentEvent e) {
	}
	@Override
	public void componentHidden(ComponentEvent e) {				
	}
});*/
/*//���� https://blog.naver.com/gjduddnr5923/140181030248
GridBagConstraints constraint = new GridBagConstraints(); 
GridBagLayout gbl_main_panel = new GridBagLayout();
gbl_main_panel.columnWidths = new int[] {2};
gbl_main_panel.rowHeights = new int[] {2};
gbl_main_panel.columnWeights = new double[]{Double.MIN_VALUE};
gbl_main_panel.rowWeights = new double[]{Double.MIN_VALUE};
main_panel.setLayout(gbl_main_panel);
constraint.fill=GridBagConstraints.BOTH;
constraint.weightx = 1.0;
constraint.gridwidth = 1;  //REMAINDER = �� ���� ��Ұ� ���̳� ���� ������ ���� ������� �����մϴ�.
constraint.gridheight = 1;
constraint.weighty = 1;*/