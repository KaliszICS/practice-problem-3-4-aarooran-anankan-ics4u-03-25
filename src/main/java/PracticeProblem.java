public class PracticeProblem {

	public static void main(String args[]) {}

	public static int[] recaman(int n) {

		if (n < 1) {
			return new int[0];
		}

		int[] intArr = new int[n];

		recamanHelper(n, intArr);

		return intArr;
	}

	public static void recamanHelper(int n, int[] intArr) {

		if (n==1) {
			intArr[n-1] = n;
			return;
		}

		recamanHelper(n-1, intArr);

		boolean exists = false;
		int x = intArr[n-2]-n;

		if (x > 0) {
			for (int i=0; i<n-1; i++) {
				if (intArr[i]==x) {
					exists = true;
				}
			}
			if (!exists) {
				intArr[n-1] = x;
			}
			else {
				intArr[n-1] = x + 2*n;
			}
		}
		else {
			intArr[n-1] = x + 2*n;
		}
	}
}