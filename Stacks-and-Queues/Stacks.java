import classes.BasicStack;

class Stacks {

    public static void main(String[] args) {
        BasicStack<Integer> stack = new BasicStack<Integer>();
        System.out.println("Starting with: " + stack + ", min=" + stack.min() + ", top=" + stack.top());

        System.out.println("Inserting values...");
        Integer[] values = new Integer[]{5, 4, 3, 2, 6, 1};
        for (Integer value : values) {
            stack.push(Integer.valueOf(value));
        }

        System.out.println(stack + ", min=" + stack.min() + ", top=" + stack.top());
        stack.pop();
        System.out.println(stack + ", min=" + stack.min() + ", top=" + stack.top());
        stack.pop();
        System.out.println(stack + ", min=" + stack.min() + ", top=" + stack.top());
    }
}