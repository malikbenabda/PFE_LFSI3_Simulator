package presentation.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import presentation.gestion_comptes.Ajout_Encadrant;
import presentation.gestion_comptes.Modifier_Encadrant;
import presentation.gestion_comptes.Supprimer_Encadrant;
import services.Request_service;
import beans.Admin;
import beans.Utilisateur;

public class Start_Administrateur extends JFrame {
	private JPanel contentPane;
	private JTextField txtcin;
	Request_service rq = new Request_service();
	private JTextField txt_mdp;

	public static void main(String[] arg) {
		Start_Administrateur a = new Start_Administrateur(
				"Acceuil Administrateur");
		a.setVisible(true);
		a.setResizable(false);
	}

	// l'administrateur a le pouvoir de changer son mdp et cin ;
	// l'administrateur aussi fait la gestion des encadrants
	public Start_Administrateur(String s) {
		setDefaultCloseOperation(3);
		setBounds(100, 100, 319, 175);
		setTitle(s);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnGestionAdministrateur = new JMenu("Gestion Des Encadrants");
		menuBar.add(mnGestionAdministrateur);

		JMenuItem menuItem = new JMenuItem("Ajouter");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ajout_Encadrant ad = new Ajout_Encadrant("Ajouter Encadrants",
						"admins");
				ad.setVisible(true);
				ad.pack();
			}
		});
		mnGestionAdministrateur.add(menuItem);

		JMenuItem menuItem_1 = new JMenuItem("Modifier");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Modifier_Encadrant ad = new Modifier_Encadrant(
						"Modifier les donnÃ©es des Encadrants", "admins");
				ad.setVisible(true);
				ad.pack();
			}
		});
		mnGestionAdministrateur.add(menuItem_1);

		JMenuItem menuItem_2 = new JMenuItem("Supprimer");
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Supprimer_Encadrant ad = new Supprimer_Encadrant(
						"Supprimer le compte d'Encadrant", "admins");
				ad.setVisible(true);
				ad.pack();
			}
		});
		mnGestionAdministrateur.add(menuItem_2);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		this.contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 48, 28, 102, 28 };
		gbl_panel.rowHeights = new int[] { 20 };
		gbl_panel.columnWeights = new double[] { 0.0D, 0.0D, 0.0D, 0.0D,
				4.9E-324D };
		gbl_panel.rowWeights = new double[] { 0.0D, 0.0D, 4.9E-324D };
		panel.setLayout(gbl_panel);

		JLabel lblEditer = new JLabel("Editer");
		lblEditer.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				String t = JOptionPane.showInputDialog(null,
						"Veuillez entrer le nouveau Cin",
						Start_Administrateur.this.txtcin.getText());
				if ((!t.isEmpty()) && (t.length() >= 4)) {
					Start_Administrateur.this.txtcin.setText(t);
					Start_Administrateur.this.rq.modifier_root_item(
							Start_Administrateur.this.txtcin.getText(), "cin");
				}
			}
		});
		JLabel lblCin = new JLabel("CIN : ");
		GridBagConstraints gbc_lblCin = new GridBagConstraints();
		gbc_lblCin.anchor = 17;
		gbc_lblCin.insets = new Insets(0, 0, 5, 5);
		gbc_lblCin.gridx = 0;
		gbc_lblCin.gridy = 0;
		panel.add(lblCin, gbc_lblCin);

		this.txtcin = new JTextField();
		GridBagConstraints gbc_txtcin = new GridBagConstraints();
		gbc_txtcin.gridwidth = 2;
		gbc_txtcin.fill = 1;
		gbc_txtcin.insets = new Insets(0, 0, 5, 5);
		gbc_txtcin.gridx = 1;
		gbc_txtcin.gridy = 0;
		panel.add(this.txtcin, gbc_txtcin);
		this.txtcin.setColumns(12);
		this.txtcin.setEditable(false);

		this.txtcin.setText(this.rq.getutilisateur("Root", "admins").getCin());
		lblEditer.setForeground(Color.BLUE);
		lblEditer.setFont(new Font("Tahoma", 2, 11));
		GridBagConstraints gbc_lblEditer = new GridBagConstraints();
		gbc_lblEditer.insets = new Insets(0, 0, 5, 0);
		gbc_lblEditer.anchor = 17;
		gbc_lblEditer.gridx = 3;
		gbc_lblEditer.gridy = 0;
		panel.add(lblEditer, gbc_lblEditer);

		JLabel lbl_mdp = new JLabel("Mot de passe : ");
		GridBagConstraints gbc_lbl_mdp = new GridBagConstraints();
		gbc_lbl_mdp.insets = new Insets(0, 0, 0, 5);
		gbc_lbl_mdp.gridx = 0;
		gbc_lbl_mdp.gridy = 1;
		panel.add(lbl_mdp, gbc_lbl_mdp);

		this.txt_mdp = new JTextField();
		GridBagConstraints gbc_txt_mdp = new GridBagConstraints();
		gbc_txt_mdp.gridwidth = 2;
		gbc_txt_mdp.fill = 1;
		gbc_txt_mdp.insets = new Insets(0, 0, 0, 5);
		gbc_txt_mdp.gridx = 1;
		gbc_txt_mdp.gridy = 1;
		panel.add(this.txt_mdp, gbc_txt_mdp);
		this.txt_mdp.setText(null);
		this.txt_mdp.setEditable(false);
		this.txt_mdp.setColumns(12);
		this.txt_mdp.setText(this.rq.getutilisateur("Root", "admins").getMdp());

		JLabel edit_mdp = new JLabel("Editer");
		GridBagConstraints gbc_edit_mdp = new GridBagConstraints();
		gbc_edit_mdp.gridx = 3;
		gbc_edit_mdp.gridy = 1;
		panel.add(edit_mdp, gbc_edit_mdp);
		edit_mdp.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				String t = JOptionPane.showInputDialog(null,
						"Veuillez entrer le nouveau mot de passe",
						Start_Administrateur.this.txt_mdp.getText());
				if ((!t.isEmpty()) && (t.length() >= 4)) {
					Start_Administrateur.this.txt_mdp.setText(t);
					Start_Administrateur.this.rq.modifier_root_item(
							Start_Administrateur.this.txt_mdp.getText(), "mdp");
				}
			}
		});
		edit_mdp.setForeground(Color.BLUE);
		edit_mdp.setFont(new Font("Tahoma", 2, 11));

		JPanel panel_1 = new JPanel();
		this.contentPane.add(panel_1, "North");

		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setAlignment(4);
		this.contentPane.add(panel_2, "South");

		JLabel lblNewLabel = new JLabel("Déconnecter");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				if (JOptionPane.showConfirmDialog(null,
						"Voulez vous vraiment rentrer au fenetre d'acceuil ?",
						"titre de joptionpane", 2) == 0) {
					Welcome w = new Welcome();
					w.setVisible(true);
					Start_Administrateur.this.dispose();
				}
			}
		});
		panel_2.add(lblNewLabel);
	}

	private Admin utilisateur2admin(Utilisateur u) {
		Admin ad = new Admin();
		ad.setCin(u.getCin());
		ad.setMdp(u.getMdp());

		return ad;
	}
}

/*
 * Location: C:\Users\stark\Desktop\pfeprojetc.jar
 * 
 * Qualified Name: presentation.login.Start_Administrateur
 * 
 * JD-Core Version: 0.7.0.1
 */