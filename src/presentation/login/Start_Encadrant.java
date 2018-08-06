package presentation.login;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import presentation.definitions.Liste_Defauts_definition_encadrant;
import presentation.exercice_encadrant.Liste_Defauts_ex_encadrant;
import presentation.gestion_comptes.Ajouter_stg;
import presentation.gestion_comptes.Modifier_stg;
import presentation.gestion_comptes.Supprimer_stagiaire;

public class Start_Encadrant extends JFrame {
	private JPanel contentPane;

	public Start_Encadrant() {
		setTitle("Acceuil encadrant");
		setDefaultCloseOperation(3);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		// l'encadrant fait la gestion des Stagiaire
		// ainsi que son role principale de moderer , modifier et mettre a jour
		// le cour : definition ainsi que les parametres des remedes pour quaque
		// defaut dans la liste depuis ses deux chois : "definition" ou
		// " exercice"
		JMenu mnGestionStagiaires = new JMenu("Gestion Stagiaires");
		menuBar.add(mnGestionStagiaires);

		JMenuItem mntmAjouter = new JMenuItem("Ajouter");
		mntmAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ajouter_stg s = new Ajouter_stg("Ajouter Stagiaire", "stg");
				s.setVisible(true);
				s.pack();
			}

		});
		mnGestionStagiaires.add(mntmAjouter);

		JMenuItem mntmModifier = new JMenuItem("Modifier");
		mntmModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Modifier_stg s = new Modifier_stg(
						"Modifier les données de Stagiaire", "stg");
				s.setVisible(true);
				s.pack();
			}

		});
		mnGestionStagiaires.add(mntmModifier);

		JMenuItem mntmSupprimer = new JMenuItem("Supprimer");
		mntmSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Supprimer_stagiaire s = new Supprimer_stagiaire(
						"Supprimer le compte de Stagiaire", "stg");
				s.setVisible(true);
				s.pack();
			}

		});
		mnGestionStagiaires.add(mntmSupprimer);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);
		JPanel panel = new JPanel();
		this.contentPane.add(panel, "Center");
		panel.setLayout(new GridLayout(3, 0, 0, 30));

		JButton btnDefinitions = new JButton("Definitions");
		btnDefinitions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Liste_Defauts_definition_encadrant ls = new Liste_Defauts_definition_encadrant();
				ls.setVisible(true);
				dispose();

			}

		});
		panel.add(btnDefinitions);

		JButton btnExercices = new JButton("Exercices");
		btnExercices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Liste_Defauts_ex_encadrant exercice = new Liste_Defauts_ex_encadrant();
				exercice.setVisible(true);
				dispose();
			}

		});
		btnExercices.setEnabled(true);
		panel.add(btnExercices);

		JButton btnTest = new JButton("Test");
		btnTest.setEnabled(false);
		panel.add(btnTest);

		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(4);
		this.contentPane.add(panel_1, "South");

		JLabel lblDconnection = new JLabel("Deconnection");
		lblDconnection.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				if (JOptionPane.showConfirmDialog(null,
						"Voulez vous vraiment rentrer au fenetre d'acceuil ?",
						"titre de joptionpane", 2) == 0) {
					Welcome w = new Welcome();
					w.setVisible(true);
					Start_Encadrant.this.dispose();
				}
			}

		});
		panel_1.add(lblDconnection);
	}

}

/*
 * Location: C:\Users\stark\Desktop\pfeprojetc.jar
 * 
 * Qualified Name: presentation.login.Start_Encadrant
 * 
 * JD-Core Version: 0.7.0.1
 */