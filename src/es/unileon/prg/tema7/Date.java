package es.unileon.prg.tema7;

/**
*@author RUBEN MARTINEZ ALCONERO
*@version 1.0
*/


public class Date {
	private int day;
	private int month;
	private int year;

	/*public Date(int day, int month, int year) throws DateExceptions {
		this.year=year;

		 (month>=1 && month<=12){
			this month=month;
		}else{
			throw new DateException("Mes "+month+" no válido. Los valores aceptados para mes deben estar comprendidos entre 1 y 12 ")
		         //EL IF TIENE QUE LEER LAS CONDICIONES MAS NEGATIVAS
		if (month<1 && month>12){
			throw new DateException("Mes "+month+" no válido. Los valores aceptados para mes deben estar comprendidos entre 1 y 12 ");		
		}else{
			this.month=month;
		}
		

		this.day=day;
	}//cierre de public date
	*/


	public Date(int day, int month, int year){
		this.year=year;
		this.month=month;
		this.day=day;
	}





	public int getDay(){
		return this.day;
	}
	public int setDay(int day){
		this.day=day;
	return day;}

	public int getMonth(){
		return this.month;
	}

	public int setMonth(int month){
		this.month=month;
	return month;}

	public int getYear(){
		return this.year;
	}
	public int setYear(int year){
		this.year=year;
	return year;}

	public boolean isSameDay(Date another){
		return this.day == another.day;
	}

	public boolean isSameMonth(Date another){
		return this.month == another.month;
	}

	public boolean isSameYear(Date another){
		return this.year == another.year;
	}

	public boolean isSame(Date another){
		return ((this.isSameYear(another)) && (this.isSameMonth(another)) && (this.isSameDay(another)));
	}






	public String printMonthName(int month){

		String nombre = String.valueOf(month);


			switch (month){

				case 1: nombre = "Enero";
				break;

				case 2: nombre = "Febrero";
				break;

				case 3: nombre = "Marzo";
				break;

				case 4: nombre = "Abril";
				break;

				case 5: nombre = "Mayo";
				break;

				case 6: nombre = "Junio";
				break;

				case 7: nombre = "Julio";
				break;

				case 8: nombre = "Agosto";
				break;

				case 9: nombre = "Septiembre";
				break;

				case 10: nombre = "Octubre";
				break;

				case 11: nombre = "Noviembre";
				break;

				case 12: nombre = "Diciembre";
				break;
			
			}
		return nombre;
	}//cierre de PrintMonthName

public int printDaysOfEachMonth(int numDays){

	switch(numDays){

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: numDays = 31;
		break;

		case 4:
		case 6:
		case 9:
		case 11: numDays = 30;
		break;

		case 2: numDays = 28;
		break;
	}

	return numDays;
}//cierre de printDaysOfEachMonth


}//Cierre de public class Date