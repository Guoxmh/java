public class PrintReceipt{
     public static void  main(String[] args){
		 Receipt  commodities = new Receipt("T",2);
		 
		 Receipt.Money  price = new Receipt("T恤",2,"T恤",1,"网球拍",1).new Money(15000);
		 price.print();
	 }
}

class  Receipt{

	private String A;
	private int amountA = 0;
	private int  priceShirt = 245;
	
	
	private  String B;
	private int amountB = 0;
	private int  priceSandShoe = 570;
	
	private   String C;
	private int amountC = 0;
	private int  priceTennisRacquest = 320;
    public  Receipt(){
		System.out.println("************消费单**************");
		System.out.println("名单"+"\t"+"单价"+"\t"+"个数"+"\t"+"金额");
	}
	
	public Receipt(String A,int amountA){
		this();
		this.A = A;
		this.amountA = amountA;
		if(A == "T恤"){
					System.out.println(A+"\t"+"￥"+priceShirt+"\t"+amountA+"\t"+"￥"+amountA*priceShirt);
		}else if(A == "网球鞋"){
			System.out.println(A+"\t"+"￥"+priceSandShoe+"\t"+amountA+"\t"+"￥"+amountA*priceSandShoe);
		}else  if(A == "网球拍"){
			System.out.println(A+"\t"+"￥"+priceTennisRacquest+"\t"+amountA+"\t"+"￥"+amountA*priceTennisRacquest);
		}

	}
	
	public Receipt(String A,int amountA,
	               String B,int amountB){
		this(A,amountA);
		this.B =  B;
		this.amountB = amountB;
		if(B == "T恤"){
					System.out.println(B+"\t"+"￥"+priceShirt+"\t"+amountB+"\t"+"￥"+amountB*priceShirt);
		}else if(B == "网球鞋"){
			System.out.println(B+"\t"+"￥"+priceSandShoe+"\t"+amountB+"\t"+"￥"+amountB*priceSandShoe);
		}else  if(B == "网球拍"){
			System.out.println(B+"\t"+"￥"+priceTennisRacquest+"\t"+amountB+"\t"+"￥"+amountB*priceTennisRacquest);
		}
		
	}
	public Receipt(String A,int amountA,
	               String  B,int amountB,
	               String C, int amountC){
		this(A,amountA,
	          B,amountB);
	
		this.C = C;
		this.amountC = amountC;
        //System.out.println("名单"+"\t"+"单价"+"\t"+"个数"+"\t"+"金额");
		//System.out.println(shirt+"\t"+"￥"+priceShirt+"\t"+amountShirt+"\t"+"￥"+amountShirt*priceShirt);
		//System.out.println(sandShoe+"\t"+"￥"+priceSandShoe+"\t"+amountSandShoe+"\t"+"￥"+amountSandShoe*priceSandShoe);
		//System.out.println(tennisRacquest+"\t"+"￥"+priceTennisRacquest+"\t"+amountTennisRacquest+"\t"
		                   // +"￥"+amountTennisRacquest*priceTennisRacquest);
		if(C == "T恤"){
					System.out.println(C+"\t"+"￥"+priceShirt+"\t"+amountC+"\t"+"￥"+amountC*priceShirt);
		}else if(C == "网球鞋"){
			System.out.println(C+"\t"+"￥"+priceSandShoe+"\t"+amountC+"\t"+"￥"+amountC*priceSandShoe);
		}else  if(C == "网球拍"){
			System.out.println(C+"\t"+"￥"+priceTennisRacquest+"\t"+amountC+"\t"+"￥"+amountC*priceTennisRacquest);
		}
	}
	
	class  Money{
		private int totalPrice;
		float dic = 0.8F;
		public Money(int totalPrice){
			this.totalPrice = totalPrice;
		}
		public int getMoney(){
			return this.totalPrice;
		}
		public void print(){
			int b = 0;
			int c = 0;
			int d = 0;
			if(A == "T恤") b = amountA*priceShirt;
		     else if(A == "网球鞋") b = amountA*priceSandShoe;
					else  if(A == "网球拍") b = amountA*priceTennisRacquest;
					
					if(B == "T恤") c = amountA*priceShirt;
		     else if(B == "网球鞋") c = amountA*priceSandShoe;
					else  if(B == "网球拍") c = amountA*priceTennisRacquest;
					
					if(C == "T恤") d = amountA*priceShirt;
		     else if(C == "网球鞋") d = amountA*priceSandShoe;
					else  if(C == "网球拍")  d = amountA*priceTennisRacquest;
			int  a =  b+c+d;
			System.out.println("折扣：8折");
		System.out.println("消费总金额  "+"￥"+a*dic);
		System.out.println("实际交费   ￥"+this.totalPrice);
		
		System.out.println("找钱    ￥"+(this.totalPrice-a*dic));
						   
		System.out.println("本次所获得的积分是"+(int)(a*0.03));
		}
		

	}
	
	
}