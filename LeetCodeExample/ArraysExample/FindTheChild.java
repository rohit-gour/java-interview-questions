package LeetCodeExample.ArraysExample;

public class FindTheChild {
    public static void main(String[] args) {
        int n = 3;
        int k = 5;

        getTheBoYWithBall(n, k);
    }
    public static void getTheBoYWithBall(int child, int times){
        System.out.println(times/child-1);
        System.out.println(times%child);
    }
}

//You are given two positive integers n and k. There are n children numbered from 0 to n - 1
// standing in a queue in order from left to right.
//
//Initially, child 0 holds a ball and the direction of passing the ball is towards
// the right direction. After each second, the child holding the ball passes it to
// the child next to them. Once the ball reaches either end of the line, i.e. child 0 or child n - 1,
// the direction of passing is reversed.
//
//Return the number of the child who receives the ball after k seconds.