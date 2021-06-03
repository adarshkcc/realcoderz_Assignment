package assignment2;

public class Employee {
int empId;
String empName;
Address address;

public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
}
