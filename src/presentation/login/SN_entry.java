package presentation.login;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import services.Request_service;
import services.Serial;
import services.Utility;

public class SN_entry extends JFrame {

	private JPanel contentPane;
	private JTextField txtid;
	private JLabel lblNumeroSerial;
	private JTextField txtsn;
	private JButton btnValider;

	public void setid(String id) {
		this.txtid.setText(id);
	}

	// formulaire qui affiche le code unique de machine qui sera utilisé pour
	// generer le SN de logiciel
	// l'utilisateur est invité à inserer le SN dans le champs specifié apres le
	// SN sera verifié si il est valide par la ligne
	// ( sn.equals( Serial.md5Java(code: id)))
	public SN_entry() {
		setResizable(false);
		setAlwaysOnTop(true);
		setType(Type.UTILITY);
		setTitle("Enregistrer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 150, 433, 240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		final JLabel lblCodeClient = new JLabel("Code Client*");
		lblCodeClient
				.setToolTipText("\"Veuillez envoyer ce code au responsable de distribution de licences de ce logiciel");
		lblCodeClient.setFont(new Font("Times New Roman", Font.BOLD, 17));

		lblCodeClient.setBounds(114, 4, 120, 27);
		contentPane.add(lblCodeClient);

		txtid = new JTextField();
		txtid.setHorizontalAlignment(SwingConstants.CENTER);
		txtid.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtid.setEditable(false);
		txtid.setBounds(26, 42, 293, 48);
		contentPane.add(txtid);
		txtid.setColumns(10);

		lblNumeroSerial = new JLabel("Numero Serial");
		lblNumeroSerial.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNumeroSerial.setBounds(114, 90, 120, 27);
		contentPane.add(lblNumeroSerial);

		txtsn = new JTextField();
		txtsn.setHorizontalAlignment(SwingConstants.CENTER);
		txtsn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtsn.setBounds(26, 128, 293, 48);
		contentPane.add(txtsn);
		txtsn.setColumns(40);

		btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = txtid.getText();
				String sn = txtsn.getText();
				if (sn.equals(Serial.md5Java(id + "soufflage"))) {
					setVisible(false);
					JOptionPane
							.showMessageDialog(null,
									"Enregistrement avec succées . Merci pour votre confience.");
					Request_service rq = new Request_service();
					rq.set_sn(id, sn);
					Welcome frame = new Welcome();
					frame.setVisible(true);
					dispose();
				} else

					JOptionPane.showMessageDialog(null,
							"Numero Serial erroné !");

			}
		});
		btnValider.setBounds(145, 182, 89, 23);
		contentPane.add(btnValider);

		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtsn.setText(Utility.get_clipboard_text());
			}
		});
		button.setIcon(new ImageIcon(SN_entry.class
				.getResource("/Clipboard Paste.png")));
		button.setBounds(329, 128, 48, 48);
		contentPane.add(button);

		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Utility.copy_to_clipboard(txtid.getText());
			}
		});
		button_1.setIcon(new ImageIcon(SN_entry.class
				.getResource("/Clipboard Copy.png")));
		button_1.setBounds(329, 42, 48, 48);
		contentPane.add(button_1);
	}
}
