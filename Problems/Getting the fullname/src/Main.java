class User {
	private String firstName;
	private String lastName;

	public User() {
		this.firstName = "";
		this.lastName = "";
	}

	public void setFirstName(String firstName) {
		// write your code here
		if (this.firstName == null) {
			this.firstName = "";
		} else {
			this.firstName = firstName;
		}
	}

	public void setLastName(String lastName) {
		// write your code here
		if (this.lastName == null) {
			this.lastName = "";
		} else {
			this.lastName = lastName;
		}
	}

	public String getFullName() {
		// write your code here
		if (firstName == null && lastName == null) {
			return "Unknown";
		} else if (firstName == null) {
			return this.lastName;
		} else if (lastName == null) {
			return this.firstName;
		} else {
			return this.firstName + " " + this.lastName;
		}
	}
}