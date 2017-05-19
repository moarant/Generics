import java.util.Arrays;

/**
 * Created by mollyarant on 5/18/17.
 */
public class MyArrayList {

    private static final int DEFAULT_CAPACITY = 10;

    public Object[] myArray;

    public int size;

    public MyArrayList() {
        this.myArray = new Object[DEFAULT_CAPACITY];
    }

    public void add(Object e){
        if(myArray.length>size){
            myArray[size]=e;
            size++;
        }
        else{
            increaseArrayLength();
            myArray[size]=e;
            size++;

        }

    }

    public void add(int index, Object element){
        if(myArray.length>size){
            myArray[index]=element;
            size++;
        }
        else{
            increaseArrayLength();
            myArray[index]=element;
            size++;
        }
    }

    public Object getIndexValue(int e){
        if(e>size || e<0){
            System.out.println("Index does not exist");
            return null;
        }
        else{
            return myArray[e];
        }
    }

    public void removeIndex(int removedIndex)throws IndexOutOfBoundsException{
        if(removedIndex>size ||removedIndex<0){
            throw new IndexOutOfBoundsException("Index "+removedIndex+ " does not exist in this array");
        }
        Object [] newArray= new Object[myArray.length];
        int counter=0;
        for(int i=0; i<myArray.length;i++){
            if(i!= removedIndex){
                newArray[counter]= myArray[i];
                counter++;
            }

        }
        myArray= newArray;
    }


    public Object set(int index, Object element) throws IndexOutOfBoundsException{
        if(index>size || index<0){
            throw new IndexOutOfBoundsException ("Index " + index + " does not exist in this array");
        }
        Object value= myArray[index];
        myArray[index]=element;
        return value;
    }

    public void clear(){
        for (int i = 0; i < size; i++)
            myArray[i] = null;

        size = 0;
    }



    private void increaseArrayLength(){
        Object[] newArray= new Object[myArray.length+10];
        for (int i=0;i<myArray.length;i++){
            newArray[i]=myArray[i];
        }
        myArray=newArray;
    }

    public boolean isEmpty(){
        boolean empty= true;
        for(int i=0; i<myArray.length;i++){
            if (myArray[i]!=null){
                empty=false;
            }
        }
        return empty;
    }

    public boolean doesContain(Object[] myArray, Object element){
        for(int i=0;i<size;i++) {
            if (myArray[i].equals(element)) {
                return true;
            }
        }
        return false;
    }









    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        System.out.println("length: " + myArrayList.myArray.length);
        System.out.println("size: " + myArrayList.size);
    }

}
