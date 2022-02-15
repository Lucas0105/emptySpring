package com.cbnu.zmz.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StatusDTO {
    private boolean success;

    private boolean friend_accept;

    private int status;

    private String message;
}
