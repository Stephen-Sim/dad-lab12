package Exercise6;

public class Station {
    private int id;
    private String name;
    private String districtName;
    private int[] dailyRainFall;

    // Constructor
    public Station(int id, String name, String districtName, int[] dailyRainFall) {
        this.id = id;
        this.name = name;
        this.districtName = districtName;
        this.dailyRainFall = dailyRainFall;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public int[] getDailyRainFall() {
		return dailyRainFall;
	}

	public void setDailyRainFall(int[] dailyRainFall) {
		this.dailyRainFall = dailyRainFall;
	}
}
