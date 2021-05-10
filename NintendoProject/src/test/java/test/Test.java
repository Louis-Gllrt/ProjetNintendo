package test;

import java.util.ArrayList;
import java.util.List;

import metier.Adresse;
import metier.Boutique;
import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {

		Console gameCube = new Console("Game Cube");
		Console wii = new Console("Wii");
		Console snes = new Console("SNES");
		Console gameboy = new Console("Gameboy");

		Adresse adresseGamestop =new Adresse(420,"rue du swag","Old York");
		Adresse adresseMicromania =new Adresse(666,"rue du seum","Flavortown");
		
		List<Console> consoles = new ArrayList();
		List<Jeu> jeux = new ArrayList();
		List<Jeu> jeux2 = new ArrayList();
		
		Boutique gamestop = new Boutique("Gamestop",adresseGamestop,jeux);
		Boutique micromania = new Boutique("Micromania",adresseMicromania,jeux2);
		
		Jeu marioKart = new Jeu("Mario Kart", consoles,  gamestop);
		Jeu smashBros = new Jeu("Super Smash Bros", consoles,  gamestop);
		Jeu zelda = new Jeu("A Link to the past", consoles,micromania);
		Jeu donkeyKong = new Jeu("Donkey Kong 64", consoles,  gamestop);
		Jeu pokemon = new Jeu("Pokemon rouge et bleu", consoles,micromania);
		
		consoles.add(gameCube);
		consoles.add(wii);
		consoles.add(snes);
		
		jeux.add(pokemon);
		jeux.add(donkeyKong);
		jeux2.add(smashBros);
		jeux2.add(zelda);
		

		

	}

}
