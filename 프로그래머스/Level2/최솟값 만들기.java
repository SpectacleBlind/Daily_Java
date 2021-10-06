/* 프로그래머스 Level 2 문제 풀이
   *. 최솟값 만들기
      배열 A, B에서 각각 한 개의 숫자를 뽑아 두 수를 곱합니다. 이러한 과정을 배열의 길이만큼 반복하며, 
      두 수를 곱한 값을 누적하여 더합니다. 이때 최종적으로 누적된 값이 최소가 되도록 만드는 것이 목표입니다.
      - 배열 A, B의 크기 : 1,000 이하의 자연수
      - 배열 A, B의 원소의 크기 : 1,000 이하의 자연수
      */

import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int length = A.length;
        int answer = 0;        
        for(int i = 0; i < length; i++){
            answer += A[i]*B[length-1-i];
        }
        

        return answer;
    }
}
//다른사람의 풀이

class TryHelloWorld
{
    public int getMinSum(int []A, int []B)
    {
        int answer = 0;
        int length = A.length;


        quickSort(A, 0, A.length-1);
        quickSort(B, 0, B.length-1);

        //System.out.println(A[0]);
        //System.out.println(B[0]);

        for(int i = 0 ; i < length ; i++)
        {
            answer += A[i] * B[length-1-i];
        }



        return answer;
    }

    public static void quickSort(int[] arr, int left, int right) // Sort 메소드를 만들었다. 추후 확인 필요
    {
        int i, j, pivot, tmp;

        if (left < right) {
            i = left;
            j = right;
            pivot = arr[left];
            //분할 과정
            while (i < j) {
                while (arr[j] > pivot) j--;
                while (i < j && arr[i] <= pivot) i++;

                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            arr[left] = arr[i];
            arr[i] = pivot;
            //정렬 과정
            quickSort(arr, left, i - 1);
            quickSort(arr, i + 1, right);
        }
    }