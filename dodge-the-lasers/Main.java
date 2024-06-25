// i have Solution.java file in the same directory
// so if i want to use this class i have to import it

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("5"));
        System.out.println(solution.solution("77"));
        System.out.println(solution.solution("10000000000000000000000000000"));
    }
}
