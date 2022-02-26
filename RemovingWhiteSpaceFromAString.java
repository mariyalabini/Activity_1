package RemovingWhiteSpaceFromAString;
public class RemovingWhiteSpaceFromAString {
    public static void main(String[] args)

    {

        String str = " G O D B L E S S Y O U ";


        str = str.replaceAll("\\s", "");



        System.out.println(str);


    }
}

