package presentation.gestion_comptes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import beans.Stagiaire;
import beans.Utilisateur;

public class Ajouter_stg extends Ajouter_utilisateur {
	public Ajouter_stg(String titre, String tab) {
		super(titre, tab);
		getBtnValider().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (validate_entry()) {
					ajouter_stg(person2stg(getdata()));

					JOptionPane.showMessageDialog(null,
							"compte ajouté avec succes");
					Ajouter_stg.this.dispose();
				} else {
					JOptionPane.showMessageDialog(null,
							"Echec d'ajout de compte");
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
 * Qualified Name: presentation.gestion_comptes.Ajouter_stg
 * 
 * JD-Core Version: 0.7.0.1
 */