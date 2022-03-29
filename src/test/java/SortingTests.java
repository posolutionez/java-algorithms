import com.solutionez.learning.Sorter;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;

public class SortingTests {

    @Test
    public void testBubbleSortSwap(){

        int[] testArray = {3,4,5};

        //before swap
        Assert.assertTrue(testArray[0] == 3);
        Assert.assertTrue(testArray[1] == 4);


        Sorter sorter = new Sorter();
        sorter.swapElements(testArray, 0,1);

        Assert.assertTrue(testArray[0] == 4);
        Assert.assertTrue(testArray[1] == 3);

    }

    @Test
    public void testBubbleSortSwap_samePositions_noAction(){

        int[] testArray = {3,4,5};

        //before swap
        Assert.assertTrue(testArray[0] == 3);
        Assert.assertTrue(testArray[1] == 4);


        Sorter sorter = new Sorter();
        sorter.swapElements(testArray, 0,0);

        Assert.assertTrue(testArray[0] == 3);
        Assert.assertTrue(testArray[1] == 4);

    }


    @Test
    public void testBubbleSort_intArray_alreadySorted(){

        int[] inArray = { 1, 2, 3, 4, 5 };

        Sorter sorter = new Sorter();
        sorter.bubbleSort(inArray);

        System.out.println("here is the sorted Array");
        System.out.println(Arrays.toString(inArray));

        Assert.assertTrue(inArray[0] ==1);
        Assert.assertTrue(inArray[4] ==5);

    }

    @Test
    public void testBubbleSort_intArray(){

        int[] inArray = { 1, 14, 36, 84, 5,96,7 };

        Sorter sorter = new Sorter();
        sorter.bubbleSort(inArray);

        System.out.println("here is the sorted Array");
        System.out.println(Arrays.toString(inArray));

        Assert.assertTrue(inArray[0] ==1);
        Assert.assertTrue(inArray[6] ==96);

    }

    @Test
    public void testBubbleSort_intArray_withNegatives(){

        int[] inArray = { 1, 14, -36, 84, 5,-96,7 };

        Sorter sorter = new Sorter();
        sorter.bubbleSort(inArray);

        System.out.println("here is the sorted Array");
        System.out.println(Arrays.toString(inArray));

        Assert.assertTrue(inArray[0] == -96);
        Assert.assertTrue(inArray[6] == 84);

    }


}