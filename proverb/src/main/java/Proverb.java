import java.util.Arrays;

class Proverb {

    private String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        String proverb = "";
        if(this.words.length == 0){
            return "";
        }
        String firstWord = this.words[0];
        String lastSentance = String.format("And all for the want of a %s.", firstWord);
        String [] sentanceArray = new String[this.words.length];
        sentanceArray[this.words.length -1] = lastSentance;
        if(this.words.length > 1) {
            for (int i = 0; i < this.words.length - 1; i++) {
                String word = this.words[i];
                String word2 = this.words[i+1];
                String sentance = "For want of a " + word + " the " + word2 + " was lost.\n";
                sentanceArray[i] = sentance;
            }
            for (String eachSentance : sentanceArray){
                 proverb += eachSentance;
            } return proverb ;

        }
        return lastSentance;
    }

}
