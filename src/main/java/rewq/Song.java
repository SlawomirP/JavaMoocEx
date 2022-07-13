package rewq;

public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    public boolean equals(Object compared) {
        //1 location
        if (this == compared) {
            return true;
        }
        //2 types
        if (!(compared instanceof Song)) {
            return false;
        }
        // 3 variables
        Song comparedSong = (Song) compared;
        if (this.artist.equals(comparedSong.artist) && this.name.equals(comparedSong.name) &&
                this.durationInSeconds == comparedSong.durationInSeconds) {
            return true;
        }
        return false;
    }
}