package me.zhyd.oauth.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2019/1/31 13:47
 * @since 1.8
 */
@Builder
@Data
public class AuthUser {
    private String username;
    private String avatar;
    private String blog;
    private String nickname;
    private String company;
    private String location;
    private String email;
    private String remark;
    private AuthUserGender gender;
    private AuthSource source;
    private String accessToken;
}
