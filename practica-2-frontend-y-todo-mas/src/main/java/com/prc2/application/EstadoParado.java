package com.prc2.application;

import com.prc2.application.views.control.Ascensor;
import com.prc2.application.views.control.Piso;



public class EstadoParado implements Estado {
	
String nameEstado ="Parado";
	
	@Override
	public void requestAscensor(Ascensor a, Piso p){
		// TODO Auto-generated method stub
		
		
		
		int pisoAscensor = a.getPisoAscensor();
		
		if (p.getnumPiso() == pisoAscensor) {
			
			a.setEstado(new EstadoAbriendoPuerta());
			
		}
		else {
			a.setEstado(new EstadoMovimiento());
			a.setPisoAscensor(a.recorrerPisos(p));
			a.setEstado(new EstadoAbriendoPuerta());
				
		}
		
				
	}


	@Override
	public void abrirPuerta(Ascensor a) {
		// TODO Auto-generated method stub
		a.setEstado(new EstadoAbriendoPuerta());
	}

	@Override
	public void cerrarPuerta(Ascensor a) {
		// TODO Auto-generated method stub
				
	}
	
	@Override
	public void activarAlarma(Ascensor a) {
		// TODO Auto-generated method stub
		System.out.println("*SONIDO ALARMA*");
		
	}
	
	@Override
	public String getNameEstado() {
		// TODO Auto-generated method stub
		return nameEstado;
	}


}
