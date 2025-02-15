
public class Song{
    private String title;
    private String artist;
    private double length;

    public Song(String title, String artist, double length){
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    public static void main(String[] args){
        Song song = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);
        System.out.println("New Song " + song.title + " by " + song.artist + ".");
        System.out.println("Song lenght: " + song.length);
    }

}