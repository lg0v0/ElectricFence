package info;

/**
 * 用于描述点，lng为经度，lat为纬度
 * @author root
 *
 */
public class Point {
	public double lng;
	public double lat;
	public Point() {}
	public Point(double x,double y) {
		lng=x;
		lat=y;
	}
	public void set(double x,double y) {
		lng=x;
		lat=y;
	}
}