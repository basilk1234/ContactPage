import java.util.Scanner;

public class InsertionContactBook {

	public static void main(String[] args) {
		//Write a java program to create a Phone Book – based on insertion sort approach. 
//		Accept the contact name and number from the user one by one and insert it in the appropriate position. 
//		Use proper validations: for example phone numbers must be of 10 digits, 
//		names only alphabets, etc. 
		
		Scanner myScanner = new Scanner (System.in);

		String [] nameArray = new String [10];
		String [] numbArray = new String [10];
		int j;
		int k;
		String n;
		String num;




		// can use string array for ints!!!!

		System.out.println("Welcome To Kamhiyah's Phone Book");

		for (int i = 0; i < 10; i++) {

			boolean check = true;

			System.out.println("Please enter a New Contact Name: ");
			n = myScanner.next();
			System.out.println("Please enter a New Phone Number: ");
			num = myScanner.next();

			System.out.println(" ");
			System.out.println("Contact Stored!");

		

			while(n.matches("[a-zA-Z]+") && num.matches("[0-9]+")&& num.length() <= 10 && check) {	

				if (i==0) {
					nameArray[i] = n;
					numbArray[i] = num;
					check =!check;

				}else if (n.compareTo(nameArray[0]) <= 0){

					for (j =i; j > 0 ; j--) {
						nameArray[j] = nameArray[j-1];
						numbArray[j] = numbArray[j-1];
					}

					nameArray[j] = n;
					numbArray[j] = num;
					check =!check;

				}else if (n.compareTo(nameArray[i-1]) >=0) {
					nameArray[i] = n;
					numbArray[i] = num;
					check =!check;

				}else {

					for ( k = 0; k < i ; k++) {
						if (n.compareTo(nameArray[k]) >= 0 && n.compareTo(nameArray[k+1]) <0) {
							break;
						}

					}

					for (int o = i; o > k; o--) {
						nameArray[o] = nameArray[o-1];
						numbArray[o] = numbArray[o-1];

					}

					nameArray[k+1] = n;
					numbArray[k+1] =num;
					check =!check;
				}


			}

		}

		System.out.println("The contacts in alphabetical order: ");
		System.out.println(" ");
		for (int l = 0; l < 10; l++) {
			System.out.print(nameArray[l] + " ");
			System.out.println(numbArray[l] + " ");

		}	
	}
}
