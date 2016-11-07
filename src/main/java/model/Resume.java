package model;

public class Resume {
	
	String education,experience,skills;

	
	
	public Resume(String education, String experience, String skills) {
		super();
		this.education = education;
		this.experience = experience;
		this.skills = skills;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}
	
	

}
