package homework;

import java.util.ArrayList;

public class FindLuckyTickets {
	private int minNumb;
	private int maxNumb;
	private int countM1 = 0;
	private int countM2 = 0;
	
	public FindLuckyTickets(int min, int max) {
	this.minNumb = min;
	this.maxNumb = max;
	}
	
	/*public void setMinNumb(int min) {
		this.minNumb = min;
	}
	
	public void setMaxNumb(int max) {
		this.maxNumb = max;
	}
	
	public int getMinNumb() {
		return minNumb;
	}
	
	public int getMaxNumb() {
		return maxNumb;
	}*/
	
	public int getCountM1() {
		return countM1;
	}	
	public int getCountM2() {
		return countM2;
	}	

	public String findWinMethod() {
		ArrayList<Ticket> ticketsList = createTickets();
		for (int i = 0; i < ticketsList.size(); i++) {
			if (ticketsList.get(i).isTicketLuckyM1()) countM1++;
			if (ticketsList.get(i).isTicketLuckyM2()) countM2++;
		}
		if (countM1 > countM2) return("Method1");
		else if (countM1 < countM2) return("Method2");
		else if (countM1 < countM2) return("Method2");
		else if ((countM1 == countM2) & (countM2 != 0)) return("Friendship");
		else return ("no winners");
	}
	
	public ArrayList<Ticket> createTickets() {
		ArrayList<Ticket> ticketsList = new ArrayList<Ticket>();
		for (int i = minNumb; i <= maxNumb; i++) {
			Ticket ticket = new Ticket(i);
			ticketsList.add(ticket);
		}
		return ticketsList;
	}

}
