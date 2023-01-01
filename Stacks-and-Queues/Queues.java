class Queues {
    public static void main(String[] args) {
        BasicQueue<Integer> queue = new BasicQueue<Integer>(1);
        System.out.println(queue.head());
    }
}

class BasicQueue<T> {

    private BasicQueueNode<T> head;

    public BasicQueue() {
    }

    public BasicQueue(T value) {
        this.head = new BasicQueueNode<T>(value);
    }

    public Object head() {
        if (this.head == null)
            return null;
        return this.head.value;
    }

    private static class BasicQueueNode<T> {
        private T value;
        //private BasicQueue<T> next;

        public BasicQueueNode(T value) {
            this.value = value;
        }
    }
}
