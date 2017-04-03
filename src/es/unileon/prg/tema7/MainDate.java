package es.unileon.prg.tema7;

/**
*@author RUBEN MARTINEZ ALCONERO
*@version 1.0
*/

class MainDate {

	public static void main(String args[]) {

		Date fecha = new Date(27, 03, 2017);
		Date fecha2 = new Date(01, 01, 1970);

		/*Date today;

		try {
			today = new Date(99, 13, 2017);
			System.out.println(today);
		} catch (dateException e) {
			System.out.println(e.getMessage());
		}
		*/

		System.out.println(fecha.isSameYear(fecha2));
		System.out.println(fecha.isSameMonth(fecha2));
		System.out.println(fecha.isSameDay(fecha2));
		System.out.println(fecha.isSame(fecha2));

		System.out.println(fecha.printMonthName());
		System.out.println(fecha.printSeason());
		System.out.println(fecha.checking());

		System.out.println(fecha.monthLeft());
		System.out.println(fecha.toString());
		System.out.println(fecha.printMonthsSameAmountDays());
		System.out.println(fecha.CountAllYearDaysSinceTheFirstOne());

		System.out.println(fecha.getNumGuess());















}
}