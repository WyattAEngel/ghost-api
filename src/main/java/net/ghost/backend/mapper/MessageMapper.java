package net.ghost.backend.mapper;

import net.ghost.backend.dto.MessageDto;
import net.ghost.backend.entity.Message;

public class MessageMapper {

    public static MessageDto mapToMessageDto(Message message){
        return new MessageDto(
                message.getId(),
                message.getContent(),
                message.getDatetime(),
                message.getUser()
        );
    }

    public static Message mapToMessage(MessageDto messageDto){
        return new Message(
            messageDto.getId(),
            messageDto.getContent(),
            messageDto.getDatetime(),
            messageDto.getUser()
        );
    }
}
