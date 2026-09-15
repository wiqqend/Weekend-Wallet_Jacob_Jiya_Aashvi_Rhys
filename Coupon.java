public class Coupon extends Activities {
    private String code;
    private double discount;

    public Coupon(String code, double discount, String activityName, double cost, double duration) {
        super(activityName, cost, duration);
        this.code = code;
        this.discount = discount;
    }

    public String getCode() {
        return code;
    }

    public double getDiscount() {
        return discount;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public boolean hasCoupon(String code) {
        return this.code.equals(code);
    }
}