package algo.queue;

public class CircularQueue {

    // 数组
    private String[] items;

    // 数组大小
    private int n = 0;

    // 对头下标
    private int head = 0;

    // 队尾下标
    private int tail = 0;

    public CircularQueue(int capacity) {
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
        // 队列满了
        if ((tail + 1) % n == head) {
            return false;
        }
        items[tail] = item;
        tail = (tail + 1) % n;
        return true;
    }

    /**
     * 出队
     *
     * @return
     */
    public String dequeue() {
        if (head == tail) {
            return null;
        }
        String item = items[head];
        head = (head + 1) % n;
        return item;
    }
}
