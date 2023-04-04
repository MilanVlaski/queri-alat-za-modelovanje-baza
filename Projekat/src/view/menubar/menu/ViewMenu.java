package view.menubar.menu;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

import view.Menu;
import view.MenuItem;
import view.menubar.DefaultMenuBar;
/**
* Prilagođeni View meni. 
* Nasljeđuje klasu Menu.
* 
* @see Menu
* @see DefaultMenuBar
* @author Grupa1
* @version 1.0
*/
public class ViewMenu extends Menu {

	private static final long serialVersionUID = -8787688311478510574L;
	private MenuItem zoomInMenuItem ;
	private MenuItem zoomOutMenuItem ;
	private MenuItem gridLines;
	private Menu scaleMenu;
	
	public ViewMenu() {
		
		setText("View");
 		setMnemonic(KeyEvent.VK_V);
 		
 		Toolkit toolkit = Toolkit.getDefaultToolkit();
 		
 		//konfiguracija pojedinacne stavke menija
 		zoomInMenuItem = new MenuItem("Zoom In");
 		Image zoomInIcon = toolkit.getImage("images/zoomIn.png").getScaledInstance(16, 16, Image.SCALE_AREA_AVERAGING);
 		zoomInMenuItem.setIcon(new ImageIcon(zoomInIcon));
 		zoomInMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F6,0));
 		add(zoomInMenuItem);
 		
 		zoomOutMenuItem = new MenuItem("Zoom Out");
 		Image zoomOutIcon = toolkit.getImage("images/zoomOut.png").getScaledInstance(16, 16, Image.SCALE_AREA_AVERAGING);
 		zoomOutMenuItem.setIcon(new ImageIcon(zoomOutIcon));
 		zoomOutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F7,0));
 		add(zoomOutMenuItem);
 		
 		gridLines = new MenuItem("Grid Lines");
 		Image gridLinesIcon = toolkit.getImage("images/gridIcon.png").getScaledInstance(16, 16, Image.SCALE_AREA_AVERAGING);
 		gridLines.setIcon(new ImageIcon(gridLinesIcon));
 		gridLines.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F8,0));
// 		gridLines.addActionListener(e->{})
 		add(gridLines);
 		
 		scaleMenu=new ScaleMenu();
 		Image scaleIcon = toolkit.getImage("images/scale.png").getScaledInstance(16, 16, Image.SCALE_AREA_AVERAGING);
 		scaleMenu.setIcon(new ImageIcon(scaleIcon));
 		add(scaleMenu);
 		
	}
}
