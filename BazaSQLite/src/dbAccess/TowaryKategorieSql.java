package dbAccess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import records.TowaryKategorie;

public class TowaryKategorieSql {

	public static List<TowaryKategorie> selectAll() {
    	
    	Connection connection = DbConnection.connect();
    	
        List<TowaryKategorie> towaryKategorie = new LinkedList<TowaryKategorie>();
        
        try {
            ResultSet result = connection.createStatement().executeQuery("SELECT * FROM towary_kategorie");
            
            int id_towary, id_kategorie;
            
            while(result.next()) {
            	id_towary = result.getInt("id_towary");
            	id_kategorie = result.getInt("id_kategorie");
                towaryKategorie.add(new TowaryKategorie(id_towary, id_kategorie));
            }
            
            DbConnection.close();
            
        } catch (SQLException e) {
            return null;
        }
        return towaryKategorie;
    }
    
    public static boolean insert(int id_towary, int id_kategorie) {
    	
        try {
        	System.err.println("dupa1");
        	
            PreparedStatement prepStmt = DbConnection.connect().prepareStatement(
                    "insert into towary_kategorie values (?, ?);");
            
            System.err.println("dupa2");
            
            prepStmt.setInt(1, id_towary);
            prepStmt.setInt(2, id_kategorie);
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
    		
    		PreparedStatement prepStmt = DbConnection.connect().prepareStatement("DELETE FROM towary_kategorie WHERE id = ?");
    		
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
