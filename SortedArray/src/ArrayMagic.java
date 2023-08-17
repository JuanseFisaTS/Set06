public class ArrayMagic {
 
    public boolean isSorted(int[] array) {
 
    
        if (array.length <= 1) {
            return true;
        }
 
       
        for (int i = 1; i < array.length; i++) {
            
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
 
     
        return true;
    }
}