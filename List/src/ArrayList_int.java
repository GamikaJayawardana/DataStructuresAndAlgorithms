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
            System.out.println("Attempt to insert at the end of a full list");
        }
        position++;
        listEntry[position] = x;
    }

    void insertList(int p, int element ) {
        if (isListFull()) {
            System.out.println("Attempt to insert an entry into a full list");
        }
        else if ( p < 0 || p > (listSize())) {
            System.out.println("attempt to insert a position not in the list");
        }
        else {
            for (int i = (listSize()); i < p ; i--) {
                listEntry[i] = listEntry[i-1];
            }
            listEntry[p] = element;
            position++;

        }

    }

    int deleteList(int p) {
        if (isListEmpty()) {
            System.out.println("Attempt to delete an entry from an empty list");
        }
        else if (p < 0 || p > (listSize())) {
            System.out.println("attempt to delete a position not in the list");
        }
        else {
            int element = listEntry[p];
            for (int i = p; i < (listSize()) ; i++) {
                listEntry[i] = listEntry[i=1];
            }
            position--;
            return element;
        }
        return 0;
    }

    int retriveList(int p) {
        if (isListEmpty()) {
            System.out.println("Attempt to delete an entry from an empty list");
        }
        else if (p < 0 || p > (listSize())) {
            System.out.println("attempt to delete a position not in the list");
        }
        else {
            return listEntry[p];
        }
        return 0;
    }

    int replaceList(int p, int x) {
        if (isListEmpty()) {
            System.out.println("Attempt to delete an entry from an empty list");
        }
        else if (p < 0 || p > (listSize())) {
            System.out.println("attempt to delete a position not in the list");
        }
        else {
            listEntry[p] = x;
        }
        return 0;
    }

    void traverselList() {
        int i;
        for (i=0; i< position+1; i++) {
            System.out.println(listEntry[i]);
        }
    }




}