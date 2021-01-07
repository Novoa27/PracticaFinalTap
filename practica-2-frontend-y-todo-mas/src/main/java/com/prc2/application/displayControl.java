package com.prc2.application;

import com.prc2.application.views.control.Ascensor;

public class displayControl implements Observer { //piso y estado 
	
	 	String nameEstado; 
	    int pisoSal; 
	    
	    
	    public displayControl(Ascensor s) {
	    	//update (s.getPisoAscensor());
	    	this.pisoSal = 0; 
	    	String estadoinicial = "Parado";
	    	//updateEstado (estadoinicial);
	    	this.nameEstado = "parado"; 
	    }

	    public void imprimirPiso(int piso) {
	        // TODO Auto-generated method stub

	        this.pisoSal = piso; 
	        System.out.println("Display Control: Piso  " + this.pisoSal);

	    }

	    public void imprimirEstado(String s) {
	        // TODO Auto-generated method stub

	        this.nameEstado = s; 
	        System.out.println("Display Control: Estado " + this.nameEstado);

	    }


	    @Override
	    public void update(int piso) {
	        this.imprimirPiso(piso);
	    }


	    @Override
	    public void updateEstado(String s) {
	        // TODO Auto-generated method stub
	        this.imprimirEstado(s);

	    }
		

	
	

}
