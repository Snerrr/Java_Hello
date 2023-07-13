// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package hw_4;
import java.util.Iterator;
public class j2 {
    public static void main(String[] args) {
        MyQueue test = new MyQueue();
        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
        test.enqueue(4);

        print(test);
        Object elem = test.dequeue();
        System.out.println(elem);
        print(test);


        Object elemFirst = test.first();
        System.out.println(elemFirst);
        print(test);

    }
    static void print(MyQueue arg){
        arg.iteratorMyQueue();
    }
}
