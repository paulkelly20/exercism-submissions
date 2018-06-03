class RnaTranscription {

    String transcribe(String dnaStrand) {
        int length = dnaStrand.length();
        char [] result = dnaStrand.toCharArray();



            for (int i = 0; i < length; i++) {

                if (result[i] == 'G') {
                    result[i] = 'C';

                }
                else if (result[i] == 'C') {
                    result[i] = 'G';
                }
                else if (result[i] == 'T') {
                    result[i] =  'A';
                }
                else if (result[i] == 'A') {
                    result[i] =  'U';
                }
            } String finalResult = new String(result);
            return finalResult;
        }

}



