package weekelyAssignment1;

public class LongestPrefix_24_04 {
    public static void main(String[] args) {
        // Test Cases
        String[] input1 = {"flower", "flow", "flight"};
        String[] input2 = {"dog", "racecar", "car"};
        String[] input3 = {"interview", "internet", "internal", "interval"};

        System.out.println("Output 1: " + findLCP(input1)); // "fl"
        System.out.println("Output 2: " + findLCP(input2)); // ""
        System.out.println("Output 3: " + findLCP(input3)); // "inte"
    }

    public static String findLCP(String[] strs) {
        // Handle empty or null input
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        
        for (int i = 1; i < strs.length; i++) {
         
            while (strs[i].indexOf(prefix) != 0) {
                
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}