package homework;

public class Ticket {
	private int ticketNumb;

	
	public Ticket(int numb) {
		this.ticketNumb = numb;
	}
	
	public boolean isTicketLuckyM1() {
		//if (((ticketNumb/100000) + (ticketNumb%100000/10000) + (ticketNumb%10000/1000)) == ((ticketNumb%1000/100) + (ticketNumb%100/10) + (ticketNumb%10))) { 
		if (((ticketNumb/100000) + (ticketNumb/10000%10) + (ticketNumb/1000%10)) == ((ticketNumb/100%10) + (ticketNumb/10%10) + (ticketNumb%10))) 
			return true;
		else return false;
	}
	
	public boolean isTicketLuckyM2() {
		int[] digits = {ticketNumb/100000, ticketNumb/10000%10, ticketNumb/1000%10, ticketNumb/100%10, ticketNumb/10%10, ticketNumb%10};
		//int[] digits = {ticketNumb/100000, ticketNumb%100000/10000, ticketNumb%10000/1000, ticketNumb%1000/100, ticketNumb%100/10, ticketNumb%10};
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < 6; i++) {
			if (digits[i] % 2 == 0) evenSum += digits[i];
			else oddSum += digits[i];
		}
		if (evenSum == oddSum) return true;
		else return false;
	}
}
