package com.unfbx.chatgptsteamoutput.service.impl;

import com.unfbx.chatgptsteamoutput.entity.ChatDetail;
import com.unfbx.chatgptsteamoutput.mapper.ChatDetailMapper;
import com.unfbx.chatgptsteamoutput.service.ChatDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChatDetailServiceImpl implements ChatDetailService {

    @Autowired
    private ChatDetailMapper chatDetailMapper;

    public void saveChatDetail(ChatDetail chatDetail) {
        chatDetailMapper.insert(chatDetail);
    }

}
