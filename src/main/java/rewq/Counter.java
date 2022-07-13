package rewq;

public class Counter {

    int startValue;

    public Counter(int startValue){
        this.startValue = startValue;
    }

    public Counter () {
        this.startValue = 0;
    }

    public int value () {
        return this.startValue;
    }

    public void increase () {
        this.startValue ++;
    }

    public void decrease () {
        this.startValue --;
    }

    public void increase (int increaseBy){
        if (increaseBy > 0 ) {
            this.startValue += increaseBy;
        }
    }
    public void decrease (int decreaseBy){
        if (decreaseBy > 0) {
            this.startValue -= decreaseBy;
        }
    }
}