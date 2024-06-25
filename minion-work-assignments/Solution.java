import java.util.HashMap;

public class Solution {
    public static int[] solution(int[] data, int n) {
        // make a hashmap of the occurences of each number
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < data.length; i++) {
            if (map.containsKey(data[i])) {
                map.put(data[i], map.get(data[i]) + 1);
            } else {
                map.put(data[i], 1);
            }
        }

        // make an array to store what are the numbers that occur less than n times
        int[] intermediate = new int[data.length];
        int count = 0;

        for (int i = 0; i < data.length; i++) {
            if (map.get(data[i]) <= n) {
                intermediate[count++] = data[i];
            }
        }

        // make a new array to store the answer since the intermediate array size is fixed and not ideal for answer
        int[] ret = new int[count];
        for (int i = 0; i < count; i++) {
            ret[i] = intermediate[i];
        }

        return ret;
    }

    public static void main(String[] args) {
      int[] answer = solution(new int[]{5,10,15,10,7}, 1);

      for (int i = 0; i < answer.length; i++) {
        System.out.println(answer[i]);
      }
    }
}
