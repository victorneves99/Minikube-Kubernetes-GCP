package org.acme.response;

import java.util.Set;
import java.util.stream.Collectors;

import jakarta.validation.ConstraintViolation;

public class Result {

  private String message;

  private boolean success;

  public Result(String message) {
    this.message = message;
  }

  public Result(String message, boolean success) {
    this.message = message;
    this.success = true;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }

  public Result(Set<? extends ConstraintViolation<?>> violation) {
    this.success = false;
    this.message = violation.stream()
        .map(cv -> cv.getMessage())
        .collect(Collectors.joining(", "));
  }

}
