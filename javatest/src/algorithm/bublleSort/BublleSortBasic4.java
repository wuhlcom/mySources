package algorithm.bublleSort;

import java.util.Arrays;

/**
 * 相邻元素比较大小交换位置,每一轮找到最大的数放到最后
 * 每经过一轮,下轮参与比较大小的数就减少一个
 * 双层循环基础排序 算法复杂度O(n^2)
 * 数组中部分有序,有序的部门不会进行位置交换，所以当有位置交换则最后一次交换的位置为无序部分的边界
 */
public class BublleSortBasic4 {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 8, 4, 5, 6};
        bublleSort(array);
    }

    private static void bublleSort(Integer[] array) {
        System.out.println(Arrays.toString(array));
        Integer temp = null;
        int lastExchange=0;
        int sortedBorder=array.length-1;
        boolean isSorted=true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < sortedBorder; j++) {
                if (array[j].intValue() > array[j + 1].intValue()) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSorted=false;
                    lastExchange=j;
                }
            }
            sortedBorder=lastExchange;
            if (isSorted){
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
