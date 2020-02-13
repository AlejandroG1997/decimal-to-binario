package proyect;

public class binario {

	public static void main(String[] args, int decimal) {
		// TODO Auto-generated method stub
		int bit =0;
		do {
			bit = decimal % 2;
			System.out.println(bit);
			decimal = decimal / 2;
		}while(decimal != 0);
		
	}

}
