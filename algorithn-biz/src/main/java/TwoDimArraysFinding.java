import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 二维数组中的查找
 * @author  hunter.yang
 * @date  20190810
 * @version 1.0
 *
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 1  2  8  9
 * 2  4  9  12
 * 4  7  10  13
 * 6  8  11  15
 *
 * 找7 和5
 */
public class TwoDimArraysFinding {

    private static boolean find(int target, int [][] array) {
        int i=0;
        int j=array[0].length-1;
        while(i<array.length && j>=0){
            if(target>array[i][j]){i++;continue;}
            if(target<array[i][j]){j--;continue;}
            if(target==array[i][j]){return true;}
        }
        return false;
    }

public static void main(String[] args) {
    int [][] arr = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
    System.out.println(find(7,arr));
}
}
