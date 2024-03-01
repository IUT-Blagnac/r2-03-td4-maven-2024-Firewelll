public class MainSchtroumpf {
	public static void main (String[] argv) {
		Schtroumpf grognon = new Schtroumpf("Grognon", 135);
		grognon.sePresenter();
		grognon.allerTravailler();
		grognon.sePresenter();
		grognon.manger(10);
		grognon.sePresenter();
		grognon.anniversaire();
		grognon.sePresenter();
	}

}
