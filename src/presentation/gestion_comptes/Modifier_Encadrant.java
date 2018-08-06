package presentation.gestion_comptes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import beans.Encadrant;
import beans.Utilisateur;

public class Modifier_Encadrant extends Modifier_utilisateur {
	public Modifier_Encadrant(String titre, String tab) {
		super(titre, tab);

		getBtnValider().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (valid_pass()) {
					person2encadrant(get_data());
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

	private Encadrant person2encadrant(Utilisateur p) {
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
