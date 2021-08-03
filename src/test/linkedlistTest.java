import com.assignment.linkedlist;
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

}