package junit5_Question2;

public class MinMaxClass {

    public int findMin(int[] array) {
        if (!(array.length > 0)) {
            throw new IllegalArgumentException("Input array is empty");
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min)
                min = array[i];
        }

        return min;
    }
    
    public int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max)
                max = array[i];
        }

        return max;
    }
}


 


