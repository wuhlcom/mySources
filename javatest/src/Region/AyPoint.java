package Region;

public class AyPoint {

    /*
     * X坐标
     */
    private double _x;
    //	public void setX(double x){
//		this._x = x;
//	}
    /*
	 * Y坐标
	 */
    private double _y;

    /*
     * 构造函数
     */
    public AyPoint(double x, double y) {
        this._x = x;
        this._y = y;
    }

    public double getX() {
        return _x;
    }
//	public void setY(double y){
//		this._y = y;
//	}

    public double getY() {
        return _y;
    }
}
