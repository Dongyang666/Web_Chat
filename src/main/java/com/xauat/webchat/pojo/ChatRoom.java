package com.xauat.webchat.pojo;

import org.springframework.stereotype.Repository;

/**
 * Created by liudongyang on 2017/12/5.
 */
@Repository(value = "chatRoom")
public class ChatRoom {
    private int id;      //id
    private String chat_name;    //聊天室名称
    private String speaker_name;    //主讲人
    private String profile;    //简介
    private int status;            //状态

    public ChatRoom() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChat_name() {
        return chat_name;
    }

    public void setChat_name(String chat_name) {
        this.chat_name = chat_name;
    }

    public String getSpeaker_name() {
        return speaker_name;
    }

    public void setSpeaker_name(String speaker_name) {
        this.speaker_name = speaker_name;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ChatRoom{" +
                "id=" + id +
                ", chat_name='" + chat_name + '\'' +
                ", speaker_name='" + speaker_name + '\'' +
                ", profile='" + profile + '\'' +
                ", status=" + status +
                '}';
    }
}
