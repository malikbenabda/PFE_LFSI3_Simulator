package presentation.exercice_stagiaire;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import services.Request_service;

public class Remedes_prog extends JFrame {
	// meme travail pour fourreau ici
	private JPanel contentPane;
	private String def_code;
	private JLabel lblra;
	private JButton btnValider;
	private JLabel lblrp;
	private JLabel lblprg;
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
					Remedes_prog frame = new Remedes_prog();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Remedes_prog() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 336, 180);
		setResizable(false);
		contentPane = new JPanel();
		setTitle("Remedes Programmeur Paraison");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		lblra = new JLabel("R\u00E9glage amplitude");
		lblra.setHorizontalAlignment(SwingConstants.CENTER);
		lblra.setBounds(10, 11, 310, 32);
		lblra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				verify(lblra, "ra");
			}
		});
		contentPane.setLayout(null);
		lblra.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblra.setIcon(new ImageIcon(Remedes_prog.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_32x32.png")));
		contentPane.add(lblra);

		lblrp = new JLabel("R\u00E9glage poid         ");
		lblrp.setHorizontalAlignment(SwingConstants.CENTER);
		lblrp.setBounds(10, 41, 310, 30);
		lblrp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				verify(lblrp, "rp");
			}
		});

		lblrp.setIcon(new ImageIcon(Remedes_prog.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_32x32.png")));
		lblrp.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(lblrp);

		lblprg = new JLabel("Programmeur        ");
		lblprg.setHorizontalAlignment(SwingConstants.CENTER);
		lblprg.setBounds(10, 71, 310, 32);
		lblprg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				verify(lblprg, "prg");
			}
		});
		lblprg.setIcon(new ImageIcon(Remedes_prog.class
				.getResource("/com/jtattoo/plaf/icons/pearl_blue_32x32.png")));
		lblprg.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(lblprg);

		btnValider = new JButton("Valider");
		btnValider.setBounds(130, 111, 80, 30);
		contentPane.add(btnValider);
	}

	private void verify(JLabel label, String rm_code) {
		Request_service rq = new Request_service();

		if (label
				.getIcon()
				.toString()
				.equals(new ImageIcon(
						Remedes_prog.class
								.getResource("/com/jtattoo/plaf/icons/pearl_blue_32x32.png"))
						.toString())) {

			if (rq.exist_remede(def_code, rm_code)) {

				label.setIcon(new ImageIcon(
						Remedes_prog.class
								.getResource("/com/jtattoo/plaf/icons/pearl_green_32x32.png")));
				JOptionPane.showMessageDialog(null,
						"Vous avez choisi un bon remede");
				result++;

			} else {
				label.setIcon(new ImageIcon(
						Remedes_prog.class
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
