package com.evernorth;

public class CustomExceptionTest {

	public static void main(String[] args) throws DepositException{
		int amount=1999;
		if(amount<1000)
			throw new DepositException("Monimum amount is 1000/-");
		else
			System.out.println(" thank you ");

	}

}
