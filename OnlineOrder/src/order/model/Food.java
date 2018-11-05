package order.model;

public class Food {
	private int foodid;
	private String foodname;
	private double price;
	private double discountprice;
	private String description;
	private String imgurl;
	public int getFoodid() {
		return foodid;
	}
	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscountprice() {
		return discountprice;
	}
	public void setDiscountprice(double discountprice) {
		this.discountprice = discountprice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	@Override
	public String toString() {
		return "Food [foodid=" + foodid + ", foodname=" + foodname + ", price=" + price + ", discountprice="
				+ discountprice + ", description=" + description + ", imgurl=" + imgurl + "]";
	}
}
