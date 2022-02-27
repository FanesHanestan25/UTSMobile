package Main;

import java.util.Scanner;

public class Motorcycle extends Kendaraan{

	@Override
	public void brand() {
		String Mitsu = null;
		Scanner sc = null;
		do {
			try {
				System.out.println("Input brand [>=5]: ");
				sc = new Scanner(System.in);
				Mitsu = sc.nextLine();
		}
			finally {
				if(Mitsu.length()>4) 
					sc.close();
			}
		}
		while(Mitsu.length()<4);
		System.out.printf("%s",Mitsu);		
		System.out.println("");
	}
	
	@Override
	public void nama() {
		String name = null;
		Scanner sa = null;
		do {
			try {
				System.out.println("Input name [>=5]: ");
				sa = new Scanner(System.in);
				name = sa.nextLine();
		}
			finally {
				if(name.length()>4) 
					sa.close();
			}
		}
		while(name.length()<4);
		System.out.printf("%s",name);		
		System.out.println("");
	}

	@Override
	public void license() {
		String licen = null;
		Scanner sc = null;
		try {
			System.out.println("Input license: ");
			sc = new Scanner(System.in);
			licen = sc.nextLine();
	}
		finally { 
				sc.close();
		}
		
	}
	
	@Override
	public void top() {
		int speed = 0;
		Scanner sc=null;
		do {
			try {
				System.out.println("Input top speed [100 <= topSpeed <= 250]: ");
				sc = new Scanner(System.in);
				speed = sc.nextInt();
		}
			finally {
				if(speed>=100 && speed <=250) 
					sc.close();
			}
		}
		while(speed<100 || speed > 250);
	}
	
	@Override
	public void gas() {
		int cap = 0;
		Scanner sc=null;
		do {
			try {
				System.out.println("Input gas capacity [30 <= gasCap <= 60]: ");
				sc = new Scanner(System.in);
				cap = sc.nextInt();
		}
			finally {
				if(cap>=30 && cap <=250) 
					sc.close();
			}
		}
		while(cap<100 || cap>250);
	}
	
	@Override
	public void wheel() {
		int roda = 0;
		Scanner sc=null;
		do {
			try {
				System.out.println("Input wheel [2 <= wheel <= 3]: ");
				sc = new Scanner(System.in);
				roda = sc.nextInt();
		}
			finally {
				if(roda==2 || roda == 3) 
					sc.close();
			}
		}
		while(roda!=2 && roda!=3);
	}
	
	@Override
	public void type() {
		String ti = null;
		Scanner sc=null;
		do {
			try {
				System.out.println("Input type [SUV | Supercar | Minivan]: ");
				sc = new Scanner(System.in);
				ti = sc.nextLine();
		}
			finally {
				if(ti.equals("SUV")||ti.equals("Supercar")||ti.equals("Minivan")); 
					sc.close();
			}
		}
		while(!ti.equals("SUV")||!ti.equals("Supercar")||!ti.equals("Minivan"));
	}
	
	@Override
	public void enter() {
		int ent = 0;
		Scanner sc=null;
		do {
			try {
				System.out.println("Input helm amount [>=1]: ");
				sc = new Scanner(System.in);
				ent = sc.nextInt();
		}
			finally {
				if(ent>=1); 
					sc.close();
			}
		}
		while(ent < 1);
	}
	
}