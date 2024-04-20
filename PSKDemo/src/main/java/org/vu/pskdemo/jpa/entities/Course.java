package org.vu.pskdemo.jpa.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic(optional = false)
    private String title;

    @Basic(optional = false)
    private Integer capacity;

    @Basic
    @Column(name = "grade")
    private Integer courseGrade;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;

    /*
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<StudentGroup> studentGroups = new ArrayList<>();
    */

}
