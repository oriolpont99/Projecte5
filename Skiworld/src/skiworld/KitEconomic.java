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

public class KitEconomic {
    public static void barat() {
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
                    
                    
                    
                    int x = 0;
                    int preuMin = 1000000;
                    //int kitMin=0 ;
                    
                    Kit kitMin = null;
                    
                    while (kit[x] != null) {
                       if (kit[x].getId_Total() < preuMin) {
                           preuMin = kit[x].getId_Total();
                           kitMin = kit[x];
                       }
         
                        x++;
                    }
                    
                    System.out.println("Kit més barat: "+ kitMin.toString());
                        

                    System.out.println("========================================================================");
                    System.out.println("APRETA RETURN/INTRO PER TORNAR AL MENU PRINCIPAL");
                    teclat.nextLine();
    }

}
