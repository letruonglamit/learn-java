package Exception.Handling;

import java.util.regex.Matcher;
import java.util.Scanner;
class EmailAddressException extends Exception{
	public EmailAddressException(String str){
		super(str);
	}
}
public class EmailCheck {
	public static void checkEmail(String str) throws EmailAddressException{
		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		boolean b = str.matches(emailreg);
		if(b==false) throw new EmailAddressException("Dia chi email khong hop le!");
	}
	public static void main(String[] args){
		try{
			
			Scanner kb = new Scanner(System.in);
			System.out.println("Nhap dia chi email: ");
			String email = kb.nextLine();
			checkEmail(email);
		}
		catch(EmailAddressException e){
			System.out.println(e.getMessage());
		}
	}
}
