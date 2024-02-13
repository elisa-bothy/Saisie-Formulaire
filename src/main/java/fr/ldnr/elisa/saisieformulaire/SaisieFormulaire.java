/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package fr.ldnr.elisa.saisieformulaire;

/**
 *
 * @author Elisa Bothy
 */
public class SaisieFormulaire {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Saisissez quelque chose :");
        String saisie = scan.next();
        System.out.println("saisie = " + saisie);
        saisie = scan.next();
        System.out.println("Et :" + saisie);
        Age(getInt(5,7));
    }
     public static void Age(int a){
        System.out.printf("Vous avez %d ans%n", a);
    }
     
    /**
     * Demande à l'utilisateur de faire la saisie d'un entier entre min et max
     * Redemande tant que la saisie n'est pas valide
     * 
     * @param min Valeur minimale acceptée
     * @param max Valeur maximale acceptée
     * @return valeur acceptable saisie
     */
    private static int getInt(int min, int max){
       java.util.Scanner scan = new java.util.Scanner(System.in);
       String saisie;
       int value =0;
       boolean isCorrect;
       do{
            System.out.println("Saisissez un nombre entre :" +min+" et " +max);
            //Saisie de la valeur
            try{
                saisie = scan.nextLine();
                value = Integer.parseInt(saisie);
                //validation valeur
                isCorrect = (value >= min) && (value <= max);
            }catch (NumberFormatException e){
                System.out.println("Valeur incorrecte. Recommencez");
                isCorrect = false;
            }
        }while(!isCorrect);
        return value;
    }
}

