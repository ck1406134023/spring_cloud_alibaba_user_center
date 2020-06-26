package com.itmuch.usercenter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LombokTest {
//    public static final Logger LOGGER = LoggerFactory.getLogger(LombokTest.class);
    public static void main(String[] args) {
        UserRegisterDTO build = UserRegisterDTO.builder()
                .email("xx")
                .password("www")
                .confirmPassword("xxxx")
                .agreement(true)
                .build();

        log.info("UserRegisterDTO={}",build);
    }
}

//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@Builder
class UserRegisterDTO{
    private String email;
    private String password;
    private String confirmPassword;
    private String mobile;
    private boolean agreement;
}
