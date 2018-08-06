package presentation.exercice_stagiaire;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
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

public class Remedes_Trémie extends JFrame {
	// meme travail pour fourreau ici
	private JPanel contentPane;
	private String def_code;
	private JLabel lblcrc;
	private JLabel lblchmt;
	private JButton btnValider;
	private JLabel lblpb;
	private JLabel lblpc;
	private JLabel lblcgm;
	private JLabel lblcmm;
	private JLabel lblchm;
	private JLabel lblcpm;
	int result = 0;

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getDef_code() {
		return def_code;
	}

	public void setDef_code(String def_code) {
		this.def_code = def_code;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Remedes_Trémie frame = new Remedes_Trémie();
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
	public Remedes_Trémie() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 280, 360);
		setMinimumSize(new Dimension(280, 360));
		setResizable(false);
		contentPane = new JPanel();
		setTitle("Remedes Trémie/Matiere");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		lblcrc = new JLabel("Contr\u00F4le refroidissement culasse ");
		lblcrc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				verify(lblcrc, "crc");
			}
		});
		lblcrc.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblcrc.setIcon(new ImageIcon(Remedes_Trémie.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_32x32.png")));
		GridBagConstraints gbc_lblcrc = new GridBagConstraints();
		gbc_lblcrc.insets = new Insets(0, 0, 5, 0);
		gbc_lblcrc.fill = GridBagConstraints.BOTH;
		gbc_lblcrc.gridx = 1;
		gbc_lblcrc.gridy = 0;
		contentPane.add(lblcrc, gbc_lblcrc);

		lblcmm = new JLabel("Contr\u00F4le m\u00E9lange mati\u00E8re ");
		lblcmm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				verify(lblcmm, "cmm");
			}
		});

		lblcmm.setIcon(new ImageIcon(Remedes_Trémie.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_32x32.png")));
		lblcmm.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblcmm = new GridBagConstraints();
		gbc_lblcmm.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblcmm.insets = new Insets(0, 0, 5, 0);
		gbc_lblcmm.gridx = 1;
		gbc_lblcmm.gridy = 1;
		contentPane.add(lblcmm, gbc_lblcmm);

		lblcpm = new JLabel("Contr\u00F4le pollution mati\u00E8re ");
		lblcpm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				verify(lblcpm, "cpm");
			}
		});
		lblcpm.setIcon(new ImageIcon(Remedes_Trémie.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_32x32.png")));
		lblcpm.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblcpm = new GridBagConstraints();
		gbc_lblcpm.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblcpm.insets = new Insets(0, 0, 5, 0);
		gbc_lblcpm.gridx = 1;
		gbc_lblcpm.gridy = 2;
		contentPane.add(lblcpm, gbc_lblcpm);

		lblchmt = new JLabel("Contr\u00F4le hauteur mati\u00E8re tr\u00E9mie ");
		lblchmt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				verify(lblchmt, "chmt");
			}
		});
		lblchmt.setIcon(new ImageIcon(Remedes_Trémie.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_32x32.png")));
		lblchmt.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblchmt = new GridBagConstraints();
		gbc_lblchmt.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblchmt.insets = new Insets(0, 0, 5, 0);
		gbc_lblchmt.gridx = 1;
		gbc_lblchmt.gridy = 3;
		contentPane.add(lblchmt, gbc_lblchmt);

		lblcgm = new JLabel("Contr\u00F4le grade mati\u00E8re  ");
		lblcgm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				verify(lblcgm, "cgm");
			}
		});
		lblcgm.setIcon(new ImageIcon(Remedes_Trémie.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_32x32.png")));
		lblcgm.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblcgm = new GridBagConstraints();
		gbc_lblcgm.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblcgm.insets = new Insets(0, 0, 5, 0);
		gbc_lblcgm.gridx = 1;
		gbc_lblcgm.gridy = 4;
		contentPane.add(lblcgm, gbc_lblcgm);

		lblchm = new JLabel("Contr\u00F4le humidit\u00E9 mati\u00E8re ");
		lblchm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				verify(lblchm, "chm");
			}
		});
		lblchm.setIcon(new ImageIcon(Remedes_Trémie.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_32x32.png")));
		lblchm.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblchm = new GridBagConstraints();
		gbc_lblchm.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblchm.insets = new Insets(0, 0, 5, 0);
		gbc_lblchm.gridx = 1;
		gbc_lblchm.gridy = 5;
		contentPane.add(lblchm, gbc_lblchm);

		lblpc = new JLabel("Pourcentage de colorant");
		lblpc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				verify(lblpc, "pc");
			}
		});
		lblpc.setIcon(new ImageIcon(Remedes_Trémie.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_32x32.png")));
		lblpc.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblpc = new GridBagConstraints();
		gbc_lblpc.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblpc.insets = new Insets(0, 0, 5, 0);
		gbc_lblpc.gridx = 1;
		gbc_lblpc.gridy = 6;
		contentPane.add(lblpc, gbc_lblpc);

		lblpb = new JLabel("Pourcentage de broyer");
		lblpb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				verify(lblpb, "pb");
			}
		});
		lblpb.setIcon(new ImageIcon(Remedes_Trémie.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_32x32.png")));
		lblpb.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblpb = new GridBagConstraints();
		gbc_lblpb.insets = new Insets(0, 0, 5, 0);
		gbc_lblpb.fill = GridBagConstraints.BOTH;
		gbc_lblpb.gridx = 1;
		gbc_lblpb.gridy = 7;
		contentPane.add(lblpb, gbc_lblpb);

		btnValider = new JButton("Valider");
		GridBagConstraints gbc_btnValider = new GridBagConstraints();
		gbc_btnValider.gridx = 1;
		gbc_btnValider.gridy = 8;
		contentPane.add(btnValider, gbc_btnValider);
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

}
