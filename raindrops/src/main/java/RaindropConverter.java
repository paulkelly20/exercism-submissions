import java.util.HashMap;

class RaindropConverter {



    String convert(int number) {

        String result = "";
        HashMap<Integer, String> raindrops = new HashMap<>();
        raindrops.put(3, "Pling");
        raindrops.put(5, "Plang");
        raindrops.put(7, "Plong");
        for(Integer intNumber :raindrops.keySet()){
            if (number % intNumber == 0){
                 result += raindrops.get(intNumber);

            }

        }   if(result.equals("")){
            return result = String.format("%d", number);
        }


        return result;
    }

}
