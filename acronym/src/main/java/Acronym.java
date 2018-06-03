import java.util.ArrayList;

class Acronym {

    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {


        String[] split = phrase.split("[-\\s]");

        char [] firstLetterArray = new char[split.length];

            for (int i = 0; i < firstLetterArray.length; i++){
                String word = split[i];
            firstLetterArray[i] = word.charAt(0);

                }

         return new String(firstLetterArray).toUpperCase();
        }

    }


