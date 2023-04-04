/***********************************************************************
 * Module:  Subject.java
 * Author:  Yelja
 * Purpose: Defines the Interface Subject
 ***********************************************************************/

package observer;

/**
 * Interfejs koji se koristi za implementaciju dizajn šablona Observer.
 * Klase, koje implementiraju ovaj interfejs, mogu biti "posmatrane" od strane klasa koje implementiraju Observer šablon. 
 * Kada se desi neka promjena, ove klase notifikuju sve observere.
 * 
 * @Grupa 1
 * @version 1.0
 */


public interface Subject {
	/**Metoda koja notifikuje sve observere*/
   void notifyAllObservers();
	/**Metoda koja pretplaćuje pojedinačni observer*/
   void attachObserver(Observer observer);
   /**Metoda koja skida pojedinačni observer, poslije čega on neće dobijati obavještenja*/
   void detachObserver(Observer observer);

}