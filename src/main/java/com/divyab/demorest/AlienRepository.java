package com.divyab.demorest;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {
	
	List<Alien> aliens;
	
	public AlienRepository () {
		aliens = new ArrayList();
		
		Alien a1= new Alien();
		
		a1.setId(101);
		a1.setName("Divya");
		a1.setPoints(70);
		
		Alien a2= new Alien();
		
		a2.setId(102);
		a2.setName("Gayathr");
		a2.setPoints(80);
		
		
		aliens.add(a1);
		aliens.add(a2);
	}

	public List<Alien> getAliens() {
		return aliens;
	}
	
	
	
	public Alien getAlien(int id) {
		
		Alien a1 = null;
		for (Alien a :aliens) {
			if(a.getId() == id)
				return a;
		}
		return a1;
		
	}
	public Alien getAlienByName(String name) {
		
		Alien a1 = null;
		for (Alien a :aliens) {
			if(a.getName().equals(name))
				return a;
		}
		return a1;
		
	}

	public void createAlien(Alien a1) {
		// TODO Auto-generated method stub
		aliens.add(a1);
	}
	
	
}
