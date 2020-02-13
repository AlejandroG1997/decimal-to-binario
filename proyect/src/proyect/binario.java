package proyect;

public class binario {

	public static void main(String[] args, int decimal) {
		// TODO Auto-generated method stub
		int bit =0;
		int numero = decimal,contador = 0;
		do {
			//bit = decimal % 2;
			//System.out.println(bit);
			decimal = decimal / 2;
			contador++;
		}while(decimal != 0);
		System.out.println(contador);
		int vector[] = new int [contador+1];
		
		for(int j=0; j< contador ; j++) {
			bit = (numero % 2);
			
			vector[j]= bit;
			//System.out.print(vector[j]);
			numero/=2;
		}
		do {
			System.out.print(vector[contador]);
			contador--;
		}while(contador != -1);
		
		
	}

}
