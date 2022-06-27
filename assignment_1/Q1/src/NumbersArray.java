import java.util.*;

public class NumbersArray {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,1,5};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input)));       
        
        System.out.println();

        input = new Integer[] {1,2,3,4,1,2,5,3};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input))); 
    }

    // Write your methods here
    public static Integer findMax(Integer[] array) {

        Integer max = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max)
                max = array[i];
        }
        return max;

    }

    public static Integer[] findDuplicates(Integer[] array) {
        if(array.length == 0 || array.length == 1) return new Integer[0];

        HashMap<Integer, Integer> data = new HashMap<>(); 

        int answerArraySize = 0;
 
        for(int i = 0; i < array.length; i++) {
            if(data.get(array[i]) == null) {
                data.put(array[i], 1);
            } else {
                data.put(array[i], data.get(array[i]) + 1);
                if(data.get(array[i]) == 2) answerArraySize++;          // If finds duplicate, increase answerArraySize
            }
        }
        
        Integer[] answerArray = new Integer[answerArraySize];

        int counter = 0;

        for(Integer key : data.keySet()) 
            if(data.get(key) > 1) answerArray[counter++] = key;

        return answerArray;

    }

    public static Integer[] findUnique(Integer[] array) {
        if(array.length == 0 || array.length == 1) return array;

        HashMap<Integer, Integer> data = new HashMap<>();

        for(int i = 0; i < array.length; i++) {
            if(data.get(array[i]) == null) data.put(array[i], 1);
            else data.put(array[i], data.get(array[i]) + 1);
        }

        Set<Integer> keys = new HashSet<>(data.keySet());

        for(Integer key : keys) {
            if(data.get(key) > 1)
                data.remove(key);
        }

        Integer[] answerArray = new Integer[data.size()];

        int counter = 0;

        for(Integer key : data.keySet()) 
            answerArray[counter++] = key;

        return answerArray;
    }
}