package com.unfbx.chatgptsteamoutput.entity;

import cn.hutool.json.JSONObject;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.sql.Timestamp;

@Data
@Accessors(chain = true)
@TableName("chat_detail")
public class ChatDetail {

    private static final long serialVersionUID = 415151360470410233L;

    @TableId(type = IdType.AUTO)
    private Long id;
    private Long chatInfoId;
    private String question;
    private String answer;
    private Long count;
    private Timestamp dateCreated;
    private String createdBy;
    private Integer status;

    @Override
    public String toString() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", id);
        jsonObject.put("chatInfoId", chatInfoId);
        jsonObject.put("question", question);
        jsonObject.put("answer", answer);
        jsonObject.put("count", count);
        jsonObject.put("dateCreated", dateCreated);
        jsonObject.put("createdBy", createdBy);
        jsonObject.put("status", status);
        return jsonObject.toString();
    }
}
