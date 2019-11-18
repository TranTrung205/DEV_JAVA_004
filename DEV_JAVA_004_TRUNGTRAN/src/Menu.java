import java.util.ArrayList;
import java.util.Scanner;

public class Menu extends ArrayList<String> {
	private String title;

	public Menu(String title) {
		this.title = title;
	}

	public void display() {
		int i = 0;
		System.out.println(title.toUpperCase());
		if (this.size() == 0)
			return;
		for (String item : this) {
			System.out.println(++i + ". " + item);
		}
		System.out.println("Moi chon chuc nang'(1-" + ++i + ")" + ": ");
	}

	public int getChoice() {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		while (true) {
			try {
				choice = Integer.parseInt(scan.nextLine());
				if (choice > this.size() + 1 || choice < 1) {
					System.out.println("Vui long chon lai!");
				} else {
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("Chon chuc nang sai");
			}
		}
		return choice;
	}

	public static void pause() {
		System.out.println("-----------------------------------");
		System.out.println("Nhan phim bat ky de tiep tuc");
		new Scanner(System.in).nextLine();
	}
}
