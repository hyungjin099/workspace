package com.green.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;

@Setter
@Getter
@ToString
public class TestDTO {
  private int age;
  private String name;
}
