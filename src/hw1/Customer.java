package hw1;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer
{
	public String paymentType;//�ŷ���� cash or card
	public int payment;//������ �ݾ�
	public ArrayList<Item> selectedItem=new ArrayList<Item>();//�մ��� ������ ��ǰ �̸�  ArrayList�� ����
	
	Customer()
	{
	}
	
	//�Է��ϴ� ���ڰ� ������ �ݾ��̵ȴ�.
	void calculateBill()
	{
		Scanner scan=new Scanner(System.in);
		payment=scan.nextInt();
	}
	
	/*�ŷ������ ���Ѵ�.
	 *1.ī�� 
	 *2.����
	 */
	void choosePayment(String payment)
	{
		this.paymentType=payment;
	}
	
	//�ŷ������ �����̸� return true
	boolean isCashPayment()
	{
		if(paymentType=="cash")
			return true;
		else
			return false;
	}
	
	//�ŷ������ ī��� return true
	boolean isCardPayment()
	{
		if(paymentType=="card")
			return true;
		else
			return false;
	}
	
	void chooseToBuy()//��������
	{
		int index;
		Item item=new Item();
		System.out.println("���ǿ� �ش��ϴ� ���ڸ� �Է��ϼ���.");
		System.out.println("1.�� 2.��� 3.���");
		System.out.println("4.��ä 5.�� 6.����");
		
		Scanner scan=new Scanner(System.in);
		index=scan.nextInt();
		switch(index)
		{
		case 1:
			item.itemInformation("��");
			selectedItem.add(item);
			break;
		case 2:
			item.itemInformation("���");
			selectedItem.add(item);
			break;
		case 3:
			item.itemInformation("���");
			selectedItem.add(item);
			break;
		case 4:
			item.itemInformation("��ä");
			selectedItem.add(item);
			break;
		case 5:
			item.itemInformation("��");
			selectedItem.add(item);
			break;
		case 6:
			item.itemInformation("����");
			selectedItem.add(item);
			break;
		}
	}
}
