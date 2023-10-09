/*
규칙
1. yellow + brown = w * h
2. yellow = (w-2) * (h-2)
3. brown = w * h - yellow
*/

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/42842
 * <p>
 * 문제 설명
 * Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 노란색으로 칠해져 있고 테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.
 * <p>
 * carpet.png
 * <p>
 * Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.
 * <p>
 * Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 * <p>
 * <p>
 * ------
 * <p>
 * 규칙
 * 1. yellow + brown = w * h
 * 2. yellow = (w-2) * (h-2)
 * 3. brown = w * h - yellow
 */
class Carpet
{
    public int[] solution (int brown, int yellow)
    {
        int area = brown + yellow; // 전체 면적
        int h = 0; // 높이
        int w = 0; // 너비

        for (h = 1; h <= area / 2; h++)
        {
            // 약수가 아님
            if (area % h != 0)
            {
                continue;
            }

            w = area / h;

            // 규칙 확인
            int calY = (w - 2) * (h - 2);
            int calB = (w * h) - yellow;

            if (calY == yellow && calB == brown)
            {
                break;
            }
        }

        int[] answer = {w, h};
        return answer;
    }
}