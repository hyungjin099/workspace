package com.green.First;

public class OrderDTO {
  private String food;
  private int cnt;
  private String option;
  private String request;
  private String orderDate;

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public int getCnt() {
    return cnt;
  }

  public void setCnt(int cnt) {
    this.cnt = cnt;
  }

  public String getOption() {
    return option;
  }

  public void setOption(String option) {
    this.option = option;
  }

  public String getRequest() {
    return request;
  }

  public void setRequest(String request) {
    this.request = request;
  }

  public String getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(String orderDate) {
    this.orderDate = orderDate;
  }

  @Override
  public String toString() {
    return "OrderDTO{" +
            "food='" + food + '\'' +
            ", cnt=" + cnt +
            ", option='" + option + '\'' +
            ", request='" + request + '\'' +
            ", orderDate='" + orderDate + '\'' +
            '}';
  }
}
