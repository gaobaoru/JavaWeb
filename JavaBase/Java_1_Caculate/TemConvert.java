mport java.util.Scanner;

public class Main {
		public static void main(String[] args){
				Scanner in = new Scanner(System.in);
				int tem_c;
				int tem_f = in.nextInt();
				tem_c = (int)((5/9.0)*(tem_f-32));
				System.out.println(tem_c);
		} 
}

