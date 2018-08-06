package presentation.login;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

import services.Request_service;
import services.Serial;

public class Loading {

	private String code;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loading start = new Loading();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Loading() {

		code = Serial.GetMACadress();

		Request_service rq = new Request_service();

		rq.create_serial_table();

		reoriantation();

	}

	private void grant_access() {
		// donner acces au logiciel : acceuil
		Welcome frame = new Welcome();
		frame.setVisible(true);
		frame.setResizable(false);
	}

	private void reoriantation() {
		Request_service rq = new Request_service();
		if (rq.valid_sn()) {

			grant_access();

		}

		else {

			if (code.isEmpty()) {
				// @mac vide = deconnecté : identification impossible donc
				// fermeture de logiciel jusqu'a le reinstaller

				JOptionPane
						.showMessageDialog(
								null,
								"Vous devez connecter cette machine au resaux pour recevoir le code d'activation de logiciel");

				System.exit(0);
			} else {
				System.out.println("opening register form");
				// fenetre d'enregistrement :
				// le client copie le code affiché ( adresse mac ) et l'envoie
				// au sosieté qui lui fourni le serial SN relatif au code unique
				// de sa machine pour acceder au logiciel
				// le SN est valide pour une seule machine (
				SN_entry a = new SN_entry();
				a.setVisible(true);
				a.setResizable(false);
				a.setid(code);

			}
		}
	}

}
