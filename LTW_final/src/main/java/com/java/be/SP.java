package com.java.be;

public class SP {
	String spID;
	String spName;
	int schoolYear;
	int spPart;
	String subjectID;
	public String getSpID() {
		return spID;
	}
	public void setSpID(String spID) {
		this.spID = spID;
	}
	public String getSpName() {
		return spName;
	}
	public void setSpName(String spName) {
		this.spName = spName;
	}
	public int getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(int schoolYear) {
		this.schoolYear = schoolYear;
	}
	public int getSpPart() {
		return spPart;
	}
	public void setSpPart(int sqPart) {
		this.spPart = sqPart;
	}
	public String getSubjectID() {
		return subjectID;
	}
	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}
	public SP(String spID, String spName, int schoolYear, int sqPart, String subjectID) {
		super();
		this.spID = spID;
		this.spName = spName;
		this.schoolYear = schoolYear;
		this.spPart = sqPart;
		this.subjectID = subjectID;
	}
	public SP() {
		super();
	}
}
