package com.xauat.webchat.serviceImpl;

import com.xauat.webchat.dao.IChatRoomDao;
import com.xauat.webchat.pojo.ChatRoom;
import com.xauat.webchat.service.IChatRoomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * NAME   :  WebChat/com.amayadream.webchat.serviceImpl
 * Author :  Amayadream
 * Date   :  2016.01.08 14:37
 * TODO   :
 */
@Service(value = "chatRoomService")
public class ChatRoomServiceImpl implements IChatRoomService {

    @Resource private IChatRoomDao chatRoomDao;

    @Override
    public List<ChatRoom> selectAll() {
        return chatRoomDao.selectAll();
    }

    @Override
    public List<ChatRoom> selectChatRoomInAnswer() {
        return chatRoomDao.selectChatRoomInAnswer();
    }

    @Override
    public List<ChatRoom> selectChatRoomByChatName(String chat_name) {
        return chatRoomDao.selectChatRoomByChatName(chat_name);
    }

    @Override
    public List<ChatRoom> selectChatRoomBySpeakerName(String speaker_name) {
        return chatRoomDao.selectChatRoomBySpeakerName(speaker_name);
    }

    @Override
    public List<ChatRoom> selectChatRoomByChatNameAndUserid(String chat_name, String nickname) {
        return chatRoomDao.selectChatRoomByChatNameAndUserid(chat_name,nickname);
    }

    @Override
    public ChatRoom selectChatRoomById(int id) {
        return chatRoomDao.selectChatRoomById(id);
    }

    @Override
    public boolean insert(ChatRoom chatRoom) {
        return chatRoomDao.insert(chatRoom);
    }

    @Override
    public boolean update(ChatRoom chatRoom) {
        return chatRoomDao.update(chatRoom);
    }

    @Override
    public boolean delete(int id) {
        return chatRoomDao.delete(id);
    }


}
