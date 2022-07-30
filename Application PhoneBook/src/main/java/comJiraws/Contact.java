package comJiraws;

public class Contact {

	private String lastName;
	private String firtName;

	private String phoneNumber;

	public Contact(String lastName, String firstName, String phoneNumber) {

		this.lastName = lastName;
		this.firtName = firstName;
		this.phoneNumber = phoneNumber;

	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirtName() {
		return firtName;
	}

	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return this.lastName + " " + this.firtName + " " + this.phoneNumber;

	}

}
