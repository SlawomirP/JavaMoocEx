public class ClockHand {
    private int wartosc;
    private int limit;

    public ClockHand (int limit){ // ustalenie limitu i zerowanie poczatkowej
        this.limit = limit;       // wartosci
        this.wartosc = 0;
    }

    public void advance(){ // zwiekszanie o 1 i zerowanie na limicie
        this.wartosc += 1;
        if (this.wartosc > this.limit){
            this.wartosc = 0;
        }
    }

    public int value() { // zwrocenie wartosci
        return this.wartosc;
    }

    public String toString (){ // zwrocenie stringa
        if(wartosc < 10){
            return "0" + wartosc;
        }
        return " " + wartosc;
    }
}
