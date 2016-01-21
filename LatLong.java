import java.util.*;

public class LatLong{
	public static void main(String[] args){
		System.out.println("");
		Scanner console = new Scanner(System.in);
		System.out.println("Enter Latitude 1: ");
		double lat1deg = console.nextDouble();
		double lat1min = console.nextDouble();
		System.out.println("Enter Longitude 1: ");
		double lon1deg = console.nextDouble();
		double lon1min = console.nextDouble();
		System.out.println("Enter Latitude 2: ");
		double lat2deg = console.nextDouble();
		double lat2min = console.nextDouble();
		System.out.println("Enter Longitude 2: ");
		double lon2deg = console.nextDouble();
		double lon2min = console.nextDouble();
		stuff(lat1deg, lat1min, lon1deg, lon1min, lat2deg, lat2min, lon2deg, lon2min);
	}
	
	public static double stuff(double lat1deg, double lat1min, double lon1deg, double lon1min, double lat2deg, double lat2min, double lon2deg, double lon2min){
		double lat1 = lat1deg + (lat1min/60);
		double lon1 = lon1deg + (lon1min/60);
		double lat2 = lat2deg + (lat2min/60);
		double lon2 = lon2deg + (lon2min/60);
		
		
		double lat1rad = Math.toRadians(lat1);
		double lon1rad = Math.toRadians(lon1);
		double lat2rad = Math.toRadians(lat2);
		double lon2rad = Math.toRadians(lon2);
		
		double lambda = Math.toRadians(lon1-lon2);
		
		double deltabeforeacos = (Math.sin(lat1rad))*(Math.sin(lat2rad)) + (Math.cos(lat1rad))*(Math.cos(lat2rad)*Math.cos(lambda));
		double delta = Math.acos(deltabeforeacos);
		
		System.out.println("Angular Distance= "+delta+" radians");
		
		double distkm = 6372.795*delta;
		double distmi = 3959.863629*delta;
		
		System.out.println("Distance= "+(int)(distkm+.5)+" kilometers");
		System.out.println("Distance="+(int)(distmi+.5)+" miles");
		
		
		return delta;
	}
		
		
		
}	