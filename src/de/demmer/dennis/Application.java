package de.demmer.dennis;

import de.demmer.dennis.pokemon.Glumanda;

public class Application {

	public static void main(String[] args) {
		
		Glumanda glumanda = new Glumanda();
		Pokeball pokeball = new Pokeball();
		
		Renderer renderer = new Renderer();
		
		renderer.render(pokeball);
		renderer.render(glumanda);
		

	}

}
