package main;

import javax.swing.SwingUtilities;

import model.appmodel.Application;

/** 
 * Main klasa softverskog alata queri. 
 * 
 * @author Grupa 1
 * @version 1.0
 */
public class MainClass {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new Application();
			}
		});
	}
}
