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
            Object [] newArray= new Object[myArray.length+10];
            for(int i=0;i<myArray.length;i++){
                newArray[i]=myArray[i];
            }
            myArray=newArray;
            myArray[size]=e;
            size++;

        }

    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        System.out.println("length: " + myArrayList.myArray.length);
        System.out.println("size: " + myArrayList.size);
    }

}
