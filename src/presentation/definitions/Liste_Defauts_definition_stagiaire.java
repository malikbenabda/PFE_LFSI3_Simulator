package presentation.definitions;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import presentation.login.Start_stg;
import services.Utility;

@SuppressWarnings("serial")
public class Liste_Defauts_definition_stagiaire extends JFrame implements
		MouseMotionListener, MouseListener {

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
	private JPanel panel_sud;
	private JButton btnAcceuil;

	public Liste_Defauts_definition_stagiaire() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		setSize(800, 600);
		setMinimumSize(Utility.getsuitable_dimension());
		setExtendedState(MAXIMIZED_BOTH);

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JLabel lblListeDesDefauts = new JLabel("Liste des Defauts");
		lblListeDesDefauts.setFont(new Font("Rockwell",
				Font.BOLD | Font.ITALIC, 60));
		lblListeDesDefauts.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblListeDesDefauts, BorderLayout.NORTH);

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(UIManager.getBorder("FormattedTextField.border"));

		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.PAGE_AXIS));

		lblpo = new JLabel("PEAU D'ORANGE : INSTABILITE D'ECOULEMENT ");
		lblpo.setIcon(new ImageIcon(Liste_Defauts_definition_stagiaire.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		lblpo.setForeground(new Color(0, 0, 128));
		lblpo.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		panel_1.add(lblpo);

		lblbth = new JLabel("BULLES OU TRACES D'HUMIDITE ");
		lblbth.setIcon(new ImageIcon(Liste_Defauts_definition_stagiaire.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		lblbth.setForeground(new Color(0, 0, 128));
		lblbth.setHorizontalAlignment(SwingConstants.LEFT);
		lblbth.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		panel_1.add(lblbth);

		lblmrc = new JLabel("MAUVAISE REPARTITION DE LA COULEUR");
		lblmrc.setIcon(new ImageIcon(Liste_Defauts_definition_stagiaire.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		lblmrc.setForeground(new Color(0, 0, 128));
		lblmrc.setHorizontalAlignment(SwingConstants.LEFT);
		lblmrc.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		panel_1.add(lblmrc);

		lblpl = new JLabel("PLISSEMENT LONGITUDINAL ");
		lblpl.setIcon(new ImageIcon(Liste_Defauts_definition_stagiaire.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		lblpl.setForeground(new Color(0, 0, 128));
		lblpl.setHorizontalAlignment(SwingConstants.LEFT);
		lblpl.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		panel_1.add(lblpl);

		lblpn = new JLabel("POINTS NOIRS ");
		lblpn.setIcon(new ImageIcon(Liste_Defauts_definition_stagiaire.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		lblpn.setForeground(new Color(0, 0, 128));
		lblpn.setHorizontalAlignment(SwingConstants.LEFT);
		lblpn.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		panel_1.add(lblpn);

		lblrtr = new JLabel("RETRAIT ");
		lblrtr.setIcon(new ImageIcon(Liste_Defauts_definition_stagiaire.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		lblrtr.setForeground(new Color(0, 0, 128));
		lblrtr.setHorizontalAlignment(SwingConstants.LEFT);
		lblrtr.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		panel_1.add(lblrtr);

		lblgch = new JLabel("GAUCHISSEMENT");
		lblgch.setIcon(new ImageIcon(Liste_Defauts_definition_stagiaire.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		lblgch.setForeground(new Color(0, 0, 128));
		lblgch.setHorizontalAlignment(SwingConstants.LEFT);
		lblgch.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		panel_1.add(lblgch);

		lblrl = new JLabel("RAYURES LONGITUDINALES");
		lblrl.setIcon(new ImageIcon(Liste_Defauts_definition_stagiaire.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		lblrl.setForeground(new Color(0, 0, 128));
		lblrl.setHorizontalAlignment(SwingConstants.LEFT);
		lblrl.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		panel_1.add(lblrl);

		lbltd = new JLabel("TRAINEES DE DEGRADATION ");
		lbltd.setIcon(new ImageIcon(Liste_Defauts_definition_stagiaire.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		lbltd.setForeground(new Color(0, 0, 128));
		lbltd.setHorizontalAlignment(SwingConstants.LEFT);
		lbltd.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		panel_1.add(lbltd);

		lblov = new JLabel("OVALISATION");
		lblov.setIcon(new ImageIcon(Liste_Defauts_definition_stagiaire.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		lblov.setForeground(new Color(0, 0, 128));
		lblov.setHorizontalAlignment(SwingConstants.LEFT);
		lblov.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		panel_1.add(lblov);

		lblrce = new JLabel("RESISTANCE AUX CHOCS ET/OU A L'ECLATEMENT");
		lblrce.setIcon(new ImageIcon(Liste_Defauts_definition_stagiaire.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		lblrce.setForeground(new Color(0, 0, 128));
		lblrce.setHorizontalAlignment(SwingConstants.LEFT);
		lblrce.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		panel_1.add(lblrce);

		lblpm = new JLabel("POLLUTION MATIERE ");
		lblpm.setIcon(new ImageIcon(Liste_Defauts_definition_stagiaire.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		lblpm.setForeground(new Color(0, 0, 128));
		lblpm.setHorizontalAlignment(SwingConstants.LEFT);
		lblpm.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		panel_1.add(lblpm);

		lblst = new JLabel("SURFACE TERNE");
		lblst.setIcon(new ImageIcon(Liste_Defauts_definition_stagiaire.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		lblst.setForeground(new Color(0, 0, 128));
		lblst.setHorizontalAlignment(SwingConstants.LEFT);
		lblst.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		panel_1.add(lblst);

		lblcc = new JLabel("CHANGEMENT DE COULEUR ");
		lblcc.setIcon(new ImageIcon(Liste_Defauts_definition_stagiaire.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		lblcc.setForeground(new Color(0, 0, 128));
		lblcc.setHorizontalAlignment(SwingConstants.LEFT);
		lblcc.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		panel_1.add(lblcc);

		lblstb = new JLabel("SURFACE TROP BRILLANTE ");
		lblstb.setIcon(new ImageIcon(Liste_Defauts_definition_stagiaire.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		lblstb.setForeground(new Color(0, 0, 128));
		lblstb.setHorizontalAlignment(SwingConstants.LEFT);
		lblstb.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		panel_1.add(lblstb);

		lblfte = new JLabel("FOSSETTES OU TRACES D'EAU ");
		lblfte.setIcon(new ImageIcon(Liste_Defauts_definition_stagiaire.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_28x28.png")));
		lblfte.setForeground(new Color(0, 0, 128));
		lblfte.setHorizontalAlignment(SwingConstants.LEFT);
		lblfte.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		panel_1.add(lblfte);

		JPanel panel_2 = new JPanel();
		scrollPane.setRowHeaderView(panel_2);
		scrollPane.setViewportView(panel_1);
		panel_2.setLayout(new BorderLayout(0, 0));

		JLabel lblAperu = new JLabel(
				"                  Aper\u00E7u                ");
		lblAperu.setHorizontalAlignment(SwingConstants.CENTER);
		lblAperu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 34));
		panel_2.add(lblAperu, BorderLayout.NORTH);

		apercu = new JLabel("");
		apercu.setVerticalAlignment(SwingConstants.TOP);
		apercu.setHorizontalAlignment(SwingConstants.CENTER);

		panel_2.add(apercu, BorderLayout.CENTER);
		apercu.setIcon(new ImageIcon("docs\\images\\" + "Liste_Defauts"
				+ ".png"));

		panel_sud = new JPanel();
		contentPane.add(panel_sud, BorderLayout.SOUTH);

		btnAcceuil = new JButton("Acceuil");
		btnAcceuil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Start_stg fr = new Start_stg();
				fr.setVisible(true);
				dispose();
			}
		});
		panel_sud.add(btnAcceuil);

		lblpo.addMouseMotionListener(this);
		lblbth.addMouseMotionListener(this);
		lblcc.addMouseMotionListener(this);
		lbltd.addMouseMotionListener(this);
		lblstb.addMouseMotionListener(this);
		lblst.addMouseMotionListener(this);
		lblrtr.addMouseMotionListener(this);
		lblrl.addMouseMotionListener(this);
		lblrce.addMouseMotionListener(this);
		lblpn.addMouseMotionListener(this);
		lblpm.addMouseMotionListener(this);
		lblpl.addMouseMotionListener(this);
		lblov.addMouseMotionListener(this);
		lblmrc.addMouseMotionListener(this);
		lblgch.addMouseMotionListener(this);

		lbltd.addMouseListener(this);
		lblstb.addMouseListener(this);
		lblst.addMouseListener(this);
		lblrtr.addMouseListener(this);
		lblrl.addMouseListener(this);
		lblrce.addMouseListener(this);
		lblpo.addMouseListener(this);
		lblpn.addMouseListener(this);
		lblpm.addMouseListener(this);
		lblpl.addMouseListener(this);
		lblov.addMouseListener(this);
		lblmrc.addMouseListener(this);
		lblgch.addMouseListener(this);
		lblfte.addMouseListener(this);
		lblcc.addMouseListener(this);
		lblbth.addMouseListener(this);

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == lblpo)
			create_defaut_definition_frame("Peau D'Orange", "po");

		if (arg0.getSource() == lblbth)
			create_defaut_definition_frame("BULLES OU TRACES D'HUMIDITE ",
					"bth");

		if (arg0.getSource() == lblmrc)
			create_defaut_definition_frame(
					"MAUVAISE REPARTITION DE LA COULEUR ", "mrc");

		if (arg0.getSource() == lblpl)
			create_defaut_definition_frame("PLISSEMENT LONGITUDINAL ", "pl");

		if (arg0.getSource() == lblpn)
			create_defaut_definition_frame("POINTS NOIRS ", "pn");

		if (arg0.getSource() == lblrtr)
			create_defaut_definition_frame("RETRAIT", "rtr");

		if (arg0.getSource() == lblgch)
			create_defaut_definition_frame("GAUCHISSEMENT", "gch");

		if (arg0.getSource() == lblrl)
			create_defaut_definition_frame("RAYURES LONGITUDINALES ", "rl");

		if (arg0.getSource() == lbltd)
			create_defaut_definition_frame("TRAINEES DE DEGRADATION", "td");

		if (arg0.getSource() == lblov)
			create_defaut_definition_frame("OVALISATION", "ov");

		if (arg0.getSource() == lblrce)
			create_defaut_definition_frame(
					"RESISTANCE AUX CHOCS ET/OU A L'ECLATEMENT ", "rce");

		if (arg0.getSource() == lblpm)
			create_defaut_definition_frame("POLLUTION MATIERE", "pm");

		if (arg0.getSource() == lblst)
			create_defaut_definition_frame("SURFACE TERNE ", "st");

		if (arg0.getSource() == lblcc)
			create_defaut_definition_frame("CHANGEMENT DE COULEUR ", "cc");

		if (arg0.getSource() == lblstb)
			create_defaut_definition_frame("SURFACE TROP BRILLANTE ", "stb");

		if (arg0.getSource() == lblfte)
			create_defaut_definition_frame("FOSSETTES OU TRACES D'EAU ", "fte");

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		if (arg0.getSource() == lblpo)
			apercu.setIcon(new ImageIcon("docs\\images\\" + "po" + ".png"));
		if (arg0.getSource() == lblbth)
			apercu.setIcon(new ImageIcon("docs\\images\\" + "bth" + ".png"));
		if (arg0.getSource() == lblmrc)
			apercu.setIcon(new ImageIcon("docs\\images\\" + "mrc" + ".png"));
		if (arg0.getSource() == lblpl)
			apercu.setIcon(new ImageIcon("docs\\images\\" + "pl" + ".png"));
		if (arg0.getSource() == lblpn)
			apercu.setIcon(new ImageIcon("docs\\images\\" + "pn" + ".png"));
		if (arg0.getSource() == lblrtr)
			apercu.setIcon(new ImageIcon("docs\\images\\" + "rtr" + ".png"));
		if (arg0.getSource() == lblgch)
			apercu.setIcon(new ImageIcon("docs\\images\\" + "gch" + ".png"));
		if (arg0.getSource() == lblrl)
			apercu.setIcon(new ImageIcon("docs\\images\\" + "rl" + ".png"));
		if (arg0.getSource() == lbltd)
			apercu.setIcon(new ImageIcon("docs\\images\\" + "td" + ".png"));
		if (arg0.getSource() == lblov)
			apercu.setIcon(new ImageIcon("docs\\images\\" + "ov" + ".png"));
		if (arg0.getSource() == lblrce)
			apercu.setIcon(new ImageIcon("docs\\images\\" + "rce" + ".png"));
		if (arg0.getSource() == lblpm)
			apercu.setIcon(new ImageIcon("docs\\images\\" + "pm" + ".png"));
		if (arg0.getSource() == lblst)
			apercu.setIcon(new ImageIcon("docs\\images\\" + "st" + ".png"));
		if (arg0.getSource() == lblcc)
			apercu.setIcon(new ImageIcon("docs\\images\\" + "cc" + ".png"));
		if (arg0.getSource() == lblstb)
			apercu.setIcon(new ImageIcon("docs\\images\\" + "stb" + ".png"));
		if (arg0.getSource() == lblfte)
			apercu.setIcon(new ImageIcon("docs\\images\\" + "fte" + ".png"));

	}

	private void create_defaut_definition_frame(String title, String code) {
		Definition_defaut_stagiaire a = new Definition_defaut_stagiaire(title,
				code);

		a.setVisible(true);
		a.seteditable(false);
		dispose();
	}
}
