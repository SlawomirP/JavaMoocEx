package rewq;


public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    //Create a method public boolean largerThan(Apartment compared)
    // that returns true if the apartment object whose method is called has a larger total area
    // than the apartment object that is being compared.
    public boolean largerThan(Apartment compare){
        if (this.squares > compare.squares) {
            return true;
        }
        if (this.squares < compare.squares){
            return false;
        }
        return false;
    }
//    Create a method public int priceDifference(Apartment compared)
//    that returns the price difference of the apartment object whose method was called and the apartment object received as the parameter.
//    The price difference is the absolute value of the difference of the prices (price can be calculated by multiplying the
//    price per square by the number of squares).

    public int priceDifference (Apartment compare){
        int objPrice = this.squares * this.pricePerSquare;
        int compPrice = compare.squares * compare.pricePerSquare;
        int difference = objPrice - compPrice;
        if (difference < 0){
            return difference * -1;
        }
    return difference;
    }

//    Write a method public boolean moreExpensiveThan(Apartment compared)
//    that returns true if the apartment object whose method is called is more expensive than
//    the apartment object being compared.

    public boolean moreExpensiveThan (Apartment compared){
        if ((this.squares * this.pricePerSquare) > (compared.squares * compared.pricePerSquare)){
            return true;
        }
        return false;
    }
}