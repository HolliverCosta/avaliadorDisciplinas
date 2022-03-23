package com.engSoft.services;

import com.engSoft.entities.AvarageFeedback;
import com.engSoft.entities.Feedback;

import java.util.List;
import java.util.Optional;

public interface FeedbackService {
    void saveFeedback(Feedback feedback);
    List<Feedback> listFeedbacks();
    List<Feedback> listFeedbackByCourse(Long idCourse);
    AvarageFeedback avarageFeedbackByCourse(Long idCourse);
    void removeFeedback(Long idFeedback);
    Optional<Feedback> findFeedbackById(Long id);
    List<Feedback> findFeedbackBySemester(Long idSemester);
    List<Feedback> findFeedbakByCourseAndSemester(Long idCourse, Long idSemester);
    AvarageFeedback avarageFeedbackByCourseAndSemester(Long idCourse, Long idSemester);
    List<Feedback> findFeedbackByStudent(Long idStudent);

}
