package components;

import java.awt.event.KeyEvent;

import javax.swing.JTextField;

public class JNumericfield extends JTextField {

	final static String badchars = "`~!@#$%^&*()_+-=\\|\"':;?/><, ";

	public void processKeyEvent(KeyEvent ev) {

		char c = ev.getKeyChar();

		if ((Character.isLetter(c) && !ev.isAltDown())
				|| badchars.indexOf(c) > -1) {
			ev.consume();
			return;
		} else
			super.processKeyEvent(ev);

	}
}
// heritage de jtextfield avec filtrage des caracteres autres que numeriques
