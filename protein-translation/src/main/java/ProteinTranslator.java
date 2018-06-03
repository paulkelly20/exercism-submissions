


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> result = new ArrayList<>();
        HashMap<String, String> condonAndProtein = new HashMap<>();
        condonAndProtein.put("AUG", "Methionine");
        condonAndProtein.put("UUU", "Phenylalanine");
        condonAndProtein.put("UUC", "Phenylalanine");
        condonAndProtein.put("UUA", "Leucine");
        condonAndProtein.put("UUG", "Leucine");
        condonAndProtein.put("UCU", "Serine");
        condonAndProtein.put("UCC", "Serine");
        condonAndProtein.put("UCA", "Serine");
        condonAndProtein.put("UCG", "Serine");
        condonAndProtein.put("UAU", "Tyrosine");
        condonAndProtein.put("UAC", "Tyrosine");
        condonAndProtein.put("UGU", "Cysteine");
        condonAndProtein.put("UGC", "Cysteine");
        condonAndProtein.put("UGG", "Tryptophan");
        condonAndProtein.put("UAA", "STOP");
        condonAndProtein.put("UAG", "STOP");
        condonAndProtein.put("UGA", "STOP");


        for (int i = 0; i < rnaSequence.length() -1; i+=3){
            String comparisionSting = rnaSequence.substring(i, i +3);
        for(String key :condonAndProtein.keySet()){
            if(comparisionSting.equals(key)){
                if(condonAndProtein.get(key).equals("STOP")){
                    return result;
                }
               result.add(condonAndProtein.get(key));

            }}

        }

        return result;
    }
}

