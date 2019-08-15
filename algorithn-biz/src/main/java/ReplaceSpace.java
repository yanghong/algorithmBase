/**
 * @author hunter.yang
 * @version 1.0
 * @description null
 * @date 2019/8/10 20:49
 */
public class ReplaceSpace {

    private static String replace(String target) {
       return target.replace(" ", "%20");
    }

    public static void main(String[] args) {
        System.out.println(replace("We are happy."));
    }
}
