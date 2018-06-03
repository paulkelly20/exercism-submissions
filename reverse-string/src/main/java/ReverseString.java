import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

class ReverseString {

    String reverse(String inputString) {
        StringJoiner joiner = new StringJoiner("");
        List<String> splitword1 = Arrays.asList(inputString.split(""));
        ArrayList<String> result = new ArrayList<>();
        int counter = splitword1.size() -1 ;
        for(int i = 0; i < splitword1.size(); i++){
            result.add(splitword1.get(counter));
            counter -=1 ;
        }  for(String letter: result){joiner.add(letter);}
        return joiner.toString();
    }
  
}