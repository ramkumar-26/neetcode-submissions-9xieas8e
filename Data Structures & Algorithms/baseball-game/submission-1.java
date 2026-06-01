class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (String s : operations) {
            switch (s) {
                case "C":
                    deque.pop();
                    break;
                case "D":
                    deque.push(deque.peek() * 2);
                    break;
                case "+":
                    int top = deque.pop();
                    int newTop = top + deque.peek();
                    deque.push(top);
                    deque.push(newTop);
                    break;
                default:
                    deque.push(Integer.parseInt(s));
                    break;
            }
        }
        int sum = 0;
        for (int num : deque) {
            sum += num;
        }
        return sum;
    }
}