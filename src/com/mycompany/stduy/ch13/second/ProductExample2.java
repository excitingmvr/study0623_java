package com.mycompany.stduy.ch13.second;

public class ProductExample2 {

	public static void main(String[] args) {

		Product<Car, Integer> product = new Product<>();
		product.setKind(new Car());
		product.setModel(450);
		
		Car rtCar = product.getKind();
		int rtString = product.getModel();
		
		System.out.println(rtCar + " : " + rtString);
		
		
	}

}
