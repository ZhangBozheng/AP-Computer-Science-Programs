import java.util.*;
public class ClientAuthor{
	public static void main(String [] args){
		Scanner console = new Scanner(System.in);
		String inputname = console.next();
		String inputgender = console.next();
		char inputgenderchar = inputgender.charAt(0);
		Author a = new Author(inputname, inputgenderchar);
		String actualemail = inputname+".2015@gmail.com";
		a.changeEmail(actualemail);
		int prodYearInput = console.nextInt();
		for(int i = 1; i<=prodYearInput; i++){
			a.productiveYear();
		}
		int lazyYearInput = console.nextInt();
		for(int i = 1; i<=lazyYearInput; i++){
			a.lazyYear();
		}
		System.out.println(a.toString());
	}
}