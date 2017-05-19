import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mollyarant on 5/18/17.
 */
public class TestMyArrayList {
    MyArrayList list;

    @Before
    public void setUp(){
        list = new MyArrayList();
    }

    @Test
    public void testAddIfSizeSmallerThanLength(){

        //given
        String stuff= "stuff";
        //when
        list.add(stuff);
        //then
        Assert.assertEquals("should return 'stuff'", "stuff", list.myArray[0]);
        Assert.assertEquals("should return 1", 1, list.size);

    }

    @Test
    public void testAddIfSizeEqualToLength(){

        //given

        for(int i = 0; i < 12; i++) {
            String stuff= "stuff";
            stuff += i;

            //when
            list.add(stuff);
        }

        //then
        Assert.assertEquals("should return 'stuff11'", "stuff11", list.myArray[11]);
        Assert.assertEquals("should return 12", 12, list.size);

    }

    @Test
    public void testGetIndex(){
        //given:
        int index=5;
        for(int i = 0; i < 12; i++) {
            String stuff= "stuff";
            stuff += i;


            list.add(stuff);
        }

        //when:
        list.getIndexValue(index);
        //then:
        Assert.assertEquals("Should return value at index 5", "stuff5", list.myArray[5]);

    }

    @Test
    public void testGetIndexIfLargerThanSize(){
        //given:
        int index=14;
        for(int i = 0; i < 12; i++) {
            String stuff= "stuff";
            stuff += i;


            list.add(stuff);
        }

        //when:
        list.getIndexValue(index);
        //then:
        Assert.assertEquals("Should return a String message that index does not exist", null, list.myArray[14]);

    }

    @Test
    public void testRemove(){
        //given
        int index=10;
        for(int i=0; i<12;i++){
            String stuff="stuff";
            stuff +=i;

            list.add(stuff);
        }
        //when
        list.removeIndex(index);
        //then
        Assert.assertEquals("Should remove element from array and move other elements over", "stuff11", list.myArray[10]);

    }


    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveIfIndexOutOfBounds() throws IndexOutOfBoundsException {
        list.removeIndex(list.size+1);
    }

    @Test
    public void testSet(){
        //given
        int index=10;
        String element= "not stuff";
        //when
        for(int i=0; i<12;i++){
            String stuff= "stuff";
            stuff +=i;
            list.add(stuff);
        }
        list.set(index, element);

        //then
        Assert.assertEquals("Should return the element that was replaced in the array", "not stuff", list.myArray[10]);
    }

    @Test (expected= IndexOutOfBoundsException.class)
    public void testSetIfIndexOutOfBounds() throws IndexOutOfBoundsException{
        list.set(list.size+1, "e");
    }

    @Test
    public void testClear(){
        //given
        for (int i=0; i<12;i++){
            String stuff= "stuff";
            stuff +=i;
            list.add(stuff);
        }
        //when
        list.clear();

        //then
        Assert.assertEquals("This should return null after cleared", null, list.myArray[10]);

    }

    @Test
    public void testIsEmpty(){
        //given
        for(int i=0;i<12;i++){
            String stuff= "stuff";
            stuff +=i;
            list.add(stuff);
        }
        list.clear();
        //when
        list.isEmpty();
        //then
        Assert.assertTrue("this should return true only if the array is empty", true);
    }

    @Test
    public void testIsEmptyIfNotEmpty(){
        //given
        for(int i=0;i<12;i++){
            String stuff= "stuff";
            stuff +=i;
            list.add(stuff);
        }
        //when
        list.isEmpty();
        //then
        Assert.assertFalse("this should return true only if the array is empty", false);
    }

    @Test
    public void testDoesContain(){
        //given
        for(int i=0;i<12;i++){
            String stuff= "stuff";
            stuff +=i;
            list.add(stuff);
        }

        String element= "stuff5";
        //when
        list.doesContain(list.myArray, element);

        //then
        Assert.assertTrue("this should only return true if the value is found within the array", true);
    }

    @Test
    public void testDoesContainIfItDoesNotActuallyContain(){
        //given
        for(int i=0;i<12;i++){
            String stuff= "stuff";
            stuff +=i;
            list.add(stuff);
        }

        String element= "stuff14";
        //when
        list.doesContain(list.myArray, element);

        //then
        Assert.assertFalse("this should only return false if the value is not found within the array", false);
    }




}
