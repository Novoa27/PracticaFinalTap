package com.prc2.application;

import com.prc2.application.views.control.Ascensor;
import com.prc2.application.views.control.Piso;





public class EstadoAbriendoPuerta implements Estado{

String nameEstado ="Abriendo puerta";
	
	public String getNameEstado() {
		// TODO Auto-generated method stub
		return nameEstado;
		
	}

	@Override
	public void requestAscensor(Ascensor a, Piso p){

		// TODO Auto-generated method stub
		a.setEstado(new EstadoCerrandoPuerta());
		a.setEstado(new EstadoMovimiento());
		a.setPisoAscensor(a.recorrerPisos(p));		
		a.setEstado(new EstadoAbriendoPuerta());
		a.setEstado(new EstadoCerrandoPuerta());
		a.setEstado(new EstadoParado());
				
	}

	@Override
	public void abrirPuerta(Ascensor a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cerrarPuerta(Ascensor a) {
		// TODO Auto-generated method stub
		a.setEstado(new EstadoCerrandoPuerta());
		
	}

	@Override
	public void activarAlarma(Ascensor a) {
		// TODO Auto-generated method stub
		System.out.println("*SONIDO ALARMA*");
		
	}


}

