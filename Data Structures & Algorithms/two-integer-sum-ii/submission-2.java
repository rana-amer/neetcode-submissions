class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] result = new int [2];
        int i = 0;
        int j = 1;
        while(i<numbers.length-1){
            if(numbers[i]+numbers[j] == target){
                result[0] = i+1;
                result[1] = j+1;
                return result;
            }
            if(j>=numbers.length-1 || numbers[i]+numbers[j]>target){
                i++;
                j = i+1;
            }
            else 
                j++;
        }
        return result;
    }
}

