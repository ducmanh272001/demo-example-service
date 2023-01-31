package com.afs.backend.example.common.constants;

import com.afs.backend.base.common.response.ErrorCode;

public interface ErrorCodes {
    ErrorCode SUBJECT_NOT_FOUND = new ErrorCode(10000, "error.subjectNotFound");
    ErrorCode GRADE_NOT_FOUND = new ErrorCode(10001, "error.gradeNotFound");
    ErrorCode LEVEL_NOT_FOUND = new ErrorCode(10002, "error.levelNotFound");
    ErrorCode LABEL_NOT_FOUND = new ErrorCode(10003, "error.labelNotFound");
    ErrorCode ANSWER_NOT_FOUND = new ErrorCode(10004, "error.answerNotFound");
    ErrorCode QUESTION_NOT_FOUND = new ErrorCode(10005, "error.questionNotFound");
    ErrorCode LIST_ANSWER_IS_NULL = new ErrorCode(10006, "error.listAnswerIsNull");
    ErrorCode QUESTION_TYPE_IS_NOT_VALID = new ErrorCode(10007, "error.questionTypeIsNotValid");
}
