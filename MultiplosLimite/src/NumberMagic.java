import java.util.ArrayList;
import java.util.List;

public class NumberMagic {
    /**
     * This method generates a list of multiples of a given number less than a specified limit.
     * 
     * @param number the number to find multiples of
     * @param limit the upper bound for the multiples
     * @return a List of multiples of the number less than the limit
     */
    public List<Integer> determineMultiples(int number, int limit) {
            
            List <Integer> multiples =  new ArrayList<>();
        if (number <= 0 || limit <= 0) {
            return new ArrayList<>();
        }
            
            for(int i = 1; i<limit ; i++){
                if(i%number==0){
                    multiples.add(i);
                }
            }
            
            return multiples;
        // TODO: Write your code here
    }
}