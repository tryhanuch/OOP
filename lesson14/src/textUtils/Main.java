package textUtils;

import java.util.List;

/**
 * Created by tish on 22.03.2014.
 */
public class Main {
    public static void main(String[] args) {
        String st = "I have mobile phone mokia.";

        String[] str = st.split(" ");

        List<String> list = TextUtils.findText(str, s -> s.length() == 4);
        for (String s :list) {
            System.out.println(s);
        }

        List<String> list2 = TextUtils.findText(str, s -> s.startsWith("m"));
        for (String s :list2) {
            System.out.println(s);
        }
    }
}
