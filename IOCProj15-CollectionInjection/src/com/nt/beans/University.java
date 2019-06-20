package com.nt.beans;

import java.util.Date;
import java.util.Map;

public class University {
	private Map<String,String> facultySubjects;
	private Map<String,Date>  meetingDates;
	private Map<?,?> mapData;

	public void setMapData(Map<?, ?> mapData) {
		this.mapData = mapData;
	}

	public void setMeetingDates(Map<String, Date> meetingDates) {
		this.meetingDates = meetingDates;
	}

	public void setFacultySubjects(Map<String, String> facultySubjects) {
		this.facultySubjects = facultySubjects;
	}

	@Override
	public String toString() {
		return "University [facultySubjects=" + facultySubjects + ", meetingDates=" + meetingDates + ", mapData="
				+ mapData + "]";
	}

	
	
	
		
}//class
