import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @program: dy
 * @description
 * @author: dajitui
 * @create: 2021-04-07 11:26
 **/
public class work {
    public static void main(String[] args) {
        int[] array={1,2,3,10,5,6};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

   public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }

    }
    public static int maxArray(int[] array){
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if(max<array[i]){
                max=array[i];
            }
        }
        return max;
    }

    public static double avg(int[] array){
        int sum=0;
        for (int x:array){
            sum+=x;
        }
        return (double)sum/(int) array.length;
    }
    public static void quickSort(int[] arr,int low,int high) {
        int p,i,j,temp;

        if(low >= high) {
            return;
        }
        //p就是基准数,这里就是每个数组的第一个
        p = arr[low];
        i = low;
        j = high;
        while(i < j) {
            //右边当发现小于p的值时停止循环
            while(arr[j] >= p && i < j) {
                j--;
            }
            //这里一定是右边开始，上下这两个循环不能调换（下面有解析，可以先想想）

            //左边当发现大于p的值时停止循环
            while(arr[i] <= p && i < j) {
                i++;
            }

            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        arr[low] = arr[i];//这里的arr[i]一定是停小于p的，经过i、j交换后i处的值一定是小于p的(j先走)
        arr[i] = p;
        quickSort(arr,low,j-1);  //对左边快排
        quickSort(arr,j+1,high); //对右边快排

    }
}
