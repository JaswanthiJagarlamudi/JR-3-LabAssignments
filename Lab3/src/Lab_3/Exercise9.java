package Lab_3;
import java.time.LocalDate; 
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
public class Exercise9 {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		System.out.println("Enter your dob in this format YEAR-MON-DAY");
		Scanner sc=new Scanner(System.in);
		String date=sc.next();
		LocalDate dateOfBirth = LocalDate.parse(date);
		
	   long diffInDays = ChronoUnit.DAYS.between(dateOfBirth, currentDate); 
	   long diffInMonths = ChronoUnit.MONTHS.between(dateOfBirth, currentDate); 
	   long diffInYears = ChronoUnit.YEARS.between(dateOfBirth, currentDate);
	   System.out.println(diffInYears);
	
	}

}