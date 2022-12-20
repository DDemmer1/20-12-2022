package de.demmer.dennis.pokemon;

import de.demmer.dennis.Drawable;

public class Glumanda extends Pokemon implements Drawable {

	
	@Override
	public String getImgUrl() {
		return "img/glumanda.png";
	}

	
	
	@Override
	public void getInfo() {
		System.out.println("Das ist ein Glumanda");
	}
	
	
}
