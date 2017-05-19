import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mollyarant on 5/18/17.
 */
public class TestMyArrayList {

    @Test
    public void testAddifSizeSmallerThanLength(){

        //given
       MyArrayList list = new MyArrayList();
        String stuff= "stuff";
        //when
        list.add(stuff);
        //then
        Assert.assertEquals("should return 'stuff'", "stuff", list.myArray[0]);
        Assert.assertEquals("should return 1", 1, list.size);

    }

    @Test
    public void testAddifSizeEqualToLength(){

        //given
        MyArrayList list = new MyArrayList();

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
}
