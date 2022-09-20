package collatz;

public class Solution {
    public int solution(long num) {
        int answer = 0;
        
        while (num > 1) {
            if (answer < 500) {
                if (num % 2 == 0) {
                    num /= 2;
                    answer++;
                } else {
                    num = (num * 3) + 1;
                    answer++;
                }
            } else {
                answer = -1;
                break;
            }
        }
        return answer;
    }
}
