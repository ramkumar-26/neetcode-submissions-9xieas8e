class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> deque = new ArrayDeque<>();
        for(String s : operations){
            switch(s) {
                case "C" :
                    deque.pop();
                    break;
                case "D" :
                    deque.push(deque.peek() * 2);
                    break;
                case "+" :
                     int num2 = deque.pop();
                     int num1 = deque.pop();
                     deque.push(num1);
                     deque.push(num2);
                     deque.push(num1 + num2);
                     break;
                default: 
                    deque.push(Integer.valueOf(s));
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