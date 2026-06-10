import java.util.HashSet;
import java.util.Set;

/**
 * The CommonElementsFinder class provides a method for finding common elements
 * between two arrays of integers.
 */
public class CommonElementsFinder {

    /**
     * Finds the common elements between two arrays of integers.
     *
     * @param array1 the first array of integers
     * @param array2 the second array of integers
     * @return a Set<Integer> containing the integers that are present in both arrays
     */
    public static Set<Integer> findCommonElements(int[] array1, int[] array2) {
        Set<Integer> common = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();

        for(int num1: array1){ // O(n) n = len(arr1)
            set1.add(num1); // O(1)
        }

        for(int num2: array2){ // O(n) n = len(arr2) = len(arr1)
            if(set1.contains(num2)){ // O(1)
                common.add(num2); // O(1)
            }
        }
        /*Set<Integer> toRemove = new HashSet<>();
        for(int num1: array1){
            common.add(num1);
        }

        for(int num: array2){
            boolean contains = false;
            for(int num2: array2){
                if(num2 == num) contains = true;
            }
            if(contains){
                common.remove(num);
            }
        }

        for(int num: toRemove){
            common.remove(num);
        }*/

        return common;
    }


    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        Set<Integer> common = findCommonElements(array1, array2);
        System.out.println("Common elements: " + common);
    }
}
