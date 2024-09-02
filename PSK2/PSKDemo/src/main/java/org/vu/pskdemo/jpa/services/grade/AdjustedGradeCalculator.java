package org.vu.pskdemo.jpa.services.grade;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Specializes;

@ApplicationScoped
@Alternative
public class AdjustedGradeCalculator extends BaseGradeCalculator {

    @Override
    public double calculateFinalGrade(double assignmentScore, double examScore) {
        double grade = super.calculateFinalGrade(assignmentScore, examScore) + 0.5;
        System.out.println("Using @specializes implementation of grade calculator. Adjusted grade: " + grade);
        return grade;
    }
}
