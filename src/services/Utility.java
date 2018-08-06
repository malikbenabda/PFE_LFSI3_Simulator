package services;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Utility {
	// converts fichier txt to string
	public static String File2String(String file_directory) {
		InputStream ips = null;
		try {
			ips = new FileInputStream(file_directory);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InputStreamReader ipsr = new InputStreamReader(ips);
		BufferedReader br = new BufferedReader(ipsr);
		String ligne;
		String s = "";
		try {
			while ((ligne = br.readLine()) != null) {
				System.out.println(ligne);
				s += ligne + "\n";
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return s;

	}

	// charger image depuis repertoire personnel dans le pc et le mettre comme
	// imageicon de le label passé en parametre
	public static String charger_image(JLabel lblimage, String code) {

		JFileChooser f = new JFileChooser();
		String pathway = null;

		FileFilter filtre = new FileNameExtensionFilter("Fichier Image",
				"jpeg", "jpg", "png", "gif");
		f.setFileFilter(filtre);

		int responce = f.showOpenDialog(null);
		if (responce == f.APPROVE_OPTION)

		{
			pathway = f.getSelectedFile().toString();
			lblimage.setIcon(new ImageIcon(pathway));
		}
		return pathway;
	}

	public static int getscreenwidth() {
		return Toolkit.getDefaultToolkit().getScreenSize().width;
	}

	public static int getscreenheight() {
		return Toolkit.getDefaultToolkit().getScreenSize().height;
	}

	public static Dimension getsuitable_dimension() {
		return new Dimension(getscreenwidth() - 150, getscreenheight() - 50);
	}

	// creation de dimentions relative a la taille de l'ecran et resolution
	// d'affichage
	public static void copy_to_clipboard(String source) {
		/* -- get system clipboard */

		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

		/* -- set clipboard content (string data) */

		StringSelection str = new StringSelection(source);
		clipboard.setContents(str, null);

	}

	// get et set text to and from clipboard ( presse-papier )
	public static String get_clipboard_text() {
		String s = "";
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

		/* -- get clipboard context */

		Transferable data = clipboard.getContents(null);

		/* -- is context string type ? */

		boolean bIsText = ((data != null) && (data
				.isDataFlavorSupported(DataFlavor.stringFlavor)));

		/* -- if yes, translate context to string type and write it */

		if (bIsText) {

			try {

				s = (String) data.getTransferData(DataFlavor.stringFlavor);

				System.out.println(s);
				return s;

			} catch (UnsupportedFlavorException ex) {
				Logger.getLogger(Window.class.getName()).log(Level.SEVERE,
						null, ex);
			} catch (IOException ex) {
				Logger.getLogger(Window.class.getName()).log(Level.SEVERE,
						null, ex);
			}

		}
		return s;

	}
}
