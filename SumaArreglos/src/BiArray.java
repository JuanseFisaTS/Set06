public class BiArray {

    private int[] array1;
    private int[] array2;

    public BiArray(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public boolean areSumsEqual() {

        int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);
        // TODO: Write the code to compare the sums of the arrays and return the result.
       if (sum1==sum2){
           return true;
       }
       
       return false;
    }

    private int calculateSum(int[] array) {
    
    int sum = 0;
        // TODO: Write the code to calculate the sum of the array.
     for(int element: array){
            sum = element+ sum;
        }
    return sum;
    }
}