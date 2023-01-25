package MultiDemntion_array;

public class multidemntion3 {

	public static boolean isSymmetric(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] != mat[j][i]) {
					return false;
				}
			}
		}
		return true;

	}

	public static boolean isAntiSymmetric(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] + mat[j][i] == 0) {
					return false;
				}
			}
		}
		return true;

	}

	public static boolean isLowerTriangular(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (mat[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isUpperTriangular(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = i + 1; j < mat[i].length; j++) {
				if (mat[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isDiagonalTriangular(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (j != i && mat[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isScalarTriangular(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (j != i && mat[i][j] != 0) {
					return false;
				} else if (j == i && mat[i][j] != mat[j][i]) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isZeroMat(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isIdentityMat(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(j!=i && mat[i][j] != 0) {
					return false;
				}else if (j==i && mat[i][j] !=1){
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {

	}

}
