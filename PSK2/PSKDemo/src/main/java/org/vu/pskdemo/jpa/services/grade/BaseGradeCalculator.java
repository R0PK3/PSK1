package org.vu.pskdemo.jpa.services.grade;

import jakarta.enterprise.context.ApplicationScoped;
import org.vu.pskdemo.jpa.qualifiers.RoundGrade;

@ApplicationScoped
@RoundGrade
public class BaseGradeCalculator implements GradeCalculator {

    @Override
    public double calculateFinalGrade(double assignmentScore, double examScore) {
        double grade = (assignmentScore * 0.2) + (examScore * 0.8);
        System.out.println("Using default implementation of GradeCalculator. Grade: " + grade);
        return grade;
    }
}

