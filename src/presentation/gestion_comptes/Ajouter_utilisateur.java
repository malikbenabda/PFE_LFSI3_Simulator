package presentation.gestion_comptes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import services.Request_service;
import beans.Encadrant;
import beans.Stagiaire;
import beans.Utilisateur;

import components.JNumericfield;

public class Ajouter_utilisateur extends JFrame {
	private JPanel contentPane;
	private JTextField txtnom;
	private JTextField txtprenom;
	private JNumericfield txtcin;
	private JTextField txtadress;
	private JTextField txtemail;
	private JTextField txttel;
	private JTextField txtlogin;
	private JTextField txtmdp;
	private JTextField txtconfirm_mdp;
	private JButton btnAnnuler;
	private JButton btnValider;
	Request_service rq;
	private String table;

	public Ajouter_utilisateur(String titre, String tab) {
		this.table = tab;
		setDefaultCloseOperation(3);
		setBounds(100, 100, 581, 398);
		setTitle(titre);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);

		JPanel panel = new JPanel();
		this.contentPane.add(panel, "Center");
		panel.setLayout(new GridLayout(9, 2, 20, 5));

		JLabel lblNewLabel = new JLabel("Nom");
		panel.add(lblNewLabel);

		this.txtnom = new JTextField();
		panel.add(this.txtnom);
		this.txtnom.setColumns(10);

		JLabel lblPrenom = new JLabel("Prenom");
		panel.add(lblPrenom);

		this.txtprenom = new JTextField();
		this.txtprenom.setColumns(10);
		panel.add(this.txtprenom);

		JLabel lblCin = new JLabel("CIN");
		panel.add(lblCin);

		this.txtcin = new JNumericfield();
		this.txtcin.setColumns(10);
		panel.add(this.txtcin);

		JLabel lblAdresse = new JLabel("Adresse");
		panel.add(lblAdresse);

		this.txtadress = new JTextField();
		this.txtadress.setColumns(10);
		panel.add(this.txtadress);

		JLabel lblEmail = new JLabel("E-mail");
		panel.add(lblEmail);

		this.txtemail = new JTextField();
		this.txtemail.setColumns(10);
		panel.add(this.txtemail);

		JLabel lblNTelephone = new JLabel("N\u00B0 Telephone");
		panel.add(lblNTelephone);

		this.txttel = new JTextField();
		this.txttel.setColumns(10);
		panel.add(this.txttel);

		JLabel lblLogin = new JLabel("Login");
		panel.add(lblLogin);

		this.txtlogin = new JTextField();
		this.txtlogin.setColumns(10);
		panel.add(this.txtlogin);

		JLabel lblMotDePasse = new JLabel("Mot de passe");
		panel.add(lblMotDePasse);

		this.txtmdp = new JTextField();
		this.txtmdp.setColumns(10);
		panel.add(this.txtmdp);

		JLabel lblConfirmerMotDe = new JLabel("Confirmer Mot de passe");
		panel.add(lblConfirmerMotDe);

		this.txtconfirm_mdp = new JTextField();
		this.txtconfirm_mdp.setColumns(10);
		panel.add(this.txtconfirm_mdp);

		JPanel panel_1 = new JPanel();
		this.contentPane.add(panel_1, "South");

		this.btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		panel_1.add(this.btnValider);

		this.btnAnnuler = new JButton("Annuler");
		panel_1.add(this.btnAnnuler);
	}

	public Utilisateur getdata() {
		Utilisateur p = new Utilisateur();

		p.setNom(this.txtnom.getText().trim());

		p.setPrenom(this.txtprenom.getText().trim());

		p.setCin(this.txtcin.getText().trim());

		p.setAdresse(this.txtadress.getText().trim());

		p.setEmail(this.txtemail.getText().trim());

		p.setTel(this.txttel.getText().trim());

		p.setLogin(this.txtlogin.getText().trim());

		p.setMdp(this.txtmdp.getText());

		return p;
	}

	// controle saisie des information de nouveau compte
	public boolean validate_entry() {
		return valid_cin() && valid_confirm_mdp() && valid_login()
				&& valid_mdp() && valid_nom() && valid_prenom();
	}

	// cin doit avoir longeur >6 chars et n'extsiste pas déja dans la DB
	public boolean valid_cin() {
		boolean v = false;
		rq = new Request_service();

		if (!rq.user_existe("cin", this.txtcin.getText().trim(), table)
				&& (txtcin.getText().trim().length() > 6)) {
			v = true;
			txtcin.setBackground(Color.green);
		} else {
			v = false;
			txtcin.setBackground(Color.red);
		}

		return v;
	}

	// le nom doit etre non-nul
	public boolean valid_nom() {
		boolean v = false;

		if ((!txtnom.getText().isEmpty())) {
			v = true;
			txtnom.setBackground(Color.green);
		} else {
			v = false;
			txtnom.setBackground(Color.red);
		}

		return v;
	}

	// le prenom doit etre non-nul
	public boolean valid_prenom() {
		boolean v = true;

		if ((!txtprenom.getText().isEmpty())) {
			v = true;
			txtprenom.setBackground(Color.green);
		} else {
			v = false;
			txtprenom.setBackground(Color.red);
		}

		return v;
	}

	// login doit avoir longeur >3 chars et unique dans la DB
	public boolean valid_login() {
		boolean v = true;
		rq = new Request_service();

		if ((!rq.user_existe("login", txtlogin.getText().trim(), table))
				&& (txtlogin.getText().length() > 3)) {
			v = true;
			txtlogin.setBackground(Color.green);
		} else {
			v = false;
			txtlogin.setBackground(Color.red);
		}

		return v;
	}

	// mot de pass doit avoir longeur >3 chars et sa confirmation est identique

	public boolean valid_mdp() {
		boolean v = true;

		if (txtmdp.getText().length() > 3) {
			v = true;
			txtmdp.setBackground(Color.green);
		} else {
			v = false;
			txtmdp.setBackground(Color.red);
		}

		return v;
	}

	public boolean valid_confirm_mdp() {
		boolean v = true;

		if (txtmdp.getText().equals(txtconfirm_mdp.getText())) {
			v = true;
			txtconfirm_mdp.setBackground(Color.green);
		} else {
			v = false;
			txtconfirm_mdp.setBackground(Color.red);
		}

		return v;
	}

	public void ajouter_encadrant(Encadrant encadrant) {
		this.rq = new Request_service();
		this.rq.ajouter_encadrant(encadrant);
		System.out.println("add encadrant succussful");
	}

	public void ajouter_stg(Stagiaire a) {
		this.rq = new Request_service();
		this.rq.ajouter_stg(a);
		System.out.println("add stagiaire succussful");
	}

	public JButton getBtnValider() {
		return this.btnValider;
	}
}
