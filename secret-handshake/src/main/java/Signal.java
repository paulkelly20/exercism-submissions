enum Signal {

    WINK(1), DOUBLE_BLINK(2), CLOSE_YOUR_EYES(3), JUMP(4);

     private  int number;
    Signal(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
