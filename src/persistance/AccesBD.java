package persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class AccesBD {

	String driver = "org.sqlite.JDBC";
	Connection con;
	Statement stmt;
	String nom_base = "simdb";

	public void MAJ(String maRequeteSql)

	{// methode update d'acces bd

		try {
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection("jdbc:sqlite:" + nom_base
					+ ".sqlite");
			stmt = con.createStatement();
			stmt.executeUpdate(maRequeteSql);
			System.out.println("connexion etablie");
			// stmt.close();
			// con.close();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex);
		}

	}

	// methode execution requete à BD qui restourne un Resultset
	public ResultSet getStatment(String maRequeteSql) {

		ResultSet monResultSet = null;

		try {
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection("jdbc:sqlite:" + nom_base
					+ ".sqlite");
			stmt = con.createStatement();
			monResultSet = stmt.executeQuery(maRequeteSql);
			System.out.println("connexion getstatement etablie");

		} catch (Exception ex) {
			System.out.println("erreur ");

		}
		return monResultSet;

	}

	// methode deconnection manuelle
	public void disconnect() {
		try {
			stmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
