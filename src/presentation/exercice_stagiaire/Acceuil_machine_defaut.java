package presentation.exercice_stagiaire;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import presentation.login.Start_stg;
import services.Request_service;
import services.Utility;

public class Acceuil_machine_defaut extends JFrame {
	private JPanel contentPane;
	private JButton btn_moule;
	private JButton btn_cahier;
	private JButton btn_fourreau;
	private JButton btn_matiere;
	private JButton btn_prg;
	private JButton btn_canne;
	private JButton btn_quitter;
	private JLabel label;
	private JButton btn_tete;
	private JButton btnDernierepiece;
	private int resultat_total = 0;
	private boolean bm = true, bmo = true, bf = true, bt = true, bc = true,
			bp = true;
	String def_code;
	Remedes_Trémie m;
	Remede_Fourreau f;
	Remedes_tete t;
	Remedes_canne c;
	Remedes_moule mo;
	Remedes_prog p;
	private JButton btnChrono;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acceuil_machine_defaut frame = new Acceuil_machine_defaut(
							"po");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
	}

	public Acceuil_machine_defaut(String code) {

		try {
			javax.swing.UIManager
					.setLookAndFeel(new com.jtattoo.plaf.texture.TextureLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setIconImage(Toolkit.getDefaultToolkit().getImage(
				Acceuil_machine_defaut.class.getResource("/machine.png")));
		this.def_code = code;
		int w = Utility.getscreenwidth();
		int h = Utility.getscreenheight();
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setMinimumSize(new Dimension(w, h));
		setExtendedState(MAXIMIZED_BOTH);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(null);

		this.label = new JLabel("");
		this.label.setBounds(0, 0, w, h);

		Image im = new ImageIcon(
				Acceuil_machine_defaut.class.getResource("/machine.png"))
				.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);

		JLabel lblDisabled = new JLabel("DISABLED");
		lblDisabled.setForeground(new Color(0, 255, 0));
		lblDisabled.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisabled.setOpaque(true);
		lblDisabled.setBackground(new Color(128, 128, 128));
		lblDisabled.setFont(new Font("Digital-7", Font.BOLD, 26));
		lblDisabled.setBounds(56, 18, 115, 25);
		contentPane.add(lblDisabled);

		this.label.setIcon(new ImageIcon(im));

		this.contentPane.add(this.label);
		this.btn_matiere = new JButton("matiere");

		// au clik sur la piece de la machine elle affiche un frame contenant
		// tout les remedes relatives à ce composant de machine et operations
		// possible à faire pour essayer de
		// diminiuer le defaut present dans les pieces fabriquées
		// apres le traitement sur ce frame et sa fermeture il sera plus
		// disponible ( desactivé) jusqu'a instancier un autre defaut à traiter

		this.btn_matiere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (bm) {
					m = new Remedes_Trémie();
					m.setDef_code(def_code);
					m.setVisible(true);
					m.getBtnValider().addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							int r = JOptionPane
									.showConfirmDialog(
											null,
											"       Etes vous sur de Valider votre choix ? \n"
													+ " *une fois validé le parametrage ne sera plus accessible*");

							if (r == JOptionPane.YES_OPTION) {
								resultat_total += m.getResult();
								m.dispose();
								bm = false;
							}

						}
					});

				} else
					JOptionPane.showMessageDialog(null,
							"Vous avez déja parametré la Trémie");

			}

		});
		this.btn_matiere.setBounds(775, 68, 168, 119);
		this.contentPane.add(this.btn_matiere);

		this.btn_fourreau = new JButton("fourreau");

		this.btn_fourreau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (bf) {
					f = new Remede_Fourreau(def_code);

					f.setVisible(true);
					f.getBtnValider().addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							int r = JOptionPane
									.showConfirmDialog(
											null,
											"       Etes vous sur de Valider votre choix ? \n"
													+ " *une fois validé le parametrage ne sera plus accessible*");

							if (r == JOptionPane.YES_OPTION) {
								resultat_total += f.getResult();
								f.dispose();
								bf = false;
							}

						}
					});

				} else
					JOptionPane.showMessageDialog(null,
							"Vous avez déja parametré le Fourreau");

			}

		});

		this.btn_fourreau.setBounds(560, 229, 450, 70);
		this.contentPane.add(this.btn_fourreau);

		this.btn_moule = new JButton("moule");

		this.btn_moule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (bmo) {
					mo = new Remedes_moule(def_code);
					mo.setVisible(true);
					mo.getBtnValider().addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							int r = JOptionPane
									.showConfirmDialog(
											null,
											"       Etes vous sur de Valider votre choix ? \n"
													+ " *une fois validé le parametrage ne sera plus accessible*");

							if (r == JOptionPane.YES_OPTION) {
								resultat_total += mo.getResult();
								mo.dispose();
								bmo = false;
							}

						}
					});

				} else
					JOptionPane.showMessageDialog(null,
							"Vous avez déja parametré la Moule");

			}

		});

		this.btn_moule.setBounds(347, 299, 110, 84);
		this.contentPane.add(this.btn_moule);

		this.btn_canne = new JButton("canne de soufflage");
		this.btn_canne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (bc) {
					c = new Remedes_canne(def_code);
					c.setVisible(true);
					c.getBtnValider().addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							int r = JOptionPane
									.showConfirmDialog(
											null,
											"       Etes vous sur de Valider votre choix ? \n"
													+ " *une fois validé le parametrage ne sera plus accessible*");

							if (r == JOptionPane.YES_OPTION) {
								resultat_total += c.getResult();
								c.dispose();
								bc = false;
							}

						}
					});

				} else
					JOptionPane.showMessageDialog(null,
							"Vous avez déja parametré la Canne de Soufflage");

			}

		});

		this.btn_canne.setBounds(389, 181, 30, 107);
		this.contentPane.add(this.btn_canne);

		this.btn_tete = new JButton("tete de d'extrusion");
		this.btn_tete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (bt) {
					t = new Remedes_tete(def_code);
					t.setVisible(true);
					t.getBtnValider().addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							int r = JOptionPane
									.showConfirmDialog(
											null,
											"       Etes vous sur de Valider votre choix ? \n"
													+ " *une fois validé le parametrage ne sera plus accessible*");

							if (r == JOptionPane.YES_OPTION) {
								resultat_total += t.getResult();
								t.dispose();
								bt = false;
							}

						}
					});

				} else
					JOptionPane.showMessageDialog(null,
							"Vous avez déja parametré la Tete d'Extrusion");

			}

		});
		this.btn_tete.setBounds(431, 57, 101, 219);
		this.contentPane.add(this.btn_tete);

		this.btn_prg = new JButton("programmeur paraison");
		this.btn_prg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (bp) {
					p = new Remedes_prog();
					p.setDef_code(def_code);
					p.setVisible(true);
					p.getBtnValider().addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							int r = JOptionPane
									.showConfirmDialog(
											null,
											"       Etes vous sur de Valider votre choix ? \n"
													+ " *une fois validé le parametrage ne sera plus accessible*");

							if (r == JOptionPane.YES_OPTION) {
								resultat_total += p.getResult();
								p.dispose();
								bp = false;
							}

						}
					});

				} else
					JOptionPane
							.showMessageDialog(null,
									"Vous avez déja parametré le Programmeur de Paraison");

			}

		});
		this.btn_prg.setBounds(1056, 229, 244, 458);
		this.contentPane.add(this.btn_prg);

		this.btn_cahier = new JButton("cahier de charges");
		this.btn_cahier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,
						"cahier de charge non disponible pour exercices");
			}

		});
		this.btn_cahier.setBounds(3, 152, 201, 35);
		this.contentPane.add(this.btn_cahier);

		this.btn_quitter = new JButton("quitter");

		// au clik de bouton quitter : le resultat sera affiché ; puis le
		// stagiaire sera demandé si il veut continuer à essayer de traiter
		// d'autres cas de defauts en retournant à la liste des defauts partie
		// exercice ou rentrer à l'acceuil de stagiaire ou il peut choisir de
		// reconsulter les definition ou il peut cjoisir d'annuler le quit pour
		// continuer à reparer le defaut courant
		this.btn_quitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double r, p, t;
				Request_service rq = new Request_service();

				r = resultat_total;// r : nombre de remedes effectués avec
									// succes pour ce
				// defaut ( incrémenté dans un table 'exercice' )
				t = rq.count_remedes(def_code); // t : nombre de remedes total
												// pour ce defaut = nb de
				// ligne dans table 'remede' avec def_code =
				// this.def_code
				p = r / t; // p : pourcentage de reussite de reparation ainsi
							// que note

				JOptionPane.showMessageDialog(null, "Defaut reduit par " + p
						* 100 + "% \n  VOTRE RESULTAT EST " + p * 20 + "/20 ");
				int res = JOptionPane.showConfirmDialog(null,
						"voulez vous continuer tester autres defauts ?",
						"Quitter", 1);
				if (res == 0) {
					Liste_Defauts_ex_stagiaire lst = new Liste_Defauts_ex_stagiaire();
					lst.setVisible(true);
					dispose();
				}
				if (res == 1) {
					Start_stg lst = new Start_stg();
					lst.setVisible(true);
					dispose();
				}
			}

		});
		this.btn_quitter.setBounds(0, 220, 204, 43);
		this.contentPane.add(this.btn_quitter);

		btnDernierepiece = new JButton("Derniere_piece");
		btnDernierepiece.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Dernier_piece p = new Dernier_piece(def_code, resultat_total);
				p.setVisible(true);
			}
		});
		btnDernierepiece.setBounds(50, 391, 244, 162);
		contentPane.add(btnDernierepiece);

		btnChrono = new JButton("chrono");
		btnChrono.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,
						"chronometre non disponible pour module exercice");
			}
		});
		btnChrono.setBounds(0, 0, 216, 128);
		contentPane.add(btnChrono);
		// masquer les boutons et afficher l'image au dessus
		show_buttons(false);
	}

	private void show_buttons(boolean a) {
		// les boutons sont mise transparants et au dessous de l'image de la
		// machine d'extrusion
		this.btn_fourreau.setOpaque(a);
		this.btn_moule.setOpaque(a);
		this.btn_prg.setOpaque(a);
		this.btn_tete.setOpaque(a);
		this.btn_canne.setOpaque(a);
		this.btn_matiere.setOpaque(a);
		this.btn_cahier.setOpaque(a);
		this.btn_quitter.setOpaque(a);
		btnDernierepiece.setOpaque(a);
		this.label.setOpaque(!a);
	}
}

/*
 * Location: C:\Users\stark\Desktop\pfeprojetc.jar
 * 
 * Qualified Name: presentation.exercice_stagiaire.Acceuil_machine_defaut
 * 
 * JD-Core Version: 0.7.0.1
 */