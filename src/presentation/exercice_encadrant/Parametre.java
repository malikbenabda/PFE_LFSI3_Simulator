package presentation.exercice_encadrant;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import components.JNumericfield;

public class Parametre extends JFrame {
	private JPanel contentPane;
	private JNumericfield txtinit;
	private JNumericfield txtmin;
	private JNumericfield txtopt;
	private JNumericfield txtmax;
	private JPanel panel_1;
	private JButton btnValider;
	private JButton btnReset;
	private double[] s = { -1.0D, -1.0D, -1.0D, -1.0D };

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parametre frame = new Parametre();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Parametre() {
		setDefaultCloseOperation(2);
		setBounds(100, 100, 307, 338);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);

		JPanel panel = new JPanel();
		this.contentPane.add(panel, "Center");
		panel.setLayout(new GridLayout(5, 2, 30, 30));

		JLabel lblValeureInitiale = new JLabel("Valeure Initiale");
		panel.add(lblValeureInitiale);

		this.txtinit = new JNumericfield();
		panel.add(this.txtinit);
		this.txtinit.setColumns(10);

		JLabel lblValeureOptimale = new JLabel("Valeure Optimale");
		panel.add(lblValeureOptimale);

		this.txtopt = new JNumericfield();
		this.txtopt.setColumns(10);
		panel.add(this.txtopt);

		JLabel lblValeureMinimale = new JLabel("Valeure Minimale");
		panel.add(lblValeureMinimale);

		this.txtmin = new JNumericfield();
		this.txtmin.setColumns(10);
		panel.add(this.txtmin);

		JLabel lblValeureMaximale = new JLabel("Valeure Maximale");
		panel.add(lblValeureMaximale);

		this.txtmax = new JNumericfield();
		this.txtmax.setColumns(10);
		panel.add(this.txtmax);

		this.panel_1 = new JPanel();
		this.contentPane.add(this.panel_1, "South");

		this.btnValider = new JButton("Valider");
		this.btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		this.panel_1.add(this.btnValider);

		this.btnReset = new JButton("Reset");
		this.btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Parametre.this.txtinit.setText("0");
				Parametre.this.txtmin.setText("0");
				Parametre.this.txtopt.setText("0");
				Parametre.this.txtmax.setText("0");
			}
		});
		this.panel_1.add(this.btnReset);
	}

	public JButton BtnValider() {
		return this.btnValider;
	}

	public double[] getvalues() {
		try {
			// remplissage des valeures saisie dans un table s[] de double

			if (!this.txtinit.getText().isEmpty()) {
				this.s[0] = Double.parseDouble(this.txtinit.getText());
			}
			if (!this.txtopt.getText().isEmpty()) {
				this.s[1] = Double.parseDouble(this.txtopt.getText());
			}
			if (!this.txtmin.getText().isEmpty()) {
				this.s[2] = Double.parseDouble(this.txtmin.getText());
			}
			if (!this.txtmax.getText().isEmpty()) {
				this.s[3] = Double.parseDouble(this.txtmax.getText());
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Verifiez format de saisie");
		}
		return this.s;
	}

	public boolean check(double[] c) {
		// controle saisie sous forme de logique que
		// min< init, opt < max
		return (c[2] < c[1]) && (c[2] < c[0]) && (c[3] > c[0]) && (c[3] > c[1])
				&& (c[2] < c[3]);
	}
}

/*
 * Location: C:\Users\stark\Desktop\pfeprojetc.jar
 * 
 * Qualified Name: presentation.exercice_encadrant.Parametre
 * 
 * JD-Core Version: 0.7.0.1
 */