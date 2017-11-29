package lesson39;
import java.util.Date;
import java.text.*;

public class MyClass
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date.toString());
		//System.out.println(date.toString("DD/MM/YYYY"));
		
		System.out.println(date.getTime()); //time in ms since 1970
		
		System.out.println(date.getYear()+1900);
		System.out.println(date.getMonth()+1);
		System.out.println(date.getDay());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf.format(date));
		
		
	}

}
