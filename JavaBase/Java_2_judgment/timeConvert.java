import java.util.Scanner;

public class Main {
		public static void main(String[] args){
				Scanner in = new Scanner(System.in);
				int BJT = in.nextInt();
				int hours = BJT / 100;
				int minutes = BJT % 100;
				int UJT = 0;
				if(hours == 8)
				{
						UJT = minutes;
				}
				else if(hours < 8)
				{
						UJT = (hours - 8 + 24) * 100 + minutes;
				}
				else
				{
						UJT = (hours - 8) * 100 + minutes;
				}
				System.out.println(UJT);
		} 
}

