package org.example;

import java.util.Collections;

public class ConsecutiveCharsRemove  implements CharsProcess {
    public String process(String inputChars) {

        StringBuilder result = new StringBuilder(inputChars);

        boolean isContinue = true;

        while (isContinue) {
            isContinue = false;
            int length = result.length();
            int count = 1;
            int i = 1;

            for (i=1; i < length; i++) {
                if (result.charAt(i) == result.charAt(i - 1)) {
                    count++;
                } else {
                    if (count >= 3) {
                        break;
                    }
                    count = 1;
                }
            }

             if (count >= 3) {
                 result.delete(i - count, i);
                 System.out.println(result);
                 isContinue = true;
             }


        }

        return result.toString();

    }
}
