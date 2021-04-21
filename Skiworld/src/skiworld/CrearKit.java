/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skiworld;

import java.util.Random;
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

public class CrearKit {
    
    public static void mostrar(){
        Scanner teclat = new Scanner(System.in);
        int i = 0;

        Kit[] kit = new Kit[6];

        System.out.println("");
        System.out.println("                  LLISTAT DE PRODUCTES DISPONIBLES");
        System.out.println("");
        System.out.println("=============================================================================");
        Consultar.roba();
        System.out.println("=============================================================================");
        Consultar.bota();
        System.out.println("=============================================================================");
        Consultar.esqui();
        System.out.println("=============================================================================");
        Consultar.casc();
        System.out.println("=============================================================================");
        System.out.println("");
        InsertarKits.esquis();
        System.out.println("APRETA RETURN PER CONFIRMAR LA RESERVA");
        teclat.nextLine();
        //Kit obj5 = new Kit();
        ConsultarKits.consultartot();
        
    }
    
}
