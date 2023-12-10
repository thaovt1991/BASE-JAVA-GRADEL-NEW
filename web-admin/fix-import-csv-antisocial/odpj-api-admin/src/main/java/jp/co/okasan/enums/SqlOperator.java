package jp.co.okasan.enums;

public enum SqlOperator {
  EQUALS("="),
  GREAT_THAN_EQUALS(">="),
  LESS_THAN_EQUALS("<=");
  String value;

  SqlOperator(String value) {
    this.value = value;
  }

  public String getOperator() {
    return this.value;
  }
}
