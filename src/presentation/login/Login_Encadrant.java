package presentation.login;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import services.Request_service;

public class Login_Encadrant extends JFrame {
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JComboBox<String> comboBox;
	Request_service rq;

	// ‡ l'ouverture de formuaire le cobobox est rempli par un array de String
	// contenant la liste des logins des encadrants depuis la table admins dans
	// la DB;
	// puis verification de mot de passe et donner acces au utilisateur ‡
	// l'acceuil Encadrant sinon si mot de passe invalide affchage de message
	// d'ereur et demande de resaisier un autre mot de passe
	public Login_Encadrant(String s) {
		setDefaultCloseOperation(3);
		setBounds(100, 100, 450, 300);
		setTitle(s);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);

		JPanel panel = new JPanel();
		this.contentPane.add(panel, "Center");
		panel.setLayout(new GridLayout(6, 2, 0, 0));

		JLabel lblNewLabel = new JLabel("login");
		panel.add(lblNewLabel);

		this.comboBox = new JComboBox();

		panel.add(this.comboBox);

		JLabel lblNewLabel_1 = new JLabel("mot de passe");
		panel.add(lblNewLabel_1);
		this.rq = new Request_service();
		this.comboBox.setModel(this.rq.getlogins("admins"));

		this.passwordField = new JPasswordField();
		panel.add(this.passwordField);

		JPanel panel_1 = new JPanel();
		this.contentPane.add(panel_1, "South");

		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String login = Login_Encadrant.this.comboBox.getSelectedItem()
						.toString();
				System.out.println(Login_Encadrant.this.rq.getmdp(login,
						"admins"));
				if (!Login_Encadrant.this.rq.getmdp(login, "admins").equals(
						String.valueOf(Login_Encadrant.this.passwordField
								.getPassword()))) {
					JOptionPane.showMessageDialog(null,
							"Mot de passe erron√© ! ");
				} else {
					Start_Encadrant acceuil = new Start_Encadrant();
					acceuil.setVisible(true);
					Login_Encadrant.this.dispose();
				}
			}
		});
		panel_1.add(btnOk);

		JButton btnQuitter = new JButton("Retour");
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Welcome w = new Welcome();
				w.setVisible(true);
				Login_Encadrant.this.dispose();
			}
		});
		panel_1.add(btnQuitter);
	}

}

/*
 * Location: C:\Users\stark\Desktop\pfeprojetc.jar
 * 
 * Qualified Name: presentation.login.Login_Encadrant
 * 
 * JD-Core Version: 0.7.0.1
 */