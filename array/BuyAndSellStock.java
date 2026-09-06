class BuyAndSellStock{
	public static void findBestTimeToBuyAndSellStock(int prices[]){
		int buyPrice = prices[0];
        int bestBuy = prices[0];
        int sellPrice = prices[0];
		int profit=0;
		for(int i=1;i<prices.length;i++){
			if(profit<(prices[i]-buyPrice)){
				profit=prices[i]-buyPrice;
				bestBuy=buyPrice;
				sellPrice=prices[i];
			}
			if(prices[i]<buyPrice){
				buyPrice=prices[i];
			}
		}
		System.out.println("Buying Prices :- "+bestBuy);
		System.out.println("Selling Prices :- "+sellPrice);
		System.out.println("Profit :- "+profit);
	}
	public static void main(String args[]){
		int arr[]={7,1,5,3,6,4};
		findBestTimeToBuyAndSellStock(arr);
	}
}