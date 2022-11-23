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
public class DemonsController { 
	private Demons model;
	private DemonsView view; 
	public DemonsController(Demons model, DemonsView view){ 
		this.model = model; 
		this.view = view; 
	} 
	public void setDemonsName(String name){ 
		model.setName(name); 
	} 
	public String getDemonsName(){ 
		return model.getName(); 
	} 
	public void setDemonsPangkat(String pangkat){ 
		model.setPangkat(pangkat); 
	} 
	public String getDemonsPangkat(){ 
		return model.getPangkat(); 
	} 
	public void updateView(){ 
		view.printDemonsDetails(model.getName(), model.getPangkat()); 
	} 
}

