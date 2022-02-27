package Main;

import java.util.Scanner;

public class Main {

	public Main() {
		
		System.out.println("Input type [Car | Motorcycle]: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(str.equals("Car")) {
			Car kendaraan1 = new Car();
			kendaraan1.brand();
			kendaraan1.nama();
			kendaraan1.license();
			kendaraan1.top();
			kendaraan1.gas();
			kendaraan1.wheel();
			kendaraan1.type();
			kendaraan1.enter();
			
			System.out.println("");
			
		}
		if(str.equals("Motorcycle")) {
			Motorcycle kendaraan2 = new Motorcycle();
			kendaraan2.brand();
			kendaraan2.nama();
			kendaraan2.license();
			kendaraan2.top();
			kendaraan2.gas();
			kendaraan2.wheel();
			kendaraan2.type();
			kendaraan2.enter();
			
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		new Main();

	}

}
