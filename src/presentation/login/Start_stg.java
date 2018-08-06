package presentation.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import presentation.definitions.Liste_Defauts_definition_stagiaire;
import presentation.exercice_stagiaire.Liste_Defauts_ex_stagiaire;

public class Start_stg extends JFrame {

	private JPanel contentPane;
	JFrame a;

	public Start_stg() {
		// le stagiaire est inviter à se familiariser avec la machine
		// d'extrusion soufflage en utilisant ce logiciel comme simulateur
		// il est inviter à consulter le cours depuis le bouton "definitions"
		// aussi faire la simulation sous forme d'exercice non noté depuis
		// l'interface offerte par le bouton "exercice"
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setTitle("Bienvenue Stagiaire");
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 0, 0, 30));

		JButton btnDefinitions = new JButton("Definitions");
		btnDefinitions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Liste_Defauts_definition_stagiaire ls = new Liste_Defauts_definition_stagiaire();
				ls.setVisible(true);
				dispose();
			}
		});
		panel.add(btnDefinitions);

		JButton btnExercices = new JButton("Exercices");
		btnExercices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Liste_Defauts_ex_stagiaire a = new Liste_Defauts_ex_stagiaire();
				a.setVisible(true);
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
		flowLayout.setAlignment(FlowLayout.TRAILING);
		contentPane.add(panel_1, BorderLayout.SOUTH);

		JLabel lblDconnection = new JLabel("D\u00E9connection");
		lblDconnection.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(
						null,
						"Voulez vous vraiment rentrer au fenetre d'acceuil ?",
						"titre de joptionpane", 2)) {
					Welcome w = new Welcome();
					w.setVisible(true);
					dispose();
				}
			}
		});
		lblDconnection.setForeground(Color.BLUE);
		lblDconnection.setHorizontalAlignment(SwingConstants.TRAILING);
		panel_1.add(lblDconnection);
	}

}
