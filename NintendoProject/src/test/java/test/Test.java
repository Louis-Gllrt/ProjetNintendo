package test;

import java.util.ArrayList;
import java.util.List;

import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {

		Console gameCube = new Console("Game Cube");
		Console wii = new Console("Wii");
		Console snes = new Console("SNES");
		Console gameboy = new Console("Gameboy");
		
		List<Console> consoles = new ArrayList();
		
		consoles.add(gameCube);
		consoles.add(wii);
		consoles.add(snes);
		
		Jeu marioKart = new Jeu("Mario Kart", consoles);
		Jeu smashBros = new Jeu("Super Smash Bros", consoles);
		Jeu zelda = new Jeu("A Link to the past", consoles);
		Jeu donkeyKong = new Jeu("Donkey Kong 64", consoles);
		Jeu pokemon = new Jeu("Pokemon rouge et bleu", consoles);
		
	}

}
