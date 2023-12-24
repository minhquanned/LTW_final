package com.java.be;

public class RSP {
	String rspID;
	String spID;
	String studentID;
	String lecturerID;
	public String getRspID() {
		return rspID;
	}
	public void setRspID(String rspID) {
		this.rspID = rspID;
	}
	public String getSpID() {
		return spID;
	}
	public void setSpID(String spID) {
		this.spID = spID;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getLecturerID() {
		return lecturerID;
	}
	public void setLecturerID(String lecturerID) {
		this.lecturerID = lecturerID;
	}
	public RSP(String rspID, String spID, String studentID, String lecturerID) {
		super();
		this.rspID = rspID;
		this.spID = spID;
		this.studentID = studentID;
		this.lecturerID = lecturerID;
	}
	public RSP() {
		super();
	}
	@Override
	public String toString() {
		return "RSP [rspID=" + rspID + ", spID=" + spID + ", studentID=" + studentID + ", lecturerID=" + lecturerID
				+ "]";
	}
}
