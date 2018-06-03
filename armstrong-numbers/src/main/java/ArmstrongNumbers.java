class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        int result = 0;
        Integer number = (Integer) numberToCheck;
        String numbersAsString = number.toString();
        int lengthOfNumberToCheck = numbersAsString.length();
        if(lengthOfNumberToCheck == 1){return true;}
        int i = 0;
        while (i < lengthOfNumberToCheck) {
            char newChar = numbersAsString.charAt(i);
            int number1 = Character.getNumericValue(newChar);
            result += (Math.pow(number1, lengthOfNumberToCheck));
            i++;
            if (result == numberToCheck) {
                return true;
            }

        }
        return false;

    }

}