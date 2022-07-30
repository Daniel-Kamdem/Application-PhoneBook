package comJiraws;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PhoneBook {

	public static Scanner sc = null;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		String userLastName = getUserImput("Entrez un numero de téléphone:: ");
		String userFirstName = getUserImput("Entrez un prenom: ");
		String userPhoneNumber = getUserImput("Entrez un numero de téléphone: ");
		Contact newContact = new Contact(userLastName, userFirstName, userPhoneNumber);

		//System.out.println(userLastName);
		//System.out.println(userFirstName);
		//System.out.println(userPhoneNumber);
		System.out.println("_______________________________________");
		System.out.println(newContact.toString());
		System.out.println("_______________________________________");

		File phoneBookFile = new File("/Users/danielkamdemsadefo/Documents/test/1ere Appli JAVA/phoneBook.txt");

		if (phoneBookFile.exists()) {
			System.out.println("Le fichier existe à l'emplacement donné");

		} else {
			System.out.println("Le fichier n'existe pas");
			try {
				phoneBookFile.createNewFile();
				
				System.out.println("Le fichier à été crée");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {

			BufferedWriter fileWriter = new BufferedWriter(new FileWriter(phoneBookFile, true));
			
			fileWriter.append(newContact.toString() + '\n');
			
			System.out.println("Vous venez d'ajouter un nouveau Contact");
			fileWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}

	public static String getUserImput(String userRequest) {

		System.out.println(userRequest);
		return sc.nextLine();
	}

	
}