
public class SongAList {
    int size;
    int maxSize;
    Song[] songList;

    public SongAList(int maxSize){
        this.maxSize = maxSize;
        this.songList = new Song[maxSize];
        this.size = 0;
    }

    //Add new node with given song to list
    public void addy(Song song){
        if(size >= maxSize){
            maxSize *=2; //double the array size
            Song[] tempSongList = new Song[maxSize];
            for(int i = 0; i < size; i++){
                tempSongList[i] = songList[i];
            }
            songList = tempSongList;
        }
        songList[size] = song;
        size++;
    }

    //Remove item at position pos from AList
    public void removy(int pos){
        for(int i = pos; i < size-1; i++){
            songList[i] = songList[i+1];
        }
        songList[size - 1] = null;
        size--;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(songList[i].toString()).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args){
        System.out.println("Cyberpunk Edgerunners Soundtrack: ");

        SongAList songList = new SongAList(4);
        Song song1 = new Song("Let You Down", "Dawid Podsiadlo", 3.47);
        Song song2 = new Song("Who's Ready for Tomorrow", "Rat Boy, IBDY", 1.56);
        Song song3 = new Song("This fffire", "Franz Ferdinand", 3.38);
        Song song4 = new Song("I Really Want to Stay at Your House", "Rosa Walton, Hallie Coggins", 4.06);
        Song song5 = new Song("Major Crimes", "Health", 4.13);

        //add songs to list
        songList.addy(song1);
        songList.addy(song2);
        songList.addy(song3);
        songList.addy(song4);
        songList.addy(song5); //increase list size

        //remove song from list
        songList.removy(3);

        System.out.println(songList);
    }

}
