package order.model;

public class OrderDetail {
	private int orderdetailid;
	private int order_id;
	private int food_id;
	private int foodcount;
	public int getOrderdetailid() {
		return orderdetailid;
	}
	public void setOrderdetailid(int orderdetailid) {
		this.orderdetailid = orderdetailid;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getFood_id() {
		return food_id;
	}
	public void setFood_id(int food_id) {
		this.food_id = food_id;
	}
	public int getFoodcount() {
		return foodcount;
	}
	public void setFoodcount(int foodcount) {
		this.foodcount = foodcount;
	}
	@Override
	public String toString() {
		return "OrderDetail [orderdetailid=" + orderdetailid + ", order_id=" + order_id + ", food_id=" + food_id
				+ ", foodcount=" + foodcount + "]";
	}
}
