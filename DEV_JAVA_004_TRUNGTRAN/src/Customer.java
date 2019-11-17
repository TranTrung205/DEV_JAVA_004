import java.util.Scanner;

public class Customer {
	private static String id;
	private String name;
	boolean gender;
	Scanner scan = new Scanner(System.in);

	public Customer() {

	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public boolean isGender() {
		return gender;
	}

	public Customer(String code, String name) {
		try {
			if (checkCode(code) == true) {
				this.id = code;
			} else {
				System.out.println("ID miss match!!!");
			}
		} catch (Exception e) {

		}
	}

	public void Input() {
		System.out.println("Please input ID: ");
		id = scan.nextLine();
		System.out.println("Please input full name: ");
		name = scan.nextLine();
		System.out.println("Please input gender: ");
		name = scan.nextLine();
	}

	private static boolean checkCode(String id) { // 6 ky tu: 2 ky tu dau la chu a-z. 4 ky tu sau la so 0-9
		if (id.length() == 6) {
			if (id.matches("^[a-z]{1,2}[0-9]+$")) {
				return true;
			} else {
				return false;
			}
		}
		else
			return false;
	}

	private static boolean checkName(String name) { // khong chua ky so , 2 tu : split \\st
		if (name.matches("")) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean checkGender(String gender) { // kiem tra gioi tinh
		if (gender.matches("")) {
			return true;
		} else {
			return false;
		}
	}

	public void Output() {
		System.out.println(toString());
	}

	public String toString() {
		return String.format("%10s %10s %10s", id, name, isGender());
	}

	public static void printTile() {
		System.out.println(String.format("%s %10s %10s", "COURSE", "NAME", "GENDER"));
	}

	public static String padLeft(String s, int n, char c) {
		return String.format("%10s %20s %30s", "" + n + "s", s).replace(' ', c);
	}
}
