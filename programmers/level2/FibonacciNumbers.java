import java.util.*;

/**
 * 문제 설명
 * <p>
 * 피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.
 * <p>
 * 예를들어
 * <p>
 * F(2) = F(0) + F(1) = 0 + 1 = 1
 * F(3) = F(1) + F(2) = 1 + 1 = 2
 * F(4) = F(2) + F(3) = 1 + 2 = 3
 * F(5) = F(3) + F(4) = 2 + 3 = 5
 * 와 같이 이어집니다.
 * <p>
 * 2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요.
 *
 *
 *
 * -----
 * 주의
 *  1. 재귀함수 사용하면, 스택이 계속 쌓여서 시간초과 or Runtime 에러 발생할 위험 있음.
 * 오류
 *  1. n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수 => n개 피보나치 수열을 구할 때마다 나누라느 소리였음..
 */
public class FibonacciNumbers
{
    private List<Integer> pbncList = new ArrayList<>();

    public int solution (int n)
    {

        for (int x = 0; x <= n; x++)
        {
            if (x < 2)
            {
                pbncList.add(x);
                continue;
            }
            pbncList.add((pbncList.get(x - 1) + pbncList.get(x - 2)) % 1234567);
        }

        return pbncList.get(pbncList.size() - 1);
    }
}