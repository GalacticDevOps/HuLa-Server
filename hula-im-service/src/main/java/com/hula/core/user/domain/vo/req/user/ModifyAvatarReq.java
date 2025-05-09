package com.hula.core.user.domain.vo.req.user;

import com.hula.domain.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 修改用户名
 * @author nyh
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ModifyAvatarReq extends BaseEntity {

    @NotEmpty
    @Schema(description = "头像url")
    private String avatar;

}
