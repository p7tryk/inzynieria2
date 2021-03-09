package dbAccess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import records.Klienci;

public class KlienciSql {

	public static List<Klienci> selectAll() {
    	
    	Connection connection = DbConnection.connect();
    	
        List<Klienci> klienci = new LinkedList<Klienci>();
        
        try {
            ResultSet result = connection.createStatement().executeQuery("SELECT * FROM klienci");
            
            int id;
            String imie, nazwisko, kraj, miejscowosc, ulica, mieszkanie, kod_pocztowy, numer_tel, email;
            
            while(result.next()) {
                id = result.getInt("id");
                imie = result.getString("imie");
                nazwisko = result.getString("nazwisko");
                kraj = result.getString("kraj");
                miejscowosc = result.getString("miejscowosc");
                ulica = result.getString("ulica");
                mieszkanie = result.getString("mieszkanie");
                kod_pocztowy = result.getString("kod_pocztowy");
                numer_tel = result.getString("numer_tel");
                email = result.getString("email");
                klienci.add(new Klienci(id, imie, nazwisko, kraj, miejscowosc, ulica, mieszkanie, kod_pocztowy, numer_tel, email));
            }
            
            DbConnection.close();
            
        } catch (SQLException e) {
            return null;
        }
        return klienci;
    }
    
    public static boolean insert(String imie, String nazwisko, String kraj, String miejscowosc, String ulica,
			String mieszkanie, String kod_pocztowy, String numer_tel, String email) {
    	
        try {
        	System.err.println("dupa1");
        	
            PreparedStatement prepStmt = DbConnection.connect().prepareStatement(
                    "insert into klienci values (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            
            System.err.println("dupa2");
            
            prepStmt.setString(1, imie);
            prepStmt.setString(2, nazwisko);
            prepStmt.setString(3, kraj);
            prepStmt.setString(4, miejscowosc);
            prepStmt.setString(5, ulica);
            prepStmt.setString(6, mieszkanie);
            prepStmt.setString(7, kod_pocztowy);
            prepStmt.setString(8, numer_tel);
            prepStmt.setString(9, email);
            prepStmt.execute();
            
            DbConnection.close();
            
            System.err.println("Wpisano");
            
        } catch (SQLException e) {
            System.err.println("nie wpisano");
            return false;
        }
        return true;
    }
    
    public static boolean delete(String id) {
    	
    	try {
    		
    		PreparedStatement prepStmt = DbConnection.connect().prepareStatement("DELETE FROM klienci WHERE id = ?");
    		
    		prepStmt.setString(1, id);
    		prepStmt.execute();
    		
    		System.err.println("Usunieto");
    		
    	} catch (SQLException e) {
            System.err.println("Nie usunieto");
            return false;
        }
        return true;
    }
}
