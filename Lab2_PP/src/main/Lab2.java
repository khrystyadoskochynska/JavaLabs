package main;

import java.util.Scanner;

import phone.Phone;
// import phone.*;

public class Lab2 {

	private static void InputData(Phone[] customers) {

		customers[0] = new Phone();
		customers[0].setId(3);
		customers[0].setSurname("Doskochynska");
		customers[0].setName("Krhystyna");
		customers[0].setMiddleName("Ivanivna");
		customers[0].setAccountNumber(123);
		customers[0].setWithinCityTime(65);
		// customers[0].setOutCityTime(21);

		customers[1] = new Phone();
		customers[1].setId(7);
		customers[1].setSurname("Koval");
		customers[1].setName("Petro");
		customers[1].setMiddleName("Olegovych");
		customers[1].setAccountNumber(124);
		customers[1].setWithinCityTime(987);
		customers[1].setOutCityTime(3);

		customers[2] = new Phone();
		customers[2].setId(7);
		customers[2].setSurname("Ivanov");
		customers[2].setName("Mykhailo");
		customers[2].setMiddleName("Dmytrovych");
		customers[2].setAccountNumber(121);
		customers[2].setWithinCityTime(4);
		customers[2].setOutCityTime(750);

	}

	private static void OverlimitInCity(Phone[] customers, int qtyUsers, int LimitCityTime) {

		System.out.println();
		System.out.println("Person's surname who overlimited time of within city calls: ");

		for (int i = 0; i < qtyUsers; i++) {

			if (LimitCityTime < customers[i].getWithinCityTime()) {

				System.out.println(customers[i].getSurname());
			}
		}
	}

	public static void UseOutcityCalls(Phone[] customers, int qtyUsers) {

		System.out.println();
		System.out.println("Person's surname who used outcity calls: ");

		for (int i = 0; i < qtyUsers; i++) {

			if (0 < customers[i].getOutCityTime()) {

				System.out.println(customers[i].getSurname());
			}
		}
	}

	public static void AccountNumberFromDiapasone(Phone[] customers, int qtyUsers) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		System.out.println("AccountNumber is in such diapason ");
		System.out.println("Input bottom value of diapason: ");
		int BottomValue = in.nextInt();
		System.out.println();
		System.out.println("Input top value of diapason: ");
		int TopValue = in.nextInt();

		if (BottomValue > TopValue) {

			int TemporVar = 0;
			TemporVar = BottomValue;
			BottomValue = TopValue;
			TopValue = TemporVar;

			System.out.println("Limits of diapasone have been changed succsessfuly");
		}

		System.out.println();
		System.out.println("Person's surname whos AccountNumber is in such diapason: ");

		for (int i = 0; i < qtyUsers; i++) {

			if (BottomValue <= customers[i].getAccountNumber() && TopValue >= customers[i].getAccountNumber()) {

				System.out.println(customers[i].getSurname());
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Employee[] obj = new Employee[2] ;
		int qtyUsers = 3;

		Phone[] customers = new Phone[qtyUsers];
		InputData(customers);

		Scanner in = new Scanner(System.in);
		System.out.println("Overlimited time of within city calls");
		int LimitCityTime = in.nextInt();

		OverlimitInCity(customers, qtyUsers, LimitCityTime);

		UseOutcityCalls(customers, qtyUsers);

		AccountNumberFromDiapasone(customers, qtyUsers);

		System.out.println("\nData about customers:");

		for (int i = 0; i < qtyUsers; i++) {
			System.out.println(customers[i].toString());
		}

	}

}
