import java.util.Scanner;

class StackOfIntegers {
	
	private int [] elements;
	private int size;
	public static final int capacity = 16;
	public StackOfIntegers() {
		this(16);
		
	}
	 public StackOfIntegers(int capacity) {
	        elements = new int[capacity];
	    }
	    public int push(int value) {
	        if (size >= elements.length) {
	            int[] temp = new int[elements.length * 2];
	            System.arraycopy(elements, 0, temp, 0, elements.length);
	            elements = temp;
	        }

	        return elements[size++] = value;
	    }
	    public int pop() {
	        return elements[--size];
	    }
	    public int peek() {
	        return elements[size - 1];
	    }
	    public boolean empty() {
	        return size == 0;
	    }
	    public int getSize() {
	        return size;
	    }
	}

public class Problem10_5 {

	public static void main(String[] args) {
		System.out.print("Enter a positive integer: ");
        int num = new Scanner(System.in).nextInt();

        StackOfIntegers stack = new StackOfIntegers(20);

        int factor = 2;
        while (factor <= num) {
            if (num % factor == 0) {
                stack.push(factor);
                num /= factor;
            } else {
                factor++;
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }


    }
}


