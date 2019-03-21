import java.util.Scanner;

public class HomeGoods{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Order order = new Order();
		
		Commodities[]  goodsArrys = new Commodities[3];
		order.setGoodsArrys(goodsArrys);
		for(int i = 0; i < 3; i++){
				System.out.println("商品 价格 数量");
		        String input = scanner.nextLine();
		        String[] result = input.split(" ");
				goodsArrys[i] = new Commodities(result[0],Integer.parseInt(result[1]),
		                                                      Integer.parseInt(result[2]));
   
		}
		
	System.out.println("请输入支付金额");
	String inputpay = scanner.nextLine();
	 order.setPay(Integer.parseInt(inputpay));
	 
	 	System.out.println("请输入折扣");
        String inputDiscount = scanner.nextLine();
	 order.setDiscount(Double.parseDouble(inputDiscount));


		System.out.println(order.toString());
	}
}



class Order{
	
	private Double discount;
	private Integer pay;
	private Commodities[]  goodsArrys;
	public void setGoodsArrys(Commodities[]  goodsArrys){
		this.goodsArrys = goodsArrys;
	}
	
	public void setPay(Integer pay){
		this.pay = pay;
	}
	public void setDiscount(Double discount){
		this.discount = discount;
	}
   public Double getTotal(){
	Double total = 0.0 ;
		 for(int i = 0; i < 3; i++){
			total += goodsArrys[i].getTotalMoney();	
		}
		return total*discount*0.1;
 }
	
	public String toString(){
	  StringBuilder sb = new StringBuilder();
        sb.append("****************消费单****************").append("\n")
          .append("名称\t单价\t数量\t金额").append("\n");
        for(int i=0; i<this.goodsArrys.length; i++){
           sb.append(this.goodsArrys[i].toString()).append("\n");
        }
		sb.append("\n")
		  .append("支付总净额").append(this.pay).append("\n")
		  .append("折扣数").append(this.discount).append("\n")
		  .append("花费").append(getTotal()).append("\n")
		  .append("z找零").append(this.pay -getTotal() );
		
		return sb.toString() ;

	}
	
	
}



 

class Commodities{
	private String  tradeName;
	private Integer price;
	private Integer number;

	public Commodities(String tradeName, Integer price, Integer number ){
		this.tradeName = tradeName;
		this.price = price;
		this.number = number;
		
	}

	public Integer getTotalMoney(){
		return this.price*this.number;
	}
    public String toString(){
		return this.tradeName +"\t"+
		           this.price +"\t"+
		           this.number +"\t"+
				  this.getTotalMoney()+"\n";
	}
}

