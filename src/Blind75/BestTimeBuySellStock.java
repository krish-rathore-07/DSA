package Blind75;

public class BestTimeBuySellStock {

    //best time to sell and buy the stock
    public static int BestTimeToBuySellStock(int prices[]){
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i= 1;i<prices.length;i++){
            int profit = prices[i]-minPrice;
            if(minPrice>prices[i]){
                minPrice=prices[i];
            }
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }

    void main(){
        int arr[] = {7,1,5,3,6,4};
        System.out.println("Maximum Profit is : " +BestTimeToBuySellStock(arr));

    }
}
