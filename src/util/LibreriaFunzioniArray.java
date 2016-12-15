/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author tss
 */
public class LibreriaFunzioniArray {

    private LibreriaFunzioniArray() {

    }

    /**
     * Ordinamento con bubblesort
     *
     * @param persone
     */
    //Metodo generico.
    //Comparable può contenere qualunque classe che gli passo perchè è un'estensione di object
    //Sto facendo un metodo generico
    public static void ordina(Comparable[] objects) {
        boolean disordinato;

        do {
            //Setto disordinato = false
            disordinato = false;
            //Avvio ciclo for con la lunghezza MENO uno poichè vogliamo che l'ultimo
            //Controllo sia valido.
            for (int i = 0; i < objects.length - 1; i++) {
                //Creo p[i]
                Comparable p = objects[i];
                //Creo p dove è il numero successivo
                Comparable pNext = objects[i + 1];

                //SE il numero è maggiore di zero allora scambio i due numeri
                //e faccio uscire disordinato = true
                if (p.compareTo(pNext) >= 0) {
                    //Scambio
                    objects[i] = pNext;
                    objects[i + 1] = p;
                    disordinato = true;
                }

            }

        } while (disordinato);

    }

    //Metodo generico per stampare
    public static void stampa(Object[] objects) {

        System.out.println("--------- INIZIO STAMPA ---------");

        //per tutte le persone nell'array persona: 
        for (Object obj : objects) {
            System.out.println(obj);
        }
        System.out.println("--------- FINE STAMPA ---------");
    }

    //Metodo cerca ; VOGLIAMO la posizione sull'array dell'oggetto
    //In input gli diamo l'array di riferimento e l'oggetto da cercare
    //Return -1 se non trovato altrimenti indice elemento
    public static int cerca(Object[] objects, Object item) {
        int result = -1;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].equals(item)) {
                result = i;
                break;
            }
        }
        return result;
    }
    
    //Metodo per cercare. si riutilizza il metodo cerca.
    public static boolean contiene (Object[] objects, Object item){
        //Si usa il metodo cerca e ci permette di avere in uscita un numero.
        //SE IL NUMERO è uguale a -1 allora l'output sarà FALSE
        //SE il numero è DIVERSO da -1 avremo TRUE
        return cerca(objects , item) != -1;
    }
    
    
    
    
    
}