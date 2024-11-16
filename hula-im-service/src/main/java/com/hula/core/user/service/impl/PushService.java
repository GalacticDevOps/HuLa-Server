package com.hula.core.user.service.impl;

import com.hula.common.constant.MQConstant;
import com.hula.common.domain.dto.PushMessageDTO;
import com.hula.core.user.domain.enums.WSBaseResp;
import com.hula.service.MQProducer;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author nyh
 */
@Service
public class PushService {
    @Resource
    private MQProducer mqProducer;

    public void sendPushMsg(WSBaseResp<?> msg, List<Long> uidList, Long uid) {
        mqProducer.sendMsg(MQConstant.PUSH_TOPIC, new PushMessageDTO(uidList, msg, uid));
    }

    public void sendPushMsg(WSBaseResp<?> msg, Long uid, Long cuid) {
        mqProducer.sendMsg(MQConstant.PUSH_TOPIC, new PushMessageDTO(uid, msg, cuid));
    }

    public void sendPushMsg(WSBaseResp<?> msg, Long uid) {
        mqProducer.sendMsg(MQConstant.PUSH_TOPIC, new PushMessageDTO(msg, uid));
    }
}
