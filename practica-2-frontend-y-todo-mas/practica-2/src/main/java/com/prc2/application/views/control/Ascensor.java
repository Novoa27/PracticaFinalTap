package com.prc2.application.views.control;

public class Ascensor implements Cloneable {
	    private int id;
	    private String puertas;
	    private String estado;
	    private String ascensor;
	    private int planta;
	   
	    public Ascensor() {

	    }

	    public Ascensor(int id, String puertas, String estado, String ascensor, int planta) {
	        super();
	        this.id = id;
	        this.puertas = puertas;
	        this.estado = estado;
	        this.ascensor = ascensor;
	        this.planta = planta;
	        
	    }

	       
	    public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getPuertas() {
			return puertas;
		}

		public void setPuertas(String puertas) {
			this.puertas = puertas;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public int getPlanta() {
			return planta;
		}

		public void setPlanta(int planta) {
			this.planta = planta;
		}

		public String getAscensor() {
			return ascensor;
		}

		public void setAscensor(String ascensor) {
			this.ascensor = ascensor;
		}

		
	    
	}