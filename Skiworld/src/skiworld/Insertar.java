package skiworld;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
        
public class Insertar {
            
        public static void esquis() {
                Scanner teclat = new Scanner(System.in);
                //String opcio;
                
                String query = "INSERT INTO esquis (marca, preu, imatge) VALUES (?, ?, ?)";
                PreparedStatement st = null;
                System.out.println("Escriu la marca:");
                try {
                  //opcio = teclat.next();
                  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/skiworld2", "root", "");
                  st = conn.prepareStatement(query);
                  st.setString(1, teclat.nextLine());
                  System.out.println("Escriu el preu:");
                  st.setString(2, teclat.nextLine());
                  System.out.println("Escriu el directori de la imatge:");
                  st.setString(3, teclat.nextLine());
                  
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
        public static void botes() {
                Scanner teclat = new Scanner(System.in);
                //String opcio;
                
                String query = "INSERT INTO botes (marca, preu, imatge) VALUES (?, ?, ?)";
                PreparedStatement st = null;
                System.out.println("Escriu la marca:");
                try {
                  //opcio = teclat.next();
                  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/skiworld2", "root", "");
                  st = conn.prepareStatement(query);
                  st.setString(1, teclat.nextLine());
                  System.out.println("Escriu el preu:");
                  st.setString(2, teclat.nextLine());
                  System.out.println("Escriu el directori de la imatge:");
                  st.setString(3, teclat.nextLine());
                  
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
        public static void roba() {
                Scanner teclat = new Scanner(System.in);
                //String opcio;
                
                String query = "INSERT INTO roba (marca, preu, imatge) VALUES (?, ?, ?)";
                PreparedStatement st = null;
                System.out.println("Escriu la marca:");
                try {
                  //opcio = teclat.next();
                  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/skiworld2", "root", "");
                  st = conn.prepareStatement(query);
                  st.setString(1, teclat.nextLine());
                  System.out.println("Escriu el preu:");
                  st.setString(2, teclat.nextLine());
                  System.out.println("Escriu el directori de la imatge:");
                  st.setString(3, teclat.nextLine());
                  
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
        public static void cascs() {
                Scanner teclat = new Scanner(System.in);
                //String opcio;
                
                String query = "INSERT INTO cascs (marca, preu, imatge) VALUES (?, ?, ?)";
                PreparedStatement st = null;
                System.out.println("Escriu la marca:");
                try {
                  //opcio = teclat.next();
                  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/skiworld2", "root", "");
                  st = conn.prepareStatement(query);
                  st.setString(1, teclat.nextLine());
                  System.out.println("Escriu el preu:");
                  st.setString(2, teclat.nextLine());
                  System.out.println("Escriu el directori de la imatge:");
                  st.setString(3, teclat.nextLine());
                  
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
