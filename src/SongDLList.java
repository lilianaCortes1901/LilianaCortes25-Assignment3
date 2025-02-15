public class SongDLList {
    String songTitle;
    String artist;
    double length;

    public SongDLList(String songTitle, String artist, double length){
        this.songTitle = songTitle;
        this.artist = artist;
        this.length = length;
        SongDLList songDLList = new SongDLList();
    }

    public void addy(SongDLList songDLList){

    }

    public void removy(int pos){

    }

    public String toString(){
        return "Song[title: " + songTitle + ", artist: " + artist + ", length: " + length + "]";
    }
}
