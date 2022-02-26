public class FindtheFirstNonRepeatedCharacters {
    public static class findtheFirstNonRepeatedCharacters {

        public static void main(String[] args) {

            String inputStr = "mariaamanda";
            for (char i : inputStr.toCharArray()) {
                if (inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
                    System.out.println("First non-repeating character is; " + i);
                    break;
                }
            }
        }
    }
}