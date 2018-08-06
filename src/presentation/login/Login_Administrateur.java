package presentation.login;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import services.Request_service;

public class Login_Administrateur extends JFrame {
	private JPanel contentPane;
	private JPasswordField passwordField;
	Request_service rq;
	private JTextField txtRoot;

	// formulaire qui affiche le seul login de seul Administrateur Root dans un
	// Jtextfield non-editable
	// puis verification de mot de passe enregistré dans la table admins dans la
	// BD et donner acces au utilisateur à l'acceuil Administrateur sinon si mot
	// de passe invalide affchage de message d'ereur et demande de resaisier un
	// autre mot de passe.
	public Login_Administrateur(String s) {
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

		this.txtRoot = new JTextField();
		this.txtRoot.setText("Root");
		this.txtRoot.setEditable(false);
		panel.add(this.txtRoot);
		this.txtRoot.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("mot de passe");
		panel.add(lblNewLabel_1);
		this.rq = new Request_service();

		this.passwordField = new JPasswordField();
		panel.add(this.passwordField);

		JPanel panel_1 = new JPanel();
		this.contentPane.add(panel_1, "South");

		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!Login_Administrateur.this.rq
						.getmdp("Root", "admins")
						.equals(String
								.valueOf(Login_Administrateur.this.passwordField
										.getPassword()))) {
					JOptionPane.showMessageDialog(null,
							"Mot de passe erronÃ© ! ");
				} else {
					Start_Administrateur acceuil = new Start_Administrateur(
							"Bienvenue Administrateur");
					acceuil.setVisible(true);
					Login_Administrateur.this.dispose();
				}
			}
		});
		panel_1.add(btnOk);

		JButton btnQuitter = new JButton("Retour");
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Welcome w = new Welcome();
				w.setVisible(true);
				Login_Administrateur.this.dispose();
			}
		});
		panel_1.add(btnQuitter);
	}
}
