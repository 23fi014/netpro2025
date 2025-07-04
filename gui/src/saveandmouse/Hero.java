package saveandmouse;

public class Hero {
	public static final String NAME = "name";
	public static final String LEVEL = "level";
	public static final String HP = "hp";
	public static final String MP = "mp";
	private String name = "";
	private int level = 0;
	private int hp = 0;
	private int mp = 0;
	public Hero() {
		//セーブデータがない場合は初期設定
		setName("名無し");
		level = 1;
		hp = 5;
		mp = 5;
	}
	public Hero(String name,int level, int hp, int mp) {
		this.setName(name);
		this.level = level;
		this.hp = hp;
		this.mp = mp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getHP() {
		return hp;
	}
	public void setHP(int hP) {
		hp = hP;
	}
	public int getMP() {
		return mp;
	}
	public void setMP(int mP) {
		mp = mP;
	}
}
