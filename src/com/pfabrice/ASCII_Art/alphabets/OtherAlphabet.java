/**
 * 
 */
package com.pfabrice.ASCII_Art.alphabets;

/**
 * @author Fabrice
 *
 */
public abstract class OtherAlphabet {

	int h;
	int w;
	String[] datas;

	public int getH() {
		return h;
	}

	public int getW() {
		return w;
	}

	public String[] getDatas() {
		return datas;
	}

	public OtherAlphabet(int h, int w, String[] datas) {
		this.h = h;
		this.w = w;
		this.datas = datas;
	}

}
