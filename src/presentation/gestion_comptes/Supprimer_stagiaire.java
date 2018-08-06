package presentation.gestion_comptes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import services.Request_service;

public class Supprimer_stagiaire extends Modifier_utilisateur {
	public Supprimer_stagiaire(String titre, String tab) {
		super(titre, tab);
		getBtnValider().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (valid_pass()) {
					supprimer_stg(get_data().getLogin());
					JOptionPane.showMessageDialog(null,
							"Compte supprimé avec succés");
					Supprimer_stagiaire.this.dispose();
				} else {
					JOptionPane.showMessageDialog(null,
							"Echec de suppression de compte");

				}
			}

		});
	}

	private void supprimer_stg(String login) {
		Request_service rq = new Request_service();
		rq.supprimer_stg(login);
	}

}

/*
 * Location: C:\Users\stark\Desktop\pfeprojetc.jar
 * 
 * Qualified Name: presentation.gestion_comptes.Supprimer_stagiaire
 * 
 * JD-Core Version: 0.7.0.1
 */