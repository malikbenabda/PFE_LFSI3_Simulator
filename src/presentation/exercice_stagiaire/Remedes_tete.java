package presentation.exercice_stagiaire;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import services.Request_service;
import beans.Remede;

import components.temperature_Scale1110;
import components.time_Scale011;

public class Remedes_tete extends JFrame {
	// meme travail pour fourreau ici
	private JPanel contentPane;
	private JButton btnValider;
	private JLabel lblCentrageFiliere;
	private JLabel lblControleCouteauCoupe;
	int result = 0;
	String def_code;
	Remede rem;
	Request_service rq;
	private time_Scale011 rc;
	private time_Scale011 tc;
	private temperature_Scale1110 tf;

	public int getResult() {
		calculate_result();
		return result;
	}

	public void setResult(int result) {
		calculate_result();
		this.result = result;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Remedes_tete frame = new Remedes_tete("po");
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
	public Remedes_tete(String code) {
		this.def_code = code;
		setTitle("Remedes tete d'extrusion");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 558, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		tf = new temperature_Scale1110((String) null);
		tf.getNumericfield().setText("195");
		tf.getBtn_ok().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rq = new Request_service();
				if (rq.exist_remede(def_code, "tf")) {
					tf.test_entry();
					tf.setCurrent(Double.parseDouble(tf.getNumericfield()
							.getText()));

				} else {
					JOptionPane.showMessageDialog(null,
							"Vous n'avez pas choisi un bon remede");
					tf.setEnabledall(false);
				}
			}
		});
		tf.set_title("Temp\u00E9rature Fili\u00E8re");
		tf.setBounds(0, 0, 182, 125);
		contentPane.add(tf);

		rc = new time_Scale011((String) null);
		rc.getNumericfield().setText("0.5");
		rc.getBtn_ok().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rq = new Request_service();
				if (rq.exist_remede(def_code, "rc")) {
					rc.test_entry();
					rc.setCurrent(Double.parseDouble(rc.getNumericfield()
							.getText()));

				} else {
					JOptionPane.showMessageDialog(null,
							"Vous n'avez pas choisi un bon remede");
					rc.setEnabledall(false);
				}
			}
		});
		rc.set_title("Retard de coupe");
		rc.setBounds(181, 0, 180, 125);
		contentPane.add(rc);

		tc = new time_Scale011((String) null);
		tc.getNumericfield().setText("0.6");
		tc.getBtn_ok().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rq = new Request_service();
				if (rq.exist_remede(def_code, "tc")) {
					tc.test_entry();
					tc.setCurrent(Double.parseDouble(tc.getNumericfield()
							.getText()));

				} else {
					JOptionPane.showMessageDialog(null,
							"Vous n'avez pas choisi un bon remede");
					tc.setEnabledall(false);
				}
			}
		});
		tc.set_title("Temps de coupe");
		tc.setBounds(362, 0, 180, 125);
		contentPane.add(tc);

		lblControleCouteauCoupe = new JLabel("Controle Couteau Coupe");
		lblControleCouteauCoupe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				verify(lblControleCouteauCoupe, "ccc");

			}
		});
		lblControleCouteauCoupe.setFont(new Font("Times New Roman", Font.BOLD,
				15));
		lblControleCouteauCoupe.setIcon(new ImageIcon(Remedes_tete.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_32x32.png")));
		lblControleCouteauCoupe.setBounds(90, 150, 210, 25);
		contentPane.add(lblControleCouteauCoupe);

		lblCentrageFiliere = new JLabel("Centrage Filiere");
		lblCentrageFiliere.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				verify(lblCentrageFiliere, "cf");

			}
		});
		lblCentrageFiliere.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCentrageFiliere.setIcon(new ImageIcon(Remedes_tete.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_32x32.png")));
		lblCentrageFiliere.setBounds(90, 200, 210, 25);
		contentPane.add(lblCentrageFiliere);

		btnValider = new JButton("Valider");
		btnValider.setBounds(405, 200, 120, 25);
		contentPane.add(btnValider);
		initialize_parameter_values();
	}

	public JButton getBtnValider() {
		return btnValider;
	}

	private void verify(JLabel label, String rm_code) {
		Request_service rq = new Request_service();

		if (label
				.getIcon()
				.toString()
				.equals(new ImageIcon(
						Remedes_Trémie.class
								.getResource("/com/jtattoo/plaf/icons/pearl_blue_32x32.png"))
						.toString())) {

			if (rq.exist_remede(def_code, rm_code)) {

				label.setIcon(new ImageIcon(
						Remedes_Trémie.class
								.getResource("/com/jtattoo/plaf/icons/pearl_green_32x32.png")));
				JOptionPane.showMessageDialog(null,
						"Vous avez choisi un bon remede");
				result++;

			} else {
				label.setIcon(new ImageIcon(
						Remedes_Trémie.class
								.getResource("/com/jtattoo/plaf/icons/pearl_red_32x32.png")));
				JOptionPane.showMessageDialog(null,
						"Vous n'avez pas choisi un bon remede");

			}

		}
		initialize_parameter_values();
	}

	private void initialize_parameter_values() {
		rq = new Request_service();
		// au lancement de frame , le systeme lance une requete au base donné
		// (DB ) pour verifier les remedes qui existent dans le table remede
		// avec l'identifiant def_code comme le code du defaut present à traiter
		if (rq.exist_remede(def_code, "rc")) {
			rem = new Remede();
			rem = rq.get_remede(def_code, "rc");
			rc.setInit(rem.getInit());
			rc.setMax(rem.getMax());
			rc.setOpt(rem.getOpt());
			rc.setMin(rem.getMin());
			rc.setCurrent(rem.getInit());

		}

		if (rq.exist_remede(def_code, "tf")) {
			rem = new Remede();
			rem = rq.get_remede(def_code, "tf");
			tf.setInit(rem.getInit());
			tf.setMax(rem.getMax());
			tf.setOpt(rem.getOpt());
			tf.setMin(rem.getMin());
			tf.setCurrent(rem.getInit());

		}
		if (rq.exist_remede(def_code, "tc")) {
			rem = new Remede();
			rem = rq.get_remede(def_code, "tc");
			tc.setInit(rem.getInit());
			tc.setMax(rem.getMax());
			tc.setOpt(rem.getOpt());
			tc.setMin(rem.getMin());
			tc.setCurrent(rem.getInit());

		}

	}

	private void calculate_result() {
		rq = new Request_service();
		if (rq.exist_remede(def_code, "tf"))
			if (tf.test_entry())
				result++;
		if (rq.exist_remede(def_code, "tc"))
			if (tc.test_entry())
				result++;
		if (rq.exist_remede(def_code, "rc"))
			if (rc.test_entry())
				result++;
	}

}
