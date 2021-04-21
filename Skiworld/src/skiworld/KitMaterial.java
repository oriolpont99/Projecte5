
package skiworld;

import classes.Casc;
import classes.Roba;
import classes.Bota;
import classes.Esqui;
import classes.Kit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;
import java.util.Arrays;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class KitMaterial {
    public static void consultaresqui() {
                    Scanner teclat = new Scanner(System.in);
                    int i = 0;
                    Kit[] kit = new Kit[100]; 
                    try{
                        
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/skiworld2", "root", "");
                    //Class.forName("com.mysql.jdbc.Driver"); 
                    System.out.println("MOSTRANT TOTES LES RESERVES...");
                    System.out.println("========================================================================");
                    String query = "SELECT * FROM kits";
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(query);
//                        int i = 0;
//                        Kit[] kit = new Kit[100]; 
                        
                        
                        
                        while(rs.next()){

                            Kit obj2 = new Kit();
                            obj2.setId_Kit(rs.getInt("id_kit"));
                            obj2.setId_Esqui(rs.getInt("id_esqui"));
                            obj2.setId_Roba(rs.getInt("id_roba"));
                            obj2.setId(rs.getInt("id_bota"));
                            obj2.setId_Casc(rs.getInt("id_casc"));
                            obj2.setId_Total(rs.getInt("total"));
                            obj2.getId();
                            kit[i] = obj2;
                            //esquis[i] = esqui;
                            i++;
                            
                            
                         
                        }
                        
                    st.close();
                    

                    }
                    catch (SQLException e){
                        System.err.println("Got an exception! ");
                        e.printStackTrace();
                    }
                    //Scanner teclat = new Scanner(System.in);

                    //boolean sortir=false;
                    String opcio;
                    System.out.println("APRETA E PER FILTRAR PER ID D'ESQUI");
                    System.out.println("APRETA R PER FILTRAR PER ID DE ROBA");
                    System.out.println("APRETA C PER FILTRAR PER ID DE CASC");
                    System.out.println("APRETA B PER FILTRAR PER ID DE BOTA");
                    opcio=teclat.next();

                    switch (opcio.charAt(0)){

                                case 'E':
                                    System.out.println("ESCRIU EL ID DE'ESQUI");
                                    int x = 0;
                                    int valor = teclat.nextInt();
                                    //int kitMin=0 ;

                                    Kit kitMin;

                                    while (kit[x] != null) {
                                       if (kit[x].getId_Esqui() == valor) {
                                           System.out.println("Conte"+ kit[x].toString());
                                       }

                                        x++;
                                    }
                                    break;
                                case 'R':
                                    System.out.println("ESCRIU EL ID DE ROBA");
                                    int y = 0;
                                    int valor2 = teclat.nextInt();
                                    //int kitMin=0 ;

                                    Kit kitMin2;

                                    while (kit[y] != null) {
                                       if (kit[y].getId_Roba() == valor2) {
                                           System.out.println("Conte"+ kit[y].toString());
                                       }

                                        y++;
                                    }                                    
                                    break;
                                case 'C':
                                    System.out.println("ESCRIU EL ID DE CASC");
                                    int z = 0;
                                    int valor3 = teclat.nextInt();
                                    //int kitMin=0 ;

                                    Kit kitMin3;

                                    while (kit[z] != null) {
                                       if (kit[z].getId_Casc() == valor3) {
                                           System.out.println("Conte"+ kit[z].toString());
                                       }

                                        z++;
                                    }                                    
                                    break;
                                case 'B':
                                    System.out.println("ESCRIU EL ID DE BOTA");
                                    int b = 0;
                                    int valor4 = teclat.nextInt();
                                    //int kitMin=0 ;

                                    Kit kitMin4;

                                    while (kit[b] != null) {
                                       if (kit[b].getId() == valor4) {
                                           System.out.println("Conte"+ kit[b].toString());
                                       }

                                        b++;
                                    }                                    
                                    break;

                                default:
                                    System.out.println("FORMAT ERRONI");
                            }
                    
         
                 
                        

                    System.out.println("========================================================================");
                    System.out.println("APRETA RETURN/INTRO PER TORNAR AL MENU PRINCIPAL");
                    teclat.nextLine();
    }
}