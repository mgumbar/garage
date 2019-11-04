package com.oc.exception;

import java.io.FileNotFoundException;

public class GarageVideException extends FileNotFoundException{

	public GarageVideException() {
		System.err.println( "Aucune voiture sauvegardée !" );
	}
	
}