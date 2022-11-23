/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_mi202;

/**
 *
 * @author ASUS
 */
   

public class MVCPatternDemo { 
	public static void main(String[] args) { 
            
	Demons model = retriveDemonsFromDatabase(); 
	
	//Create a view : to write student details on console 
	DemonsView view = new DemonsView(); 
	DemonsController controller = new DemonsController(model, view); 	
        controller.updateView(); 

	//update model data 
	controller.setDemonsName("Kokushibo (黒こく死し牟ぼう)"); 
	controller.updateView(); 
	} 

	private static Demons retriveDemonsFromDatabase(){ 
	Demons demons = new Demons(); 
	demons.setName("Doma ( 童 ( どう ) 磨 ( ま )"); 
	demons.setPangkat("Upper Moon 1"); 
	return demons; 
	} 
}

