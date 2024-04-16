class Solution {
    public int[] solution(int money) {
        
        // 가격을 상수로 선언
        final int AMERICANO_PRICE = 5500;
        int numberOfAmericano = money / AMERICANO_PRICE;
        int remainingMoney = money % AMERICANO_PRICE;
        
        int[] answer = {numberOfAmericano, remainingMoney};
        return answer;
    }
}