package com.hula.core.user.domain.vo.resp.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author nyh
 */
@Data
public class UserInfoResp {

    @Schema(description = "用户id")
    private Long id;

    @Schema(description = "用户账号")
    private String account;

    @Schema(description = "用户密码")
    private String password;

    @Schema(description = "用户昵称")
    private String name;

    @Schema(description = "头像")
    private String avatar;

    @Schema(description = "性别 1男 2女")
    private Integer sex;

    @Schema(description = "修改昵称次数")
    private Integer modifyNameChance;
}
