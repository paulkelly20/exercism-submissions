import java.util.HashSet;
import java.util.Set;

class SumOfMultiples {
    private int number;
    private int [] set;

    SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = set;
    }


    int getSum() {
         Set<Integer> multiples = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < this.set.length ; i++){
            int foundNumber = this.set[i];
            for (int j = foundNumber; j < number  ; j++){
                if(j % foundNumber == 0){
                    multiples.add(j);
                }
            }

        }

        for(int eachNumber: multiples){
            sum += eachNumber;
        }

        return sum;
    }

}
