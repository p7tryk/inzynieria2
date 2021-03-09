package dbAccess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import records.Pracownicy;

public class PracownicySql {

	public static List<Pracownicy> selectAll() {
    	
    	Connection connection = DbConnection.connect();
    	
        List<Pracownicy> pracownicy = new LinkedList<Pracownicy>();
        
        try {
            ResultSet result = connection.createStatement().executeQuery("SELECT * FROM pracownicy");
            
            int id;
            String imie, nazwisko;
            
            while(result.next()) {
                id = result.getInt("id");
                imie = result.getString("imie");
                nazwisko = result.getString("nazwisko");
                pracownicy.add(new Pracownicy(id, imie, nazwisko));
            }
            
            DbConnection.close();
            
        } catch (SQLException e) {
            return null;
        }
        return pracownicy;
    }
    
    public static boolean insert(String imie, String nazwisko) {
    	
        try {
        	
            PreparedStatement prepStmt = DbConnection.connect().prepareStatement(
                    "insert into pracownicy values (NULL, ?, ?);");
            
            prepStmt.setString(1, imie);
            prepStmt.setString(2, nazwisko);
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
    		
    		PreparedStatement prepStmt = DbConnection.connect().prepareStatement("DELETE FROM pracownicy WHERE id = ?");
    		
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
