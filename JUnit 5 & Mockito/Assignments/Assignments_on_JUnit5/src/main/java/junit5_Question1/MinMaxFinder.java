package junit5_Question1;
import java.util.Arrays;

//created class -> MinMaxFinder
public class MinMaxFinder {
	
		public int[] arr(int [] numbers) {
			Arrays.sort(numbers);
			int [] array1= {numbers[0],numbers[numbers.length-1]};
			
			return array1;
		}
		
		
}

