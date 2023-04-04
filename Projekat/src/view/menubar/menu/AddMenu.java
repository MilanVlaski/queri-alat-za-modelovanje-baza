package view.menubar.menu;


import java.awt.event.KeyEvent;




import view.Menu;
import view.MenuItem;

/**
* Prilagođeni podmeni za dodavanje novog objekta.
* Nasljeđuje klasu Menu.
* 
* @see Menu
* @see ObjectMenu
* @author Grupa1
* @version 1.0
*/
public class AddMenu extends Menu {

	private static final long serialVersionUID = -1104428152483378378L;
	
	MenuItem entityMenuItem;
	MenuItem relationshipMenuItem  ;
	MenuItem associativeEntityMenuItem  ;
	MenuItem associationLinkItem ;
	MenuItem inheritanceNodeMenuItem  ;
	MenuItem inheritanceLinkItem ;
	
	
	public AddMenu() {
		//postavljanje osnovnih parametara
		setText("Add object...");
		setMnemonic(KeyEvent.VK_A);
		
	//	Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		//konfiguracija pojedinacne stavke menija
		entityMenuItem = new MenuItem("Entity");
		//Image entityIcon = toolkit.getImage("icons/data-model-icon.png");
		//entityIcon=entityIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH); 
		//entityMenuItem.setIcon(new ImageIcon(entityIcon));
		entityMenuItem.setMnemonic(KeyEvent.VK_E);
		add(entityMenuItem);
		
		relationshipMenuItem = new MenuItem("Relationship");
		//dodati simbol 
		//Image relationshipIcon = toolkit.getImage("icons/folder_opened_icon.png");
		//relationshipIcon=relationshipIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH); 
		//relationshipMenuItem.setIcon(new ImageIcon(relationshipIcon));
		relationshipMenuItem.setMnemonic(KeyEvent.VK_R);
		add(relationshipMenuItem);
		
		associativeEntityMenuItem = new MenuItem("Associative Entity");
		//dodati simbol 
		//Image associativeEntityIcon = toolkit.getImage("icons/data-model-icon.png");
		//associativeEntityIcon=associativeEntityIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH); 
		//associativeEntityMenuItem.setIcon(new ImageIcon(associativeEntityIcon));
		associativeEntityMenuItem.setMnemonic(KeyEvent.VK_A);
		add(associativeEntityMenuItem);
		
		associationLinkItem = new MenuItem("Association Link");
		//dodati simbol 
		//Image associationLinkIcon = toolkit.getImage("icons/folder_opened_icon.png");
		//associationLinkIcon=associationLinkIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH); 
		//associationLinkItem.setIcon(new ImageIcon(associationLinkIcon));
		associationLinkItem.setMnemonic(KeyEvent.VK_A);
		add(associationLinkItem);
		
		inheritanceNodeMenuItem = new MenuItem("Inheritance Node");
		//dodati simbol 
		//Image inheritanceNodeIcon = toolkit.getImage("icons/data-model-icon.png");
		//inheritanceNodeIcon=inheritanceNodeIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH); 
		//inheritanceNodeMenuItem.setIcon(new ImageIcon(inheritanceNodeIcon));
		inheritanceNodeMenuItem.setMnemonic(KeyEvent.VK_I);
		add(inheritanceNodeMenuItem);
		
		inheritanceLinkItem = new MenuItem("Inheritance Link");
		//dodati simbol 
		//Image inheritanceLinkIcon = toolkit.getImage("icons/folder_opened_icon.png");
		//inheritanceLinkIcon=inheritanceLinkIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH); 
		//inheritanceLinkItem.setIcon(new ImageIcon(inheritanceLinkIcon));
		inheritanceLinkItem.setMnemonic(KeyEvent.VK_I);
		add(inheritanceLinkItem);

	
	}

}
