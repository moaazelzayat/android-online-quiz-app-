package com.example.moaaz.quizapp.model;

/**
 * Created by moaaz on 3/1/2018.
 */

public class Question {
    private String Question, AnswerA, AnswerB, AnswerC, AnswerD, correctAnswer, categoryID,
            IsImageQuestion;

    public Question() {
    }

    public Question(String question, String answerA, String answerB, String answerC,
                    String answerD, String correctAnswer, String categoruID, String isImageQuestion) {
        this.Question = question;
        this.AnswerA = answerA;
        this.AnswerB = answerB;
        this.AnswerC = answerC;
        this.AnswerD = answerD;
        this.correctAnswer = correctAnswer;
        this.categoryID = categoruID;
        this.IsImageQuestion = isImageQuestion;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getAnswerA() {
        return AnswerA;
    }

    public void setAnswerA(String answerA) {
        AnswerA = answerA;
    }

    public String getAnswerB() {
        return AnswerB;
    }

    public void setAnswerB(String answerB) {
        AnswerB = answerB;
    }

    public String getAnswerC() {
        return AnswerC;
    }

    public void setAnswerC(String answerC) {
        AnswerC = answerC;
    }

    public String getAnswerD() {
        return AnswerD;
    }

    public void setAnswerD(String answerD) {
        AnswerD = answerD;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getCategoruID() {
        return categoryID;
    }

    public void setCategoruID(String categoruID) {
        this.categoryID = categoruID;
    }

    public String getIsImageQuestion() {
        return IsImageQuestion;
    }

    public void setIsImageQuestion(String isImageQuestion) {
        IsImageQuestion = isImageQuestion;
    }
}
