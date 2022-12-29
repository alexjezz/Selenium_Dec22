package Week3_day1;

public class iPad extends iPhone {

		public void watchMovie() {
			System.out.println("Overloading");
		}
		
		public String watchMovie(String orientation) {
			
			System.out.println("orientation started");
			return orientation;
		}
		
		public String watchMovie(String orientation, int timeout) {
			System.out.println("Potrait started");
			return "timeout";
		}
}
