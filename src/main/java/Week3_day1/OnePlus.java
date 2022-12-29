package Week3_day1;

public class OnePlus extends AndroidTv implements Android {
	
	public static void main(String[] args) {
		OnePlus one = new OnePlus();
		System.out.println(one.playMusic());
		System.out.println(one.playVideo());
		System.out.println(one.openAPP());
	}
	public String playVideo() {
		return null;
	}

	@Override
	public String playMusic() {
		
		return "Played Music";
	}

}
