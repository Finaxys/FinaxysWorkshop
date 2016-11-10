package model;

public class Resume {
	
	String name,education,experience,skills,language;

	public Resume() {
	}
	
	public Resume(String name, String education, String experience, String skills, String language) {
		super();
		this.name = name;
		this.education = education;
		this.experience = experience;
		this.skills = skills;
		this.language = language;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	

}
