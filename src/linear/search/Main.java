package linear.search;

public class Main {

    public static void main(String[] args) {
        
        int array[] = {2, 3, 4, 6, 1, 7, 5, 9, 8};
        
        int index = linearSearch(array, 4);
        
        if(index != -1){
            System.out.println("Element found at index " + index);
        }
        else{
            System.out.println("Element not found.");
        }
        
    }

    private static int linearSearch(int[] array, int target) {
        
        for (int i = 0; i < array.length; i++) {
            if(array[i] == target){
                return i;
            }
        }
        
        return -1;
    }
    
}
