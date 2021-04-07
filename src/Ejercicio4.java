
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = (int)(Math.random()*100)+1;
		int num2 = (int)(Math.random()*100)+1;
		
		//int num1 = 4;
		//int num2 = 2;
		
		if ((num1 % num2) == 0) {
			System.out.println("El numero 1: "+num1+" ES multiplo de numero 2: "+num2);
		}else {
			System.out.println("El numero 1: "+num1+" NO es multiplo de numero 2: "+num2);
		}

	}

}
