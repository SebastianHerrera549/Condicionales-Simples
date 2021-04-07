import java.text.DecimalFormat;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota = Math.round(((Math.random()*10))*100)/100d; 
		//asigno a la variable  nota un valor aleatorio "Math.random" menor que 10 "*10"  y lo limito a dos decimales "Math.round()/100d"
	if (nota >=0 && nota <= 6) {
		
		System.out.println("La nota del estudiante es: "+nota+" El estudiante REPROBO");
	}else {
		System.out.println("La nota del estudiante es: "+nota+" El estudiante APROBO");
	}
		
	}

}
