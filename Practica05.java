package uabc.poo.andres.le.gresley.practica05;

/**
 *
 * @author Andres Le Gresley
 * 
 * Clase principal donde se instancia un objeto del juego y se comienza el mismo
 * 
 * 
 */
public class Practica05 {

    public static void main(String[] args) {
        /*FichaLogica ficha = new FichaLogica(5, 4);
        System.out.println(ficha.toString());
        ficha.rotateRight();
        System.out.println("");
        System.out.println(ficha.toString());
        System.out.println("");
        ficha.rotateLeft();
        System.out.println("");
        System.out.println(ficha.toString());
        System.out.println("");
        ficha.voltearFicha();
        System.out.println(ficha.toString());
        System.out.println("");
        ficha.voltearFicha();
        System.out.println(ficha.toString());
        
        TrifichaLogica trificha = new TrifichaLogica(5, 4, 3);
        
        System.out.println(trificha.toString());
        trificha.voltearFicha();
        System.out.println("");
        System.out.println(trificha.toString());
        System.out.println("");
        trificha.voltearFicha();
        System.out.println("");
        trificha.rotateLeft();
        System.out.println(trificha.toString());
        System.out.println("");
        trificha.rotateRight();
        System.out.println(trificha.toString());
        System.out.println("");
        System.out.println("");*/
        Tridomino tridomino = new Tridomino(6);
        
        tridomino.imprimirFichas();
        System.out.println("");
        tridomino.mezclarFichas();
        System.out.println("");
        tridomino.imprimirFichas();
    }
}
