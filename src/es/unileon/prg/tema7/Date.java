package es.unileon.prg.tema7;

/**
*@author RUBÉN MARTÍNEZ ALCONERO
*@version 1.0
*/


class Date(){
	private int _day;
	private int _month;
	private int _year;

	public Date(int day, int month, int year) throws DateExceptions {
		this.year=year;

		/*if (month>=1 && month<=12){
			this month=month;
		}else{
			throw new DataException("Mes "+month+" no válido. Los valores aceptados para mes deben estar comprendidos entre 1 y 12 ")
		}*/          //EL IF TIENE QUE LEER LAS CONDICIONES MÁS NEGATIVAS
		if (month<1 && month>12){
			throw new DataException("Mes "+month+" no válido. Los valores aceptados para mes deben estar comprendidos entre 1 y 12 ");		
		}else{
			this month=month;
		}
		

		this day=day;
	}

public int getDay(){
	return this.Day;
}
public int setDay(int day){
	this.day=day
}

public int getMonth()
	return this.Month;
}
public int setMonth(int month){
	this.month=month
}

public int getYear(){
	return this.year;
}
public int setYear(int year)){
	this.year=year;
}








}