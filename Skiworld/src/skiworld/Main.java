package skiworld;

//import classes.Botes;
//import classes.Casc;
//import classes.Roba;
import classes.Esqui;
import java.util.Scanner;

public class Main {    
    
    static Scanner teclat = new Scanner (System.in);
    
    public static void main(String[] args) {
        //Esqui esqui = new Esqui(1,"defe", "2");
        //Casc casc = new Casc(1,"defe", "2");
        //Botes bota = new Botes(1,"defe", "2");
        //Roba roba = new Roba(1,"defe", "2");
        
        //System.out.println("Esqui" + esqui);
        //System.out.println("Casc" + casc);
        //System.out.println("Bota" + bota);
        //System.out.println("Roba:" + roba);
        
        int[] aInt = {11,22,33,44,55,66,77,88,99,100};
        
        int[] aInt2;
        
        aInt2 = aInt;
        
        aInt2[5] = 400000;
        
        System.out.println("aInt: " + aInt);
        System.out.println("aInt2: " + aInt2);
        
        double[] aDouble = {89.56, 55.67, 45.67, 8, 8, 100.11};
        
        boolean[] aBoolean;
        
        String[] aString = {"Hola", "que", "tal", "estas", "?"};
        
        char[] aChar = {'H','o','l','a','q','u','e','t','a','l','e','s','t','a','s','?'};
        
        //aInt = new int[10];
        
        Esqui[] aEsqui = new Esqui[4];
        
//        aEsqui[0] = new Esqui(0);
//        aEsqui[1] = new Esqui(1);
//        aEsqui[2] = new Esqui(2);
//        aEsqui[3] = new Esqui(3);
        
        for (int i = 0; i < aEsqui.length; i++){
        System.out.println("aEsqui: " + aEsqui[i]);
        }
//        
//        System.out.println("aInt: " + aInt);
//        System.out.println("longitud: " + aInt.length);
        //CALCULEM EL MINIM
        int minInt = aInt[0];
        
        //CALCULEM EL MAXIM
        int maxInt = aInt[0];
        
        //CALCULEM LA SUMA
        int sumaInt = 0;
        
        //CALCULEM EL PRODUCTE
        long prodInt = 1;
        
//        System.out.println("------------------- NORMAL ----------------------");
//        //NORMAL
//        for (int i = 0; i < aInt.length; i++){
//            System.out.print("aInt: " + aInt[i]);
//            
//            if (aInt[i] < minInt) minInt = aInt[i];
//            if (aInt[i] > maxInt) maxInt = aInt[i];
//            
//            sumaInt = sumaInt + aInt[i];
//            System.out.print(" Suma: " + sumaInt);
//            
//            prodInt = prodInt * aInt[i];
//            System.out.println(" Producte: " + prodInt);
//        }
//
//        System.out.println("----------------- PARELLS ------------------------");
//        //POSICIO PAR
//        for (int i = 0; i < aInt.length; i = i + 2){
//            System.out.print("aInt: " + aInt[i]);
//            
//            if (aInt[i] < minInt) minInt = aInt[i];
//            if (aInt[i] > maxInt) maxInt = aInt[i];
//            
//            sumaInt = sumaInt + aInt[i];
//            System.out.print(" Suma: " + sumaInt);
//            
//            prodInt = prodInt * aInt[i];
//            System.out.println(" Producte: " + prodInt);
//        }
//
//        System.out.println("---------------- IMAPRS -------------------------");
//        //POSICIO IMPAR
//        for (int i = 1; i < aInt.length; i = i + 2){
//            System.out.print("aInt: " + aInt[i]);
//            
//            if (aInt[i] < minInt) minInt = aInt[i];
//            if (aInt[i] > maxInt) maxInt = aInt[i];
//            
//            sumaInt = sumaInt + aInt[i];
//            System.out.print(" Suma: " + sumaInt);
//            
//            prodInt = prodInt * aInt[i];
//            System.out.println(" Producte: " + prodInt);
//        }
//
//        System.out.println("---------------- VEGADES -------------------------");
////        //CONTEM EL NUMERO DE VEGADES QUE APAREIX
//        System.out.println("Quin numero vols comptar?");
//        int num = teclat.nextInt();
//        
//        for (int i = 1; i < aInt.length; i = i + 2){
//            System.out.print("aInt: " + aInt[i]);
//            
//            if (aInt[i] < minInt) minInt = aInt[i];
//            if (aInt[i] > maxInt) maxInt = aInt[i];
//            
//            sumaInt = sumaInt + aInt[i];
//            System.out.print(" Suma: " + sumaInt);
//            
//            prodInt = prodInt * aInt[i];
//            System.out.println(" Producte: " + prodInt);
//        }
//
//        //VISUALITZAR CONTINGUT I POSICIO DE ARRAY
//        System.out.println("Quin numero vols comptar?");
//        double num = teclat.nextDouble();
//        int cont = 0;
//        
//        for (int i = 0; i < aDouble.length; i++){
//            System.out.print("aDouble: [" + i + "]:" + aDouble[i]);
//            if (num == aDouble[i]) cont++;
//            System.out.println(" Cont: " + cont);
//        }

        //AMB STRING
//        for (int i = 0; i < aString.length; i++){
//            System.out.println("aString: [" + i + "]: " + aString[i].toUpperCase());
//        }
//        
//        for (int i = aString.length - 1; i >= 0; i--){
//            System.out.println("aString: [" + i + "]: " + aString[i].toUpperCase());
//        }
        
        
//        System.out.println("---------------- MIN / MAX / SUMA -------------------------");
//        System.out.println("Minim: " + minInt);
//        System.out.println("Maxim: " + maxInt);
//        System.out.println("Suma: " + sumaInt);
    }  
}
