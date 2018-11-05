package order.dao;

import order.model.Order;
import java.util.List;

public interface OrderDAO {
	public void addOrder(Order order);
	public void deleteOrder(int orderId);
	public void updateOrder(Order order);
	public List<Order> getAllOrder();
}
