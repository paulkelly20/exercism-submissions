class Scrabble {
    private String word;

    Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    int getScore() {
        int result = 0;

        for (int i = 0; i < this.word.length(); i++) {
            char letter = this.word.charAt(i);

            switch (letter) {
                case 'D':
                    result += 2;
                    break;
                case 'G':
                    result += 2;
                    break;
                case 'B':
                    result += 3;
                    break;
                case 'C':
                    result += 3;
                    break;
                case 'M':
                    result += 3;
                    break;
                case 'P':
                    result += 3;
                    break;
                case 'F':
                    result += 4;
                    break;
                case 'H':
                    result += 4;
                    break;
                case 'V':
                    result += 4;
                    break;
                case 'W':
                    result += 4;
                    break;
                case 'Y':
                    result += 4;
                    break;
                case 'K':
                    result += 5;
                    break;
                case 'J':
                    result += 8;
                    break;
                case 'X':
                    result += 8;
                    break;
                case 'Q':
                    result += 10;
                    break;
                case 'Z':
                    result += 10;
                    break;

                default:
                    result += 1;
            }
        }
        return result;
    }
}






