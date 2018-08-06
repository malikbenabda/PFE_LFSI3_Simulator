package presentation.exercice_stagiaire;

import java.awt.BorderLayout;
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
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import services.Request_service;
import beans.Remede;

import components.speed_Scale110;
import components.temperature_Scale1110;

// les valeurs affichées dans les cadres numerique sont destiné à etre traités apres 
//pour permettre l'encadrant d'y mettre depuis une interface graphique qui les mettes dans un table de BD

public class Remede_Fourreau extends JFrame {

	private JPanel contentPane;
	int result = 0;
	private Remede tm, vv;
	private JLabel lblcem;
	private JLabel lblpnf;
	private JLabel lblcf;
	private JButton btnvalider;
	String def_code;
	private temperature_Scale1110 tsz3;
	private speed_Scale110 vv_scale;
	private temperature_Scale1110 tsz2;
	private temperature_Scale1110 tsz1;
	private temperature_Scale1110 tsz4;
	Request_service rq;

	public int getResult() {
		calculate_result();
		return result;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Remede_Fourreau frame = new Remede_Fourreau("po");
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
	public Remede_Fourreau(String code) {
		this.def_code = code;
		setTitle("Remede Fourreau");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 609, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		vv_scale = new speed_Scale110((String) null);
		vv_scale.getBtn_ok().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rq = new Request_service();
				if (rq.exist_remede(def_code, "vv")) {
					vv_scale.test_entry();
					vv_scale.setCurrent(Double.parseDouble(vv_scale
							.getNumericfield().getText()));

				} else {
					JOptionPane.showMessageDialog(null,
							"Vous n'avez pas choisi un bon remede");
					vv_scale.setEnabledall(false);
				}
			}
		});
		vv_scale.getNumericfield().setText("65");
		vv_scale.set_title("Vitesse Vis");
		vv_scale.setBounds(390, 11, 180, 125);
		contentPane.add(vv_scale);

		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(360, 0, 10, 270);
		contentPane.add(separator);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 360, 270);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		JLabel lblTemperatureDeMatiere = new JLabel("Temperature de Matiere");
		lblTemperatureDeMatiere.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTemperatureDeMatiere.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblTemperatureDeMatiere, BorderLayout.NORTH);

		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);

		tsz2 = new temperature_Scale1110("Zone 2");
		tsz2.getBtn_ok().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rq = new Request_service();
				if (rq.exist_remede(def_code, "tm")) {
					tsz2.test_entry();
					tsz2.setCurrent(Double.parseDouble(tsz2.getNumericfield()
							.getText()));

				} else {
					JOptionPane.showMessageDialog(null,
							"Vous n'avez pas choisi un bon remede");
					tsz1.setEnabledall(false);
					tsz2.setEnabledall(false);
					tsz3.setEnabledall(false);
					tsz4.setEnabledall(false);
				}
			}
		});
		tsz2.getNumericfield().setText("205");
		tsz2.setBounds(180, 0, 180, 125);
		panel_1.add(tsz2);

		tsz1 = new temperature_Scale1110("Zone 1 ( Alimentation");
		tsz1.getBtn_ok().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rq = new Request_service();
				if (rq.exist_remede(def_code, "tm")) {
					tsz1.test_entry();
					tsz1.setCurrent(Double.parseDouble(tsz1.getNumericfield()
							.getText()));

				} else {
					JOptionPane.showMessageDialog(null,
							"Vous n'avez pas choisi un bon remede");
					tsz1.setEnabledall(false);
					tsz2.setEnabledall(false);
					tsz3.setEnabledall(false);
					tsz4.setEnabledall(false);
				}

			}
		});
		tsz1.set_title("Zone 1 (Alimentation)");
		tsz1.getNumericfield().setText("200");
		tsz1.setBounds(0, 0, 180, 125);
		panel_1.add(tsz1);

		tsz3 = new temperature_Scale1110("Zone 3");
		tsz3.getBtn_ok().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rq = new Request_service();
				if (rq.exist_remede(def_code, "tm")) {
					tsz3.test_entry();
					tsz3.setCurrent(Double.parseDouble(tsz3.getNumericfield()
							.getText()));

				} else {
					JOptionPane.showMessageDialog(null,
							"Vous n'avez pas choisi un bon remede");
					tsz1.setEnabledall(false);
					tsz2.setEnabledall(false);
					tsz3.setEnabledall(false);
					tsz4.setEnabledall(false);
				}
			}
		});
		tsz3.getNumericfield().setText("210");
		tsz3.setBounds(0, 125, 180, 125);
		panel_1.add(tsz3);

		tsz4 = new temperature_Scale1110("Zone 4");
		tsz4.getBtn_ok().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rq = new Request_service();
				if (rq.exist_remede(def_code, "tm")) {
					tsz4.test_entry();
					tsz4.setCurrent(Double.parseDouble(tsz4.getNumericfield()
							.getText()));

				} else {
					JOptionPane.showMessageDialog(null,
							"Vous n'avez pas choisi un bon remede");
					tsz1.setEnabledall(false);
					tsz2.setEnabledall(false);
					tsz3.setEnabledall(false);
					tsz4.setEnabledall(false);
				}
			}
		});
		tsz4.getNumericfield().setText("215");
		tsz4.setBounds(180, 125, 180, 125);
		panel_1.add(tsz4);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(360, 145, 232, 10);
		contentPane.add(separator_1);

		lblpnf = new JLabel("Purger et netoyer le fourreau");
		lblpnf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				verify(lblpnf, def_code);
			}
		});
		lblpnf.setIcon(new ImageIcon(Remede_Fourreau.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_32x32.png")));
		lblpnf.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblpnf.setBounds(360, 150, 250, 25);
		contentPane.add(lblpnf);

		lblcf = new JLabel("Controler Filtre");
		lblcf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				verify(lblcf, def_code);
			}
		});
		lblcf.setIcon(new ImageIcon(Remede_Fourreau.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_32x32.png")));
		lblcf.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblcf.setBounds(360, 175, 250, 27);
		contentPane.add(lblcf);

		lblcem = new JLabel("Controler ecoulement matiere");
		lblcem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				verify(lblcem, def_code);
			}
		});
		lblcem.setIcon(new ImageIcon(Remede_Fourreau.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_32x32.png")));
		lblcem.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblcem.setBounds(360, 200, 250, 27);
		contentPane.add(lblcem);

		btnvalider = new JButton("Valider");
		btnvalider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnvalider.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnvalider.setBounds(390, 238, 180, 32);
		contentPane.add(btnvalider);

		initialize_parameter_values();
	}

	private void verify(JLabel label, String rm_code) {
		// ç l'action sur ce rememde le systeme envoie une requete au BD pour
		// verifier l'existance de l'entrée de ce remede pour ce defaut dans la
		// table remede
		// si elle existe le remede sera accepté et signalé comme valide sinon
		// signalé comme invalid et un message sera affiché pour les 2 cas ainsi
		// que la couleur de boule blue changera de vert ou rouge
		rq = new Request_service();

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
	}

	public JButton getBtnValider() {
		return btnvalider;
	}

	private void initialize_parameter_values() {
		// au lancement de frame , le systeme lance une requete au base donné
		// (DB ) pour verifier les remedes qui existent dans le table remede
		// avec l'identifiant def_code comme le code du defaut present à traiter
		Request_service rq = new Request_service();
		if (rq.exist_remede(def_code, "tm")) {
			{
				tm = new Remede();
				tm = rq.get_remede(def_code, "tm");
				tsz1.setInit(tm.getInit());
				tsz1.setMax(tm.getMax());
				tsz1.setOpt(tm.getOpt());
				tsz1.setMin(tm.getMin());
				tsz1.setCurrent(tm.getInit());

				tsz2.setInit(tm.getInit() + 5);
				tsz2.setMax(tm.getMax() + 5);
				tsz2.setOpt(tm.getOpt() + 5);
				tsz2.setMin(tm.getMin() + 5);
				tsz2.setCurrent(tm.getInit() + 5);

				tsz3.setInit(tm.getInit() + 10);
				tsz3.setMax(tm.getMax() + 10);
				tsz3.setOpt(tm.getOpt() + 10);
				tsz3.setMin(tm.getMin() + 10);
				tsz3.setCurrent(tm.getInit() + 10);

				tsz4.setInit(tm.getInit() + 15);
				tsz4.setMax(tm.getMax() + 15);
				tsz4.setOpt(tm.getOpt() + 15);
				tsz4.setMin(tm.getMin() + 15);
				tsz4.setCurrent(tm.getInit() + 15);

			}

		}

		if (rq.exist_remede(def_code, "vv")) {
			vv = new Remede();
			vv = rq.get_remede(def_code, "vv");
			vv_scale.setInit(vv.getInit());
			vv_scale.setMax(vv.getMax());
			vv_scale.setOpt(vv.getOpt());
			vv_scale.setMin(vv.getMin());
			vv_scale.setCurrent(vv.getInit());

		}

	}

	public temperature_Scale1110 getTsz3() {
		return tsz3;
	}

	public speed_Scale110 getVv() {
		return vv_scale;
	}

	public temperature_Scale1110 getTsz2() {
		return tsz2;
	}

	public temperature_Scale1110 getTsz1() {
		return tsz1;
	}

	public temperature_Scale1110 getTsz4() {
		return tsz4;
	}

	private void calculate_result() {
		rq = new Request_service();
		// calculer le resultat: nombre de bons remedes effectués pour cette
		// partie de machine
		if (rq.exist_remede(def_code, "tm")) {

			if (tsz1.test_entry() && tsz2.test_entry() && tsz3.test_entry()
					&& tsz4.test_entry())
				result++;
		}

		if (rq.exist_remede(def_code, "vv"))
			if (vv_scale.test_entry())
				result++;

	}

}
