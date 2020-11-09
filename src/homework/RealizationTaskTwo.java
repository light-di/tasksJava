package homework;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class RealizationTaskTwo {
	
	public static void taskTwoDescription(Scanner scanner) {
		System.out.println("This program shows if it's possible to put the envelope in another envelope");
		taskTwo(scanner);
	}
	public static void taskTwo(Scanner scanner) {
		int envelopeNum;
		ArrayList<Envelope> envelopesList = new ArrayList<Envelope>();
		System.out.println("Please, enter the number of envelopes (min 2)");
		envelopeNum = checkEnvelopeNum(scanner);
		for (int i = 0; i < envelopeNum; i++) {
			Envelope envelope = new Envelope();
			System.out.println("Please, input the size of the " + (i+1) + " envelope");
			System.out.println("Width = ");
			envelope.setWidth(CheckIntInput.checkPositiveInput(scanner));	
			System.out.println("Height = ");
			envelope.setHeight(CheckIntInput.checkPositiveInput(scanner));
			envelopesList.add(envelope);
		}
		compareEnvelopes(envelopesList, envelopeNum);
		System.out.println("If you want to continue enter y or yes");
		wantContinue(scanner); 
	}
	
	public static int checkEnvelopeNum(Scanner scanner) {
		int envelopeNum = CheckIntInput.checkPositiveInput(scanner);
		while (envelopeNum < 2) {
			System.out.println("Wrong data, try again");
			envelopeNum = CheckIntInput.checkPositiveInput(scanner);
		}
		return envelopeNum;
	}	
	
	public static void compareEnvelopes(ArrayList<Envelope> envelopesList, int envelopeNum) {
		int countPut = 0;
		for (int i = 0; i < envelopeNum - 1; i++) {
			for (int j = 1 + i; j < envelopeNum; j++) {
				if (envelopesList.get(i).canPutEnvelope(envelopesList.get(j))) {
					System.out.println("You can put the " + (j+1) + " envelope in the " + (i+1) + " envelope");
					countPut += 1;
				}
				else if (envelopesList.get(j).canPutEnvelope(envelopesList.get(i))) {
					System.out.println("You can put the " + (i+1) + " envelope in the " + (j+1) + " envelope");
					countPut += 1;
				}
			}	
		}
		if (countPut == 0) System.out.println("You can't put the envelope in another envelope");
	}	
	
	public static void wantContinue(Scanner scanner) {
		String answer = scanner.nextLine();
		if ((answer.equalsIgnoreCase("y")) | (answer.equalsIgnoreCase("yes")))
			taskTwo(scanner);
	}
	
}
