public class Duplicate {

    /**
     * 数组中重复的数字:
     * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，
     * 但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
     * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
     */
    private static boolean duplicate(int[] number, int length, int[] duplication) {
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length ; i++) {
            while (i != number[i]) {
                if (number[i] == number[number[i]]){
                    duplication[0] = number[i];
                    System.out.println(number[i]);
                    return true;
                } else {
                    int temp = number[number[i]];
                    number[number[i]] = number[i];
                    number[i] = temp;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] number = new int[]{2,3,1,0,2,5,3};
        int[] duplication = new int[]{0};
        System.out.println(duplicate(number, number.length, duplication));
    }
}
