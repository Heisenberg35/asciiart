/**
 * 
 */
package com.pfabrice.ASCII_Art.manager;

import com.pfabrice.ASCII_Art.alphabets.DefaultAlphabet;

/**
 * @author Fabrice
 *
 */
public class AsciiManager {

	DefaultAlphabet alphabet;

	public AsciiManager(DefaultAlphabet alphabet) {
		super();
		this.alphabet = alphabet;
	}

	public String[] getAsciiTranslation(String message) {

		int L = this.alphabet.getW();
		int H = this.alphabet.getH();
		String[] tableauString = new String[H];

		message = message.toUpperCase();

		for (int i = 0; i < H; i++) {

			tableauString[i] = new String();

			// char maj 65 => 90
			for (char letter : message.toCharArray()) {
				if (letter >= 65 && letter <= 90) {
					tableauString[i] += (this.alphabet.getDatas()[i].substring((letter - 65) * L,
							(letter - 65) * L + L));
				} else {
					tableauString[i] += (this.alphabet.getDatas()[i].substring(L * 26, (L * 26) + L));
				}
			}
		}

		return tableauString;
	}

}
