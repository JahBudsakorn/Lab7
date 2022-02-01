package lab7 ;

public class main {
	
	public static void main(String[] args) {
		Vehicle V = new Vehicle() ;

		int x = V.Wheel ;
		float y = (float) 673.7;
		
		V.Move();
		V.Move("Jah");
		
		Car 	C = new Car();
		C.Move();
		C.Move(x, y);
		
		Motorbike M = new Motorbike();
		M.Move();
		M.Move("Jah", x - 2);

		Balloon B = new Balloon();
		B.Move();

		SuperCar S = new SuperCar();
		S.Move();
		
		Drone D = new Drone();
		D.Move();
		
	}



}