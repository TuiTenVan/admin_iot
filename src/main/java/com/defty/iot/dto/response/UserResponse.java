package com.defty.iot.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {
    String rfidCode;
    String username;
    String gender;
    String studentCode;
    String className;
    Date createdDate;
}
