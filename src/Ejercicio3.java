
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int entero = -5;
		int entero = (int)(Math.random()*100)-50;// con esta linea aseguro numeros entre -50 y 50
		
		if (entero < 0) {
			System.out.println(entero+" Es Negativo");
			
		}else {
			System.out.println(entero+" Es Positivo");
		}

	}

}
