package algorithm.bublleSort;

import java.util.Arrays;

/**
 * 相邻元素比较大小交换位置,每一轮找到最大的数放到最后
 * 每经过一轮,下轮参与比较大小的数就减少一个
 * 双层循环基础排序 算法复杂度O(n^2)
 * 整个个数组已经有序可以根据是否有位置交换来判断是否有序
 */
public class BublleSortBasic2 {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1,2,3, 4, 5, 6};
        bublleSort(array);
    }

    private static void bublleSort(Integer[] array) {
        System.out.println(Arrays.toString(array));
        Integer temp = null;
        boolean isSorted=true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].intValue() > array[j + 1].intValue()) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSorted=false;
                }
            }
            if (isSorted){
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
