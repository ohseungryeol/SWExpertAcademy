package intermediate;

import java.util.Arrays;

public class BubbleSort { // 인접한 두개의 원소를 비교하여 자리 교쳬 O(n^2)
    public static void main(String[] args) {
        int[] arr = {55, 7, 78, 12, 42};

        for (int i=0; i<4; i++){
            for (int j=0; j<4-i; j++){
                if (arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
