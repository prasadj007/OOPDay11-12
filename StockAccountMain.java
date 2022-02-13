package com.bridgelabz.day11;

import java.util.*;
public class StockAccountMain {


	public static void main(String[] args) {
		StockPortfolio portfolio = new StockPortfolio();
		portfolio.PortfolioValue();
	}
}


class Stock {
	int numberOfShares;
	double sharePrice;
	Scanner scanner = new Scanner(System.in);


	public double stockValueCalc() {
		numberOfShares = scanner.nextInt();
		sharePrice = scanner.nextDouble();
		return numberOfShares * sharePrice;
	}
}


class StockPortfolio {
	static int N;
	static double portfolioValue = 0;

	public void PortfolioValue() {
		Stock obj = new Stock();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of stocks N: ");
		N = sc.nextInt();

		double[] stocksValue = new double[N];
		String[] stockNames = new String[N];

		System.out.println("Enter Stock names: ");
		for (int i = 0; i < N; i++) {
			stockNames[i] = sc.next();
		}

		for (int i = 0; i < N; i++) {
			System.out.println("Enter " + stockNames[i] + " Nuumber of Shares and Share price: ");
			stocksValue[i] = obj.stockValueCalc();
			portfolioValue += stocksValue[i];
		}

		for (int i = 0; i < N; i++) {
			System.out.println(stockNames[i] + " current value is " + stocksValue[i]);
		}
		System.out.println("Total portfolio value is : " + portfolioValue);
	}

}



