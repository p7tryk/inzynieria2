package dbAccess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import records.AdresyDostawy;

public class AdresyDostawySql {

    public static List<AdresyDostawy> selectAll() {
    	
    	Connection connection = DbConnection.connect();
    	
        List<AdresyDostawy> adresy = new LinkedList<AdresyDostawy>();
        
        try {
            ResultSet result = connection.createStatement().executeQuery("SELECT * FROM adresy_dostawy");
            
            int id, id_zamowienia;
            String kraj, miejscowosc, ulica, mieszkanie, kod_pocztowy;
            
            while(result.next()) {
                id = result.getInt("id");
                id_zamowienia = result.getInt("id_zamowienia");
                kraj = result.getString("kraj");
                miejscowosc = result.getString("miejscowosc");
                ulica = result.getString("ulica");
                mieszkanie = result.getString("mieszkanie");
                kod_pocztowy = result.getString("kod_pocztowy");
                adresy.add(new AdresyDostawy(id, id_zamowienia, kraj, miejscowosc, ulica, mieszkanie, kod_pocztowy));
            }
            
            DbConnection.close();
            
        } catch (SQLException e) {
            return null;
        }
        return adresy;
    }
    
    public static boolean insert(int id_zamowienia, String kraj, String miejscowosc, String ulica, String mieszkanie, String kod_pocztowy) {
    	
        try {
        	System.err.println("dupa");
            PreparedStatement prepStmt = DbConnection.connect().prepareStatement(
                    "insert into adresy_dostawy values (NULL, ?, ?, ?, ?, ?, ?);");
            System.err.println("dupa");
            prepStmt.setInt(1, id_zamowienia);
            prepStmt.setString(2, kraj);
            prepStmt.setString(3, miejscowosc);
            prepStmt.setString(4, ulica);
            prepStmt.setString(5, mieszkanie);
            prepStmt.setString(6, kod_pocztowy);
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
    		
    		PreparedStatement prepStmt = DbConnection.connect().prepareStatement("DELETE FROM adresy_dostawy WHERE id = ?");
    		
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
