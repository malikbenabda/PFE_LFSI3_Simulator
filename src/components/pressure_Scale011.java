package components;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

//copie speciale de numericscale111

public class pressure_Scale011 extends JPanel {
	private JLabel lblTitre;
	private JNumericfield numericfield;
	private JButton btn_add001;
	private JButton btn_sub001;
	private JButton btn_add010;
	private JButton btn_sub010;
	private JButton btn_reset;
	private JButton btn_ok;
	private double init = -1, min = -1, max = -1, opt = -1, current;

	protected void reset() {
		numericfield.setText("" + this.current);
	}

	public void setCurrent(double d) {
		this.current = d;

	}

	public double getInit() {
		return init;
	}

	public void setEnabledall(boolean b) {
		btn_add010.setEnabled(b);
		btn_ok.setEnabled(b);
		btn_reset.setEnabled(b);
		btn_sub010.setEnabled(b);

		numericfield.setEnabled(b);
		btn_sub001.setEnabled(b);
		btn_add001.setEnabled(b);
	}

	public void setInit(double init) {
		this.init = init;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public double getOpt() {
		return opt;
	}

	public void setOpt(double opt) {
		this.opt = opt;
	}

	/**
	 * Create the panel.
	 */
	public pressure_Scale011(String titre) {
		setLayout(new BorderLayout(0, 0));

		setSize(180, 125);
		lblTitre = new JLabel(titre);
		lblTitre.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTitre.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTitre, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		numericfield = new JNumericfield();
		numericfield.setText("0.0");
		numericfield.setHorizontalAlignment(SwingConstants.TRAILING);
		numericfield.setFont(new Font("Agency FB", Font.BOLD, 50));
		numericfield.setEditable(false);
		numericfield.setColumns(4);
		numericfield.setBounds(10, 30, 85, 50);
		panel.add(numericfield);

		btn_ok = new JButton("OK");
		btn_ok.setBounds(107, 31, 61, 23);
		panel.add(btn_ok);

		btn_reset = new JButton("Reset");
		btn_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				reset();
			}
		});
		btn_reset.setBounds(107, 57, 61, 23);
		panel.add(btn_reset);

		btn_add001 = new JButton("");
		btn_add001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (check_add(0.1))
					numericfield.setText(Double.parseDouble(numericfield
							.getText()) + 0.1 + "");
				else
					JOptionPane.showMessageDialog(null,
							"Vous avez atteint la valeure maximale");
			}
		});
		btn_add001
				.setIcon(new ImageIcon(
						pressure_Scale011.class
								.getResource("/com/jtattoo/plaf/acryl/icons/TreeClosedButton.gif")));
		btn_add001.setBounds(70, 10, 20, 20);
		panel.add(btn_add001);

		btn_add010 = new JButton("");
		btn_add010.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (check_add(1.0))
					numericfield.setText(Double.parseDouble(numericfield
							.getText()) + 1.0 + "");
				else
					JOptionPane.showMessageDialog(null,
							"Vous avez atteint la valeure maximale");

			}
		});
		btn_add010
				.setIcon(new ImageIcon(
						pressure_Scale011.class
								.getResource("/com/jtattoo/plaf/acryl/icons/TreeClosedButton.gif")));
		btn_add010.setBounds(40, 10, 20, 20);
		panel.add(btn_add010);

		btn_sub001 = new JButton("");
		btn_sub001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (check_sub(0.1))
					numericfield.setText(Double.parseDouble(numericfield
							.getText()) - 0.1 + "");
				else
					JOptionPane.showMessageDialog(null,
							"Vous avez atteint la valeure minimale");

			}
		});
		btn_sub001
				.setIcon(new ImageIcon(
						pressure_Scale011.class
								.getResource("/com/jtattoo/plaf/acryl/icons/TreeOpenButton.gif")));
		btn_sub001.setBounds(70, 80, 20, 20);
		panel.add(btn_sub001);

		btn_sub010 = new JButton("");
		btn_sub010.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (check_sub(1.0))
					numericfield.setText(Double.parseDouble(numericfield
							.getText()) - 1.0 + "");
				else
					JOptionPane.showMessageDialog(null,
							"Vous avez atteint la valeure minimale");

			}
		});
		btn_sub010
				.setIcon(new ImageIcon(
						pressure_Scale011.class
								.getResource("/com/jtattoo/plaf/acryl/icons/TreeOpenButton.gif")));
		btn_sub010.setBounds(40, 80, 20, 20);
		panel.add(btn_sub010);

	}

	public JNumericfield getNumericfield() {
		return numericfield;
	}

	public void setNumericfield(Double d) {
		this.numericfield.setText("" + d);
	}

	private boolean check_add(double v) {
		double valeur = Double.parseDouble(numericfield.getText());
		return ((valeur + v) <= max && (valeur + v) >= min);
	}

	private boolean check_sub(double v) {
		double valeur = Double.parseDouble(numericfield.getText());
		return ((valeur - v) <= max && (valeur - v) >= min);
	}

	public void set_title(String t) {
		lblTitre.setText(t);
	}

	public boolean test_entry() {
		// this happens when you press ok after modifying the value of the
		// parametre
		boolean t = false;
		double val = Double.parseDouble(numericfield.getText());

		if (val == opt) {
			t = true;
			JOptionPane.showMessageDialog(null,
					"Vous avez trouvé le bon parametre pour ce remede");
		}
		// case init > opt ---> on doit diminuer la valeur !!!!
		if (init > opt) {
			if (init > val && val > opt)
				JOptionPane.showMessageDialog(null,
						"Vous allez dans le bon sens , continuez");
			if (init > val && opt > val)
				JOptionPane
						.showMessageDialog(null,
								" Vous avez raté le parametre optimale et vous allez dans le mauvais sens");
			if (val > init)
				JOptionPane.showMessageDialog(null,
						" Vous allez dans le mauvais sens");
		}

		// case init < opt ---> on doit augmenter la valeur !!!!
		if (init < opt) {
			if (init < val && val < opt)
				JOptionPane.showMessageDialog(null,
						"Vous allez dans le bon sens , continuez");
			if (init < val && opt < val)
				JOptionPane
						.showMessageDialog(null,
								" Vous avez raté le parametre optimale et vous allez dans le mauvais sens");
			if (val < init)
				JOptionPane.showMessageDialog(null,
						" Vous allez dans le mauvais sens");
		}
		return t;
	}

	public JButton getBtn_ok() {
		return btn_ok;
	}
}
