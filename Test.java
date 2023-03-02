public class Test {
    public static boolean isLove(final int flower1, final int flower2) {
        boolean isLove = = false;
        if(flower1 % 2 == 0) {
            if (flower2 % 2 == 1){
                isLove = true;
            }
        } else if (flower1 % 2 == 1) {
            if (flower2 % 2 == 1) {
                isLove =false;
            }
        } else if (flower1 % 2 == 0) {
            if(flower2 % 2 == 0 ) {
                isLove = false;
            }
        }
        return isLove;
    }
}
