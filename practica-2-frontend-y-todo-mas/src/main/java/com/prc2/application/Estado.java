package com.prc2.application;

import com.prc2.application.views.control.Ascensor;
import com.prc2.application.views.control.Piso;





public interface Estado {
	
	void requestAscensor(Ascensor a, Piso p);
	void abrirPuerta(Ascensor a);
	void cerrarPuerta(Ascensor a);
	void activarAlarma (Ascensor a);
	String getNameEstado();
}
