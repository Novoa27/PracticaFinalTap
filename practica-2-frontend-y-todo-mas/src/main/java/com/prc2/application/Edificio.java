package com.prc2.application;

import java.util.ArrayList;

import com.prc2.application.views.control.Ascensor;
import com.prc2.application.views.control.Piso;



public class Edificio {
	
	private static Edificio singleton;
	private ArrayList<Ascensor> ascensores;
	private ArrayList<Piso> pisos;
	
	private int x;
	//private ArrayList<Coche> coches;

	private Edificio() {
		
		ascensores = new ArrayList<Ascensor>();
		pisos = new ArrayList<Piso>();
				
				
		Ascensor a1 = new Ascensor();
		Ascensor a2 = new Ascensor();
		Ascensor a3 = new Ascensor();
		this.ascensores.add(a1);
		this.ascensores.add(a2);
		this.ascensores.add(a3);
		
		Piso p0 = new Piso(0);
		Piso p1 = new Piso(1);
		Piso p2 = new Piso(2);
		Piso p3 = new Piso(3);
		Piso p4 = new Piso(4);
		Piso p5 = new Piso(5);
		Piso p6 = new Piso(6);
		this.pisos.add(p0);	
		this.pisos.add(p1);	
		this.pisos.add(p2);	
		this.pisos.add(p3);	
		this.pisos.add(p4);	
		this.pisos.add(p5);	
		this.pisos.add(p6);	
		
	}
	
	public static Edificio getInstance() {
		if(singleton == null)
			singleton = new Edificio();
		
		return singleton;
	}

	public Ascensor getAscensor(int i) {
		return ascensores.get(i);
	}
	
	public Piso getPiso(int i) {
		return pisos.get(i);
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	

}
