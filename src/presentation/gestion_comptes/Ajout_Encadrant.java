package presentation.gestion_comptes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import beans.Encadrant;
import beans.Utilisateur;

public class Ajout_Encadrant extends Ajouter_utilisateur {
	public Ajout_Encadrant(String titre, String tab) {
		super(titre, tab);

		getBtnValider().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (validate_entry()) {
					ajouter_encadrant(utilisateur2encadrant(getdata()));

					JOptionPane.showMessageDialog(null,
							"compte ajouté avec succes");
					Ajout_Encadrant.this.dispose();
				} else {

					JOptionPane.showMessageDialog(null,
							"Echec d'ajout de compte");
				}
			}
		});
	}

	private Encadrant utilisateur2encadrant(Utilisateur p) {
		Encadrant a = new Encadrant();
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
 * Qualified Name: presentation.gestion_comptes.Ajout_Encadrant
 * 
 * JD-Core Version: 0.7.0.1
 */