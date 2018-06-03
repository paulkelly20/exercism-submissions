import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> signals = new ArrayList<>();

        if(number == 0){
           return signals;
        }

    ArrayList<Integer> binary = new ArrayList<>();
        binary.add(16);
        binary.add(8);
        binary.add(4);
        binary.add(2);
        binary.add(1);

        ArrayList<Integer> results = new ArrayList<>();

        while(number > 0){
            for(int i : binary){
                if(number >= i){
                    number -= i;
                    results.add(1);
                }else{
                    results.add(0);
                }
            }
        }



        HashMap<Integer, Signal> options = new HashMap<>();
        options.put(4, Signal.WINK);
        options.put(3, Signal.DOUBLE_BLINK);
        options.put(2, Signal.CLOSE_YOUR_EYES);
        options.put(1, Signal.JUMP);


        for (int i = 4; i > 0; i--){
            if (results.get(i) == 1){
                signals.add(options.get(i));
            }
        }

        if(results.get(0) == 1){
            Collections.reverse(signals);
        }


        return signals;
    }

}
