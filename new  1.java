import java.util.*;

public class LatLong{
	public static void main(String[] args){
		System.out.println("");
		Scanner console = new Scanner(System.in);
		System.out.println("Enter Latitude 1: ")
		double lat1deg = console.nextdouble();
		double lat1min = console.nextdouble();
		System.out.println("Enter Longitude 1: ");
		double lon1deg = console.nextdouble();
		double lon1min = console.nextdouble();
		System.out.println("Enter Longitude 2: ");
		double lat2deg = console.nextdouble();
		double lat2min = console.nextdouble();
		System.out.println("Enter Longitude 2: ");
		double lon2deg = console.nextdouble();
		double lon2min = console.nextdouble();
	}
	
	public static double stuff(double lat1deg, double lat1min, double lon1deg, double lon1min, double lat2deg, double lat2min, double lon2deg, doublelon2min){
		lat1 = lat1deg + (lat1min/60);
		lon1 = lon1deg + (lon1min/60);
		lat2 = lat2deg + (lat2min/60);
		lon2 = lon2deg + (lon2min/60);
		
		lat1rad = Math.toRadians(lat1);
		lon1rad = Math.toRadians(lon1);
		lat2rad = Math.toRadians(lat2);
		lon2rad = Math.toRadians(lon2);
		
		double lambda = lon1rad-lon2rad;
		
		double deltabeforeacos = (Math.sin(lat1rad))*(Math.sin(lat2rad)) + (Math.cos(lon1rad)+(Math.cos(lon2rad));
		double delta = Math.acos(deltabeforeacos);
		
		
		
}	