import org.junit.Assert;
import org.junit.Test;

import com.bl.Linked.*;

public class MyLinkedListTest {
	@Test
	public void given3NumberAdded2LinkListToTop() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        myLinkedList.popLast();
        myLinkedList.printMyNodes();

		}
}
