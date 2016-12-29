import java.util.Scanner;

public class Main {
		private static Scanner in;

		public static void main(String[] args){
				in = new Scanner(System.in);
				int input = in.nextInt();
				int R = input / 10;
				int S = input % 10;
				String Readability;
				String Strength;
				switch(R){
						case 1:
								Readability = "unreadable";
								break;
						case 2:
								Readability = "barely readable, occasional words distinguishable";
								break;
						case 3:
								Readability = "readable with considerable difficulty";
								break;
						case 4:
								Readability = "readable with practically no difficulty";
								break;
						case 5:
								Readability = "perfectly readable";
								break;
						default:
								Readability = "";
				}
				switch(S){
						case 1:
								Strength = "Faint signals, barely perceptible";
								break;
						case 2:
								Strength = "Very weak signals";
								break;
						case 3:
								Strength = "Weak signals";
								break;
						case 4:
								Strength = "Fair signals";
								break;
						case 5:
								Strength = "Fairly good signals";
								break;
						case 6:
								Strength = "Good signals";
								break;
						case 7:
								Strength = "Moderately strong signals";
								break;
						case 8:
								Strength = "Strong signals";
								break;
						case 9:
								Strength = "Extremely strong signals";
								break;
						default:
								Strength = "";
				}
				System.out.println(Strength + ", " + Readability +".");
		} 
}

