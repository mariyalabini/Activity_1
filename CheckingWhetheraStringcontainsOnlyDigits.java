public class CheckingWhetheraStringcontainsOnlyDigits {
    public static class CheckingWhetherAStringContainsOnlyDigits {
        public static boolean
        onlyDigits(String str, int n)
        {
            for (int i = 0; i < n;) {
                return str.charAt(i) >= '0'
                        && str.charAt(i) <= '9';
            }
            return false;
        }
        public static void main(String[] args)
        {
            String str = "1234";
            int len = str.length();
            System.out.println(onlyDigits(str, len));
        }
    }
}
