import java.util.HashMap;

class IsbnVerifier {

    boolean isValid(String stringToVerify){
        if (stringToVerify.equals("")) {
            return false;
        }
        int sum = 0;
        int formulaTimesNumber = 10;
        int length = stringToVerify.length();
        Character checkCharacter = stringToVerify.charAt(length - 1);
        HashMap<Character, Integer> values = new HashMap<>();
        values.put('-', -1);
        values.put('0', 0);
        values.put('1', 1);
        values.put('2', 2);
        values.put('3', 3);
        values.put('4', 4);
        values.put('5', 5);
        values.put('6', 6);
        values.put('7', 7);
        values.put('8', 8);
        values.put('9', 9);

        if(checkCharacter == 'X'){
            sum += 10;
           stringToVerify = stringToVerify.replace('X', '0');
        }

        for (int i = 0; i < length ; i++)
            if(values.containsKey(stringToVerify.charAt(i))){
            if (values.get(stringToVerify.charAt(i)) >= 0){
                sum += values.get(stringToVerify.charAt(i)) * formulaTimesNumber;
                formulaTimesNumber -= 1;
            if(formulaTimesNumber < 0 ){
                return false; } }
            }
            else return false;


        if (sum % 11 == 0) {
            return true;
        }

        return false;
}}