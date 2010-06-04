package UI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import UI.Base.GradientButton2;

import DataManager.ConfigManager;

public class SetupDialog extends JDialog {
	private int dlgWidth = 400;
	private int dlgHeight = 250;
	private JPanel fontPanel = new JPanel();
	private JPanel proPanel = new JPanel();
	private JPanel btnPanel = new JPanel();
	private JComboBox cboSize;
	private JComboBox cboFamily;
	private JCheckBox chkMaxium = new JCheckBox("��������ʱ���");
	private JCheckBox chkLastFile = new JCheckBox("�Զ���¼���һ�δ򿪵ļ�¼�ļ�");
	private JCheckBox chkAutoExport = new JCheckBox("�����˳�ʱ�Զ��������ı��ļ�");
	private JCheckBox chkHidePassword = new JCheckBox("�ڱ������������");
	private String[] fontFamily = new String[] { "����", "����", "����", "Arial",
			"Tahoma", "Courier New" };
	private ConfigManager configFile;

	private SetupDialog(Frame owner, String title, boolean model) {
		super(owner, title, model);
		try {
			this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public SetupDialog(JFrame frm, ConfigManager configFile) {
		this(frm, "��������", true);
		int lx = (frm.getWidth() - dlgWidth) / 2 + frm.getX();
		int ly = (frm.getHeight() - dlgHeight) / 2 + frm.getY();
		this.setBounds(lx, ly, dlgWidth, dlgHeight);
		this.setResizable(false);
		this.configFile = configFile;
		initDialog();
		getProfile();
	}

	public void initDialog() {
		this.setLayout(new BorderLayout(5, 5));
		fontPanel.setPreferredSize(new Dimension(this.getWidth(), 60));
		fontPanel.setBorder(new TitledBorder("��������"));
		fontPanel.setLayout(new FlowLayout());

		fontPanel.add(new JLabel("���壺"));

		cboFamily = new JComboBox(fontFamily);
		cboFamily.setPreferredSize(new Dimension(120, 20));
		fontPanel.add(cboFamily);

		fontPanel.add(new JLabel("����С��"));

		cboSize = new JComboBox();
		for (int i = 10; i <= 30; i++)
			cboSize.addItem(String.valueOf(i));
		cboSize.setPreferredSize(new Dimension(100, 20));
		fontPanel.add(cboSize);
		this.getContentPane().add(fontPanel, BorderLayout.NORTH);

		proPanel.setPreferredSize(new Dimension(this.getWidth(), 100));
		proPanel.setBorder(new TitledBorder("��������"));
		proPanel.setLayout(new GridLayout(4, 1));
		proPanel.add(chkMaxium);
		proPanel.add(chkLastFile);
		proPanel.add(chkAutoExport);
		proPanel.add(chkHidePassword);
		this.getContentPane().add(proPanel);

		btnPanel.setPreferredSize(new Dimension(this.getWidth(), 40));
		btnPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		this.getContentPane().add(btnPanel, BorderLayout.SOUTH);

		JButton btnOK = setButton("ȷ��", btnPanel);
		JButton btnCancel = setButton("ȡ��", btnPanel);
		JButton btnApple = setButton("Ӧ��", btnPanel);
		btnOK.setDefaultCapable(true);
	}

	public JButton setButton(String text, JPanel panel) {
		JButton btn = new GradientButton2(text);
		btn.setPreferredSize(new Dimension(80, 25));
		panel.add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getActionCommand().equals("ȷ��"))
					onOK();
				if (e.getActionCommand().equals("ȡ��"))
					onCancel();
				if (e.getActionCommand().equals("Ӧ��"))
					onApply();
			}
		});
		return btn;
	}

	public void onOK() {
		onApply();
		this.dispose();
	}

	public void onCancel() {
		this.dispose();
	}

	public void onApply() {
		configFile.setFontName(cboFamily.getSelectedItem().toString().trim());
		configFile.setFontSize(cboSize.getSelectedIndex() + 10);
		configFile.setAutoExport(chkAutoExport.isSelected());
		configFile.setMaxium(chkMaxium.isSelected());
		configFile.setOpenLastFile(chkLastFile.isSelected());
		configFile.setHidePassword(chkHidePassword.isSelected());
	}

	public void getProfile() {
		cboFamily.setSelectedItem(configFile.getFontName());
		cboSize.setSelectedIndex(configFile.getFontSize() - 10);
		chkMaxium.setSelected(configFile.isMaxium());
		chkAutoExport.setSelected(configFile.isAutoExport());
		chkLastFile.setSelected(configFile.isOpenLastFile());
		chkHidePassword.setSelected(configFile.isHidePassword());
	}
}
