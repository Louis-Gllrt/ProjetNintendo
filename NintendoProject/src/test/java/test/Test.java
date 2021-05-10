package test;

import java.util.ArrayList;
import java.util.List;

import metier.Achat;
import metier.Adresse;
import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {

		Console gameCube = new Console("Game Cube",200,"2010-05-12");
		Console wii = new Console("Wii",2000,"2010-05-12");
		Console snes = new Console("SNES",200,"2010-05-12");
		Console gameboy = new Console("Gameboy",200,"2010-05-12");

		Adresse adresseGamestop =new Adresse(420,"rue du swag","Old York");
		Adresse adresseMicromania =new Adresse(666,"rue du seum","Flavortown");
		
		List<Console> consoles = new ArrayList();
		List<Jeu> jeux = new ArrayList();
		List<Jeu> jeux2 = new ArrayList();
		List<Achat> achats = new ArrayList();
		
		Boutique gamestop = new Boutique("Gamestop",adresseGamestop,jeux);
		Boutique micromania = new Boutique("Micromania",adresseMicromania,jeux2);
		
		Jeu marioKart = new Jeu("Mario Kart", consoles,  gamestop);
		Jeu smashBros = new Jeu("Super Smash Bros", consoles,  gamestop);
		Jeu zelda = new Jeu("A Link to the past", consoles,micromania);
		Jeu donkeyKong = new Jeu("Donkey Kong 64", consoles,  gamestop);
		Jeu pokemon = new Jeu("Pokemon rouge et bleu", consoles,micromania);
		List<Jeu> jeux3= new ArrayList<Jeu>();
		
		consoles.add(gameCube);
		consoles.add(wii);
		consoles.add(snes);
		
		jeux.add(pokemon);
		jeux.add(donkeyKong);
		jeux2.add(smashBros);
		jeux2.add(zelda);
		jeux3.add(pokemon);
		jeux3.add(zelda);
		jeux3.add(donkeyKong);
		
		Achat achat1 = new Achat(pokemon, "2010-05-12", 100, micromania);
		
		achats.add(achat1);
		
		Client c1 = new Client("Martin","Louis", achats);

	}

}
