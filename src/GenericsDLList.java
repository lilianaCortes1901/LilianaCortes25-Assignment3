
public class GenericsDLList {
    private GenericsDLNode head;
    private int size;

    public GenericsDLList(int maxSize){
        this.head = null;
        this.size = 0;
    }

    public void addy(Object item){
        GenericsDLNode newNode = new GenericsDLNode(item);

        if(head == null){
            head = newNode;
        } else {
            GenericsDLNode temp = head;
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
            GenericsDLNode temp = head;
            for(int i = 0; i < pos -1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        GenericsDLNode temp = head;
        while (temp != null){
            sb.append(temp.data.toString()).append("\n");
            temp = temp.next;
        }
        return sb.toString();
    }
}
