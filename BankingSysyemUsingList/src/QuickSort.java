public class QuickSort {
    void quick (ListHeader datalist,int start, int end){
        if (start < end) {
            int p = patition(datalist,start,end);
            quick(datalist,start,p-1);
            quick(datalist,p+1,end);
        }
    }

  public int patition(ListHeader datalist,int start, int end) {
        double pivot = datalist.listEntry[end].accBalance;
        int i=0;
        for (int j = start; j < end; j++) {
            if(datalist.listEntry[j].accBalance < pivot){
                i++;
                double temp = datalist.listEntry[i].accBalance;
                datalist.listEntry[i].accBalance = datalist.listEntry[j].accBalance;
                temp = datalist.listEntry[j].accBalance;
            }
        }
        double temp = datalist.listEntry[i+1].accBalance;
        datalist.listEntry[i+1].accBalance = datalist.listEntry[end].accBalance;
        datalist.listEntry[end].accBalance = temp;
        return (i+1);

    }
}
