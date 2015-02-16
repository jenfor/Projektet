package Projektet;

import java.awt.Dimension;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class PanelSklett {
	private GameEngine engine;
	public Room center;
	public Room shop;
	public Room garden;
	public Room miniGame1;
	public Room miniGame2;
	
	public PanelSklett(GameEngine e)
	{
		engine = e;
		center = new Center();
		shop = new Shop();
		garden = new Garden();
		miniGame1 = new MiniGame();
	}
	
	private JPanel getInventoryPanel()
	{
		JPanel panel = createInventoryPanel();
		return panel;
		
	}
	
	private JPanel getPanel(String current)
	{
		JPanel panel = new JPanel();
		if(current.equals("Center")) panel = createCenterPanel();
		if(current.equals("Shop")) panel = createShopPanel();
		if(current.equals("Garden")) panel = createGardenPanel();
		else panel = createMiniGamePanel();
		
		return panel;
	}
	
	private JPanel createCenterPanel()
	{
    
	    JPanel panelClickable = new JPanel();
	    
	    panelClickable.setOpaque(false);
	    //panelClickable.setLayout(new GridLayout(4,4));
	    panelClickable.setLayout(null);
	    JButton clickButton = new JButton ("Skylt");
	    clickButton.setBounds(4,6,200,400);
	    clickButton.setContentAreaFilled(false);
	    //clickButton.setBorderPainted(false); //med eller utan kant
	    panelClickable.add(clickButton);
	    
	    JButton clickButton2 = new JButton ("Skylt2");
	    clickButton2.setBounds(300,400,200,200);
	    clickButton2.setContentAreaFilled(false);
	    //clickButton.setBorderPainted(false); //med eller utan kant
	    panelClickable.add(clickButton2);
	    
	   	    
	    return panelClickable;
    
    
	}
	
	private JPanel createShopPanel()
	{
		JPanel panelClickable = new JPanel();
		HashMap<int, String> shopItems =shop.getShopItems();
		
		panelClickable.setOpaque(false);
	    panelClickable.setLayout(null);
		
		return panelClickable;
	}
	
	private JPanel createGardenPanel()
	{
		JPanel panelClickable = new JPanel();
		
		
		panelClickable.setOpaque(false);
	    panelClickable.setLayout(null);
		
		return panelClickable;
		
	}
	
	private JPanel createMiniGamePanel()
	{
		JPanel panelClickable = new JPanel();
		
		panelClickable.setOpaque(false);
	    panelClickable.setLayout(null);
		
		return panelClickable;
		
	}
	
	private JPanel createInventoryPanel()
	{
		JPanel panelClickable = new JPanel();
		
		panelClickable.setOpaque(false);
	    panelClickable.setLayout(null);
		
		return panelClickable;
		
	}
	
	
}

