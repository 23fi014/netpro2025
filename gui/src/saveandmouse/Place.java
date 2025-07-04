package saveandmouse;

public class Place {
	public static final String AREA = "area";
	public static final String STAGE = "stage";
	private int area = 0;
	private int stage = 0;
	public Place() {
		//セーブデータがない場合は最初から
		area = 1;
		stage = 1;
	}
	public Place(int area, int stage) {
		this.area = area;
		this.stage = stage;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getStage() {
		return stage;
	}
	public void setStage(int stage) {
		this.stage = stage;
	}
}