public class FindNUniqueIntegersSumuptoZero {
    public static void main(String[] args) {
        System.out.println(FindNUniqueIntegersSumuptoZero.sumZero(1));
    }

    private static int[] sumZero(int n) {

        int [] nums = new int[n];
        if(n==1){
            nums[0] =0;
            return  nums;
        }

        if(n%2==0){
            for(int i=0, j=1; i<n; i++,j++){
                nums[i] = j;
                i++;
                nums[i] =-1*j;
            }
        }
        else{
            nums[n-1]= 0;
            for(int i=0, j=1; i<n-1; i++,j++){
                nums[i] = j;
                i++;
                nums[i] =-1*j;
            }
        }


        return nums;
    }
}

/*
Given an integer n, return any array containing n unique integers such that they add up to 0.

Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:

Input: n = 3
Output: [-1,0,1]
Example 3:

Input: n = 1
Output: [0]
 */
