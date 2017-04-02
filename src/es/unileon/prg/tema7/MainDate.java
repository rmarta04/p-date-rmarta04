package es.unileon.prg.tema7;

/**
*@author RUBÉN MARTÍNEZ ALCONERO
*@version 1.0
*/

class MainDate(){

public static void main(String args[]){

	Date fecha = new Date (27,03,2017);
	System.out.println(fecha.isSameYear(2016));
	Date fecha2 = new Date (01,01,1970);
	System.out.println(fecha.isSame(fecha2));

	Date today;

	try {
		today=new Date(99,13,2017);
		System.out.println(today);
	}catch (DateException e){
		System.out.println(e.getMessage());
	}






}
}