package presentation.exercice_stagiaire;

import java.awt.EventQueue;
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

import components.pressure_Scale011;
import components.speed_Scale110;
import components.time_Scale011;

public class Remedes_canne extends JFrame {
	// meme travail pour fourreau ici
	private JPanel contentPane;
	int result = 0;
	String def_code;
	private JLabel lblControleDiametreDe;
	private JButton btnValider;
	private JLabel lblControleDeRefroidissment;
	private JLabel lblControleCentrageDe;
	Request_service rq;
	private time_Scale011 tr;
	private pressure_Scale011 pi;
	private time_Scale011 ts;
	private pressure_Scale011 ps;
	private speed_Scale110 vec;
	Remede rem;

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
					Remedes_canne frame = new Remedes_canne("po");
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
	public Remedes_canne(String code) {
		this.def_code = code;
		setTitle("Remedes Canne de Soufflage");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 563, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		ts = new time_Scale011((String) null);
		ts.getBtn_ok().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rq = new Request_service();
				if (rq.exist_remede(def_code, "ts")) {
					ts.test_entry();
					ts.setCurrent(Double.parseDouble(ts.getNumericfield()
							.getText()));

				} else {
					JOptionPane.showMessageDialog(null,
							"Vous n'avez pas choisi un bon remede");
					ts.setEnabledall(false);
				}
			}
		});
		ts.set_title("Temps Pr\u00E9-soufflage");
		ts.setBounds(0, 0, 180, 125);
		contentPane.add(ts);

		tr = new time_Scale011((String) null);
		tr.getBtn_ok().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rq = new Request_service();
				if (rq.exist_remede(def_code, "tr")) {
					tr.test_entry();
					tr.setCurrent(Double.parseDouble(tr.getNumericfield()
							.getText()));

				} else {
					JOptionPane.showMessageDialog(null,
							"Vous n'avez pas choisi un bon remede");
					tr.setEnabledall(false);
				}
			}
		});
		tr.set_title("Temps de Refroidissement");
		tr.setBounds(181, 0, 180, 125);
		contentPane.add(tr);

		pi = new pressure_Scale011((String) null);
		pi.getBtn_ok().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rq = new Request_service();
				if (rq.exist_remede(def_code, "pi")) {
					pi.test_entry();
					pi.setCurrent(Double.parseDouble(pi.getNumericfield()
							.getText()));

				} else {
					JOptionPane.showMessageDialog(null,
							"Vous n'avez pas choisi un bon remede");
					pi.setEnabledall(false);
				}
			}
		});
		pi.set_title("Pression initiale");
		pi.setBounds(90, 126, 180, 125);
		contentPane.add(pi);

		ps = new pressure_Scale011((String) null);
		ps.getBtn_ok().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rq = new Request_service();
				if (rq.exist_remede(def_code, "ps")) {
					ps.test_entry();
					ps.setCurrent(Double.parseDouble(ps.getNumericfield()
							.getText()));

				} else {
					JOptionPane.showMessageDialog(null,
							"Vous n'avez pas choisi un bon remede");
					ps.setEnabledall(false);
				}
			}
		});
		ps.set_title("Pression Soufflage");
		ps.setBounds(271, 126, 180, 125);
		contentPane.add(ps);

		vec = new speed_Scale110((String) null);
		vec.getBtn_ok().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				rq = new Request_service();
				if (rq.exist_remede(def_code, "vec")) {
					vec.test_entry();
					vec.setCurrent(Double.parseDouble(vec.getNumericfield()
							.getText()));

				} else {
					JOptionPane.showMessageDialog(null,
							"Vous n'avez pas choisi un bon remede");
					vec.setEnabledall(false);
				}
			}
		});
		vec.set_title("Vitesse d'entr\u00E9e canne");
		vec.setBounds(362, 0, 180, 125);
		contentPane.add(vec);

		btnValider = new JButton("Valider");
		btnValider.setBounds(451, 323, 90, 28);
		contentPane.add(btnValider);

		lblControleCentrageDe = new JLabel(
				"Controle Centrage de Canne de Soufflage");
		lblControleCentrageDe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				verify(lblControleCentrageDe, "cccs");
			}
		});
		lblControleCentrageDe.setIcon(new ImageIcon(Remedes_canne.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_32x32.png")));
		lblControleCentrageDe.setBounds(90, 262, 320, 20);
		contentPane.add(lblControleCentrageDe);

		lblControleDeRefroidissment = new JLabel(
				"Controle de refroidissment de Canne de Soufflage");
		lblControleDeRefroidissment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				verify(lblControleDeRefroidissment, "crcs");
			}
		});
		lblControleDeRefroidissment.setIcon(new ImageIcon(Remedes_canne.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_32x32.png")));
		lblControleDeRefroidissment.setBounds(90, 282, 320, 20);
		contentPane.add(lblControleDeRefroidissment);

		lblControleDiametreDe = new JLabel(
				"Controle Diametre de Canne de Soufflage");
		lblControleDiametreDe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				verify(lblControleDiametreDe, "cs");
			}
		});
		lblControleDiametreDe.setIcon(new ImageIcon(Remedes_canne.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_32x32.png")));
		lblControleDiametreDe.setBounds(90, 302, 320, 20);
		contentPane.add(lblControleDiametreDe);
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

	public JButton getBtnValider() {
		return btnValider;
	}

	private void calculate_result() {
		rq = new Request_service();
		if (rq.exist_remede(def_code, "ts"))
			if (ts.test_entry())
				result++;
		if (rq.exist_remede(def_code, "tr"))
			if (tr.test_entry())
				result++;
		if (rq.exist_remede(def_code, "pi"))
			if (pi.test_entry())
				result++;
		if (rq.exist_remede(def_code, "ps"))
			if (ps.test_entry())
				result++;
		if (rq.exist_remede(def_code, "vec"))
			if (vec.test_entry())
				result++;

	}

	private void initialize_parameter_values() {
		rq = new Request_service();
		// au lancement de frame , le systeme lance une requete au base donné
		// (DB ) pour verifier les remedes qui existent dans le table remede
		// avec l'identifiant def_code comme le code du defaut present à traiter
		if (rq.exist_remede(def_code, "ts")) {
			rem = rq.get_remede(def_code, "ts");
			ts.setInit(rem.getInit());
			ts.setMax(rem.getMax());
			ts.setOpt(rem.getOpt());
			ts.setMin(rem.getMin());
			ts.setCurrent(rem.getInit());

		}

		if (rq.exist_remede(def_code, "pi")) {
			rem = rq.get_remede(def_code, "pi");
			pi.setInit(rem.getInit());
			pi.setMax(rem.getMax());
			pi.setOpt(rem.getOpt());
			pi.setMin(rem.getMin());
			pi.setCurrent(rem.getInit());

		}

		if (rq.exist_remede(def_code, "tr")) {
			rem = rq.get_remede(def_code, "tr");
			tr.setInit(rem.getInit());
			tr.setMax(rem.getMax());
			tr.setOpt(rem.getOpt());
			tr.setMin(rem.getMin());
			tr.setCurrent(rem.getInit());

		}

		if (rq.exist_remede(def_code, "ps")) {
			rem = rq.get_remede(def_code, "ps");
			ps.setInit(rem.getInit());
			ps.setMax(rem.getMax());
			ps.setOpt(rem.getOpt());
			ps.setMin(rem.getMin());
			ps.setCurrent(rem.getInit());

		}

		if (rq.exist_remede(def_code, "vec")) {
			rem = rq.get_remede(def_code, "vec");
			vec.setInit(rem.getInit());
			vec.setMax(rem.getMax());
			vec.setOpt(rem.getOpt());
			vec.setMin(rem.getMin());
			vec.setCurrent(rem.getInit());

		}

	}

}
