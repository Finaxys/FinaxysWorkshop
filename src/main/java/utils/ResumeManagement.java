package utils;

import java.util.Map;

import model.Resume;

public class ResumeManagement {
	
	
	public boolean checkResumeExist(Map<Integer,Resume> listCV, Resume resume){
		
		for(int i=0; i<listCV.size(); i++){
			if(listCV.get(i).getName().equals(resume.getName())) return true;
		}
		return false;
	}

}
