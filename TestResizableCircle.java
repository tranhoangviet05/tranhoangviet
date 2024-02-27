package baitapjava65;

public class TestResizableCircle {
	public static void main(String[] args) {
		ResizableCircle rs=new ResizableCircle(3);
		System.out.println(rs.getArea());
		rs.resize(10);
		System.out.println(rs.getArea());
	}
}
