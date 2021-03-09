package dbAccess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import records.Zamowienia;

public class ZamowieniaSql {

	public static List<Zamowienia> selectAll() {
    	
    	Connection connection = DbConnection.connect();
    	
        List<Zamowienia> zamowienia = new LinkedList<Zamowienia>();
        
        try {
            ResultSet result = connection.createStatement().executeQuery("SELECT * FROM zamowienia");
            
            int id, cena_dostawy, darmowy_zwrot, numer_faktury, id_klienci, id_pracownicy;
            String data_zamowienia, status;
            
            while(result.next()) {
                id = result.getInt("id");
                cena_dostawy = result.getInt("cena_dostawy");
                data_zamowienia = result.getString("data_zamowienia");
                status = result.getString("status");
                darmowy_zwrot = result.getInt("darmowy_zwrot");
                numer_faktury = result.getInt("numer_faktury");
                id_klienci = result.getInt("id_klienci");
                id_pracownicy = result.getInt("id_pracownicy");
                zamowienia.add(new Zamowienia(id, cena_dostawy, data_zamowienia, status, darmowy_zwrot, numer_faktury, id_klienci, id_pracownicy));
            }
            
            DbConnection.close();
            
        } catch (SQLException e) {
            return null;
        }
        return zamowienia;
    }
    
    public static boolean insert(int cena_dostawy, String data_zamowienia, String status, int darmowy_zwrot,
			int numer_faktury, int id_klienci, int id_pracownicy) {
    	
        try {
        	System.err.println("dupa1");
        	
            PreparedStatement prepStmt = DbConnection.connect().prepareStatement(
                    "insert into zamowienia values (NULL, ?, ?, ?, ?, ?, ?, ?);");
            
            System.err.println("dupa2");
            
            prepStmt.setInt(1, cena_dostawy);
            prepStmt.setString(2, data_zamowienia);
            prepStmt.setString(3, status);
            prepStmt.setInt(4, darmowy_zwrot);
            prepStmt.setInt(5, numer_faktury);
            prepStmt.setInt(6, id_klienci);
            prepStmt.setInt(7, id_pracownicy);
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
    		
    		PreparedStatement prepStmt = DbConnection.connect().prepareStatement("DELETE FROM zamowienia WHERE id = ?");
    		
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
