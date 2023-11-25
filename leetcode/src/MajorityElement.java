public class MajorityElement {

    public static void main(String[] args) {
        int [] numbers = {2,2,1,1,1,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
        System.out.println(MajorityElement.majorityElement(numbers));
    }
    private static int majorityElement(int[] nums) {

        int counter =0;
        int candicateNumber = 0;

        for (int num : nums) {
            if (counter == 0) {
                candicateNumber = num;
                counter = 1;
            } else if (num == candicateNumber) counter++;
            else counter--;
        }

        return candicateNumber;
    }
}

/*
 Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
  */
