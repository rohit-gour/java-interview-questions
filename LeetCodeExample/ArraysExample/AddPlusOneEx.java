package LeetCodeExample.ArraysExample;

import java.util.Arrays;

public class AddPlusOneEx {
    public static void main(String[] args) {

    AddPlusOneEx addPlusOneEx = new AddPlusOneEx();

    int [] arr = {1,2,9};
    int []newArray = addPlusOneEx.plusOne(arr);

        System.out.println(Arrays.toString(newArray));
    }

    public int[] plusOne(int[] digits){
//        int length = arr.length;
//        int [] newOne = new int[length];
//        length = length-1;
//        String value = "";
//        for (int i = 0; i < arr.length; i++) {
//            value+= arr[i];
//        }
//        int sum = Integer.parseInt(value)+1;
//        int temp = sum;
//        while(temp>0){
//            int digit = temp%10;
//            newOne[length] = digit;
//            temp/= 10;
//            length = length-1;
//        }
//        return newOne;

        //Alternative Code for the Same

        int length = digits.length;
        int[] newOne = new int[length];
        length = length - 1;

        int carry = 1; // Start with a carry of 1

        // Copy digits from the original array
        for (int i = 0; i <= length; i++) {
            newOne[i] = digits[i];
        }

        for (int i = length; i >= 0; i--) {
            int sum = newOne[i] + carry; // Add the current digit and carry

            newOne[i] = sum % 10; // Store the digit in the new array
            carry = sum / 10; // Update the carry

            // If there's no carry, we don't need to process further
            if (carry == 0) {
                break;
            }
        }

        // If there's still a carry, we need to create a new array with an additional digit
        if (carry != 0) {
            newOne = new int[length + 2];
            newOne[0] = carry;
        }

        return newOne;
    }
}
