package trading.trading.algorithm;

import java.util.*;

public class CodingTest2 {

    public static void main(String[] args) {
        int[] A = {6,2,3,5,6,3};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int move = 0;
        boolean check = false;
        Arrays.sort(A);
        while(!check){
            for(int i = 0; i<A.length; i++){
                if(A[i] > i+1){
                    A[i] -= 1;
                    move ++;
                    break;
                }else if(A[i] < i+1){
                    A[i] += 1;
                    move ++;
                    break;
                }
                if(A.length == i+1){
                    check = true;
                }
            }

        }
        if(move > 1000000000){
            return -1;
        }
        return move;
    }

}
