package studentDto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="StudentForm")
public class StudentDto {
@Id
private int ID;
private String Name;
private String Gender;
private long Ph_no;
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public long getPh_no() {
	return Ph_no;
}
public void setPh_no(long ph_no) {
	Ph_no = ph_no;
}
@Override
public String toString() {
	return "StudentDto [ID=" + ID + ", Name=" + Name + ", Gender=" + Gender + ", Ph_no=" + Ph_no + "]";
}



}
