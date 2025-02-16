public class SongDLList {
    private SongDLNode head;
    private int size;

    public SongDLList(int maxSize){
        this.head = null;
        this.size = 0;
    }

    public void addy(Song song){
        SongDLNode newNode = new SongDLNode(song);

        if(head == null){
            head = newNode;
        } else {
            SongDLNode temp = head;
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
            SongDLNode temp = head;
            for(int i = 0; i < pos -1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        SongDLNode temp = head;
        while (temp != null){
            sb.append(temp.data.toString()).append("\n");
            temp = temp.next;
        }
        return sb.toString();
    }

    public static void main(String[] args){
        System.out.println("Undertale Soundtrack: ");

        SongDLList songList = new SongDLList(4);
        Song song1 = new Song("Waterfall", "Toby Fox", 2.06);
        Song song2 = new Song("Run!", "Toby Fox", 0.26);
        Song song3 = new Song("Quiet Water", "Toby Fox", 0.32);
        Song song4 = new Song("Memory", "Toby Fox", 1.15);
        Song song5 = new Song("Dummy!", "Toby Fox", 2.25);

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
