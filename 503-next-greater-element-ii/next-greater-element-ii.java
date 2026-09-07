class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> Stack = new Stack<>();
        int nextGreaterElements[] = new int[nums.length];
        for(int i = 2*nums.length-1;i>=0;i--){
            int index = i%nums.length;
            while(!Stack.isEmpty()&&nums[Stack.peek()]<=nums[index]){
                Stack.pop();
            }
            if(Stack.isEmpty()){
                nextGreaterElements[index]=-1;
            } else{ 
                nextGreaterElements[index] = nums[Stack.peek()];
            }
            Stack.push(index);
        }
        return nextGreaterElements;
    }
}