package presentation.gestion_comptes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import services.Request_service;

public class Supprimer_Encadrant extends Modifier_utilisateur {
	public Supprimer_Encadrant(String titre, String tab) {
		super(titre, tab);

		getBtnValider().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (valid_pass()) {
					supprimer_encadrant(get_data().getLogin());
					JOptionPane.showMessageDialog(null,
							"Compte supprimé avec succés");
					dispose();
				} else {
					JOptionPane.showMessageDialog(null,
							"Echec de suppression de compte");

				}
			}

		});
	}

	private void supprimer_encadrant(String login) {
		Request_service rq = new Request_service();
		rq.supprimer_encadrant(login);
	}

}

/*
 * Location: C:\Users\stark\Desktop\pfeprojetc.jar
 * 
 * Qualified Name: presentation.gestion_comptes.Supprimer_Encadrant
 * 
 * JD-Core Version: 0.7.0.1
 */