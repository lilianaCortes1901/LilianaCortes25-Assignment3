import java.util.LinkedList;

public class SongSLList {
    private SongSLNode head;
    private int size;

    public SongSLList(int maxSize){
        this.head = null;
        this.size = 0;
    }

    public void addy(Song song){
        SongSLNode newNode = new SongSLNode(song);

        if(head == null){
            head = newNode;
        } else {
            SongSLNode temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public void removy(int pos){
        if(pos == 0){
            head = head.next;
        } else {
            SongSLNode temp = head;
            for(int i = 0; i < pos -1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        SongSLNode temp = head;
        while (temp != null){
            sb.append(temp.data.toString()).append("\n");
            temp = temp.next;
        }
        return sb.toString();
    }

    public static void main(String[] args){
        System.out.println("Cult of the Lamb Soundtrack: ");

        SongSLList songList = new SongSLList(4);
        Song song1 = new Song("Praise the Lamb", "River Boy", 6.00);
        Song song2 = new Song("Start a Cult", "River Boy", 4.59);
        Song song3 = new Song("Temple", "River Boy", 3.02);
        Song song4 = new Song("Work and Worship", "River Boy", 5.47);
        Song song5 = new Song("Faith Up", "River Boy", 2.12);

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
