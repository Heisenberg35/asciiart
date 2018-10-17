/**
 * 
 */
package com.pfabrice.ASCII_Art;

import com.pfabrice.ASCII_Art.alphabets.MonAlphabet;
import com.pfabrice.ASCII_Art.alphabets.MonAlphabet2;
import com.pfabrice.ASCII_Art.manager.AsciiManager;
import com.pfabrice.ASCII_Art.utils.ScannerProvider;

/**
 * @author Fabrice
 *
 */
public class Application {


	public static void main(String[] args) {

		String saisieUtilisateur = "";
		MonAlphabet monAlphabet = new MonAlphabet();
		MonAlphabet2 monAlphabet2 = new MonAlphabet2();
		AsciiManager asciiManager = new AsciiManager(monAlphabet);
		AsciiManager asciiManager2 = new AsciiManager(monAlphabet2);
		
		do {
			
			System.out.println("Ecrire votre message ?");
			saisieUtilisateur = ScannerProvider.getInstance().getScanner().nextLine();
			
			for (String string : asciiManager.getAsciiTranslation(saisieUtilisateur)) {
				
				System.out.println(string);
				
			}
			
			for (String string : asciiManager2.getAsciiTranslation(saisieUtilisateur)) {
				
				System.out.println(string);
				
			}
			System.out.println("Voulez-vous quitter le programmer ? O/N");
			saisieUtilisateur = ScannerProvider.getInstance().getScanner().nextLine();

		} while (!saisieUtilisateur.equals("O"));
		
		System.out.println("FIN");

//		String [] message;
		
//		message = asciiManager.getAsciiTranslation("fabrice");
//		
//		for (int i = 0; i < monAlphabet.getH(); i++) {
//			
//			System.out.println(message[i]);
//			
//		}

		
	}
}
