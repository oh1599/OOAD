package hw1;

public class Item
{
	//��ǰ���� ���ݰ� ��ǰ������ �̷�����ִ�.
	String itemName;
	int price;
	
	/*1.�� 2.��� 3.���
	 *4.��ä 5.�� 6.���� */
	
	//���ڷ� ��ǰ�� �����ϸ� 
	//���� �� ��ǰ�� ���� �ϴ� �Լ�
	void itemInformation(String item)
	{
		switch(item)
		{
		case "��":
			this.price=30000;
			this.itemName="��";
			break;
		case "���":
			this.price=1200;
			this.itemName="���";
			break;
		case "���":
			this.price=12000;
			this.itemName="���";
			break;
		case "��ä":
			this.price=5000;
			this.itemName="��ä";
			break;
		case "��":
			this.price=1500;
			this.itemName="��";
			break;
		case "����":
			this.price=1000;
			this.itemName="����";
			break;
		}
	}	
}