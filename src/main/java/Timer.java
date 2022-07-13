public class Timer {
    private ClockHand hundredSec;
    private ClockHand oneSec;

    public Timer () {
        this.hundredSec = new ClockHand(100);
        this.oneSec = new ClockHand(1);
    }

    public String toString (){
        return this.oneSec + ":" + this.hundredSec;
    }

    public void advance (){
        this.hundredSec.advance();
        if (hundredSec.value() == 0){
            oneSec.advance();
        }
    }
}
