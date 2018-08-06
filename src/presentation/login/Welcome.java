package presentation.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UnsupportedLookAndFeelException;

import persistance.AccesBD;

public class Welcome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
			throws UnsupportedLookAndFeelException {

		/* Set the Nimbus look and feel *///
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				javax.swing.UIManager
						.setLookAndFeel(new com.jtattoo.plaf.texture.TextureLookAndFeel());
			}
		} catch (UnsupportedLookAndFeelException ex) {
			System.out.println("error in setting look&feel");
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the frame.
	 */
	public Welcome() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyCode() == arg0.VK_ESCAPE)
					dispose();
			}
		});
		setFocusable(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 1, 50, 100));

		JButton btnNewButton = new JButton("Mode Stagiaire");
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_Stagiaire s = new Login_Stagiaire("Login Stagiaire");
				s.setVisible(true);
				dispose();
			}
		});
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Mode Encadrant");
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_Encadrant encadrant = new Login_Encadrant(
						"Login Encadrant");
				encadrant.setVisible(true);
				dispose();
			}
		});
		// creation des tables admins,stg, et remede et creation de
		// l'administarteur Root avec mot de passe 12345 statiquement qui peut
		// etre modifiée
		AccesBD ac = new AccesBD();
		String remede = "('def_code' VARCHAR NOT NULL , 'rem_code' VARCHAR NOT NULL , "
				+ "'nom' VARCHAR , 'piece'  VARCHAR , 'type'  VARCHAR ,"
				+ " 'init' DOUBLE DEFAULT (0) ,  'opt' DOUBLE DEFAULT (0) , 'min' DOUBLE DEFAULT (0) , 'max' DOUBLE DEFAULT (0) )";

		ac.MAJ("CREATE  TABLE  IF NOT EXISTS 'remede' " + remede);
		ac.disconnect();
		String s = "(  'nom' VARCHAR  , 'prenom' VARCHAR   ,   'cin' VARCHAR UNIQUE NOT NULL    ,    'adresse' VARCHAR    ,  'email' VARCHAR   ,"
				+ " 'tel' VARCHAR ,   'login' VARCHAR PRIMARY KEY  NOT NULL  UNIQUE  , 'mdp' VARCHAR NOT NULL  )";

		ac.MAJ("CREATE  TABLE  IF NOT EXISTS 'admins' " + s);
		ac.disconnect();
		ac.MAJ("CREATE  TABLE  IF NOT EXISTS 'stg'" + s);
		ac.disconnect();
		try {
			if (!ac.getStatment("select * from 'admins'").next()) {
				ac.MAJ("insert into admins values( ' nom ' ,  'prenom' , ' cin ' , ' adresse ' , ' email  ', ' tel '   , 'Root' , '12345' )");
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ac.disconnect();

		panel.add(btnNewButton_1);

		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_1, BorderLayout.SOUTH);

		JLabel lblModeAdministrateur = new JLabel("Mode Administrateur");
		lblModeAdministrateur.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Login_Administrateur admin = new Login_Administrateur(
						"Mode ADMIN");
				admin.setVisible(true);
				dispose();
			}
		});
		lblModeAdministrateur.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModeAdministrateur.setForeground(Color.BLUE);
		panel_1.add(lblModeAdministrateur);
	}

}
