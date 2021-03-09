package dbAccess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import records.Towary;

public class TowarySql {

	public static List<Towary> selectAll() {
    	
    	Connection connection = DbConnection.connect();
    	
        List<Towary> towary = new LinkedList<Towary>();
        
        try {
            ResultSet result = connection.createStatement().executeQuery("SELECT * FROM towary");
            
            int id, ilosc_sprzedanych;
            String producent, opis, galeria_zdjec;
            
            while(result.next()) {
                id = result.getInt("id");
                producent = result.getString("producent");
                opis = result.getString("opis");
                galeria_zdjec = result.getString("galeria_zdjec");
                ilosc_sprzedanych = result.getInt("ilosc_sprzedanych");
                towary.add(new Towary(id, producent, opis, galeria_zdjec, ilosc_sprzedanych));
            }
            
            DbConnection.close();
            
        } catch (SQLException e) {
            return null;
        }
        return towary;
    }
    
    public static boolean insert(String producent, String opis, String galeria_zdjec, int ilosc_sprzedanych) {
    	
        try {

            PreparedStatement prepStmt = DbConnection.connect().prepareStatement(
                    "insert into towary values (NULL, ?, ?, ?, ?);");
            
            prepStmt.setString(1, producent);
            prepStmt.setString(2, opis);
            prepStmt.setString(3, galeria_zdjec);
            prepStmt.setInt(4, ilosc_sprzedanych);
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
    		
    		PreparedStatement prepStmt = DbConnection.connect().prepareStatement("DELETE FROM towary WHERE id = ?");
    		
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
