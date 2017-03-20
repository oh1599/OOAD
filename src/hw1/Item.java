package hw1;

public class Item
{
	//상품들은 가격과 상품명으로 이루어져있다.
	String itemName;
	int price;
	
	/*1.밥 2.라면 3.고기
	 *4.야채 5.물 6.과자 */
	
	//인자로 상품명 전달하면 
	//가격 및 제품명 갱신 하는 함수
	void itemInformation(String item)
	{
		switch(item)
		{
		case "밥":
			this.price=30000;
			this.itemName="밥";
			break;
		case "라면":
			this.price=1200;
			this.itemName="라면";
			break;
		case "고기":
			this.price=12000;
			this.itemName="고기";
			break;
		case "야채":
			this.price=5000;
			this.itemName="야채";
			break;
		case "물":
			this.price=1500;
			this.itemName="물";
			break;
		case "과자":
			this.price=1000;
			this.itemName="과자";
			break;
		}
	}	
}