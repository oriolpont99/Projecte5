package skiworld;

import java.util.Random;
import classes.Bota;
import classes.Casc;
import classes.Esqui;
import classes.Roba;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
        
public class InsertarKits {
            
        public static void esquis() {
                Scanner teclat = new Scanner(System.in);
                //String opcio;
                
                String query = "INSERT INTO kits (id_esqui, id_bota, id_roba, id_casc, total) VALUES (?, ?, ?, ?, ?)";
                //String query2 = "SELECT * FROM esquis, cascs, roba, botes";
                PreparedStatement st = null;
                System.out.println("QUIN ESQUI VOLS LLOGAR?");
                System.out.println("Escriu ID de esqui:");
                try {
                  //opcio = teclat.next();
                  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/skiworld2", "root", "");
                  st = conn.prepareStatement(query);
                  st.setString(1, teclat.nextLine());
                  System.out.println("QUINES BOTES VOLS LLOGAR?");
                  System.out.println("Escriu ID de bota:");
                  st.setString(2, teclat.nextLine());
                  System.out.println("QUINA ROBA VOLS LLOGAR?");
                  System.out.println("Escriu ID de roba:");
                  st.setString(3, teclat.nextLine());
                  System.out.println("QUIN CASC VOLS LLOGAR?");
                  System.out.println("Escriu ID de casc:");
                  st.setString(4, teclat.nextLine());
                  st.setString(5, teclat.nextLine());
                           
                  st.executeUpdate();
                } catch (SQLException e) {
                  //sqle.printStackTrace();
                  System.out.println(e);
                } finally {
                  //Nos aseguramos de cerrar los recursos abiertos
                  if (st != null)
                    try {
                      st.close();
                    } catch (SQLException e) {
                      //e.printStackTrace();
                    }
                }
               
        }

}
