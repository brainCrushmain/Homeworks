package arraysDemo;

public class arraysDemo {

	public static void main(String[] args) {

		String[] students = new String[8];
		students[0] = "dream";
		students[1] = "cigarette";
		students[2] = "loneliness";
		students[3] = "differentcity";
		students[4] = "newlife";
		students[5] = "loneliness2";
		students[6] = "medicine";
		students[7] = "dentistry";

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}

		System.out.println("******************");

		for (String student : students) {
			System.out.println(student);
		}
	}

}
