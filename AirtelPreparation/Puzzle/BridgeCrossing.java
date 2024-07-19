package AirtelPreparation.Puzzle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BridgeCrossing {
    public static void main(String[] args) {
        //
        int arr[] = {7,2,1,10};
        getTime(arr);

    }
    public static void getTime(int[] arr){
        Arrays.sort(arr);

        List<Integer> list = new ArrayList<>();
        int timeTake = 0;
        int n = 0;
        int rPesron = 0;
        while(n<arr.length){
            int max = Math.max(arr[0],arr[1]);
            timeTake = timeTake+max;
        }
    }
}
/*

Step-by-Step Explanation
To minimize the total crossing time, you need to make strategic choices about who crosses the bridge together and when someone should return with the flashlight. Here's a simpler way to think about it:

Initial State:

All four people are on side A.
You need to get all four to side B in the least amount of time.
Basic Strategies:

If the two fastest people cross first, the fastest person can return with the flashlight.
If the two slowest people cross, you still need someone to bring the flashlight back.
Example Steps
Let's walk through an example with our specific times:

Send the Two Fastest First:

p1 and p2 cross the bridge (2 minutes because p2 is slower).
p1 returns with the flashlight (1 minute).
Total time so far: 3 minutes.
        Now, p1 is back on side A, and p2 is on side B.
Send the Two Slowest Next:

p3 and p4 cross the bridge (10 minutes because p4 is slower).
p2 returns with the flashlight (2 minutes).
Total time so far: 15 minutes (3 + 10 + 2).
Now, p2 and p1 are back on side A, and p3 and p4 are on side B.
Send the Two Fastest Again:

p1 and p2 cross the bridge again (2 minutes because p2 is slower).
Total time so far: 17 minutes (15 + 2).
Now, all four people are on side B. This strategy took 17 minutes.

*/
