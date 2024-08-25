public class ArrayListOperationsInt {
    public static void main (String[] args){

        ArrayList_int arrlist = new ArrayList_int(20);

        arrlist.insertLast(10);
        arrlist.insertLast(20);
        arrlist.insertLast(30);
        arrlist.insertLast(40);
        arrlist.insertLast(50);

        arrlist.traverselList();

        arrlist.insertList(2,60);
        arrlist.insertList(3,80);


        arrlist.traverselList();

        arrlist.deleteList(2);

        arrlist.traverselList();
    }

}
