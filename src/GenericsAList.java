
public class GenericsAList {
    int size;
    int maxSize;
    Object[] genList;

    public GenericsAList(int maxSize){
        this.maxSize = maxSize;
        this.genList = new Object[maxSize];
        this.size = 0;
    }

    //Add new item to list
    public void addy(Object item){
        if(size >= maxSize){
            maxSize *=2; //double the array size
            Object[] tempGenList = new Object[maxSize];
            for(int i = 0; i < size; i++){
                tempGenList[i] = genList[i];
            }
            genList = tempGenList;
        }
        genList[size] = item;
        size++;
    }

    //Remove item at position pos from AList
    public void removy(int pos){
        for(int i = pos; i < size-1; i++){
            genList[i] = genList[i+1];
        }
        genList[size - 1] = null;
        size--;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(genList[i].toString()).append("\n");
        }
        return sb.toString();
    }

}
