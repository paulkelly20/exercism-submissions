import java.awt.image.LookupOp;

public class PangramChecker {

    public boolean isPangram(String input) {
        String downcase = input.toLowerCase();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] compare = downcase.toCharArray();
        int stringLength = input.length();
        if(stringLength < 26){return false;}
        int counter = 0;

        for (int i = 0; i < 26 ; i++) {
            for (int u = 0; u < stringLength; u++) {
                if (alphabet[i] == compare[u]) {
                    counter += 1;
                    break;
                }
            }
        }
         if(counter == 26){
            return true;
        } return false;


}}
