
public class SongAList {
    String songTitle;
    String artist;
    double length;



    public void Song(String songTitle, String artist, double length){
        this.songTitle = songTitle;
        this.artist = artist;
        this.length = length;
    }

    //Add new node with given song to list
    public void addy(){

    }

    //Remove item at position pos from AList
    public void removy(int pos){

    }

    //Return string containing all elements in AList
    public String toString(){
        return "Song[title: " + songTitle + ", artist: " + artist + ", length: " + length + "]";
    }

}
