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

public class Login_Stagiaire extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JComboBox<String> comboBox;
	Request_service rq;

	// à l'ouverture de formuaire le cobobox est rempli par un array de String
	// contenant la liste des logins des stagiaires depuis la table stg dans
	// la DB;
	// puis verification de mot de passe et donner acces au utilisateur à
	// l'acceuil Stagiaire sinon si mot de passe invalide affchage de message
	// d'ereur et demande de resaisier un autre mot de passe
	public Login_Stagiaire(String s) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle(s);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(6, 2, 0, 0));

		JLabel lblNewLabel = new JLabel("login");
		panel.add(lblNewLabel);

		comboBox = new JComboBox<String>();

		panel.add(comboBox);

		JLabel lblNewLabel_1 = new JLabel("mot de passe");
		panel.add(lblNewLabel_1);
		rq = new Request_service();
		comboBox.setModel(rq.getlogins("stg"));

		passwordField = new JPasswordField();
		panel.add(passwordField);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);

		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String login = comboBox.getSelectedItem().toString();
				System.out.println(rq.getmdp(login, "stg"));
				if (!rq.getmdp(login, "stg").equals(
						String.valueOf(passwordField.getPassword())))
					JOptionPane.showMessageDialog(null,
							"Mot de passe erroné ! ");
				else {
					Start_stg acceuil = new Start_stg();
					acceuil.setVisible(true);
					dispose();
				}
			}
		});
		panel_1.add(btnOk);

		JButton btnQuitter = new JButton("Retour");
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Welcome w = new Welcome();
				w.setVisible(true);
				dispose();
			}
		});
		panel_1.add(btnQuitter);
	}

}
