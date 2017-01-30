/**
 * Created by ashokbance on 19/01/2017.
 *
 *
 * A zero-indexed array A consisting of N integers is given. Rotation of the array means that each
 * element is shifted right by one index, and the last element of the array is also moved to the first place.

 For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to rotate array A K times; that is,
 each element of A will be shifted to the right by K indexes.

 Write a function:

 class Solution { public int[] solution(int[] A, int K); }
 that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.

 For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].

 Assume that:

 N and K are integers within the range [0..100];
 each element of array A is an integer within the range [−1,000..1,000].
 In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 */
public class CircularArray {

    public static void main(String[] args) {

        int[] res = solution(new int[]{3,8,9,7,6}, 5);

        for (int i : res) {
            System.out.print(" " + i);
        }

    }

    private static int[] solution(int[] ints, int k) {

        int[] res = new int[ints.length];

        int shift = k % ints.length;

        for (int i=0; i< res.length; i++) {

            int idx = i - shift;

            if (idx < 0) {
                idx = res.length + idx;
            }

            res[i] = ints[idx];

        }

        return res;

    }

}
