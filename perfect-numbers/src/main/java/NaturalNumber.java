import java.util.ArrayList;

class NaturalNumber {

    private int number;

    public NaturalNumber(int number) {
        this.number = number;
        if (number <= 0) {
            throw  new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
    }

    public Classification getClassification() {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 1; i < number-1; i++) {
            if (number % i == 0){
                factors.add(i);
            }
        }

        int sum = factors.stream().mapToInt(Integer::intValue).sum();
        if (sum == number) {
            return Classification.PERFECT;
        }
        if (sum < number) {
            return Classification.DEFICIENT;
        }
        if (sum > number) {
            return Classification.ABUNDANT;
        }
        return null;
    }


}
