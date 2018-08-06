package presentation.gestion_comptes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import beans.Stagiaire;
import beans.Utilisateur;

public class Modifier_stg extends Modifier_utilisateur {
	public Modifier_stg(String titre, String tab) {
		super(titre, tab);

		getBtnValider().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (valid_pass()) {
					person2stg(get_data());
					JOptionPane.showMessageDialog(null,
							"Compte modifié avec succés");
					dispose();
				} else {
					JOptionPane.showMessageDialog(null,
							"Echec de modification de compte");

				}
			}

		});
	}

	private Stagiaire person2stg(Utilisateur p) {
		Stagiaire a = new Stagiaire();
		a.setNom(p.getNom());
		a.setPrenom(p.getPrenom());
		a.setCin(p.getCin());
		a.setAdresse(p.getAdresse());
		a.setEmail(p.getEmail());
		a.setTel(p.getTel());
		a.setLogin(p.getLogin());
		a.setMdp(p.getMdp());

		return a;
	}

}

/*
 * Location: C:\Users\stark\Desktop\pfeprojetc.jar
 * 
 * Qualified Name: presentation.gestion_comptes.Modifier_stg
 * 
 * JD-Core Version: 0.7.0.1
 */