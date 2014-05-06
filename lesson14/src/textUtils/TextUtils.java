package textUtils;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by tish on 22.03.2014.
 */
public class TextUtils {

    public static List<String> findText (String[] st, Criteria c){
        LinkedList<String> result = new LinkedList<String>();

        for (String s :st)
            if (c.check(s))
                result.add(s);

        return result;
    }

}
