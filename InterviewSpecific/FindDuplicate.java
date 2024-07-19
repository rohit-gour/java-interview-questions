package InterviewSpecific;

public class FindDuplicate {
    public void printDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    flag++;
                }
            }
            if (flag > 0) {
                System.out.println(arr[i]);
                flag--;
            }
        }
    }

    public static void main(String[] args) {
        FindDuplicate findDuplicate = new FindDuplicate();
        int [] arr = {10,20,30,40,20,30};
        findDuplicate.printDuplicate(arr);

    }
}
