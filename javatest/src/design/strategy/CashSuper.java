package design.strategy;

//money是商品原价，返回折后价或返现
abstract class CashSuper {
   public abstract double acceptCash(double money);
}
