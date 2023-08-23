package org.example;

import java.util.Collections;

public class ConsecutiveCharsReplace  implements CharsProcess {
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

            // if (count >= 3) {
            //     result.delete(i - count, i);
            //     //result.delete(result.length() - count, result.length());
            //     isContinue = true;
            // }

            if (count >= 3) {
                char currentChar = result.charAt(i-2);
                String replaceChar=String.valueOf((char)(currentChar - 1));
                if (result.charAt(i-1) == 'a') { replaceChar=String.valueOf('z'); }

                result.replace(i - count, i, replaceChar);
                isContinue = true;

                StringBuilder printStr = new StringBuilder();
                //printStr.append(result).append(", ").append(String.valueOf(currentChar).repeat(count)).append(" is replaced by ").append(replaceChar);
                printStr.append(result).append(", ").append(String.join("", Collections.nCopies(count,String.valueOf(currentChar)))).append(" is replaced by ").append(replaceChar);
                System.out.println(printStr);


            }

        }

        return result.toString();

    }
}
