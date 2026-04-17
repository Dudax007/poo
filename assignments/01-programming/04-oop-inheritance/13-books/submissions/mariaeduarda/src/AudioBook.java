public class AudioBook extends Book {
    private double fileSizeInMB;
    private int playLengthInMinutes;
    private String narrator;

    public AudioBook(String title, int year, String author, double fileSizeInMB, int playLengthInMinutes, String narrator) {
        super(title, year, author);
        this.fileSizeInMB = fileSizeInMB;
        this.playLengthInMinutes = playLengthInMinutes;
        this.narrator = narrator;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | File Size: %.2f MB | Length: %d minutes | Narrator: %s", fileSizeInMB, playLengthInMinutes, narrator);
    }

    public double getFileSizeInMB() {
        return fileSizeInMB;
    }

    public int getPlayLengthInMinutes() {
        return playLengthInMinutes;
    }

    public String getNarrator() {
        return narrator;
    }
}
public class AudioBook extends Book {
    private double fileSizeInMB;
    private int playLengthInMinutes;
    private String narrator;

    public AudioBook(String title, int year, String author, double fileSizeInMB, int playLengthInMinutes, String narrator) {
        super(title, year, author);
        this.fileSizeInMB = fileSizeInMB;
        this.playLengthInMinutes = playLengthInMinutes;
        this.narrator = narrator;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | File Size: %.2f MB | Length: %d minutes | Narrator: %s", fileSizeInMB, playLengthInMinutes, narrator);
    }

    public double getFileSizeInMB() {
        return fileSizeInMB;
    }

    public int getPlayLengthInMinutes() {
        return playLengthInMinutes;
    }

    public String getNarrator() {
        return narrator;
    }
}
