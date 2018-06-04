import java.util.ArrayList;

class LuhnValidator {

    boolean isValid(String candidate) {
        candidate = candidate.replaceAll("\\s+","");
        if(candidate.length() <= 1){
            return false;
        }
        int sum = 0;
        ArrayList<Integer> candidateIntArray = new ArrayList<>();
        for (int i = 0; i <candidate.length(); i++){
            if(Character.isDigit(candidate.charAt(i))){
                candidateIntArray.add(Character.getNumericValue(candidate.charAt(i)));

                }if(!Character.isDigit(candidate.charAt(i))){
                return false;
            }}

        for (int i = candidateIntArray.size() -1 ; i >= 0; i -= 2)
        { sum += candidateIntArray.get(i);}


        for (int j = candidateIntArray.size() -2; j >= 0; j -=2){
             if(candidateIntArray.get(j) * 2 < 10){
                 sum += candidateIntArray.get(j) * 2;}
                 else sum += ((candidateIntArray.get(j) * 2) -9);
             }

             if(sum % 10 == 0){return true;}

             return false;
        }


}


