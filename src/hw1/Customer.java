package hw1;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer
{
	public String paymentType;//거래방식 cash or card
	public int payment;//지불할 금액
	public ArrayList<Item> selectedItem=new ArrayList<Item>();//손님이 구매할 상품 이름  ArrayList로 구현
	
	Customer()
	{
	}
	
	//입력하는 숫자가 지불할 금액이된다.
	void calculateBill()
	{
		Scanner scan=new Scanner(System.in);
		payment=scan.nextInt();
	}
	
	/*거래방식을 정한다.
	 *1.카드 
	 *2.현금
	 */
	void choosePayment(String payment)
	{
		this.paymentType=payment;
	}
	
	//거래방식이 현금이면 return true
	boolean isCashPayment()
	{
		if(paymentType=="cash")
			return true;
		else
			return false;
	}
	
	//거래방식이 카드면 return true
	boolean isCardPayment()
	{
		if(paymentType=="card")
			return true;
		else
			return false;
	}
	
	void chooseToBuy()//문제없음
	{
		int index;
		Item item=new Item();
		System.out.println("물건에 해당하는 숫자를 입력하세요.");
		System.out.println("1.밥 2.라면 3.고기");
		System.out.println("4.야채 5.물 6.과자");
		
		Scanner scan=new Scanner(System.in);
		index=scan.nextInt();
		switch(index)
		{
		case 1:
			item.itemInformation("밥");
			selectedItem.add(item);
			break;
		case 2:
			item.itemInformation("라면");
			selectedItem.add(item);
			break;
		case 3:
			item.itemInformation("고기");
			selectedItem.add(item);
			break;
		case 4:
			item.itemInformation("야채");
			selectedItem.add(item);
			break;
		case 5:
			item.itemInformation("물");
			selectedItem.add(item);
			break;
		case 6:
			item.itemInformation("과자");
			selectedItem.add(item);
			break;
		}
	}
}
