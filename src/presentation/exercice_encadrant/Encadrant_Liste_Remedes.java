package presentation.exercice_encadrant;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import services.Request_service;
import beans.Remede;

public class Encadrant_Liste_Remedes extends JFrame {
	private boolean visibilite_fourreau = false;
	private boolean visibilite_matiere = false;
	private boolean visibilite_tete = false;
	private boolean visibilite_canne = false;
	private boolean visibilite_moule = false;
	private boolean visibilite_programmeur = false;
	private String m = "matiere";
	private String f = "fourreau";
	private String t = "tete d'extrusion";
	private String mo = "moule";
	private String c = "canne de soufflage";
	private String pr = "programmeur paraison";
	String[] type_cn = { "Controle", "Valeur" };
	double[] s = { 0.0D, 0.0D, 0.0D, 0.0D };
	private JPanel contentPane;
	private JPanel panel_matiere_tremie;
	private JPanel panel_c_pi;
	private JPanel panel_c_ts;
	private JPanel panel_p_ra;
	private JPanel panel_mo_vd;
	private JPanel panel_m_cgm;
	private JPanel panel_t_tf;
	private JPanel panel_mo_vfm;
	private JPanel panel_m_chm;
	private JPanel panel_f_vv;
	private JPanel panel_m_crc;
	private JPanel panel_f_pnf;
	private JPanel panel_c_cccs;
	private JPanel panel_m_chmt;
	private JPanel panel_tete_soufflage;
	private JPanel panel_m_pc;
	private JPanel panel_m_cmm;
	private JPanel panel_f_tm;
	private JPanel panel_mo_tmo;
	private JPanel panel_m_cpm;
	private JPanel panel_mo_cemo;
	private JPanel panel_fourreau;
	private JPanel panel_m_pb;
	private JPanel panel_t_tc;
	private JPanel panel_c_vec;
	private JPanel panel_t_ccc;
	private JPanel panel_c_crcs;
	private JPanel panel_t_rc;
	private JPanel panel_canne_soufflage;
	private JPanel panel_p_prg;
	private JPanel panel;
	private JPanel panel_c_cs;
	private JPanel panel_c_tr;
	private JPanel panel_p_rp;
	private JPanel panel_t_cnf;
	private JPanel panel_mo_rd;
	private JPanel panel_c_ps;
	private JPanel panel_f_cf;
	private JPanel panel_f_cem;
	private JCheckBox chk_rp;
	private JCheckBox chk_ra;
	private JCheckBox chk_vec;
	private JCheckBox chk_ccc;
	private JCheckBox chk_ts;
	private JCheckBox chk_cem;
	private JCheckBox chk_cccs;
	private JCheckBox chk_cpm;
	private JCheckBox chk_crcs;
	private JCheckBox chk_pi;
	private JCheckBox chk_cemo;
	private JCheckBox chk_crc;
	private JCheckBox chk_chm;
	private JCheckBox chk_pc;
	private JCheckBox chk_cnf;
	private JCheckBox chk_cmm;
	private JCheckBox chk_pb;
	private JCheckBox chk_cgm;
	private JCheckBox chk_tm;
	private JCheckBox chk_tr;
	private JCheckBox chk_vv;
	private JCheckBox chk_rd;
	private JCheckBox chk_pnf;
	private JCheckBox chk_tmo;
	private JCheckBox chk_cf;
	private JCheckBox chk_vfm;
	private JCheckBox chk_chmt;
	private JCheckBox chk_cs;
	private JCheckBox chk_rc;
	private JCheckBox chk_ps;
	private JCheckBox chk_tc;
	private JCheckBox chk_tf;
	private JCheckBox chk_vd;
	private JCheckBox chk_prg;
	private JButton btn_rd;
	private JButton btnAnnuler;
	private JButton btn_tf;
	private JButton btn_pi;
	private JButton btn_vfm;
	private JButton btn_vv;
	private JButton btn_rc;
	private JButton btn_ps;
	private JButton btnValider;
	private JButton btn_vd;
	private JButton btn_tmo;
	private JButton btn_tm;
	private JButton btn_tr;
	private JButton btn_tc;
	private JButton btn_ts;
	private JButton btn_vec;
	private Remede crc;
	private Remede cmm;
	private Remede cpm;
	private Remede chmt;
	private Remede cgm;
	private Remede chm;
	private Remede pc;
	private Remede pb;
	private Remede pnf;
	private Remede tm;
	private Remede cf;
	private Remede cem;
	private Remede vv;
	private Remede ccc;
	private Remede tf;
	private Remede rc;
	private Remede tc;
	private Remede cnf;
	private Remede cccs;
	private Remede crcs;
	private Remede ts;
	private Remede tr;
	private Remede pi;
	private Remede ps;
	private Remede vec;
	private Remede cs;
	private Remede cemo;
	private Remede tmo;
	private Remede vfm;
	private Remede rd;
	private Remede vd;
	private Remede ra;
	private Remede rp;
	private Remede prg;
	static Parametre p;
	static Remede rmd;
	Request_service rq;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Encadrant_Liste_Remedes frame = new Encadrant_Liste_Remedes(
							"po", "Remedes de defaut po");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
	}

	public Encadrant_Liste_Remedes(final String def_code, String titre) {
		try {
			UIManager.setLookAndFeel(new NimbusLookAndFeel());
		} catch (UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 466, 500);
		Dimension d = new Dimension(350, 500);
		setMaximumSize(d);
		setMinimumSize(d);
		setPreferredSize(d);
		setTitle(titre);
		setResizable(false);

		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		this.contentPane.add(scrollPane);

		this.panel = new JPanel();
		scrollPane.setViewportView(this.panel);
		this.panel.setLayout(new BoxLayout(this.panel, 1));

		this.panel_matiere_tremie = new JPanel();
		this.panel_matiere_tremie.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				visibilite_matiere = (!visibilite_matiere);
				Encadrant_Liste_Remedes.this
						.set_visibility_matiere(visibilite_matiere);
			}

		});
		FlowLayout fl_panel_matiere_tremie = (FlowLayout) this.panel_matiere_tremie
				.getLayout();
		fl_panel_matiere_tremie.setVgap(0);
		fl_panel_matiere_tremie.setAlignment(3);
		this.panel.add(this.panel_matiere_tremie);

		JLabel lblMatiereTrmie = new JLabel("MATIERE / Tr\u00E9mie");
		lblMatiereTrmie
				.setIcon(new ImageIcon(
						Encadrant_Liste_Remedes.class
								.getResource("/com/jtattoo/plaf/acryl/icons/thumb_hor_rollover.gif")));
		lblMatiereTrmie.setForeground(Color.BLUE);
		this.panel_matiere_tremie.add(lblMatiereTrmie);
		lblMatiereTrmie.setFont(new Font("Tunga", 1, 24));

		this.panel_m_crc = new JPanel();
		FlowLayout fl_panel_m_crc = (FlowLayout) this.panel_m_crc.getLayout();
		fl_panel_m_crc.setAlignment(0);
		this.panel.add(this.panel_m_crc);

		this.chk_crc = new JCheckBox("Controle refroidissement culasse");
		this.chk_crc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_crc.isSelected()) {
					crc = new Remede();
				}
				crc = create_remede(chk_crc, "crc", chk_crc.getText(), m,
						type_cn[0]);
			}

		});
		this.panel_m_crc.add(this.chk_crc);

		this.panel_m_cmm = new JPanel();
		FlowLayout fl_panel_m_cmm = (FlowLayout) this.panel_m_cmm.getLayout();
		fl_panel_m_cmm.setAlignment(0);
		this.panel.add(this.panel_m_cmm);

		this.chk_cmm = new JCheckBox("Controle mélange matiere");
		this.chk_cmm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_cmm.isSelected()) {
					cmm = new Remede();
				}
				cmm = create_remede(chk_cmm, "cmm", chk_cmm.getText(), m,
						type_cn[0]);
			}

		});
		this.panel_m_cmm.add(this.chk_cmm);

		this.panel_m_cpm = new JPanel();
		FlowLayout fl_panel_m_cpm = (FlowLayout) this.panel_m_cpm.getLayout();
		fl_panel_m_cpm.setAlignment(0);
		this.panel.add(this.panel_m_cpm);

		this.chk_cpm = new JCheckBox("Controle pollution matiere  ");
		this.chk_cpm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chk_cpm.isSelected()) {
					cpm = new Remede();
				}
				cpm = create_remede(chk_cpm, "cpm", chk_cpm.getText(), m,
						type_cn[0]);
			}

		});
		this.panel_m_cpm.add(this.chk_cpm);

		this.panel_m_chmt = new JPanel();
		FlowLayout fl_panel_m_chmt = (FlowLayout) this.panel_m_chmt.getLayout();
		fl_panel_m_chmt.setAlignment(0);
		this.panel.add(this.panel_m_chmt);

		this.chk_chmt = new JCheckBox("Controle hauteur matiere trémie   ");
		this.chk_chmt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chk_chmt.isSelected()) {
					chmt = new Remede();
				}
				chmt = create_remede(chk_chmt, "chmt", chk_chmt.getText(), m,
						type_cn[0]);
			}

		});
		this.panel_m_chmt.add(this.chk_chmt);

		this.panel_m_cgm = new JPanel();
		FlowLayout fl_panel_m_cgm = (FlowLayout) this.panel_m_cgm.getLayout();
		fl_panel_m_cgm.setAlignment(0);
		this.panel.add(this.panel_m_cgm);

		this.chk_cgm = new JCheckBox("Controle grade matiere  ");
		this.chk_cgm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chk_cgm.isSelected()) {
					cgm = new Remede();
				}
				cgm = create_remede(chk_cgm, "cgm", chk_cgm.getText(), m,
						type_cn[0]);
			}

		});
		this.panel_m_cgm.add(this.chk_cgm);

		this.panel_m_chm = new JPanel();
		FlowLayout fl_panel_m_chm = (FlowLayout) this.panel_m_chm.getLayout();
		fl_panel_m_chm.setAlignment(0);
		this.panel.add(this.panel_m_chm);

		this.chk_chm = new JCheckBox("Controle humidité matiere  ");
		this.chk_chm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chk_chm.isSelected()) {
					chm = new Remede();
				}
				chm = create_remede(chk_chm, "chm", chk_chm.getText(), m,
						type_cn[0]);
			}

		});
		this.panel_m_chm.add(this.chk_chm);

		this.panel_m_pc = new JPanel();
		FlowLayout fl_panel_m_pc = (FlowLayout) this.panel_m_pc.getLayout();
		fl_panel_m_pc.setAlignment(0);
		this.panel.add(this.panel_m_pc);

		this.chk_pc = new JCheckBox("Pourcentage de colorant");
		this.chk_pc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chk_pc.isSelected()) {
					pc = new Remede();
				}
				pc = create_remede(chk_pc, "pc", chk_pc.getText(), m,
						type_cn[0]);
			}

		});
		this.panel_m_pc.add(this.chk_pc);

		this.panel_m_pb = new JPanel();
		FlowLayout fl_panel_m_pb = (FlowLayout) this.panel_m_pb.getLayout();
		fl_panel_m_pb.setAlignment(0);
		this.panel.add(this.panel_m_pb);

		this.chk_pb = new JCheckBox("Pourcentage de broyer");
		this.chk_pb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_pb.isSelected()) {
					pb = new Remede();
				}
				pb = create_remede(chk_pb, "pb", chk_pb.getText(), m,
						type_cn[0]);
			}

		});
		this.panel_m_pb.add(this.chk_pb);

		this.panel_fourreau = new JPanel();
		this.panel_fourreau.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				visibilite_fourreau = (!visibilite_fourreau);
				Encadrant_Liste_Remedes.this
						.set_visibility_fourreau(visibilite_fourreau);
			}

		});
		FlowLayout fl_panel_fourreau = (FlowLayout) this.panel_fourreau
				.getLayout();
		fl_panel_fourreau.setAlignment(3);
		fl_panel_fourreau.setVgap(0);
		this.panel.add(this.panel_fourreau);

		JLabel lblFourreau = new JLabel("Fourreau");
		lblFourreau
				.setIcon(new ImageIcon(
						Encadrant_Liste_Remedes.class
								.getResource("/com/jtattoo/plaf/acryl/icons/thumb_hor_rollover.gif")));
		lblFourreau.setForeground(Color.BLUE);
		lblFourreau.setFont(new Font("Tunga", 1, 24));
		this.panel_fourreau.add(lblFourreau);

		this.panel_f_pnf = new JPanel();
		FlowLayout fl_panel_f_pnf = (FlowLayout) this.panel_f_pnf.getLayout();
		fl_panel_f_pnf.setAlignment(0);
		this.panel.add(this.panel_f_pnf);

		this.chk_pnf = new JCheckBox("Purger et nettoyer le fourreau  ");
		this.chk_pnf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_pnf.isSelected()) {
					pnf = new Remede();
				}
				pnf = create_remede(chk_pnf, "pnf", chk_pnf.getText(), f,
						type_cn[0]);
			}

		});
		this.panel_f_pnf.add(this.chk_pnf);

		this.panel_f_tm = new JPanel();
		FlowLayout fl_panel_f_tm = (FlowLayout) this.panel_f_tm.getLayout();
		fl_panel_f_tm.setAlignment(0);
		this.panel.add(this.panel_f_tm);

		this.chk_tm = new JCheckBox("Température matiere");
		chk_tm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_tm.isSelected()) {
					tm = new Remede();
					tm = create_valeur_remede(chk_tm, "tm", chk_tm.getText(),
							f, type_cn[1]);
				}
			}
		});
		this.panel_f_tm.add(this.chk_tm);

		this.btn_tm = new JButton("");
		this.btn_tm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tm = new Remede();
				tm = create_valeur_remede(chk_tm, "tm", chk_tm.getText(), f,
						type_cn[1]);
			}

		});
		this.panel_f_tm.add(this.btn_tm);

		this.panel_f_cf = new JPanel();
		FlowLayout fl_panel_f_cf = (FlowLayout) this.panel_f_cf.getLayout();
		fl_panel_f_cf.setAlignment(0);
		this.panel.add(this.panel_f_cf);

		this.chk_cf = new JCheckBox("Controle le filtre");
		this.panel_f_cf.add(this.chk_cf);
		this.chk_cf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_cf.isSelected()) {
					cf = new Remede();
				}
				cf = create_remede(chk_cf, "cf", chk_cf.getText(), f,
						type_cn[0]);
			}

		});
		this.panel_f_cem = new JPanel();
		FlowLayout fl_panel_f_cem = (FlowLayout) this.panel_f_cem.getLayout();
		fl_panel_f_cem.setAlignment(0);
		this.panel.add(this.panel_f_cem);

		this.chk_cem = new JCheckBox("Controle écoulement matiere  ");
		this.chk_cem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_cem.isSelected()) {
					cem = new Remede();
				}
				cem = create_remede(chk_cem, "cem", chk_cem.getText(), f,
						type_cn[0]);
			}

		});
		this.panel_f_cem.add(this.chk_cem);

		this.panel_f_vv = new JPanel();
		FlowLayout fl_panel_f_vv = (FlowLayout) this.panel_f_vv.getLayout();
		fl_panel_f_vv.setAlignment(0);
		this.panel.add(this.panel_f_vv);

		this.chk_vv = new JCheckBox("Vitesse vis       ");
		chk_vv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_vv.isSelected()) {
					vv = new Remede();
					vv = create_valeur_remede(chk_vv, "vv", chk_vv.getText(),
							f, type_cn[1]);
				}
			}
		});
		this.panel_f_vv.add(this.chk_vv);

		this.btn_vv = new JButton("");
		this.btn_vv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vv = new Remede();
				vv = create_valeur_remede(chk_vv, "vv", chk_vv.getText(), f,
						type_cn[1]);
			}

		});
		this.panel_f_vv.add(this.btn_vv);

		this.panel_tete_soufflage = new JPanel();
		this.panel_tete_soufflage.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				visibilite_tete = (!visibilite_tete);
				Encadrant_Liste_Remedes.this
						.set_visibility_tete(visibilite_tete);
			}

		});
		FlowLayout fl_panel_tete_soufflage = (FlowLayout) this.panel_tete_soufflage
				.getLayout();
		fl_panel_tete_soufflage.setVgap(0);
		fl_panel_tete_soufflage.setAlignment(0);
		this.panel.add(this.panel_tete_soufflage);

		JLabel lblTeteDeSoufflage = new JLabel("Tete de Soufflage");
		lblTeteDeSoufflage
				.setIcon(new ImageIcon(
						Encadrant_Liste_Remedes.class
								.getResource("/com/jtattoo/plaf/acryl/icons/thumb_hor_rollover.gif")));
		lblTeteDeSoufflage.setHorizontalAlignment(2);
		lblTeteDeSoufflage.setForeground(Color.BLUE);
		lblTeteDeSoufflage.setFont(new Font("Tunga", 1, 24));
		this.panel_tete_soufflage.add(lblTeteDeSoufflage);

		this.panel_t_ccc = new JPanel();
		FlowLayout fl_panel_t_ccc = (FlowLayout) this.panel_t_ccc.getLayout();
		fl_panel_t_ccc.setAlignment(0);
		this.panel.add(this.panel_t_ccc);

		this.chk_ccc = new JCheckBox("Controle couteau coupe      ");
		this.chk_ccc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_ccc.isSelected()) {
					ccc = new Remede();
				}
				ccc = create_remede(chk_ccc, "ccc", chk_ccc.getText(), t,
						type_cn[0]);
			}

		});
		this.panel_t_ccc.add(this.chk_ccc);

		this.panel_t_tf = new JPanel();
		FlowLayout fl_panel_t_tf = (FlowLayout) this.panel_t_tf.getLayout();
		fl_panel_t_tf.setAlignment(0);
		this.panel.add(this.panel_t_tf);

		this.chk_tf = new JCheckBox("Température filiere    ");
		chk_tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_tf.isSelected()) {
					tf = new Remede();
					tf = create_valeur_remede(chk_tf, "tf", chk_tf.getText(),
							t, type_cn[1]);
				}
			}
		});
		this.panel_t_tf.add(this.chk_tf);

		this.btn_tf = new JButton("");
		this.panel_t_tf.add(this.btn_tf);
		this.btn_tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tf = new Remede();
				tf = create_valeur_remede(chk_tf, "tf", chk_tf.getText(), t,
						type_cn[1]);
			}

		});
		this.panel_t_rc = new JPanel();
		FlowLayout fl_panel_t_rc = (FlowLayout) this.panel_t_rc.getLayout();
		fl_panel_t_rc.setAlignment(0);
		this.panel.add(this.panel_t_rc);

		this.chk_rc = new JCheckBox("Retard de coupe   ");
		chk_rc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_rc.isSelected()) {
					rc = new Remede();
					rc = create_valeur_remede(chk_rc, "rc", chk_rc.getText(),
							t, type_cn[1]);
				}
			}
		});
		this.panel_t_rc.add(this.chk_rc);

		this.btn_rc = new JButton("");
		this.panel_t_rc.add(this.btn_rc);
		this.btn_rc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rc = new Remede();
				rc = create_valeur_remede(chk_rc, "rc", chk_rc.getText(), t,
						type_cn[1]);
			}

		});
		this.panel_t_tc = new JPanel();
		FlowLayout fl_panel_t_tc = (FlowLayout) this.panel_t_tc.getLayout();
		fl_panel_t_tc.setAlignment(0);
		this.panel.add(this.panel_t_tc);

		this.chk_tc = new JCheckBox("Temps de coupe      ");
		chk_tc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_tc.isSelected()) {
					tc = new Remede();
					tc = create_valeur_remede(chk_tc, "tc", chk_tc.getText(),
							t, type_cn[1]);
				}
			}
		});
		this.panel_t_tc.add(this.chk_tc);

		this.btn_tc = new JButton("");
		this.panel_t_tc.add(this.btn_tc);
		this.btn_tc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}

		});
		this.panel_t_cnf = new JPanel();
		FlowLayout fl_panel_t_cnf = (FlowLayout) this.panel_t_cnf.getLayout();
		fl_panel_t_cnf.setAlignment(0);
		this.panel.add(this.panel_t_cnf);

		this.chk_cnf = new JCheckBox("Centrage filiere   ");
		this.chk_cnf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_cnf.isSelected()) {
					cnf = new Remede();
				}
				cnf = create_remede(chk_cnf, "cnf", chk_cnf.getText(), t,
						type_cn[0]);
			}

		});
		this.panel_t_cnf.add(this.chk_cnf);

		this.panel_canne_soufflage = new JPanel();
		this.panel_canne_soufflage.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				visibilite_canne = (!visibilite_canne);
				Encadrant_Liste_Remedes.this
						.set_visibility_canne(visibilite_canne);
			}

		});
		FlowLayout flowLayout = (FlowLayout) this.panel_canne_soufflage
				.getLayout();
		flowLayout.setVgap(0);
		flowLayout.setAlignment(0);
		this.panel.add(this.panel_canne_soufflage);

		JLabel lblCanneDeSoufflage = new JLabel("Canne de Soufflage");
		lblCanneDeSoufflage
				.setIcon(new ImageIcon(
						Encadrant_Liste_Remedes.class
								.getResource("/com/jtattoo/plaf/acryl/icons/thumb_hor_rollover.gif")));
		lblCanneDeSoufflage.setHorizontalAlignment(2);
		lblCanneDeSoufflage.setForeground(Color.BLUE);
		lblCanneDeSoufflage.setFont(new Font("Tunga", 1, 24));
		this.panel_canne_soufflage.add(lblCanneDeSoufflage);

		this.panel_c_cccs = new JPanel();
		FlowLayout fl_panel_c_cccs = (FlowLayout) this.panel_c_cccs.getLayout();
		fl_panel_c_cccs.setAlignment(0);
		this.panel.add(this.panel_c_cccs);

		this.chk_cccs = new JCheckBox("Controle centrage canne de soufflage  ");
		this.chk_cccs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_cccs.isSelected()) {
					cccs = new Remede();
				}
				cccs = create_remede(chk_cccs, "cccs", chk_cccs.getText(), c,
						type_cn[0]);
			}

		});
		this.panel_c_cccs.add(this.chk_cccs);

		this.panel_c_crcs = new JPanel();
		FlowLayout fl_panel_c_crcs = (FlowLayout) this.panel_c_crcs.getLayout();
		fl_panel_c_crcs.setAlignment(0);
		this.panel.add(this.panel_c_crcs);

		this.chk_crcs = new JCheckBox(
				"Controle refroidissement canne de soufflage ");
		this.chk_crcs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_crcs.isSelected()) {
					crcs = new Remede();
				}
				crcs = create_remede(chk_crcs, "crcs", chk_crcs.getText(), c,
						type_cn[0]);
			}

		});
		this.panel_c_crcs.add(this.chk_crcs);

		this.panel_c_ts = new JPanel();
		FlowLayout fl_panel_c_ts = (FlowLayout) this.panel_c_ts.getLayout();
		fl_panel_c_ts.setAlignment(0);
		this.panel.add(this.panel_c_ts);

		this.chk_ts = new JCheckBox("Temps pré soufflage    ");
		chk_ts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_ts.isSelected()) {
					ts = new Remede();
					ts = create_valeur_remede(chk_ts, "ts", chk_ts.getText(),
							c, type_cn[1]);
				}
			}
		});
		this.panel_c_ts.add(this.chk_ts);

		this.btn_ts = new JButton("");
		this.panel_c_ts.add(this.btn_ts);
		this.btn_ts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ts = new Remede();
				ts = create_valeur_remede(chk_ts, "ts", chk_ts.getText(), c,
						type_cn[1]);
			}

		});
		this.panel_c_tr = new JPanel();
		FlowLayout fl_panel_c_tr = (FlowLayout) this.panel_c_tr.getLayout();
		fl_panel_c_tr.setAlignment(0);
		this.panel.add(this.panel_c_tr);

		this.chk_tr = new JCheckBox("Temps  de refroidissement  ");
		chk_tr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_tr.isSelected()) {
					tr = new Remede();
					tr = create_valeur_remede(chk_tr, "tr", chk_tr.getText(),
							c, type_cn[1]);
				}
			}
		});
		this.panel_c_tr.add(this.chk_tr);

		this.btn_tr = new JButton("");
		this.panel_c_tr.add(this.btn_tr);
		this.btn_tr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tr = new Remede();
				tr = create_valeur_remede(chk_tr, "tr", chk_tr.getText(), c,
						type_cn[1]);
			}

		});
		this.panel_c_pi = new JPanel();
		FlowLayout fl_panel_c_pi = (FlowLayout) this.panel_c_pi.getLayout();
		fl_panel_c_pi.setAlignment(0);
		this.panel.add(this.panel_c_pi);

		this.chk_pi = new JCheckBox("Pression initial     ");
		chk_pi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_pi.isSelected()) {
					pi = new Remede();
					pi = create_valeur_remede(chk_pi, "pi", chk_pi.getText(),
							c, type_cn[1]);
				}
			}
		});
		this.panel_c_pi.add(this.chk_pi);

		this.btn_pi = new JButton("");
		this.panel_c_pi.add(this.btn_pi);
		this.btn_pi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pi = new Remede();
				pi = create_valeur_remede(chk_pi, "pi", chk_pi.getText(), c,
						type_cn[1]);
			}

		});
		this.panel_c_ps = new JPanel();
		FlowLayout fl_panel_c_ps = (FlowLayout) this.panel_c_ps.getLayout();
		fl_panel_c_ps.setAlignment(0);
		this.panel.add(this.panel_c_ps);

		this.chk_ps = new JCheckBox("Pression de soufflage   ");
		chk_ps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_ps.isSelected()) {
					ps = new Remede();
					ps = create_valeur_remede(chk_ps, "ps", chk_ps.getText(),
							c, type_cn[1]);
				}
			}
		});
		this.panel_c_ps.add(this.chk_ps);

		this.btn_ps = new JButton("");
		this.panel_c_ps.add(this.btn_ps);
		this.btn_ps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ps = new Remede();
				ps = create_valeur_remede(chk_ps, "ps", chk_ps.getText(), c,
						type_cn[1]);
			}

		});
		this.panel_c_vec = new JPanel();
		FlowLayout fl_panel_c_vec = (FlowLayout) this.panel_c_vec.getLayout();
		fl_panel_c_vec.setAlignment(0);
		this.panel.add(this.panel_c_vec);

		this.chk_vec = new JCheckBox("Vitesse d'entrée canne");
		chk_vec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_vec.isSelected()) {
					vec = new Remede();
					vec = create_valeur_remede(chk_vec, "vec",
							chk_vec.getText(), c, type_cn[1]);
				}
			}
		});
		this.panel_c_vec.add(this.chk_vec);

		this.btn_vec = new JButton("");
		this.panel_c_vec.add(this.btn_vec);
		this.btn_vec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vec = new Remede();
				vec = create_valeur_remede(chk_vec, "vec", chk_vec.getText(),
						c, type_cn[1]);
			}

		});
		this.panel_c_cs = new JPanel();
		FlowLayout fl_panel_c_cs = (FlowLayout) this.panel_c_cs.getLayout();
		fl_panel_c_cs.setAlignment(0);
		this.panel.add(this.panel_c_cs);

		this.chk_cs = new JCheckBox("Canne de soufflage  ");
		this.chk_cs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_cs.isSelected()) {
					cs = new Remede();
				}
				cs = create_remede(chk_cs, "cs", chk_cs.getText(), c,
						type_cn[0]);
			}

		});
		this.panel_c_cs.add(this.chk_cs);
		JPanel panel_moule = new JPanel();
		panel_moule.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				visibilite_moule = (!visibilite_moule);
				Encadrant_Liste_Remedes.this
						.set_visibility_moule(visibilite_moule);
			}

		});
		FlowLayout flowLayout_2 = (FlowLayout) panel_moule.getLayout();
		flowLayout_2.setVgap(0);
		flowLayout_2.setAlignment(0);
		this.panel.add(panel_moule);

		JLabel lblMoule = new JLabel("Moule");
		lblMoule.setIcon(new ImageIcon(
				Encadrant_Liste_Remedes.class
						.getResource("/com/jtattoo/plaf/acryl/icons/thumb_hor_rollover.gif")));
		lblMoule.setHorizontalAlignment(2);
		lblMoule.setForeground(Color.BLUE);
		lblMoule.setFont(new Font("Tunga", 1, 24));
		panel_moule.add(lblMoule);

		this.panel_mo_cemo = new JPanel();
		FlowLayout fl_panel_mo_cemo = (FlowLayout) this.panel_mo_cemo
				.getLayout();
		fl_panel_mo_cemo.setAlignment(0);
		this.panel.add(this.panel_mo_cemo);

		this.chk_cemo = new JCheckBox("Controle évents du moule");
		this.chk_cemo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_cemo.isSelected()) {
					cemo = new Remede();
				}
				cemo = create_remede(chk_cemo, "cemo", chk_cemo.getText(), mo,
						type_cn[0]);
			}

		});
		this.panel_mo_cemo.add(this.chk_cemo);

		this.panel_mo_tmo = new JPanel();
		FlowLayout fl_panel_mo_tmo = (FlowLayout) this.panel_mo_tmo.getLayout();
		fl_panel_mo_tmo.setAlignment(0);
		this.panel.add(this.panel_mo_tmo);

		this.chk_tmo = new JCheckBox("Température moule    ");
		chk_tmo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_tmo.isSelected()) {
					tmo = new Remede();
					tmo = create_valeur_remede(chk_tmo, "tmo",
							chk_tmo.getText(), mo, type_cn[1]);
				}
			}
		});
		this.panel_mo_tmo.add(this.chk_tmo);

		this.btn_tmo = new JButton("");
		this.panel_mo_tmo.add(this.btn_tmo);
		this.btn_tmo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tmo = new Remede();
				tmo = create_valeur_remede(chk_tmo, "tmo", chk_tmo.getText(),
						mo, type_cn[1]);
			}

		});
		this.panel_mo_vfm = new JPanel();
		FlowLayout fl_panel_mo_vfm = (FlowLayout) this.panel_mo_vfm.getLayout();
		fl_panel_mo_vfm.setAlignment(0);
		this.panel.add(this.panel_mo_vfm);

		this.chk_vfm = new JCheckBox("Vitesse fermeture moule  ");
		chk_vfm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_vfm.isSelected()) {
					vfm = new Remede();
					vfm = create_valeur_remede(chk_vfm, "vfm",
							chk_vfm.getText(), mo, type_cn[1]);
				}
			}
		});
		this.panel_mo_vfm.add(this.chk_vfm);

		this.btn_vfm = new JButton("");
		this.panel_mo_vfm.add(this.btn_vfm);
		this.btn_vfm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vfm = new Remede();
				vfm = create_valeur_remede(chk_vfm, "vfm", chk_vfm.getText(),
						mo, type_cn[1]);
			}

		});
		this.panel_mo_rd = new JPanel();
		FlowLayout fl_panel_mo_rd = (FlowLayout) this.panel_mo_rd.getLayout();
		fl_panel_mo_rd.setAlignment(0);
		this.panel.add(this.panel_mo_rd);

		this.chk_rd = new JCheckBox("Retard décarottage ");
		chk_rd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_rd.isSelected()) {

					rd = new Remede();
					rd = create_valeur_remede(chk_rd, "rd", chk_rd.getText(),
							mo, type_cn[1]);
				}
			}
		});
		this.panel_mo_rd.add(this.chk_rd);

		this.btn_rd = new JButton("");
		this.panel_mo_rd.add(this.btn_rd);
		this.btn_rd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rd = new Remede();
				rd = create_valeur_remede(chk_rd, "rd", chk_rd.getText(), mo,
						type_cn[1]);
			}

		});
		this.panel_mo_vd = new JPanel();
		FlowLayout fl_panel_mo_vd = (FlowLayout) this.panel_mo_vd.getLayout();
		fl_panel_mo_vd.setAlignment(0);
		this.panel.add(this.panel_mo_vd);

		this.chk_vd = new JCheckBox("Vitesse décarottage    ");
		chk_vd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_vd.isSelected()) {

					vd = new Remede();
					vd = create_valeur_remede(chk_vd, "vd", chk_vd.getText(),
							mo, type_cn[1]);
				}
			}
		});
		this.panel_mo_vd.add(this.chk_vd);

		this.btn_vd = new JButton("");
		this.panel_mo_vd.add(this.btn_vd);
		this.btn_vd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vd = new Remede();
				vd = create_valeur_remede(chk_vd, "vd", chk_vd.getText(), mo,
						type_cn[1]);
			}

		});
		JPanel panel_prog = new JPanel();
		panel_prog.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				visibilite_programmeur = (!visibilite_programmeur);
				Encadrant_Liste_Remedes.this
						.set_visibility_programmeur(visibilite_programmeur);
			}

		});
		FlowLayout flowLayout_1 = (FlowLayout) panel_prog.getLayout();
		flowLayout_1.setVgap(0);
		flowLayout_1.setAlignment(0);
		this.panel.add(panel_prog);

		JLabel lblProgrammeurParRaison = new JLabel("Programmeur par Raison");
		lblProgrammeurParRaison
				.setIcon(new ImageIcon(
						Encadrant_Liste_Remedes.class
								.getResource("/com/jtattoo/plaf/acryl/icons/thumb_hor_rollover.gif")));
		lblProgrammeurParRaison.setHorizontalAlignment(2);
		lblProgrammeurParRaison.setForeground(Color.BLUE);
		lblProgrammeurParRaison.setFont(new Font("Tunga", 1, 24));
		panel_prog.add(lblProgrammeurParRaison);

		this.panel_p_ra = new JPanel();
		FlowLayout fl_panel_p_ra = (FlowLayout) this.panel_p_ra.getLayout();
		fl_panel_p_ra.setAlignment(0);
		this.panel.add(this.panel_p_ra);

		this.chk_ra = new JCheckBox("Réglage amplitude");
		this.chk_ra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_ra.isSelected()) {
					ra = new Remede();
				}
				ra = create_remede(chk_ra, "ra", chk_ra.getText(), pr,
						type_cn[0]);
			}

		});
		this.panel_p_ra.add(this.chk_ra);

		this.panel_p_rp = new JPanel();
		FlowLayout fl_panel_p_rp = (FlowLayout) this.panel_p_rp.getLayout();
		fl_panel_p_rp.setAlignment(0);
		this.panel.add(this.panel_p_rp);

		this.chk_rp = new JCheckBox("Réglage poids");
		this.chk_rp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_rp.isSelected()) {
					rp = new Remede();
				}
				rp = create_remede(chk_rp, "rp", chk_rp.getText(), pr,
						type_cn[0]);
			}

		});
		this.panel_p_rp.add(this.chk_rp);

		this.panel_p_prg = new JPanel();
		FlowLayout fl_panel_p_prg = (FlowLayout) this.panel_p_prg.getLayout();
		fl_panel_p_prg.setAlignment(0);
		this.panel.add(this.panel_p_prg);

		this.chk_prg = new JCheckBox("Programeur");
		this.chk_prg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chk_prg.isSelected()) {
					prg = new Remede();
				}
				prg = create_remede(chk_prg, "prg", chk_prg.getText(), pr,
						type_cn[0]);
			}

		});
		this.panel_p_prg.add(this.chk_prg);

		JPanel panel_1 = new JPanel();
		this.contentPane.add(panel_1, "South");

		this.btnValider = new JButton("Valider");
		this.btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				validation(def_code, "crc", crc, chk_crc);
				validation(def_code, "cmm", cmm, chk_cmm);
				validation(def_code, "cpm", cpm, chk_cpm);
				validation(def_code, "chmt", chmt, chk_chmt);
				validation(def_code, "cgm", cgm, chk_cgm);
				validation(def_code, "chm", chm, chk_chm);
				validation(def_code, "pc", pc, chk_pc);
				validation(def_code, "pb", pb, chk_pb);
				validation(def_code, "pnf", pnf, chk_pnf);
				validation(def_code, "tm", tm, chk_tm);
				validation(def_code, "cf", cf, chk_cf);
				validation(def_code, "cem", cem, chk_cem);
				validation(def_code, "ccc", ccc, chk_ccc);
				validation(def_code, "tf", tf, chk_tf);
				validation(def_code, "rc", rc, chk_rc);
				validation(def_code, "tc", tc, chk_tc);
				validation(def_code, "cnf", cnf, chk_cnf);
				validation(def_code, "cccs", cccs, chk_cccs);
				validation(def_code, "crcs", crcs, chk_crcs);
				validation(def_code, "ts", ts, chk_ts);
				validation(def_code, "tr", tr, chk_tr);
				validation(def_code, "pi", pi, chk_pi);
				validation(def_code, "ps", ps, chk_ps);
				validation(def_code, "vec", vec, chk_vec);
				validation(def_code, "cs", cs, chk_cs);
				validation(def_code, "cemo", cemo, chk_cemo);
				validation(def_code, "tmo", tmo, chk_tmo);
				validation(def_code, "vfm", vfm, chk_vfm);
				validation(def_code, "rd", rd, chk_rd);
				validation(def_code, "vd", vd, chk_vd);
				validation(def_code, "vv", vv, chk_vv);
				validation(def_code, "ra", ra, chk_ra);
				validation(def_code, "rp", rp, chk_rp);
				validation(def_code, "prg", prg, chk_prg);
				JOptionPane.showMessageDialog(null,
						"Validation des parametres avec succés");
				return2list();
			}

		});
		panel_1.add(this.btnValider);

		this.btnAnnuler = new JButton("Annuler");
		this.btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				return2list();
			}

		});
		panel_1.add(this.btnAnnuler);
		set_visibility_canne(false);
		set_visibility_fourreau(false);
		set_visibility_matiere(false);
		set_visibility_moule(false);
		set_visibility_programmeur(false);
		set_visibility_tete(false);

		initialisation(def_code);

		put_button_image();
	}

	private void return2list() {
		Liste_Defauts_ex_encadrant lst = new Liste_Defauts_ex_encadrant();
		setResizable(false);
		lst.setExtendedState(6);

		lst.setVisible(true);
		lst.setMinimumSize(new Dimension(1000, 600));
		dispose();
	}

	private void set_visibility_matiere(boolean visibilite) {
		this.panel_m_cgm.setVisible(visibilite);
		this.panel_m_chm.setVisible(visibilite);
		this.panel_m_chmt.setVisible(visibilite);
		this.panel_m_cmm.setVisible(visibilite);
		this.panel_m_cpm.setVisible(visibilite);
		this.panel_m_crc.setVisible(visibilite);
		this.panel_m_pb.setVisible(visibilite);
		this.panel_m_pc.setVisible(visibilite);
	}

	private void set_visibility_fourreau(boolean visibilite) {
		this.panel_f_cem.setVisible(visibilite);
		this.panel_f_cf.setVisible(visibilite);
		this.panel_f_pnf.setVisible(visibilite);
		this.panel_f_tm.setVisible(visibilite);
		this.panel_f_vv.setVisible(visibilite);
	}

	private void set_visibility_tete(boolean visibilite) {
		this.panel_t_ccc.setVisible(visibilite);
		this.panel_t_cnf.setVisible(visibilite);
		this.panel_t_rc.setVisible(visibilite);
		this.panel_t_tc.setVisible(visibilite);
		this.panel_t_tf.setVisible(visibilite);
	}

	private void set_visibility_canne(boolean visibilite) {
		this.panel_c_cccs.setVisible(visibilite);
		this.panel_c_crcs.setVisible(visibilite);
		this.panel_c_cs.setVisible(visibilite);
		this.panel_c_pi.setVisible(visibilite);
		this.panel_c_ps.setVisible(visibilite);
		this.panel_c_tr.setVisible(visibilite);
		this.panel_c_ts.setVisible(visibilite);
		this.panel_c_vec.setVisible(visibilite);
	}

	private void set_visibility_moule(boolean visibilite) {
		this.panel_mo_cemo.setVisible(visibilite);
		this.panel_mo_rd.setVisible(visibilite);
		this.panel_mo_tmo.setVisible(visibilite);
		this.panel_mo_vd.setVisible(visibilite);
		this.panel_mo_vfm.setVisible(visibilite);
	}

	private void set_visibility_programmeur(boolean visibilite) {
		this.panel_p_prg.setVisible(visibilite);
		this.panel_p_ra.setVisible(visibilite);
		this.panel_p_rp.setVisible(visibilite);
	}

	private Remede create_valeur_remede(JCheckBox chkbx, String rem_code,
			String nom, String piece, String type) {
		chkbx.setSelected(true);
		rmd = new Remede();
		rmd = create_remede(chkbx, rem_code, nom, piece, type);
		p = new Parametre();
		p.setVisible(true);
		p.BtnValider().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double[] s = Encadrant_Liste_Remedes.p.getvalues();
				if (Encadrant_Liste_Remedes.p.check(s)) {
					Encadrant_Liste_Remedes.rmd.setInit(s[0]);
					Encadrant_Liste_Remedes.rmd.setOpt(s[1]);
					Encadrant_Liste_Remedes.rmd.setMin(s[2]);
					Encadrant_Liste_Remedes.rmd.setMax(s[3]);
					Encadrant_Liste_Remedes.p.dispose();
				} else {
					JOptionPane.showMessageDialog(null,
							"Veuillez verifier votre saisie");
				}
			}

		});
		return rmd;
	}

	private Remede create_remede(JCheckBox chkbx, String rem_code, String nom,
			String piece, String type) {
		rmd = new Remede();
		rmd.setCode(rem_code);
		rmd.setNom(nom);
		rmd.setPiece(piece);
		rmd.setType(type);
		rmd.setInit(0.0D);
		rmd.setOpt(0.0D);
		rmd.setMin(0.0D);
		rmd.setMax(0.0D);

		return rmd;
	}

	private void initialisation(String def_code) {
		this.rq = new Request_service();
		if (this.rq.exist_remede(def_code, "crc")) {
			this.chk_crc.setSelected(true);
			this.crc = new Remede();
			this.crc = this.rq.get_remede(def_code, "crc");
		}
		if (this.rq.exist_remede(def_code, "cmm")) {
			this.chk_cmm.setSelected(true);
			this.cmm = new Remede();
			this.cmm = this.rq.get_remede(def_code, "cmm");
		}
		if (this.rq.exist_remede(def_code, "cpm")) {
			this.chk_cpm.setSelected(true);
			this.cpm = new Remede();
			this.cpm = this.rq.get_remede(def_code, "cpm");
		}
		if (this.rq.exist_remede(def_code, "chmt")) {
			this.chk_chmt.setSelected(true);
			this.chmt = new Remede();
			this.chmt = this.rq.get_remede(def_code, "chmt");
		}
		if (this.rq.exist_remede(def_code, "cgm")) {
			this.chk_cgm.setSelected(true);
			this.cgm = new Remede();
			this.cgm = this.rq.get_remede(def_code, "cgm");
		}
		if (this.rq.exist_remede(def_code, "chm")) {
			this.chk_chm.setSelected(true);
			this.chm = new Remede();
			this.chm = this.rq.get_remede(def_code, "chm");
		}
		if (this.rq.exist_remede(def_code, "pc")) {
			this.chk_pc.setSelected(true);
			this.pc = new Remede();
			this.pc = this.rq.get_remede(def_code, "pc");
		}
		if (this.rq.exist_remede(def_code, "pb")) {
			this.chk_pb.setSelected(true);
			this.pb = new Remede();
			this.pb = this.rq.get_remede(def_code, "pb");
		}
		if (this.rq.exist_remede(def_code, "pnf")) {
			this.chk_pnf.setSelected(true);
			this.pnf = new Remede();
			this.pnf = this.rq.get_remede(def_code, "pnf");
		}
		if (this.rq.exist_remede(def_code, "tm")) {
			this.chk_tm.setSelected(true);
			this.tm = new Remede();
			this.tm = this.rq.get_remede(def_code, "tm");
		}
		if (this.rq.exist_remede(def_code, "cf")) {
			this.chk_cf.setSelected(true);
			this.cf = new Remede();
			this.cf = this.rq.get_remede(def_code, "cf");
		}
		if (this.rq.exist_remede(def_code, "cem")) {
			this.chk_cem.setSelected(true);
			this.cem = new Remede();
			this.cem = this.rq.get_remede(def_code, "cem");
		}
		if (this.rq.exist_remede(def_code, "ccc")) {
			this.chk_ccc.setSelected(true);
			this.ccc = new Remede();
			this.ccc = this.rq.get_remede(def_code, "ccc");
		}
		if (this.rq.exist_remede(def_code, "tf")) {
			this.chk_tf.setSelected(true);
			this.tf = new Remede();
			this.tf = this.rq.get_remede(def_code, "tf");
		}
		if (this.rq.exist_remede(def_code, "rc")) {
			this.chk_rc.setSelected(true);
			this.rc = new Remede();
			this.rc = this.rq.get_remede(def_code, "rc");
		}
		if (this.rq.exist_remede(def_code, "tc")) {
			this.chk_tc.setSelected(true);
			this.tc = new Remede();
			this.tc = this.rq.get_remede(def_code, "tc");
		}
		if (this.rq.exist_remede(def_code, "cnf")) {
			this.chk_cnf.setSelected(true);
			this.cnf = new Remede();
			this.cnf = this.rq.get_remede(def_code, "cnf");
		}
		if (this.rq.exist_remede(def_code, "cccs")) {
			this.chk_cccs.setSelected(true);
			this.cccs = new Remede();
			this.cccs = this.rq.get_remede(def_code, "cccs");
		}
		if (this.rq.exist_remede(def_code, "crcs")) {
			this.chk_crcs.setSelected(true);
			this.crcs = new Remede();
			this.crcs = this.rq.get_remede(def_code, "crcs");
		}
		if (this.rq.exist_remede(def_code, "ts")) {
			this.chk_ts.setSelected(true);
			this.ts = new Remede();
			this.ts = this.rq.get_remede(def_code, "ts");
		}
		if (this.rq.exist_remede(def_code, "tr")) {
			this.chk_tr.setSelected(true);
			this.tr = new Remede();
			this.tr = this.rq.get_remede(def_code, "tr");
		}
		if (this.rq.exist_remede(def_code, "pi")) {
			this.chk_pi.setSelected(true);
			this.pi = new Remede();
			this.pi = this.rq.get_remede(def_code, "pi");
		}
		if (this.rq.exist_remede(def_code, "ps")) {
			this.chk_ps.setSelected(true);
			this.ps = new Remede();
			this.ps = this.rq.get_remede(def_code, "ps");
		}
		if (this.rq.exist_remede(def_code, "vec")) {
			this.chk_vec.setSelected(true);
			this.vec = new Remede();
			this.vec = this.rq.get_remede(def_code, "vec");
		}
		if (this.rq.exist_remede(def_code, "cs")) {
			this.chk_cs.setSelected(true);
			this.cs = new Remede();
			this.cs = this.rq.get_remede(def_code, "cs");
		}
		if (this.rq.exist_remede(def_code, "cemo")) {
			this.chk_cemo.setSelected(true);
			this.cemo = new Remede();
			this.cemo = this.rq.get_remede(def_code, "cemo");
		}
		if (this.rq.exist_remede(def_code, "tmo")) {
			this.chk_tmo.setSelected(true);
			this.tmo = new Remede();
			this.tmo = this.rq.get_remede(def_code, "tmo");
		}
		if (this.rq.exist_remede(def_code, "vfm")) {
			this.chk_vfm.setSelected(true);
			this.vfm = new Remede();
			this.vfm = this.rq.get_remede(def_code, "vfm");
		}
		if (this.rq.exist_remede(def_code, "rd")) {
			this.chk_rd.setSelected(true);
			this.rd = new Remede();
			this.rd = this.rq.get_remede(def_code, "rd");
		}
		if (this.rq.exist_remede(def_code, "vd")) {
			this.chk_vd.setSelected(true);
			this.vd = new Remede();
			this.vd = this.rq.get_remede(def_code, "vd");
		}
		if (this.rq.exist_remede(def_code, "vv")) {
			this.chk_vv.setSelected(true);
			this.vv = new Remede();
			this.vv = this.rq.get_remede(def_code, "vv");
		}
		if (this.rq.exist_remede(def_code, "ra")) {
			this.chk_ra.setSelected(true);
			this.ra = new Remede();
			this.ra = this.rq.get_remede(def_code, "ra");
		}
		if (this.rq.exist_remede(def_code, "rp")) {
			this.chk_rp.setSelected(true);
			this.rp = new Remede();
			this.rp = this.rq.get_remede(def_code, "rp");
		}
		if (this.rq.exist_remede(def_code, "prg")) {
			this.chk_prg.setSelected(true);
			this.prg = new Remede();
			this.prg = this.rq.get_remede(def_code, "prg");
		}
	}

	private void validation(String def_code, String code_rm, Remede a,
			JCheckBox box) {
		// si le checkbox est sellectionné, on teste si le remede existe dans la
		// bd;
		// on le met a jour si existe sinon on l'ajoute
		// si le checkbox est désellectioné :
		// on supprime l'entrée de parametres de ce remede pour le defaut
		// present si existe dans DB

		this.rq = new Request_service();
		if (!box.isSelected()) {
			if (this.rq.exist_remede(def_code, code_rm)) {
				this.rq.supprimer_remede(def_code, code_rm);
			}
		} else if (this.rq.exist_remede(def_code, code_rm)) {
			this.rq.update_remede(def_code, a);
		} else {
			this.rq.ajouter_remede(def_code, a);
		}
	}

	private void put_button_image() {
		// mettre icone sur bouton parametrer
		this.btn_pi.setIcon(new ImageIcon(Encadrant_Liste_Remedes.class
				.getResource("/parametrer.png")));
		this.btn_ps.setIcon(new ImageIcon(Encadrant_Liste_Remedes.class
				.getResource("/parametrer.png")));
		this.btn_rc.setIcon(new ImageIcon(Encadrant_Liste_Remedes.class
				.getResource("/parametrer.png")));
		this.btn_rd.setIcon(new ImageIcon(Encadrant_Liste_Remedes.class
				.getResource("/parametrer.png")));
		this.btn_tc.setIcon(new ImageIcon(Encadrant_Liste_Remedes.class
				.getResource("/parametrer.png")));
		this.btn_tf.setIcon(new ImageIcon(Encadrant_Liste_Remedes.class
				.getResource("/parametrer.png")));
		this.btn_tm.setIcon(new ImageIcon(Encadrant_Liste_Remedes.class
				.getResource("/parametrer.png")));
		this.btn_tmo.setIcon(new ImageIcon(Encadrant_Liste_Remedes.class
				.getResource("/parametrer.png")));
		this.btn_tr.setIcon(new ImageIcon(Encadrant_Liste_Remedes.class
				.getResource("/parametrer.png")));
		this.btn_ts.setIcon(new ImageIcon(Encadrant_Liste_Remedes.class
				.getResource("/parametrer.png")));
		this.btn_vd.setIcon(new ImageIcon(Encadrant_Liste_Remedes.class
				.getResource("/parametrer.png")));
		this.btn_vec.setIcon(new ImageIcon(Encadrant_Liste_Remedes.class
				.getResource("/parametrer.png")));
		this.btn_vfm.setIcon(new ImageIcon(Encadrant_Liste_Remedes.class
				.getResource("/parametrer.png")));
		this.btn_vv.setIcon(new ImageIcon(Encadrant_Liste_Remedes.class
				.getResource("/parametrer.png")));
	}

}
