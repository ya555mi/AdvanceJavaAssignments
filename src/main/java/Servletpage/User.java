package Servletpage;
import java.util.Random;
public class User {
	String partyId;
	String firstName;
	String lastName; 
	String address; 
	String city;
	String zip;
	String state;
	String country; 
	String phone;
	String userLoginId;
	String password;
	String email;
	User()
	{}
public User(String partyId, String firstName, String lastName, String address, String city, String zip, String state,String country, String phone, String userLoginId, String password) {
	super();
	this.partyId = partyId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.address = address;
	this.city = city;
	this.zip = zip;
	this.state = state;
	this.country = country;
	this.phone = phone;
	this.userLoginId = userLoginId;
	this.password = password;
}
public String getRandom() {
    Random rnd = new Random();
    int number = rnd.nextInt(101);
    return String.format("%06d", number);
}
public String getPartyId() {
	return partyId;
}
public void setPartyId(String partyId) {
	this.partyId = partyId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getZip() {
	return zip;
}
public void setZip(String zip) {
	this.zip = zip;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getUserLoginId() {
	return userLoginId;
}
public void setUserLoginId(String userLoginId) {
	this.userLoginId = userLoginId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}	
}
