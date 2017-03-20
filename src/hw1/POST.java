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
	
	void choosePaymentType()//��������.
	{
		int index=0;
		
		System.out.println("�ŷ� ����� ����ּ���");
		System.out.println("1.ī��  2.����");
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
		System.out.println("�� "+countPriceNumber()+" �� ����");
		System.out.println("�� �ݾ� "+totalPrice());
		System.out.println("*********************");
	}
	
	void returnChange()
	{
		System.out.println("�󸶸� ���� �Ͻðڽ��ϱ�?");
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
		System.out.println("� ���ʽÿ�. �մ�~!");
		choosePaymentType();
		
		if(customer.isCardPayment())
		{
			System.out.println("ī�� �޾ҽ��ϴ�. ");
		}
		else
		{
			System.out.println("���� �޾ҽ��ϴ�.");
		}//�̻�
		System.out.println("�� "+countPriceNumber()+" �� �� ���� �ϼ̽��ϴ�.");
		System.out.println("�� "+totalPrice()+" �Դϴ�.!");
		if(customer.isCashPayment())
		{
			returnChange();
			while(change<0)
			{
				System.out.println("�Ž������� �����մϴ� �ٽ� Ȯ�� ���ּ���.");
				returnChange();
			}
			if(change==0)
				System.out.println("�Ž������� �����ϴ�.!");
			else if(change>0)
				System.out.println("�Ž����� "+change+"��������.");
			
		}
		else
		{
			System.out.println("������ �̾Ƶ帮�ڽ��ϴ�.");
			printReceipt();
		}
		
		System.out.println("�����մϴ� �� ���ʼ�!");
	}
}
