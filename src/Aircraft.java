
public class Aircraft {
	private int currentSpeed; // current velocity
	private int maxSpeed; // maximum velocity that the aircraft is capable of

	public Aircraft() {
		this(0, 100);
	}

	public Aircraft(int currentSpeed, int maxSpeed) {
		this.setMaxSpeed(maxSpeed);
		this.setCurrentSpeed(currentSpeed);
	}

	public void setCurrentSpeed(int s) {
		if (s < 0) {
			this.currentSpeed = 0;
		} else if (s > this.maxSpeed) {
			this.currentSpeed = maxSpeed;
		} else {
			this.currentSpeed = s;
		}
	}

	public void setMaxSpeed(int m) {
		if (m < 50)
			this.maxSpeed = 50;
		else
			this.maxSpeed = m;
		if (this.currentSpeed > this.maxSpeed) {
			setCurrentSpeed(this.maxSpeed);
		}
	}

	public int getCurrentSpeed() {
		return this.currentSpeed;
	}

	public int getMaxSpeed() {
		return this.maxSpeed;
	}

	public String toString() {
		return "aircraft: speed= " + this.currentSpeed + ", maxSpeed= " + this.maxSpeed;
	}

	public boolean equals(Object o) {
		if (!(o instanceof Aircraft)) return false;
		Aircraft check = (Aircraft) o;
		if (this.currentSpeed == check.getCurrentSpeed() && this.maxSpeed == check.getMaxSpeed()) {
			return true;
		}
		return false;
	}
}
