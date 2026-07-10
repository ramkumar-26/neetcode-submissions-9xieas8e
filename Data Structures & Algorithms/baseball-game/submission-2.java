class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String s : operations) {
            if (s.equals("C")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (s.equals("D")) {
                if (!stack.isEmpty()) {
                    stack.push(stack.peek() * 2);
                }
            } else if (s.equals("+")) {
                if (stack.size() >= 2) {
                    int top = stack.pop();
                    int sum = stack.peek() + top;
                    stack.push(top);
                    stack.push(sum);
                }
            } else {
                int value = Integer.parseInt(s);
                stack.push(value);
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}