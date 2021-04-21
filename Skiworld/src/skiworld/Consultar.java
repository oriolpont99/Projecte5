
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

public class Consultar {
             
            public static void esqui(){
                    try{
                        
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/skiworld2", "root", "");
                    //Class.forName("com.mysql.jdbc.Driver"); 
                    System.out.println("MOSTRANT TOTS ELS ESQUIS...");  
                    System.out.println("=============================================================================");
                    String query = "SELECT * FROM esquis";
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(query);
                        int i = 0;
                        
                        Esqui[] esqui = new Esqui[100]; 
                        
                        
                        
                        while(rs.next()){

                            Esqui obj1 = new Esqui();
                            obj1.setId(rs.getInt("id_esqui"));
                            obj1.setMarca(rs.getString("marca"));
                            obj1.setPreu(rs.getString("preu"));
                            obj1.getId();
                            esqui[i] = obj1;
                            //esquis[i] = esqui;
                            i++;
                            //System.out.println(obj1.getId());
                            //System.out.println(rs.getInt("id_esqui"));
                            System.out.println(obj1);
                            
                        }
                        
                    st.close();


                    }
                    catch (SQLException e){
                        System.err.println("Got an exception! ");
                        e.printStackTrace();
                    }
            }
            
            public static void roba(){
                    try{
                        
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/skiworld2", "root", "");
                    //Class.forName("com.mysql.jdbc.Driver"); 
                    System.out.println("MOSTRANT TOTA LA ROBA...");
                    System.out.println("=============================================================================");
                    String query = "SELECT * FROM roba";
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(query);
                        int i = 0;
                        
                        Roba[] roba = new Roba[100]; 
                        
                        
                        
                        while(rs.next()){

                            Roba obj2 = new Roba();
                            obj2.setId(rs.getInt("id_roba"));
                            obj2.setMarca(rs.getString("marca"));
                            obj2.setPreu(rs.getString("preu"));
                            obj2.getId();
                            roba[i] = obj2;
                            //esquis[i] = esqui;
                            i++;
                            //System.out.println(obj1.getId());
                            //System.out.println(rs.getInt("id_esqui"));
                            System.out.println(obj2);
                            
                        }
                        
                    st.close();


                    }
                    catch (SQLException e){
                        System.err.println("Got an exception! ");
                        e.printStackTrace();
                    }
            }
            
            public static void bota(){
                    try{
                        
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/skiworld2", "root", "");
                    //Class.forName("com.mysql.jdbc.Driver"); 
                    System.out.println("MOSTRANT TOTES LES BOTES...");
                    System.out.println("=============================================================================");
                    String query = "SELECT * FROM botes";
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(query);
                        int i = 0;
                        
                        Bota[] bota = new Bota[100]; 
                        
                        
                        
                        while(rs.next()){

                            Bota obj3 = new Bota();
                            obj3.setId(rs.getInt("id_bota"));
                            obj3.setMarca(rs.getString("marca"));
                            obj3.setPreu(rs.getString("preu"));
                            obj3.getId();
                            bota[i] = obj3;
                            //esquis[i] = esqui;
                            i++;
                            //System.out.println(obj1.getId());
                            //System.out.println(rs.getInt("id_esqui"));
                            System.out.println(obj3);
                            
                        }
                        
                    st.close();


                    }
                    catch (SQLException e){
                        System.err.println("Got an exception! ");
                        e.printStackTrace();
                    }
            }
            
            public static void casc(){
                    try{
                        
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/skiworld2", "root", "");
                    //Class.forName("com.mysql.jdbc.Driver"); 
                    System.out.println("MOSTRANT TOTS ELS CASCS...");
                    System.out.println("=============================================================================");
                    String query = "SELECT * FROM cascs";
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(query);
                        int i = 0;
                        
                        Casc[] casc = new Casc[100]; 
                        
                        
                        
                        while(rs.next()){

                            Casc obj4 = new Casc();
                            obj4.setId(rs.getInt("id_casc"));
                            obj4.setMarca(rs.getString("marca"));
                            obj4.setPreu(rs.getString("preu"));
                            obj4.getId();
                            casc[i] = obj4;
                            //esquis[i] = esqui;
                            i++;
                            //System.out.println(obj1.getId());
                            //System.out.println(rs.getInt("id_esqui"));
                            System.out.println(obj4);
                            
                        }
                        
                    st.close();


                    }
                    catch (SQLException e){
                        System.err.println("Got an exception! ");
                        e.printStackTrace();
                    }
            }
   
}