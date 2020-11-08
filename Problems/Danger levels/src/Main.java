enum DangerLevel {
	HIGH(3),
	MEDIUM(2),
	LOW(1);

	int dangerLevel;

	DangerLevel(int i) {
		this.dangerLevel = i;
	}

	int getLevel() {
		return dangerLevel;
	}
}