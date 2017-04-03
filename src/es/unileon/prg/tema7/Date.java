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
	/*public Date(int this.year){
		this.year=year;
		this.month=month;
		this.day=day;
	}*/
	
	/*public RandomDate(int randomDay, int randomMonth, int randomYear){
		randomYear=this.year;
		int rangeMonths = (12-1)+1;
		randomMonth = (int)(Math.random()*(rangeMonths))+1;
		int rangeDays = (printDaysOfEachMonth(randomMonth)-1)+1;
		randomDay = (int)(Math.random()*(rangeDays))+1;
	}*/


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
		/*boolean same = false;
		if (this.day == fecha2.getDay()){
			same = true;
		}
		return same;*/
	}

	public boolean isSameMonth(Date another){
		return this.month == another.month;
		/*boolean same = false;
		if (this.month == fecha2.getMonth()){
			same = true;
		}
		return same;*/
	}

	public boolean isSameYear(Date another){
		return this.year == another.year;
		/*boolean same = false;
		if (this.year == fecha2.getYear()){
			same = true;
		}
		return same;*/

	}

	public boolean isSame(Date another){
		return ((this.isSameYear(another)) && (this.isSameMonth(another)) && (this.isSameDay(another)));
		/*boolean same = false;
			if (this.year == fecha2.getYear()) && (this.month == fecha2.getMonth()) && (this.day == fecha2.getDay())){
				same = true;
			}
		return same;*/
	}


	



	public String printMonthName(){

		String nombre = String.valueOf(month);


			switch (month){

				case 1: nombre = "January";
				break;

				case 2: nombre = "February";
				break;

				case 3: nombre = "March";
				break;

				case 4: nombre = "April";
				break;

				case 5: nombre = "May";
				break;

				case 6: nombre = "June";
				break;

				case 7: nombre = "July";
				break;

				case 8: nombre = "August";
				break;

				case 9: nombre = "September";
				break;

				case 10: nombre = "October";
				break;

				case 11: nombre = "November";
				break;

				case 12: nombre = "December";
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

	public boolean checking(){
		boolean correcto=true;

		switch(this.month){

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: if(this.day<0 || this.day>31){
						correcto=false;
						}			
				break;

			case 4:
			case 6:
			case 9:
			case 11: if(this.day<0 || this.day>30){
						correcto=false;
						}			
				break;
			case 2: if(this.day<0 || this.day>28){
						correcto=false;
						}			
				break;
		}
		return correcto;
	}//cierre chiecking

	public String printSeason(){

			String season = String.valueOf(month);


				switch (month){

					case 1:
					case 2:
					case 12: season = "Winter";
					break;

					case 3:
					case 4:
					case 5: season = "Spring";
					break;

					case 6:
					case 7:
					case 8: season = "Summer";
					break;

					case 9:
					case 10:
					case 11: season = "Autumn";
					break;
				}
		return season;
	}//cierre Season

	public int monthLeft(){
		int cont=0;

		for(int i=this.getMonth();i<12;i++){
			cont=cont+1;
		}
		return cont;
	}//cierre monthLeft

	
	public String toString(){
		return this.day+ "/" + this.month + "/" + this.year;
	}


	public String printDatesUntillTheEndOfTheMonth(){
		StringBuffer printDates=new StringBuffer();

		for(int i=this.day;i<=printDaysOfEachMonth(i);i++){
			printDates.append(i+"/"+getMonth()+"/"+getYear());
		}
		return printDates.toString();
	}//cierre de printDatesUntilTheEndOfTheMonth


	public String printMonthsSameAmountDays(){
		Date monthSol=new Date(this.day,this.month,this.year);
		StringBuffer printMonthsSameDays=new StringBuffer();

		for(int i=1;1<=12;i++){
			if(printDaysOfEachMonth(i)==printDaysOfEachMonth(this.month)){
				monthSol.setMonth(i);
				printMonthsSameDays.append("\n >>"+monthSol.printMonthName()+"\n");
			}
		}
		return printMonthsSameDays.toString();
	}


	public int CountAllYearDaysSinceTheFirstOne(){
		int year, month, counter=0;

		for(int i=1; i<this.month;i++){
			counter=counter+printDaysOfEachMonth(i);
		}
		counter=counter+this.day;

		return counter;
	}


	/*public int getNumGuess(){
		
		int counter=0;
		Date randomDate;
		boolean end=false;

		while(!end){
			randomDate=new RandomDate(int randomDay, int randomMonth, int randomYear);
			counter++;
			if(this.equals(randomDate)){
				end=true;
			}
		}
	return counter;
	}*/
	public int getNumGuess(){
		
		int counter=0;
		int randomDay=0,randomMonth=0,randomYear=0;
		

		while(!this.isSame(new Date(randomDay,randomMonth,randomYear))){
			
			randomYear=this.year;
			int rangeMonths = (12-1)+1;
			randomMonth = (int)(Math.random()*(rangeMonths))+1;
			int rangeDays = (printDaysOfEachMonth(randomMonth)-1)+1;
			randomDay = (int)(Math.random()*(rangeDays))+1;

			counter++;
			
		}
	return counter;
	}






}//Cierre de public class Date