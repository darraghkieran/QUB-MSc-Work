/**
 * 
 */
package uk.ac.qub.revision;

/**
 * This method is revising the early weeks of the MSc
 * @author DKieran
 *
 */
public class Practical2Revision {

	/**
	 * This method is playing with the basics, as directed in Practical 2
	 * @param args
	 */
	public static void main(String[] args) {
		//format some text using the tab delimiter
		System.out.println("First witch \t When shall we three meet again \n\t\t In thunder lightening or rain");
		System.out.println("Second witch \t When the hurlyburly's done, \n\t\t When the battles lost and won");
		System.out.println("Third witch \t That will be ere the set of sun\n\n");
		
		//Declare a string and access some of its methods
		//declaring and initialising
		String name;
		name = "Darragh";
		
		//print String
		System.out.println(name);
		
		//print number of characters in String
		System.out.println(name.length());
		
		//replace lowercase with uppercase characters
		System.out.println(name.toUpperCase());
		
		//replace 'a's with '%'s
		System.out.println(name.replace('a', '%'));
		
		//print first and last occurances of 'a'
		System.out.print(name.indexOf('a') + ", ");
		System.out.println(name.lastIndexOf('a'));
		
		//calculate and print the area of a square, accepting a side as an integer
		int sideOfSquare, areaOfSquare;
		sideOfSquare = 4;
		areaOfSquare = sideOfSquare * sideOfSquare;
		System.out.println(areaOfSquare);
		
		//calculate and print the area of a circle, accepting the radius as a double
		double radius, areaOfCircle;
		radius = 1.4;
		areaOfCircle = 3.14 * (radius*radius);
		System.out.println(areaOfCircle);
		
		//use if statements to decide the biggest of 2 integers
		int littleInt, bigInt;
		littleInt = 4;
		bigInt = 1;
		//selection statements
		if (bigInt>littleInt) {
			System.out.println(bigInt + " is bigger than " + littleInt);
		}else if (bigInt<littleInt) {
			System.out.println(bigInt + " is smaller than " + littleInt);
		}else {
			System.out.println("They are the same");
		}
		
		
		//output some key milestones in a person's life based off their year of birth
		int yearOfBirth, yearTurning18, yearTurning30, yearTurning50, yearTurning65, yearTurning80;
		yearOfBirth = 1993;
		
		yearTurning18 = yearOfBirth + 18;
		yearTurning30 = yearOfBirth + 30;
		yearTurning50 = yearOfBirth + 50;
		yearTurning65 = yearOfBirth + 65;
		yearTurning80 = yearOfBirth + 80;
		
		System.out.println("You were born in " + yearOfBirth + " so you'll turn 18 in the year " + yearTurning18 + ", the big 3-0 in "+ yearTurning30+ " and 50 in " + yearTurning50 + ".");
		System.out.println("You'll also retire in the year " + yearTurning65 + " providing they haven't changed the rules by then... And if you make it, you'll turn 80 in " + yearTurning80);
		
		

	}

}
