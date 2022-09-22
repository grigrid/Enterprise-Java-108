package classes;

public class IntArrayList implements IntList{
    int[] arr= new int[10];
    int counter=0;

    public void add(int number){

        if(counter<arr.length){
                arr[counter]=number;
                counter++;
        }else{
            int[] arr2= new int [(int) (arr.length*1.5)];
            for(int i=0;i<arr.length;i++){
                arr2[i]=arr[i];
            }
            arr2[arr.length]=number;
            counter++;
        }
        arr=arr2;
}

    @Override
    public int get(int index) {
        return arr[index];
    }
}
