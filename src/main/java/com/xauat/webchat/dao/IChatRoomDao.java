package com.xauat.webchat.dao;

import com.xauat.webchat.pojo.ChatRoom;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * NAME   :  WebChat/com.amayadream.webchat.dao
 * Author :  Amayadream
 * Date   :  2016.01.08 14:30
 * TODO   :
 */
@Service(value = "chatRoomDao")
public interface IChatRoomDao {
    List<ChatRoom> selectAll();
    List<ChatRoom> selectChatRoomInAnswer();
    List<ChatRoom> selectChatRoomByChatName(String chat_name);
    List<ChatRoom> selectChatRoomBySpeakerName(String speaker_name);
    List<ChatRoom> selectChatRoomByChatNameAndUserid(@Param("chat_name") String chat_name,@Param("nickname") String nickname);
    ChatRoom selectChatRoomById(int id);


    boolean insert(ChatRoom chatRoom);

    boolean update(ChatRoom chatRoom);

    boolean delete(int id);
}
