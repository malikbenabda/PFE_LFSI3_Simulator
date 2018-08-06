package services;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;

import persistance.AccesBD;
import beans.Encadrant;
import beans.Remede;
import beans.Stagiaire;
import beans.Utilisateur;

public class Request_service {
	AccesBD ac;
	String sql;

	// methodes de gestion utilisateurs et authentification :
	// communication avec base de données
	// table admins pour encadrants
	// table stg pour Stagiaires
	public void ajouter_encadrant(Encadrant a) {
		ac = new AccesBD();
		ac.MAJ("insert into admins values( '" + a.getNom() + "' ,  '"
				+ a.getPrenom() + "' , '" + a.getCin() + "' , '"
				+ a.getAdresse() + "' , " + "'" + a.getEmail() + "' , '"
				+ a.getTel() + "' , '" + a.getLogin() + "' , '" + a.getMdp()
				+ "' )");

		ac.disconnect();
	}

	public void ajouter_stg(Stagiaire a) {
		ac = new AccesBD();
		ac.MAJ("insert into 'stg' values( '" + a.getNom() + "' ,  '"
				+ a.getPrenom() + "', '" + a.getCin() + "' , '"
				+ a.getAdresse() + "' , '" + a.getEmail() + "', '" + a.getTel()
				+ "' , '" + a.getLogin() + "' , '" + a.getMdp() + "' )");

		ac.disconnect();
	}

	public boolean user_existe(String column_id, String var_id, String type) {
		ac = new AccesBD();
		boolean existance = true;
		try {
			existance = ac.getStatment(
					"select * from " + type + " where " + column_id + " = '"
							+ var_id + "'").next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ac.disconnect();
		return existance;
	}

	public DefaultComboBoxModel<String> getlogins(String type) {
		// retourne un model de combobox pour liste d'admins logins des admins
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
		ac = new AccesBD();
		ResultSet rez = ac.getStatment("select login from " + type);

		try {
			while (rez.next()) {
				if (rez.getString("login").equals("Root")) {
				} else
					model.addElement(rez.getString("login"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ac.disconnect();
		return model;
	}

	public Utilisateur getutilisateur(String login, String table) {
		Utilisateur p = new Utilisateur();
		ac = new AccesBD();
		ResultSet rs = ac.getStatment("select * from " + table
				+ " where login='" + login + "'");

		try {
			p.setNom(rs.getString("nom"));
			p.setPrenom(rs.getString("prenom"));
			p.setCin(rs.getString("cin"));
			p.setAdresse(rs.getString("adresse"));
			p.setEmail(rs.getString("email"));
			p.setTel(rs.getString("tel"));
			p.setLogin(rs.getString("login"));
			p.setMdp(rs.getString("mdp"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ac.disconnect();
		return p;
	}

	public String getmdp(String login, String table) {
		String s = "";
		ac = new AccesBD();
		ResultSet rs = ac.getStatment("select mdp from " + table
				+ " where login='" + login + "'");
		try {
			s = rs.getString("mdp");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ac.disconnect();
		return s;

	}

	public void modifier_stg(Stagiaire a) {
		ac = new AccesBD();
		String sql = "update stg set nom= '" + a.getNom() + "' , prenom = '"
				+ a.getPrenom() + "' , cin = '" + a.getCin()
				+ "'  , adresse = '" + a.getAdresse() + "' , " + "email = '"
				+ a.getEmail() + "' , tel  = '" + a.getTel() + "' , mdp = '"
				+ a.getMdp() + "' " + "where login = '" + a.getLogin() + "' ";
		ac.MAJ(sql);
		ac.disconnect();

	}

	public void modifier_encadrant(Encadrant a) {
		ac = new AccesBD();
		String sql = "update admins set nom= '" + a.getNom() + "' , prenom = '"
				+ a.getPrenom() + "' , cin = '" + a.getCin()
				+ "'  , adresse = '" + a.getAdresse() + "' , " + "email = '"
				+ a.getEmail() + "' , tel  = '" + a.getTel() + "' , mdp = '"
				+ a.getMdp() + "' " + "where login = '" + a.getLogin() + "' ";
		ac.MAJ(sql);
		ac.disconnect();

	}

	public void modifier_root_item(String valeur_item, String type_item) {

		ac = new AccesBD();
		ac.MAJ("update admins set " + type_item + "='" + valeur_item
				+ "' where login= 'Root' ");
	}

	public void supprimer_encadrant(String login) {
		ac = new AccesBD();
		ac.MAJ("delete from admins where login = '" + login + "'");
		ac.disconnect();
	}

	public void supprimer_stg(String login) {
		ac = new AccesBD();
		ac.MAJ("delete from stg where login = '" + login + "'");
		ac.disconnect();
	}

	/*************************** code d'acces au remedes ***************************************/
	/************************************************************************************/
	/****************************************************************************/
	public boolean exist_remede(String def_code, String rem_code) {
		ac = new AccesBD();
		boolean existance = true;
		String sql = "select * from remede where def_code='" + def_code
				+ "' and rem_code='" + rem_code + "'  ";
		try {
			existance = ac.getStatment(sql).next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ac.disconnect();
		System.out.println("existance state of" + def_code + " with remcode :"
				+ rem_code + " = " + existance);
		return existance;
	}

	public void supprimer_remede(String def_code, String rem_code) {

		ac = new AccesBD();
		ac.MAJ("delete  from remede where def_code='" + def_code
				+ "' and rem_code='" + rem_code + "'  ");
		ac.disconnect();
	}

	public void ajouter_remede(String def_code, Remede r) {
		ac = new AccesBD();
		sql = "  insert into remede values ( '" + def_code + "', '"
				+ r.getCode() + "' , '" + r.getNom() + "' , '" + r.getPiece()
				+ "' , '" + r.getType() + "' ," + " '" + r.getInit() + "' , '"
				+ r.getOpt() + "' , '" + r.getMin() + "' , '" + r.getMax()
				+ "' )  ";

		ac.MAJ(sql);
		ac.disconnect();

	}

	public void update_remede(String def_code, Remede r) {
		ac = new AccesBD();
		// faire update si les valeures sont saisies ( tt les champs != -1 )
		// et aussi que le remede a au moin une des valeures changée de celle
		// enregistré dans DB
		Remede r2 = get_remede(def_code, r.getCode());
		if ((r.getInit() != -1 && r.getMin() != -1 && r.getOpt() != -1 && r
				.getMax() != -1)
				&& (r.getInit() != r2.getInit() || r.getMin() != r2.getMin()
						|| r.getOpt() != r2.getOpt() || r.getMax() != r2
						.getMax()))

		{
			sql = "update remede set init='" + r.getInit() + "' , opt='"
					+ r.getOpt() + "' , min='" + r.getMin() + "' , max= '"
					+ r.getMax() + "'    " + "where def_code='" + def_code
					+ "' and rem_code='" + r.getCode() + "' ";
			ac.MAJ(sql);

		}
		ac.disconnect();
		// else rien faire , les anciennes valeures sont laissées

	}

	public Remede get_remede(String def_code, String rem_code) {
		String sql = "select * from remede where def_code='" + def_code
				+ "' and rem_code='" + rem_code + "'  ";
		ac = new AccesBD();
		Remede rm = new Remede();
		ResultSet rs = ac.getStatment(sql);

		try {
			rm.setCode(rs.getString("rem_code"));
			rm.setNom(rs.getString("nom"));
			rm.setPiece(rs.getString("piece"));
			rm.setType(rs.getString("type"));
			rm.setInit(rs.getFloat("init"));
			rm.setOpt(rs.getFloat("opt"));
			rm.setMin(rs.getFloat("min"));
			rm.setMax(rs.getFloat("max"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ac.disconnect();
		return rm;

	}

	public int count_remedes(String def_code) {
		int count = 0;
		ac = new AccesBD();
		ResultSet rz = ac.getStatment("select * from remede where def_code= '"
				+ def_code + "'");
		try {
			while (rz.next())
				count++;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ac.disconnect();
		return count;

	}

	/************************** checking SERIAL NUMBER *******************************/

	public void create_serial_table() {
		ac = new AccesBD();
		ac.MAJ("create table if not exists 'serial' ( 'id' varchar , 'sn' varchar )    ");
		ac.disconnect();
	}

	public void set_sn(String id, String sn) {
		ac = new AccesBD();
		ac.MAJ("delete from serial");
		ac.disconnect();
		ac.MAJ("insert into serial values( '" + id + "' , '" + sn + "'  )");
		ac.disconnect();

	}

	public boolean valid_sn() {
		boolean result = false, exists = false;
		ac = new AccesBD();
		try {
			exists = ac.getStatment("select * from serial").next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (exists) {
			ResultSet rz = ac.getStatment("select * from serial");
			try {
				String id = rz.getString("id");
				String sn = rz.getString("sn");

				result = sn.equals(Serial.md5Java(id + "soufflage"));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		ac.disconnect();
		return result;

	}
}