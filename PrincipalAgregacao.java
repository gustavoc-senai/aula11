package relacaoClasses.agregacao;

public class PrincipalAgregacao {
	public static void main(String[] args) {
		
		Motor motor = new Motor("V8");
		Carro carro = new Carro("Mustang", motor);
		
		System.out.println("Carro: " + carro.getModelo() + "\nMotor: " + motor.getTipo());
	}
}
