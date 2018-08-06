package presentation.definitions;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import services.Utility;

public class Definition_defaut_stagiaire extends JFrame {

	private JPanel contentPane;
	private Label lbl_nom_defaut;
	private JTextArea txtcause, txtdef;
	private String path, code;
	private JLabel label_1;

	public void seteditable(boolean a) {
		txtcause.setEditable(a);
		txtdef.setEditable(a);

	}

	protected String getcause() {
		return txtcause.getText();
	}

	protected String getdef() {
		return txtdef.getText();
	}

	public void setcause(String txtcause) {
		this.txtcause.setText(txtcause);
	}

	public void setdef(String txtdef) {
		this.txtdef.setText(txtdef);
	}

	public Definition_defaut_stagiaire(String title, String def_code) {
		setTitle("Definition de defaut :" + title);
		code = def_code;
		setBounds(100, 100, 560, 628);
		Dimension d = new Dimension(MAXIMIZED_HORIZ, MAXIMIZED_VERT);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setMinimumSize(Utility.getsuitable_dimension());
		setExtendedState(MAXIMIZED_BOTH);

		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		Panel panel = new Panel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));

		lbl_nom_defaut = new Label(title);
		lbl_nom_defaut.setForeground(new Color(0, 0, 205));
		lbl_nom_defaut.setFont(new Font("Californian FB", Font.BOLD, 24));
		lbl_nom_defaut.setAlignment(Label.CENTER);
		panel.add(lbl_nom_defaut);

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);

		JPanel panel_2 = new JPanel();
		scrollPane.setViewportView(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.PAGE_AXIS));

		JPanel panel_1 = new JPanel();
		panel_2.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setIcon(new ImageIcon("docs\\images\\" + code + ".png"));
		panel_1.add(label_1);

		JPanel panel_6 = new JPanel();
		panel_1.add(panel_6, BorderLayout.SOUTH);

		JPanel panel_definition = new JPanel();
		panel_2.add(panel_definition);
		panel_definition.setLayout(new BorderLayout(0, 0));

		txtdef = new JTextArea();
		txtdef.setWrapStyleWord(true);
		txtdef.setLineWrap(true);
		txtdef.setFont(new Font("SansSerif", Font.PLAIN, 24));
		txtdef.setBackground(UIManager.getColor("Panel.background"));
		txtdef.setRows(2);
		txtdef.setTabSize(4);
		txtdef.setColumns(15);
		// set methode set text here of txtdef !!!

		setdef("anything that is written in this texfield and saved will be [over]written in ./docs/texts/def/");

		panel_definition.add(txtdef);

		JLabel label = new JLabel("Definition");
		panel_definition.add(label, BorderLayout.NORTH);
		label.setForeground(new Color(0, 0, 205));
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("Vijaya", Font.BOLD, 30));

		JPanel panel_Causes = new JPanel();
		panel_2.add(panel_Causes);
		panel_Causes.setLayout(new BorderLayout(0, 0));

		txtcause = new JTextArea();
		txtcause.setWrapStyleWord(true);
		txtcause.setFont(new Font("SansSerif", Font.PLAIN, 24));
		txtcause.setBackground(UIManager.getColor("Panel.background"));
		txtcause.setRows(2);
		txtcause.setTabSize(4);
		txtcause.setColumns(15);
		txtcause.setLineWrap(true);
		panel_Causes.add(txtcause, BorderLayout.CENTER);
		txtcause.setSize(200, 100);

		// set centenue de txt cause here methode

		setcause("anything that is written in this texfield and saved will be [over]written in ./docs/texts/caus/");

		JLabel lblCauses = new JLabel("Causes");
		lblCauses.setHorizontalAlignment(SwingConstants.LEFT);
		lblCauses.setForeground(new Color(0, 0, 205));
		lblCauses.setFont(new Font("Vijaya", Font.BOLD, 30));
		panel_Causes.add(lblCauses, BorderLayout.NORTH);

		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.EAST);

		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.WEST);

		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5, BorderLayout.SOUTH);

		JButton btnRetour = new JButton("Retour");
		panel_5.add(btnRetour);
		btnRetour.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Liste_Defauts_definition_stagiaire a = new Liste_Defauts_definition_stagiaire();
				a.setVisible(true);
				dispose();
			}
		});
		// remplissage de jtextarea depuis les fichieers textes dans docs
		setcause(Utility.File2String("docs\\textes\\causes\\" + code + ".txt"));
		setdef(Utility.File2String("docs\\textes\\def\\" + code + ".txt"));
		// set jtextarea non modifiable
		seteditable(false);
	}

}