public class SongSLList {
    String songTitle;
    String artist;
    double length;

    public SongSLList(String songTitle, String artist, double length){
        this.songTitle = songTitle;
        this.artist = artist;
        this.length = length;
        SongSLList songSLList = new SongSLList();

    }

    public void addy(SongSLList songSLList){

    }

    public void removy(int pos){}

    public String toString(){
        return "Song[title: " + songTitle + ", artist: " + artist + ", length: " + length + "]";
    }


}
