public class Lab1{

	public static void main(String[] args) {
		
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		double z = Double.parseDouble(args[2]);

		double x1 = Double.parseDouble(args[3]);
		double y1 = Double.parseDouble(args[4]);
		double z1 = Double.parseDouble(args[5]);

		double x2 = Double.parseDouble(args[6]);
		double y2 = Double.parseDouble(args[7]);
		double z2 = Double.parseDouble(args[8]);

		Point3d p = new Point3d(x,y,z);
		Point3d p1 = new Point3d(x1,y1,z1);
		Point3d p2 = new Point3d(x2,y2,z2);

		//System.out.println(Point3d.equalsPoints(p,p1));

		if (Point3d.equalsPoints(p, p1) || Point3d.equalsPoints(p2, p1) 
			|| Point3d.equalsPoints(p, p2)){
			System.out.println("Имееются одинаковые точки");
		}
		else
		 System.out.printf("%.2f", computeArea(p, p1, p2));
	}

	public static double computeArea(Point3d p, Point3d p2, Point3d p3){

		//sides
		double a = p.distanceTo(p2);
		double b = p2.distanceTo(p3);
		double c = p3.distanceTo(p);

		//perimeter
		double per = (a + b + c)/2;
		double s = Math.sqrt(per * (per - a) * (per - b) * (per - c));

		return s;
	}

}