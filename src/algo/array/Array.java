package algo.array;

public class Array {
    // 保存数据
    private int[] data;
    // 定义数组长度
    private int n;
    // 定义数组中元素个数
    private int count;

    public Array(int capacity) {
        this.data = new int[capacity];
        this.n = capacity;
        this.count = 0;
    }

    /**
     * 根据索引，找到数据中的元素并返回
     *
     * @param index
     * @return
     */
    public int find(int index) {
        if (index < 0 || index >= count) {
            return -1;
        }
        return data[index];
    }

    /**
     * 在指定位置插入元素
     *
     * @param index
     * @param value
     * @return
     */
    public boolean insert(int index, int value) {
        if (count == n) {
            System.out.println("没有可插入的位置");
            return false;
        }
        if (index < 0 || index > count) {
            System.out.println("位置不合法");
            return false;
        }
        for (int i = count; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        count++;
        return true;
    }

    /**
     * 删除指定位置上的元素
     *
     * @param index
     * @return
     */
    public boolean delete(int index) {
        if (index < 0 || index >= count) {
            return false;
        }
        // 从删除位置开始，将后面的元素向前移动
        for (int i = index + 1; i < count; i++) {
            data[i - 1] = data[i];
        }
        count--;
        return true;
    }

    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) {
        Array array = new Array(5);
        array.insert(0, 4);
        array.insert(1, 7);
        array.insert(2, 3);
        array.insert(3, 6);
        array.insert(1, 5);
        array.printAll();

        array.delete(2);
        array.printAll();
    }
}
