package com.githuh;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class pancard {
	@Id
private int id;
private String name;
private String pancardnumber;
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
public String getPancardnumber() {
	return pancardnumber;
}
public void setPancardnumber(String pancardnumber) {
	this.pancardnumber = pancardnumber;
}



}
