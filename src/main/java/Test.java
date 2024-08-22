import java.util.ArrayList;
import java.util.List;

public class Test {

    public static List<Integer> solve(List<Integer> arr) {

        // Write your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int processCount = 1;

        for(int i = 0; i < arr.size(); i++) {

            int timeToLive = Math.min(arr.get(i), processCount);

            if(timeToLive == processCount) {
                processCount++;
            }

            // While ans.size() < timeToLive, add 0 to ans
            while(ans.size() < timeToLive) {
                ans.add(0);
            }

            ans.set(timeToLive-1, ans.get(timeToLive-1) + 1);
        }

        // Prefix Sum From Back
        for(int i = ans.size()-2; i >= 0; i--) {
            ans.set(i, ans.get(i) + ans.get(i+1));
        }

        // Push 0 to ans
        ans.add(0);

        return ans;
    }

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>(
            List.of(2, 2, 3, 1)
        );


        List<Integer> result = solve(arr);

        System.out.println(result);
    }
}
