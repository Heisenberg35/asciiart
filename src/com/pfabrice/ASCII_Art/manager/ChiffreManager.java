/**
 * 
 */
package com.pfabrice.ASCII_Art.manager;

import com.pfabrice.ASCII_Art.alphabets.OtherAlphabet;

/**
 * @author Fabrice
 *
 */
public class ChiffreManager {

	OtherAlphabet chiffre;

	public ChiffreManager(OtherAlphabet chiffre) {
		super();
		this.chiffre = chiffre;
	}

	public String[] getChiffreTranslation(String message) {
		int L = this.chiffre.getW();
		int H = this.chiffre.getH();
		String[] tableauString = new String[H];

		for (int i = 0; i < H; i++) {

			tableauString[i] = new String();

			// char de 48 => 57
			for (char letter : message.toCharArray()) {
				if (letter >= 48 && letter <= 57) {
					tableauString[i] += (this.chiffre.getDatas()[i].substring((letter - 48) * L,
							(letter - 48) * L + L));
				} else {
					tableauString[i] += (this.chiffre.getDatas()[i].substring(L * 10, (L * 10) + L));
				}
			}
		}

		return tableauString;
	}

}
