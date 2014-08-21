import java.util.HashMap;
/*
 * Two Sum
a. for-for n2
b. if the arrary could be sorted, then left, right move the center until find it. nlogn
c. hashmap n

decrease time complexity, increase complexity of data structure
 */


public class TwoSum {
   public static int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();

        for(int i=0; i<numbers.length; i++){
            if(m.containsKey(numbers[i])){
                result[0]=m.get(numbers[i])+1;
                result[1]=i+1;
                return result;
            }else{
                m.put(target-numbers[i],i);
            }
        }
    
        return result;
   }
}