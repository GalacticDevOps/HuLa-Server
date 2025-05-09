package com.hula.core.user.domain.vo.req.friend;

import com.hula.domain.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * 好友校验
 * @author nyh
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FriendCheckReq extends BaseEntity {

    @NotEmpty
    @Size(max = 50)
    @Schema(description ="校验好友的uid")
    private List<Long> uidList;

}
