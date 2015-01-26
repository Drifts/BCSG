// David Craig's bank account Java program
import java.util.*;
import java.util.Date;
import java.text.*;
import java.text.ParseException;

public class bankAccount {
	
	public static void main (String[] args)throws ParseException{
		
		//Declaration of arrays to hold data. Alternatively, a multidimasional array can be used.
		
		//Information of the bank
		String [] bank = {
			"HSBC Canada ", "Royal Bank of Canada ", "American Express "
		};
		//Information of the card number and allocation for maked card number
		String [][] cardNumber = {
			{"5601-2345-3446-5678", "4519-4532-4524-2456", "3786-7334-8965-345"} ,
			{"","",""}
		};		
		//Information of expiry date
		String [] expiryDate = {
			"1-11-2017","1-10-2017 ","1-12-2018 " 
		};

		StringBuilder card1 = new StringBuilder(cardNumber[0][0]);
		StringBuilder card2 = new StringBuilder(cardNumber[0][1]);
		StringBuilder card3 = new StringBuilder(cardNumber[0][2]);
		
		int a = 2;
		int b = 4;
		int c = 0;
		
		//Convert the number of card 1 to a masked number
		while (a<=18){
			if (card1.charAt(a) != '-'){
				card1.setCharAt(a, 'x');
				cardNumber[1][0] = card1.toString();	
				a++;
			}
			else {
				a++;
			}
		}
				//Convert the number of card 2 to a masked number
		while (b<=18){
			if (card2.charAt(b) != '-'){
				card2.setCharAt(b, 'x');
				cardNumber[1][1] = card2.toString();	
				b++;
			}
			else {
				b++;
			}
		}	
				//Convert the number of card 3 to a masked number
		while (c<=14){
			if (card3.charAt(c) != '-'){
				card3.setCharAt(c, 'x');
				cardNumber[1][2] = card3.toString();	
				c++;
			}
			else {
				c++;
			}
		}
		
		// Organise by date------------------------------------------
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date date1 = sdf.parse(expiryDate[0]);
		Date date2 = sdf.parse(expiryDate[1]);
		Date date3 = sdf.parse(expiryDate[2]);
		
		boolean is1After2 = date1.after(date2);
		boolean is1Before2 = date1.before(date2);
		boolean is2After3 = date2.after(date3);
		boolean is2Before3 = date2.before(date3);
		boolean is3After1 = date3.after(date1);
		boolean is3Before1 = date3.before(date1);
		
		int HSBCDate = 1; //2
		int RoyalDate = 1; //1
		int AmericanDate = 1; //3
			
		if (is1After2==true){
			HSBCDate ++;
		}
		else if (is1Before2==true){
			RoyalDate ++;	
		}
		if (is2After3==true){
			RoyalDate ++;
		}
		else if (is2Before3==true){
			AmericanDate ++;
		}
		if (is3After1==true){
			AmericanDate ++;
		}
		else if (is3Before1==true){
			HSBCDate++;
		}
			
		// Print out the bank details in order of date (descending Order)
		for (int i=0; i<3; i++){
			
			if (HSBCDate ==3){
				System.out.println(bank[0] + "\n" + (cardNumber[1][0]) + "\n" + date1 + "\n");
				
			}
			if (RoyalDate ==3){
				System.out.println(bank[1] + "\n" + (cardNumber[1][1]) + "\n" + date2 + "\n");
				
			}
			if (AmericanDate ==3){
				System.out.println(bank[2] + "\n" + (cardNumber[1][2]) + "\n" + date3 + "\n");
				
			}
			HSBCDate = HSBCDate +1;
			RoyalDate = RoyalDate +1; //0
			AmericanDate = AmericanDate +1;
		}
		
		//Alternatively the task could be completed by using objects.
		//But due to my heavy workload at my current job, I ran out of time.
	}
}
