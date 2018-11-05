package order.dao;

import java.sql.Connection;
import java.util.List;

import order.model.Order;
import order.util.DBUtil;

public class OrderDAOImplementation implements OrderDAO {
	private Connection conn;
	public OrderDAOImplementation() {
		conn = DBUtil.getConnection();
	}
	public void addOrder(Order order) {
		
	}
	public void deleteOrder(int orderId) {
		
	}
	public void updateOrder(Order order) {
		
	}
	public List<Order> getAllOrder(){
		return null;
	}
}
