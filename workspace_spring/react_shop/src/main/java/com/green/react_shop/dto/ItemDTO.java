package com.green.react_shop.dto;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
public class ItemDTO {
  private int itemNum;
  private String itemName;
  private int itemPrice;
  private String seller;
  private String itemIntro;
  private LocalDateTime regDate;



}






