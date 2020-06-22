/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xvallejo.comprovacontrasenya;

/**
 *
 * @author xvallejo
 */
public class Main {
	
	public static void main(String[] args) {

		String caractersAdmesos = "abcdefghijklmnopqrstuvwxyzñç";
		String numerosAdmesos = "1234567890";

		String contrasenya = "aaaaa22aa";

		if (contrasenya.length() < 8){
			System.out.println("La contrasenya es massa curta");
		}
		else{
			int algunaLletra = 0;
			int algunNumero = 0;
			for (int posicio=0;posicio<contrasenya.length();posicio++){
				if (caractersAdmesos.indexOf(contrasenya.charAt(posicio))>=0){
					algunaLletra = 1;
				}
				if (numerosAdmesos.indexOf(contrasenya.charAt(posicio))>=0){
					algunNumero = 1;
				}
			}
			if (algunaLletra == 0){
				System.out.println("La contrasenya ha de contenir alguna lletra");
			}
			else if (algunNumero == 0){
				System.out.println("La contrasenya ha de contenir algun numero");
			}
			else{
				System.out.println("Contrasenya correcta");
			}
		}
		
	}
}
