import java.sql.SQLOutput;

public class SelectionSort {

    static int[] nums = {6,5,2,8,9,4};
    static int size = nums.length;
    static int temp = 0;

    public static void main(String[] args) {


        System.out.println("Before Sorting");
        for (int num : nums ){
            System.out.print(num + " ");
        }

        sort();

        System.out.println();
        System.out.println("After Sorting");
        for (int num : nums){
            System.out.print(num + " ");
        }
    }

    static void sort() {
        for (int i = 0; i < size; i++) {
            int minindex =i ;
            for (int j = i; j < size; j++) {
                if(nums[minindex] > nums[j])
                    minindex = j;
            }

            temp = nums[minindex];
            nums[minindex] = nums[i];
            nums[i] = temp;

            System.out.println();

        }
    }

}