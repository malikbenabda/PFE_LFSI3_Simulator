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

import components.speed_Scale110;
import components.temperature_Scale1110;
import components.time_Scale011;

public class Remedes_moule extends JFrame {
	// meme travail pour fourreau ici
	private JPanel contentPane;
	int result = 0;
	String def_code;
	Remede rem;
	private JButton btnValider;
	private JLabel lbl_cemo;
	private speed_Scale110 vd;
	private speed_Scale110 vfm;
	private temperature_Scale1110 tmo;
	private time_Scale011 rd;
	Request_service rq;

	public int getResult() {
		calculate_result();
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Remedes_moule frame = new Remedes_moule("po");
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
	public Remedes_moule(String def_cd) {
		def_code = def_cd;
		setTitle("Remedes de Moule");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 552, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		vfm = new speed_Scale110((String) null);
		vfm.setMax(200.0);
		vfm.getNumericfield().setText("45");
		vfm.getBtn_ok().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rq = new Request_service();
				if (rq.exist_remede(def_code, "vfm")) {
					vfm.test_entry();
					vfm.setCurrent(Double.parseDouble(vfm.getNumericfield()
							.getText()));

				} else {
					JOptionPane.showMessageDialog(null,
							"Vous n'avez pas choisi un bon remede");
					vfm.setEnabledall(false);
				}
			}
		});
		vfm.set_title("Vitesse de fermeture");
		vfm.setBounds(0, 0, 180, 125);
		contentPane.add(vfm);

		rd = new time_Scale011((String) null);
		rd.setMin(0.0);
		rd.setMax(50.0);
		rd.getNumericfield().setText("6.4");
		rd.getBtn_ok().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rq = new Request_service();
				if (rq.exist_remede(def_code, "rd")) {
					rd.test_entry();
					rd.setCurrent(Double.parseDouble(rd.getNumericfield()
							.getText()));

				} else {
					JOptionPane.showMessageDialog(null,
							"Vous n'avez pas choisi un bon remede");
					rd.setEnabledall(false);
				}
			}
		});
		rd.set_title("Retard D\u00E9carrotage");
		rd.setBounds(181, 0, 180, 125);
		contentPane.add(rd);

		tmo = new temperature_Scale1110("Temprature moule");
		tmo.setMin(-50.0);
		tmo.setMax(50.0);
		tmo.getNumericfield().setText("008");
		tmo.getBtn_ok().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rq = new Request_service();
				if (rq.exist_remede(def_code, "tmo")) {
					tmo.test_entry();
					tmo.setCurrent(Double.parseDouble(tmo.getNumericfield()
							.getText()));

				} else {
					JOptionPane.showMessageDialog(null,
							"Vous n'avez pas choisi un bon remede");
					tmo.setEnabledall(false);
				}
			}
		});
		tmo.set_title("Temperature Moule");
		tmo.setBounds(0, 126, 180, 125);
		contentPane.add(tmo);

		vd = new speed_Scale110((String) null);
		vd.setMin(0.0);
		vd.setMax(200.0);
		vd.getNumericfield().setText("82");
		vd.getBtn_ok().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rq = new Request_service();
				if (rq.exist_remede(def_code, "vd")) {
					vd.test_entry();
					vd.setCurrent(Double.parseDouble(vd.getNumericfield()
							.getText()));

				} else {
					JOptionPane.showMessageDialog(null,
							"Vous n'avez pas choisi un bon remede");
					vd.setEnabledall(false);
				}
			}
		});
		vd.set_title("Vitesse D\u00E9carrotage");
		vd.setBounds(362, 0, 180, 125);
		contentPane.add(vd);

		lbl_cemo = new JLabel("Contr\u00F4le \u00E9vents du moule");
		lbl_cemo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				verify(lbl_cemo, "cemo");
			}
		});
		lbl_cemo.setFont(new Font("Times New Roman", Font.BOLD, 15));

		lbl_cemo.setIcon(new ImageIcon(Remedes_moule.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_32x32.png")));
		lbl_cemo.setBounds(256, 181, 232, 20);
		contentPane.add(lbl_cemo);

		btnValider = new JButton("Valider");

		btnValider.setBounds(330, 229, 89, 23);
		contentPane.add(btnValider);
		initialize_parameter_values();
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
	}

	private void initialize_parameter_values() {
		rq = new Request_service();
		// au lancement de frame , le systeme lance une requete au base donné
		// (DB ) pour verifier les remedes qui existent dans le table remede
		// avec l'identifiant def_code comme le code du defaut present à traiter
		if (rq.exist_remede(def_code, "vfm")) {
			rem = new Remede();
			rem = rq.get_remede(def_code, "vfm");
			vfm.setInit(rem.getInit());
			vfm.setMax(rem.getMax());
			vfm.setOpt(rem.getOpt());
			vfm.setMin(rem.getMin());
			vfm.setCurrent(rem.getInit());
			vfm.setNumericfield(rem.getInit());

		}

		if (rq.exist_remede(def_code, "rd")) {
			rem = new Remede();
			rem = rq.get_remede(def_code, "rd");
			rd.setInit(rem.getInit());
			rd.setMax(rem.getMax());
			rd.setOpt(rem.getOpt());
			rd.setMin(rem.getMin());
			rd.setCurrent(rem.getInit());
			rd.setNumericfield(rem.getInit());
		}
		if (rq.exist_remede(def_code, "vd")) {
			rem = new Remede();
			rem = rq.get_remede(def_code, "vd");
			vd.setInit(rem.getInit());
			vd.setMax(rem.getMax());
			vd.setOpt(rem.getOpt());
			vd.setMin(rem.getMin());
			vd.setCurrent(rem.getInit());
			vd.setNumericfield(rem.getInit());
		}
		if (rq.exist_remede(def_code, "tmo")) {
			rem = new Remede();
			System.out.println("g enter dans if ");
			rem = rq.get_remede(def_code, "tmo");
			tmo.setInit(rem.getInit());
			tmo.setMax(rem.getMax());
			tmo.setOpt(rem.getOpt());
			tmo.setMin(rem.getMin());
			tmo.setCurrent(rem.getInit());
			tmo.setNumericfield(rem.getInit());
		}

	}

	private void calculate_result() {
		rq = new Request_service();
		if (rq.exist_remede(def_code, "tmo"))
			if (tmo.test_entry())
				result++;
		if (rq.exist_remede(def_code, "vfm"))
			if (vfm.test_entry())
				result++;
		if (rq.exist_remede(def_code, "rd"))
			if (rd.test_entry())
				result++;
		if (rq.exist_remede(def_code, "vd"))
			if (vd.test_entry())
				result++;

	}

	public JButton getBtnValider() {
		return btnValider;
	}

}
