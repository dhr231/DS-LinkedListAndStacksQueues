import com.magic.datastructures.MyLinkedList;
import com.magic.datastructures.MyNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyNodeTest {

    @Test
    public void givenT3Numbers_WhenLinked_ShouldPassLinkedListTest()
    {
        MyNode<Integer> firstNode = new MyNode<>(15);
        MyNode<Integer> secondNode = new MyNode<>(16);
        MyNode<Integer> thirdNode = new MyNode<>(17);
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        boolean result = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void givenThreeNumbers_ShouldAddInLinkedList()
    {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(15);
        myLinkedList.add(16);
        myLinkedList.add(17);
        myLinkedList.printLinkedList();
        boolean result = myLinkedList.head.data == 17 && myLinkedList.head.getNext().data == 16 && myLinkedList.head.getNext().getNext().data == 15;
        Assertions.assertTrue(result);
    }



}