package beans;

public class Remede {

	private String nom, rem_code, piece, type;
	private double init = -1, opt = -1, min = -1, max = -1;

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return rem_code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.rem_code = code;
	}

	/**
	 * @return the piece
	 */
	public String getPiece() {
		return piece;
	}

	/**
	 * @param piece
	 *            the piece to set
	 */
	public void setPiece(String piece) {
		this.piece = piece;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the init
	 */
	public double getInit() {
		return init;
	}

	/**
	 * @param init
	 *            the init to set
	 */
	public void setInit(double init) {
		this.init = init;
	}

	/**
	 * @return the opt
	 */
	public double getOpt() {
		return opt;
	}

	/**
	 * @param opt
	 *            the opt to set
	 */
	public void setOpt(double opt) {
		this.opt = opt;
	}

	/**
	 * @return the min
	 */
	public double getMin() {
		return min;
	}

	/**
	 * @param min
	 *            the min to set
	 */
	public void setMin(double min) {
		this.min = min;
	}

	/**
	 * @return the max
	 */
	public double getMax() {
		return max;
	}

	/**
	 * @param max
	 *            the max to set
	 */
	public void setMax(double max) {
		this.max = max;
	}

}
