public class reverseArray {

public static void main(String[] args) {
		int[] array = {1,2,3,4,5};

	    for(int arr : array){
	            System.out.println(arr);
	        }

	    System.out.println("\nIn reverse...");

	    for(int arr : reverse(array)) {
	    	System.out.println(arr);
	    }

}


public static int[] reverse(int[] list) {

    int[] result = new int[list.length];

     for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
      result[j] = list[i];
    }

    return result;
}
}
