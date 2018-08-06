package presentation.exercice_encadrant;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import presentation.login.Start_Encadrant;
import services.Utility;

//une liste comme les autres liste des defauts apart que
//à la place de permettre l'encadrant de modifier la definition du defaut choisi ,
// elle ouvre le frame de liste des remede pour le defaut sellectionné
public class Liste_Defauts_ex_encadrant extends JFrame implements
		MouseMotionListener, MouseListener {
	Encadrant_Liste_Remedes remedes;
	private JPanel contentPane;
	private JLabel apercu;
	private JLabel lblpn;
	private JLabel lblmrc;
	private JLabel lblrtr;
	private JLabel lbltd;
	private JLabel lblbth;
	private JLabel lblfte;
	private JLabel lblrl;
	private JLabel lblgch;
	private JLabel lblpm;
	private JLabel lblrce;
	private JLabel lblpl;
	private JLabel lblcc;
	private JLabel lblpo;
	private JLabel lblstb;
	private JLabel lblov;
	private JLabel lblst;
	private JPanel panel_3;
	private JButton btnAcceuil;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Liste_Defauts_ex_encadrant frame = new Liste_Defauts_ex_encadrant();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
	}

	public Liste_Defauts_ex_encadrant() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setTitle(getClass().getSimpleName());
		this.contentPane = new JPanel();
		setSize(800, 600);
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);
		setMinimumSize(Utility.getsuitable_dimension());
		setExtendedState(MAXIMIZED_BOTH);

		JPanel panel = new JPanel();
		this.contentPane.add(panel, "West");
		panel.setLayout(new BoxLayout(panel, 1));

		JLabel lblListeDesDefauts = new JLabel("Liste des Defauts");
		lblListeDesDefauts.setFont(new Font("Rockwell", 3, 60));
		lblListeDesDefauts.setHorizontalAlignment(0);
		this.contentPane.add(lblListeDesDefauts, "North");

		JScrollPane scrollPane = new JScrollPane();
		this.contentPane.add(scrollPane, "Center");

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(UIManager.getBorder("FormattedTextField.border"));

		panel_1.setLayout(new BoxLayout(panel_1, 3));

		this.lblpo = new JLabel("PEAU D'ORANGE/ INSTABILITE D'ECOULEMENT ");
		lblpo.setIcon(new ImageIcon(Liste_Defauts_ex_encadrant.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		this.lblpo.setForeground(new Color(0, 0, 128));
		this.lblpo.setFont(new Font("Times New Roman", 1, 30));
		panel_1.add(this.lblpo);

		this.lblbth = new JLabel("BULLES OU TRACES D'HUMIDITE ");
		lblbth.setIcon(new ImageIcon(Liste_Defauts_ex_encadrant.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		this.lblbth.setForeground(new Color(0, 0, 128));
		this.lblbth.setHorizontalAlignment(2);
		this.lblbth.setFont(new Font("Times New Roman", 1, 30));
		panel_1.add(this.lblbth);

		this.lblmrc = new JLabel("MAUVAISE REPARTITION DE LA COULEUR");
		lblmrc.setIcon(new ImageIcon(Liste_Defauts_ex_encadrant.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		this.lblmrc.setForeground(new Color(0, 0, 128));
		this.lblmrc.setHorizontalAlignment(2);
		this.lblmrc.setFont(new Font("Times New Roman", 1, 30));
		panel_1.add(this.lblmrc);

		this.lblpl = new JLabel("PLISSEMENT LONGITUDINAL ");
		lblpl.setIcon(new ImageIcon(Liste_Defauts_ex_encadrant.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		this.lblpl.setForeground(new Color(0, 0, 128));
		this.lblpl.setHorizontalAlignment(2);
		this.lblpl.setFont(new Font("Times New Roman", 1, 30));
		panel_1.add(this.lblpl);

		this.lblpn = new JLabel("POINTS NOIRS ");
		lblpn.setIcon(new ImageIcon(Liste_Defauts_ex_encadrant.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		this.lblpn.setForeground(new Color(0, 0, 128));
		this.lblpn.setHorizontalAlignment(2);
		this.lblpn.setFont(new Font("Times New Roman", 1, 30));
		panel_1.add(this.lblpn);

		this.lblrtr = new JLabel("RETRAIT ");
		lblrtr.setIcon(new ImageIcon(Liste_Defauts_ex_encadrant.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		this.lblrtr.setForeground(new Color(0, 0, 128));
		this.lblrtr.setHorizontalAlignment(2);
		this.lblrtr.setFont(new Font("Times New Roman", 1, 30));
		panel_1.add(this.lblrtr);

		this.lblgch = new JLabel("GAUCHISSEMENT");
		lblgch.setIcon(new ImageIcon(Liste_Defauts_ex_encadrant.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		this.lblgch.setForeground(new Color(0, 0, 128));
		this.lblgch.setHorizontalAlignment(2);
		this.lblgch.setFont(new Font("Times New Roman", 1, 30));
		panel_1.add(this.lblgch);

		this.lblrl = new JLabel("RAYURES LONGITUDINALES");
		lblrl.setIcon(new ImageIcon(Liste_Defauts_ex_encadrant.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		this.lblrl.setForeground(new Color(0, 0, 128));
		this.lblrl.setHorizontalAlignment(2);
		this.lblrl.setFont(new Font("Times New Roman", 1, 30));
		panel_1.add(this.lblrl);

		this.lbltd = new JLabel("TRAINEES DE DEGRADATION ");
		lbltd.setIcon(new ImageIcon(Liste_Defauts_ex_encadrant.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		this.lbltd.setForeground(new Color(0, 0, 128));
		this.lbltd.setHorizontalAlignment(2);
		this.lbltd.setFont(new Font("Times New Roman", 1, 30));
		panel_1.add(this.lbltd);

		this.lblov = new JLabel("OVALISATION");
		lblov.setIcon(new ImageIcon(Liste_Defauts_ex_encadrant.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		this.lblov.setForeground(new Color(0, 0, 128));
		this.lblov.setHorizontalAlignment(2);
		this.lblov.setFont(new Font("Times New Roman", 1, 30));
		panel_1.add(this.lblov);

		this.lblrce = new JLabel("RESISTANCE AUX CHOCS ET/OU A L'ECLATEMENT");
		lblrce.setIcon(new ImageIcon(Liste_Defauts_ex_encadrant.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		this.lblrce.setForeground(new Color(0, 0, 128));
		this.lblrce.setHorizontalAlignment(2);
		this.lblrce.setFont(new Font("Times New Roman", 1, 30));
		panel_1.add(this.lblrce);

		this.lblpm = new JLabel("POLLUTION MATIERE ");
		lblpm.setIcon(new ImageIcon(Liste_Defauts_ex_encadrant.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		this.lblpm.setForeground(new Color(0, 0, 128));
		this.lblpm.setHorizontalAlignment(2);
		this.lblpm.setFont(new Font("Times New Roman", 1, 30));
		panel_1.add(this.lblpm);

		this.lblst = new JLabel("SURFACE TERNE");
		lblst.setIcon(new ImageIcon(Liste_Defauts_ex_encadrant.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		this.lblst.setForeground(new Color(0, 0, 128));
		this.lblst.setHorizontalAlignment(2);
		this.lblst.setFont(new Font("Times New Roman", 1, 30));
		panel_1.add(this.lblst);

		this.lblcc = new JLabel("CHANGEMENT DE COULEUR ");
		lblcc.setIcon(new ImageIcon(Liste_Defauts_ex_encadrant.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		this.lblcc.setForeground(new Color(0, 0, 128));
		this.lblcc.setHorizontalAlignment(2);
		this.lblcc.setFont(new Font("Times New Roman", 1, 30));
		panel_1.add(this.lblcc);

		this.lblstb = new JLabel("SURFACE TROP BRILLANTE ");
		lblstb.setIcon(new ImageIcon(Liste_Defauts_ex_encadrant.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		this.lblstb.setForeground(new Color(0, 0, 128));
		this.lblstb.setHorizontalAlignment(2);
		this.lblstb.setFont(new Font("Times New Roman", 1, 30));
		panel_1.add(this.lblstb);

		this.lblfte = new JLabel("FOSSETTES OU TRACES D'EAU ");
		lblfte.setIcon(new ImageIcon(Liste_Defauts_ex_encadrant.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		this.lblfte.setForeground(new Color(0, 0, 128));
		this.lblfte.setHorizontalAlignment(2);
		this.lblfte.setFont(new Font("Times New Roman", 1, 30));
		panel_1.add(this.lblfte);

		JPanel panel_2 = new JPanel();
		scrollPane.setRowHeaderView(panel_2);
		scrollPane.setViewportView(panel_1);
		panel_2.setLayout(new BorderLayout(0, 0));

		JLabel lblAperu = new JLabel(
				"                  Aper\u00E7u                ");
		lblAperu.setHorizontalAlignment(0);
		lblAperu.setFont(new Font("Tahoma", 3, 34));
		panel_2.add(lblAperu, "North");

		this.apercu = new JLabel("");
		this.apercu.setVerticalAlignment(1);
		this.apercu.setHorizontalAlignment(0);

		panel_2.add(this.apercu, "Center");
		this.apercu.setIcon(new ImageIcon("docs\\images\\Liste_Defauts.png"));

		panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.SOUTH);

		btnAcceuil = new JButton("Acceuil");
		btnAcceuil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Start_Encadrant a = new Start_Encadrant();
				a.setVisible(true);
				dispose();
			}
		});
		panel_3.add(btnAcceuil);

		addMouseMotionListener(this);
		this.lblpo.addMouseMotionListener(this);
		this.lblbth.addMouseMotionListener(this);
		this.lblcc.addMouseMotionListener(this);
		this.lbltd.addMouseMotionListener(this);
		this.lblstb.addMouseMotionListener(this);
		this.lblst.addMouseMotionListener(this);
		this.lblrtr.addMouseMotionListener(this);
		this.lblrl.addMouseMotionListener(this);
		this.lblrce.addMouseMotionListener(this);
		this.lblpn.addMouseMotionListener(this);
		this.lblpm.addMouseMotionListener(this);
		this.lblpl.addMouseMotionListener(this);
		this.lblov.addMouseMotionListener(this);
		this.lblmrc.addMouseMotionListener(this);
		this.lblgch.addMouseMotionListener(this);

		this.lbltd.addMouseListener(this);
		this.lblstb.addMouseListener(this);
		this.lblst.addMouseListener(this);
		this.lblrtr.addMouseListener(this);
		this.lblrl.addMouseListener(this);
		this.lblrce.addMouseListener(this);
		this.lblpo.addMouseListener(this);
		this.lblpn.addMouseListener(this);
		this.lblpm.addMouseListener(this);
		this.lblpl.addMouseListener(this);
		this.lblov.addMouseListener(this);
		this.lblmrc.addMouseListener(this);
		this.lblgch.addMouseListener(this);
		this.lblfte.addMouseListener(this);
		this.lblcc.addMouseListener(this);
		this.lblbth.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == this.lblpo) {
			this.remedes = new Encadrant_Liste_Remedes("po",
					"Liste des remedes de " + this.lblpo.getText());
			this.remedes.setVisible(true);
			dispose();
		}
		if (e.getSource() == this.lblbth) {
			this.remedes = new Encadrant_Liste_Remedes("bth",
					"Liste des remedes de " + this.lblbth.getText());
			this.remedes.setVisible(true);
			dispose();
		}
		if (e.getSource() == this.lblcc) {
			this.remedes = new Encadrant_Liste_Remedes("cc",
					"Liste des remedes de " + this.lblcc.getText());
			this.remedes.setVisible(true);
			dispose();
		}
		if (e.getSource() == this.lblfte) {
			this.remedes = new Encadrant_Liste_Remedes("fte",
					"Liste des remedes de " + this.lblfte.getText());
			this.remedes.setVisible(true);
			dispose();
		}
		if (e.getSource() == this.lblgch) {
			this.remedes = new Encadrant_Liste_Remedes("gch",
					"Liste des remedes de " + this.lblgch.getText());
			this.remedes.setVisible(true);
			dispose();
		}
		if (e.getSource() == this.lblmrc) {
			this.remedes = new Encadrant_Liste_Remedes("mrc",
					"Liste des remedes de " + this.lblmrc.getText());
			this.remedes.setVisible(true);
			dispose();
		}
		if (e.getSource() == this.lblov) {
			this.remedes = new Encadrant_Liste_Remedes("ov",
					"Liste des remedes de " + this.lblov.getText());
			this.remedes.setVisible(true);
			dispose();
		}
		if (e.getSource() == this.lblpl) {
			this.remedes = new Encadrant_Liste_Remedes("pl",
					"Liste des remedes de " + this.lblpl.getText());
			this.remedes.setVisible(true);
			dispose();
		}
		if (e.getSource() == this.lblpm) {
			this.remedes = new Encadrant_Liste_Remedes("pm",
					"Liste des remedes de " + this.lblpm.getText());
			this.remedes.setVisible(true);
			dispose();
		}
		if (e.getSource() == this.lblpn) {
			this.remedes = new Encadrant_Liste_Remedes("pn",
					"Liste des remedes de " + this.lblpn.getText());
			this.remedes.setVisible(true);
			dispose();
		}
		if (e.getSource() == this.lblrce) {
			this.remedes = new Encadrant_Liste_Remedes("rce",
					"Liste des remedes de " + this.lblrce.getText());
			this.remedes.setVisible(true);
			dispose();
		}
		if (e.getSource() == this.lblrl) {
			this.remedes = new Encadrant_Liste_Remedes("rl",
					"Liste des remedes de " + this.lblrl.getText());
			this.remedes.setVisible(true);
			dispose();
		}
		if (e.getSource() == this.lblrtr) {
			this.remedes = new Encadrant_Liste_Remedes("rtr",
					"Liste des remedes de " + this.lblrtr.getText());
			this.remedes.setVisible(true);
			dispose();
		}
		if (e.getSource() == this.lblst) {
			this.remedes = new Encadrant_Liste_Remedes("st",
					"Liste des remedes de " + this.lblst.getText());
			this.remedes.setVisible(true);
			dispose();
		}
		if (e.getSource() == this.lblstb) {
			this.remedes = new Encadrant_Liste_Remedes("stb",
					"Liste des remedes de " + this.lblstb.getText());
			this.remedes.setVisible(true);
			dispose();
		}
		if (e.getSource() == this.lbltd) {
			this.remedes = new Encadrant_Liste_Remedes("td",
					"Liste des remedes de " + this.lbltd.getText());
			this.remedes.setVisible(true);
			dispose();
		}
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseDragged(MouseEvent arg0) {
	}

	public void mouseMoved(MouseEvent arg0) {
		if (arg0.getSource() == this.lblpo) {
			this.apercu.setIcon(new ImageIcon("docs\\images\\po.png"));
		}
		if (arg0.getSource() == this.lblbth) {
			this.apercu.setIcon(new ImageIcon("docs\\images\\bth.png"));
		}
		if (arg0.getSource() == this.lblmrc) {
			this.apercu.setIcon(new ImageIcon("docs\\images\\mrc.png"));
		}
		if (arg0.getSource() == this.lblpl) {
			this.apercu.setIcon(new ImageIcon("docs\\images\\pl.png"));
		}
		if (arg0.getSource() == this.lblpn) {
			this.apercu.setIcon(new ImageIcon("docs\\images\\pn.png"));
		}
		if (arg0.getSource() == this.lblrtr) {
			this.apercu.setIcon(new ImageIcon("docs\\images\\rtr.png"));
		}
		if (arg0.getSource() == this.lblgch) {
			this.apercu.setIcon(new ImageIcon("docs\\images\\gch.png"));
		}
		if (arg0.getSource() == this.lblrl) {
			this.apercu.setIcon(new ImageIcon("docs\\images\\rl.png"));
		}
		if (arg0.getSource() == this.lbltd) {
			this.apercu.setIcon(new ImageIcon("docs\\images\\td.png"));
		}
		if (arg0.getSource() == this.lblov) {
			this.apercu.setIcon(new ImageIcon("docs\\images\\ov.png"));
		}
		if (arg0.getSource() == this.lblrce) {
			this.apercu.setIcon(new ImageIcon("docs\\images\\rce.png"));
		}
		if (arg0.getSource() == this.lblpm) {
			this.apercu.setIcon(new ImageIcon("docs\\images\\pm.png"));
		}
		if (arg0.getSource() == this.lblst) {
			this.apercu.setIcon(new ImageIcon("docs\\images\\st.png"));
		}
		if (arg0.getSource() == this.lblcc) {
			this.apercu.setIcon(new ImageIcon("docs\\images\\cc.png"));
		}
		if (arg0.getSource() == this.lblstb) {
			this.apercu.setIcon(new ImageIcon("docs\\images\\stb.png"));
		}
		if (arg0.getSource() == this.lblfte) {
			this.apercu.setIcon(new ImageIcon("docs\\images\\fte.png"));
		}
	}

}

/*
 * Location: C:\Users\stark\Desktop\pfeprojetc.jar
 * 
 * Qualified Name: presentation.exercice_encadrant.Liste_Defauts_ex
 * 
 * JD-Core Version: 0.7.0.1
 */