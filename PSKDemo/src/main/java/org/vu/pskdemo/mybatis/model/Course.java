package org.vu.pskdemo.mybatis.model;

public class Course {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.COURSE.ID
     *
     * @mbg.generated Fri Apr 19 10:51:04 EEST 2024
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.COURSE.CAPACITY
     *
     * @mbg.generated Fri Apr 19 10:51:04 EEST 2024
     */
    private Integer capacity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.COURSE.GRADE
     *
     * @mbg.generated Fri Apr 19 10:51:04 EEST 2024
     */
    private Integer grade;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.COURSE.TITLE
     *
     * @mbg.generated Fri Apr 19 10:51:04 EEST 2024
     */
    private String title;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.COURSE.ID
     *
     * @return the value of PUBLIC.COURSE.ID
     *
     * @mbg.generated Fri Apr 19 10:51:04 EEST 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.COURSE.ID
     *
     * @param id the value for PUBLIC.COURSE.ID
     *
     * @mbg.generated Fri Apr 19 10:51:04 EEST 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.COURSE.CAPACITY
     *
     * @return the value of PUBLIC.COURSE.CAPACITY
     *
     * @mbg.generated Fri Apr 19 10:51:04 EEST 2024
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.COURSE.CAPACITY
     *
     * @param capacity the value for PUBLIC.COURSE.CAPACITY
     *
     * @mbg.generated Fri Apr 19 10:51:04 EEST 2024
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.COURSE.GRADE
     *
     * @return the value of PUBLIC.COURSE.GRADE
     *
     * @mbg.generated Fri Apr 19 10:51:04 EEST 2024
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.COURSE.GRADE
     *
     * @param grade the value for PUBLIC.COURSE.GRADE
     *
     * @mbg.generated Fri Apr 19 10:51:04 EEST 2024
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.COURSE.TITLE
     *
     * @return the value of PUBLIC.COURSE.TITLE
     *
     * @mbg.generated Fri Apr 19 10:51:04 EEST 2024
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.COURSE.TITLE
     *
     * @param title the value for PUBLIC.COURSE.TITLE
     *
     * @mbg.generated Fri Apr 19 10:51:04 EEST 2024
     */
    public void setTitle(String title) {
        this.title = title;
    }
}