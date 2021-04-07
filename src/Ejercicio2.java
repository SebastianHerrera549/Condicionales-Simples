
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = (int)(Math.random()*100)+1;
		int num2 = (int)(Math.random()*100)+1;

		if (num1 > num2) {
			System.out.println("variable numero 1 es: "+num1+" tiene mayor valor");
			System.out.println("la variable numero 2 es: "+num2+" por ser menor elevo con exponente al 2 y el el resultado es: "+Math.pow(num2,2));
		}else {
			System.out.println("variable numero 2 es: "+num2+" tiene mayor valor");
			System.out.println("la variable numero 1 es: "+num2+" por ser menor elevo con exponente al 2 y el el resultado es: "+Math.pow(num1,2));
		}
	}

}
