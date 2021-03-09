package dbAccess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import records.TowaryOferta;

public class TowaryOfertaSql {

	public static List<TowaryOferta> selectAll() {
    	
    	Connection connection = DbConnection.connect();
    	
        List<TowaryOferta> towaryOferta = new LinkedList<TowaryOferta>();
        
        try {
            ResultSet result = connection.createStatement().executeQuery("SELECT * FROM towary_oferta");
            
            int id, ilosc_dostepnych, cena, promocja_cena, promocja_ilosc, id_towary;
            String promocja_poczatek, promocja_koniec;
            
            while(result.next()) {
                id = result.getInt("id");
                ilosc_dostepnych = result.getInt("ilosc_dostepnych");
                cena = result.getInt("cena");
                promocja_cena = result.getInt("promocja_cena");
                promocja_ilosc = result.getInt("promocja_ilosc");
                promocja_poczatek = result.getString("promocja_poczatek");
                promocja_koniec = result.getString("promocja_koniec");
                id_towary = result.getInt("id_towary");
                towaryOferta.add(new TowaryOferta(id, ilosc_dostepnych, cena, promocja_cena, promocja_ilosc, promocja_poczatek, promocja_koniec, id_towary));
            }
            
            DbConnection.close();
            
        } catch (SQLException e) {
            return null;
        }
        return towaryOferta;
    }
    
    public static boolean insert(int ilosc_dostepnych, int cena, int promocja_cena, int promocja_ilosc,
			String promocja_poczatek, String promocja_koniec, int id_towary) {
    	
        try {
        	
            PreparedStatement prepStmt = DbConnection.connect().prepareStatement(
                    "insert into towary_oferta values (NULL, ?, ?, ?, ?, ?, ?, ?);"); 
            
            prepStmt.setInt(1, ilosc_dostepnych);
            prepStmt.setInt(2, cena);
            prepStmt.setInt(3, promocja_cena);
            prepStmt.setInt(4, promocja_ilosc);
            prepStmt.setString(5, promocja_poczatek);
            prepStmt.setString(6, promocja_koniec);
            prepStmt.setInt(8, id_towary);
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
    		
    		PreparedStatement prepStmt = DbConnection.connect().prepareStatement("DELETE FROM towary_oferta WHERE id = ?");
    		
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
