public class OrderModel {
private int orderNumber;
private int orderDate;


public OrderModel(int orderNumber, int orderDate) {
    this.orderNumber = orderNumber;
    this.orderDate = orderDate;
}


public int getOrderNumber() {
    return orderNumber;
}


public void setOrderNumber(int orderNumber) {
    this.orderNumber = orderNumber;
}


public int getOrderDate() {
    return orderDate;
}


public void setOrderDate(int orderDate) {
    this.orderDate = orderDate;
}

}
