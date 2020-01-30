
public class Carrier {
	private Aircraft[] ac;

	public Carrier() {
		this.ac = new Aircraft[5];
	}

	public Carrier(Aircraft[] ac) {
		this.ac = ac;
		for (int i = 0; i < this.ac.length; i++) {
			this.ac[i].setCurrentSpeed(0);
		}
	}

	public Aircraft[] getCrafts() {
		return this.ac;
	}

	public boolean planeLand(Aircraft p) {
		for (int i = 0; i < this.ac.length; i++) {
			if (this.ac[i] == null) {
				this.ac[i] = p;
				p.setCurrentSpeed(0);
				return true;
			}
		}
		return false;
	}

	public boolean planeTakeoff(Aircraft p) {
		for (int i = 0; i < this.ac.length; i++) {
			if (this.ac[i] == p) {
				this.ac[i] = null;
				p.setCurrentSpeed(10);
				return true;
			}
		}
		return false;

	}

	public String toString() {
		String s = "";
		for (Aircraft x : this.ac) {
			s += x + "/n";
		}
		return s;
	}

}
