package com.hello.model;

public class School {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column school.id
	 * @mbg.generated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column school.school
	 * @mbg.generated
	 */
	private String school;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column school.id
	 * @return  the value of school.id
	 * @mbg.generated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column school.id
	 * @param id  the value for school.id
	 * @mbg.generated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column school.school
	 * @return  the value of school.school
	 * @mbg.generated
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column school.school
	 * @param school  the value for school.school
	 * @mbg.generated
	 */
	public void setSchool(String school) {
		this.school = school == null ? null : school.trim();
	}
}