package dev.m3ttwin.runnerz.run;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RunNotFoundException extends RuntimeException {
  public RunNotFoundException() {
    super("Run not found");
  }
}
