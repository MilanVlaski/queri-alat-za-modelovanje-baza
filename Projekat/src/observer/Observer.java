/***********************************************************************
 * Module:  Observer.java
 * Author:  Yelja
 * Purpose: Defines the Interface Observer
 ***********************************************************************/

package observer;



/**
 * Interfejs koji se koristi za implementaciju dizajn šablona Observer.
 * Klase, koje implementiraju ovaj interfejs, se pretplaćuju da bi mogle biti notifikovane nakon promjene na modelu podataka.
 * 
 * @Grupa 1
 * @version 1.0
 */
public interface Observer {
	
	/** Metoda koja se posebno predefiniše u svakoj klasi koja implementira ovaj interfejs. Poziva se kada neka Subject klasa pozove notify metodu.*/
   void update();

}