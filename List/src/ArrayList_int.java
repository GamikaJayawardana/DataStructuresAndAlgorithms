public class ArrayList_int {

    int maxSize;
    int position;
    int[] listEntry;

    public ArrayList_int(int size) {
        maxSize = size;
        position = -1;
        listEntry = new int[maxSize];
    }

    boolean isListEmpty () {
        return ( position == -1);
    }

    boolean isListFull () {
        return ( position == maxSize - 1 );
    }

    int listSize() {
        return (position + 1);
    }

    void insertLast(int x) {
        if (isListFull()){
            System.out.println("List is Full");
        }
        position++;
        listEntry[position] = x;
    }




}