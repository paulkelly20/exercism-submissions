class Hamming {

    private String leftStrand;
    private String rightStrand;


    public Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    int getHammingDistance(){
        int result = 0;

            int length = rightStrand.length();
            char[] right = rightStrand.toLowerCase().toCharArray();
            char[] left = leftStrand.toLowerCase().toCharArray();

            for (int i = 0; i < length; i++) {
                if (right[i] != left[i]) {
                    result += 1;
                }
            }

        return result;

    }
}

