package org.vu.pskdemo.jpa.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
@NamedQueries({@NamedQuery(name = "StudentGroup.findAll", query = "select g from StudentGroup as g")})
public class StudentGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic(optional = false)
    private String title;

    @Basic(optional = false)
    private Integer capacity;

    @Basic
    private Integer grade;

    @ManyToMany(mappedBy = "studentGroup")
    private List<Student> students;


    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

}
