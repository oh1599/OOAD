package hw1;

import java.util.Scanner;

public class POST
{
	Customer customer;
	int totalPrice;
	int change;
	
	POST(Customer cus)
	{
		this.customer=cus;
	}
	
	void newCustomer(Customer cus)
	{
		this.customer=cus;
	}
	
	void choosePaymentType()//문제없다.
	{
		int index=0;
		
		System.out.println("거래 방식을 골라주세요");
		System.out.println("1.카드  2.현금");
		Scanner scan=new Scanner(System.in);
		index=scan.nextInt();
		if(index==1)
			customer.choosePayment("card");
		else
			customer.choosePayment("cash");
	}
	
	void printReceipt()
	{
		System.out.println("*********************");
		System.out.println("총 "+countPriceNumber()+" 개 구매");
		System.out.println("총 금액 "+totalPrice());
		System.out.println("*********************");
	}
	
	void returnChange()
	{
		System.out.println("얼마를 지불 하시겠습니까?");
		customer.calculateBill();
		
		change=customer.payment-totalPrice();
	}
	
	
	int totalPrice()
	{
		int total=0;
		for(int i=0;i<customer.selectedItem.size();i++)
		{
			total+=customer.selectedItem.get(i).price;
		}
		System.out.println(total);
		return total;
	}
	
	int countPriceNumber()
	{
		int res=customer.selectedItem.size();
		return res;
	}
	
	void treatCustomer()
	{
		System.out.println("어서 오십시오. 손님~!");
		choosePaymentType();
		
		if(customer.isCardPayment())
		{
			System.out.println("카드 받았습니다. ");
		}
		else
		{
			System.out.println("현금 받았습니다.");
		}//이상무
		System.out.println("총 "+countPriceNumber()+" 개 를 구매 하셨습니다.");
		System.out.println("총 "+totalPrice()+" 입니다.!");
		if(customer.isCashPayment())
		{
			returnChange();
			while(change<0)
			{
				System.out.println("거스름돈이 부족합니다 다시 확인 해주세요.");
				returnChange();
			}
			if(change==0)
				System.out.println("거스름돈은 없습니다.!");
			else if(change>0)
				System.out.println("거스름돈 "+change+"받으세요.");
			
		}
		else
		{
			System.out.println("영수증 뽑아드리겠습니다.");
			printReceipt();
		}
		
		System.out.println("감사합니다 또 오십쇼!");
	}
}
