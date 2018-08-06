package presentation.exercice_stagiaire;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import services.Request_service;

public class Dernier_piece extends JFrame {

	private JPanel contentPane;
	private int total;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dernier_piece frame = new Dernier_piece("po", 2);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Dernier_piece(String code, int corrected) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 408, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JLabel lblNomdefaut = new JLabel("D\u00E9tails de defaut present");
		lblNomdefaut.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNomdefaut.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNomdefaut, BorderLayout.NORTH);

		JLabel lblImage = new JLabel("");
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setIcon(new ImageIcon("docs\\images\\" + code + ".png"));
		contentPane.add(lblImage, BorderLayout.CENTER);
		Request_service rq = new Request_service();
		total = rq.count_remedes(code);
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);

		JLabel lblNombreDeRemedes = new JLabel(
				"Nombre de Remedes effectu\u00E9s : " + corrected);
		panel_1.add(lblNombreDeRemedes);

		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.SOUTH);

		JLabel lblPourcentageDeDefaut = new JLabel(
				"Pourcentage de Gravit\u00E9 de Defaut : "
						+ (100 - ((corrected * 100) / total)) + "%");
		panel_2.add(lblPourcentageDeDefaut);

		// afficher l'image de defaut present ;
		// afficher pourcentage de defaut present dans les pieces fabriquéss et
		// le nombre de bons remedes effectués pour y arriver
	}

}
