package algo.queue;

/**
 * 基于数组实现的队列
 */
public class ArrayQueue {

    private String[] items;

    // 数组大小
    private int n = 0;

    // 对头下标
    private int head = 0;

    // 队尾下标
    private int tail = 0;

    public ArrayQueue(int capacity) {
        items = new String[capacity];
        this.n = capacity;
    }

    /**
     * 入队
     *
     * @param item
     * @return
     */
    public boolean enqueue(String item) {
        //如果tail == n 表示队列已经满了
        if (tail == n) {
            return false;
        }
        items[tail] = item;
        tail++;
        return true;
    }

    /**
     * 出队
     *
     * @return
     */
    public String dequeue() {
        // 如果head == tail表示队列为空
        if (head == tail) {
            return null;
        }
        String ret = items[head];
        head++;
        return ret;
    }

    public void printAll() {
        for (int i = head; i < tail; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }
}
