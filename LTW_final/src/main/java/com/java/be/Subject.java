package com.java.be;

public class Subject {
	public Subject() {
		super();
	}
	public Subject(String subjectID, String subjectName, String noC) {
		super();
		this.subjectID = subjectID;
		this.subjectName = subjectName;
		this.noC = noC;
	}
	String subjectID;
	String subjectName;
	String noC;
	public String getSubjectID() {
		return subjectID;
	}
	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getNoC() {
		return noC;
	}
	public void setNoC(String noC) {
		this.noC = noC;
	}
}
