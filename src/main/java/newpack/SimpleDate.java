package newpack;


public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same place, they are the same.
        if (this == compared) {
            return true;
        }

        // if the object is not instance of SimpleDate, the objects are not the same
        if (!(compared instanceof SimpleDate)) {
            return false;
        }

        // let's cast the object to SimpleDate
        SimpleDate otherDate = (SimpleDate) compared;

        // if the object's values are the same, the objects are the same
        if (this.day == otherDate.day
                && this.month == otherDate.month
                && this.year == otherDate.year) {
            return true;
        }

        // other wise, the objects are not the same
        return false;
    }
    //Implement the method public void advance() that moves the date by one day.
    //In this exercise we assume that each month has 30 day.
    //NB! In certain situations you need to change the values of month and year.
    public void advance () {
        if (this.day <= 30){
            this.day += 1 ;
        }
        if (this.day > 30){
            this.day = 1;
            this.month += 1;
        }
        if (this.month > 12){
            this.month = 1;
            this.year ++;
        }
    }
    //Implement the method public void advance(int howManyDays) that moves the date by the number of days that is given.
    // Use the method advance() that you implemented in the previous section to help you in this.
    public void advance(int howManyDays){
        for(int i = 1; i <= howManyDays; i++){
            advance();
        }
    }
    //Let's add the possibility to advance time to the SimpleDate class.
    // Create the method public SimpleDate afterNumberOfDays(int days) for the class.
    // It creates a new SimpleDate object whose date is the specified number of days greater than the object that the
    // method was called on.assume that each month has 30 days. Notice that the old date object must remain unchanged!

    public SimpleDate afterNumberOfDays (int days) {
        SimpleDate after = new SimpleDate (this.day, this.month, this.year);
        after.advance(days);
        return after;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}

