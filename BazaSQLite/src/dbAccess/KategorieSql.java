package dbAccess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import records.Kategorie;

public class KategorieSql {

	public static List<Kategorie> selectAll() {
    	
    	Connection connection = DbConnection.connect();
    	
        List<Kategorie> kategorie = new LinkedList<Kategorie>();
        
        try {
            ResultSet result = connection.createStatement().executeQuery("SELECT * FROM kategorie");
            
            int id;
            String kategoria;
            
            while(result.next()) {
                id = result.getInt("id");
                kategoria = result.getString("kategoria");
                kategorie.add(new Kategorie(id, kategoria));
            }
            
            DbConnection.close();
            
        } catch (SQLException e) {
            return null;
        }
        return kategorie;
    }
    
    public static boolean insert(String kategoria) {
    	
        try {
        	System.err.println("dupa1");
        	
            PreparedStatement prepStmt = DbConnection.connect().prepareStatement(
                    "insert into kategorie values (NULL, ?);");
            
            System.err.println("dupa2");
            
            prepStmt.setString(1, kategoria);
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
    		
    		PreparedStatement prepStmt = DbConnection.connect().prepareStatement("DELETE FROM kategorie WHERE id = ?");
    		
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
