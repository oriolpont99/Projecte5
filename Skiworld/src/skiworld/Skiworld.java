package skiworld;

import java.util.Scanner;

public class Skiworld {
    
    static Scanner teclat = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        Scanner teclat = new Scanner(System.in);

        boolean sortir=false;
        String opcio;
        
        while (!sortir) {
        System.out.println("=========================== MENU PRINCIPAL =============================");   
        System.out.println("||                              *                                     ||");
        System.out.println("||                              XX                                    ||");
        System.out.println("||                            MMMMM                                   ||");
        System.out.println("||                            //(00                                   ||");
        System.out.println("||                           .:.....                                  ||");
        System.out.println("||                         .:::::::::                                 ||");
        System.out.println("||                        :: %%%%%% ::.                               ||");
        System.out.println("||                        ::  ::::::  :::::::I)                       ||");
        System.out.println("||                        (%  ::::::         |                        ||");
        System.out.println("||                        /   |   /_____     |                        ||");
        System.out.println("||                       /    |         ))   |                        ||");
        System.out.println("||                      /      ------/ //    |                        ||");
        System.out.println("||                     /            / //     |                        ||");
        System.out.println("||                    /            / //      |                        ||");
        System.out.println("||                   *            ZZZZ       *                        ||");
        System.out.println("||                      _________ZZZZZZ_________//_//                 ||");
        System.out.println("||                ------------------------------------                ||");
        System.out.println("||                                                                    ||");
        System.out.println("||                      1. REGISTRAR MATERIAL                         ||");
        System.out.println("||                      2. CREAR KITS                                 ||");
        System.out.println("||                      3. MOSTRAR KIT ECONOMIC                       ||");
        System.out.println("||                      4. MOSTRAR KIT SEGONS MATERIAL                ||");
        System.out.println("||                      5. MOSTRAR TOTS ELS KITS                      ||");
        System.out.println("||                                                                    ||");
        System.out.println("========================================================================");

        opcio=teclat.next();

        switch (opcio.charAt(0)){

                    case '1':
                        System.out.println("ACCEDINT A MATERIAL");
                        System.out.println("SELECCIONA UNA OPCIO DE MATERIAL");
                        while (!sortir) {
                            System.out.println("===============================================");
                            System.out.println("||                                           ||");
                            System.out.println("||               1. ESQUIS                   ||"); 
                            System.out.println("||               2. BOTES                    ||");
                            System.out.println("||               3. ROBA                     ||");
                            System.out.println("||               4. CASCS                    ||");
                            System.out.println("||                                           ||");
                            System.out.println("===============================================");
                            
                            opcio=teclat.next();
                                switch (opcio.charAt(0)){
                                    case '1':
                                        Insertar.esquis();
                                        break;
                                    case '2':
                                        Insertar.botes();
                                        break;
                                    case '3':
                                        Insertar.roba();
                                        break;
                                    case '4':
                                        Insertar.cascs();
                                        break;
                                }
                            }
                        break;
                    case '2':
                        CrearKit.mostrar();
                        break;
                    case '3':
                        KitEconomic.barat();
                        break;
                    case '4':
                        KitMaterial.consultaresqui();
                        break;
                    case '5':
                        ConsultarKits.consultartot();
                        break;

                    default:
                        System.out.println("FORMAT ERRONI");
                }

        }

    }
    
}
