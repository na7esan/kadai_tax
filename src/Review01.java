
public class Review01 {

	public static void main(String[] args) {
		int price = 1500;

		int tax_amount=get_tax_amount(price);

		int tax_included_price=price+tax_amount;

		System.out.println(price + "円の商品の税込み価格は" + tax_included_price + "(消費税は" + tax_amount + "円)です。");

	}

	public static int get_tax_amount(int price ) {
		double taxRate=0.1;
		int tax = (int) (price * taxRate);
		return tax;

	}

}
