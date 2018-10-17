/**
 * 
 */
package com.pfabrice.ASCII_Art.manager;

import com.pfabrice.ASCII_Art.alphabets.DefaultAlphabet;
import com.pfabrice.ASCII_Art.alphabets.datas.AlphabetDatas;

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
        String [] tableauString = new String [H];
//        if (in.hasNextLine()) {
//            in.nextLine();
//        }
//        String T = in.nextLine();
        message = message.toUpperCase();
        
//      StringBuilder builder = new StringBuilder();
         
        for (int i = 0; i < H; i++) {

        	tableauString[i] = new String();
            //String ROW = in.nextLine();
            //System.err.println(ROW);

            // char maj 65 => 90
            for(char letter : message.toCharArray()){
                if(letter >= 65 && letter <= 90){
                    tableauString[i] += (this.alphabet.getDatas()[i].substring((letter-65)*L,(letter-65)*L+L));
                }else{
                	tableauString[i] += (this.alphabet.getDatas()[i].substring(L*26,(L*26)+L));
                }

            }
            //builder.append("\n");
        }

        //System.out.println(builder.toString());
		
		
		return tableauString;
		
	}
	
	

}
