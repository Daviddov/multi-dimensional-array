import java.util.Scanner;

public class Multidemntion_arr {

	public static int getTestGrade(int numStudent, int numTest, int[][] allGrades) {

		return allGrades[numStudent][numTest];
	}

	public static int getAvrgGrade(int numStudent, int[][] allGrades) {
		int grades = 0;
		for (int i = 0; i < 7; i++) {
			grades += allGrades[numStudent][i];
		}
		return grades / 7;
	}

	public static int getAllAvrgGrade(int[][] allGrades) {
		int grades = 0;
		for (int i = 0; i < 25; i++) {
			grades += getAvrgGrade(i, allGrades);
		}
		return grades / 25;
	}

	public static int getTopGrade(int[][] allGrades) {
		int topGrade = 0;
		for (int i = 0; i < allGrades.length; i++) {
			for (int j = 0; j < allGrades[i].length; j++) {
				if (topGrade < allGrades[i][j]) {
					topGrade = allGrades[i][j];
				}
			}
		}
		return topGrade;
	}
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[][] allGrades = new int[25][7];
		
		for (int i = 0; i < allGrades.length; i++) {
			for (int j = 0; j < allGrades[i].length; j++) {
				allGrades[i][j] = in.nextInt();

			}
		}
	}

}
