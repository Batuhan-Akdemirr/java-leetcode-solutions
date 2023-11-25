public class MoveZeroes {
    public static void main(String[] args) {
        int [] arrays = {1,0,0,3,12};
        MoveZeroes.moveZeroes(arrays);
    }

    public  static void moveZeroes(int[] nums) {

        for(int i=0; i< nums.length;i++){

           if(nums[i]==0  ){

               for(int j=i+1; j< nums.length;j++){
                   if(nums[j]==0) continue;
                    else{
                       int temp = nums[i];
                       nums[i] = nums[j];
                       nums[j] = temp;
                       break;
                   }
               }

           }
        }
    }
}
