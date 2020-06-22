import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) throws Exception {

		List<List<Integer>> input = new ArrayList<>(3);
		input.add(Arrays.asList(0, 1, 2));
		input.add(Arrays.asList(3, 4, 5));
		input.add(Arrays.asList(6, 7, 8));

        System.out.println(diagonalDifference(input));
	}
	
	public static int diagonalDifference(List<List<Integer>> arr) {

		int left = 0;
		int right = 0;

		for (int index1 = 0; index1 < arr.size() ; index1++){
			final List<Integer> row = arr.get(index1);
			for (int index2 = 0; index2 < row.size(); index2++){
				if (index1 == index2){
					left += row.get(index2);
				} 
				if ((index1 + index2) == (arr.size() -1)){
					right += row.get(index2);
				}
			}
		}
	
		return Math.abs(left - right);
	}

}