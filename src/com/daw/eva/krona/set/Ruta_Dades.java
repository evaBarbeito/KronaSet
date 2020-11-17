package com.daw.eva.krona.set;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashSet;

import Varies.Data;

public class Ruta_Dades implements Comparable<Ruta_Dades>{
	private int id;                             	//Clau primaria. Es crea automàticament pel sistema i és intocable.
	private String nom;
	private ArrayList<Integer> waypoints;       	//Conté una llista de a tots els waypoints que formen part de la ruta.
	private boolean actiu;                      	//TRUE si està activa.
	private LocalDateTime dataCreacio;
	private LocalDateTime dataAnulacio;              //Quan actiu passi a valdre FALSE.
	private LocalDateTime dataModificacio;
	private LinkedHashSet<Waypoint_Dades> setWaypointsA;
	private LinkedHashSet<Waypoint_Dades> setWaypointsB;
    
	
    
	public Ruta_Dades(int id, String nom, ArrayList<Integer> waypoints, boolean actiu, LocalDateTime dataCreacio,
			LocalDateTime dataAnulacio, LocalDateTime dataModificacio) {
		this.id = id;
		this.nom = nom;
		this.waypoints = waypoints;
		this.actiu = actiu;
		this.dataCreacio = dataCreacio;
		this.dataAnulacio = dataAnulacio;
		this.dataModificacio = dataModificacio;
		this.setWaypointsA = new LinkedHashSet<Waypoint_Dades>();
		this.setWaypointsB = new LinkedHashSet<Waypoint_Dades>();
	}
	
	

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public boolean isActiu() {
		return actiu;
	}

	public LocalDateTime getDataCreacio() {
		return dataCreacio;
	}

	public ArrayList<Integer> getWaypoints() {
		return waypoints;
	}



	@Override
    public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        
        return "RUTA " + id + ":" + 
                "\n   nom = " + nom +
                "\n   actiu = " + actiu +
                "\n   dataCreacio = " + Data.imprimirData(dataCreacio) +
                "\n   dataAnulacio = " + Data.imprimirData(dataAnulacio) +
                "\n   dataModificació = " + Data.imprimirData(dataModificacio) + 
                "\n   waypoints: = " + waypoints ;
    }



	@Override
	public int compareTo(Ruta_Dades o) {
		if (this.getWaypoints().equals(o.getWaypoints())) {
			return 0;
		} else {
			return o.getId() - this.getId();
		}
	}
    
}
