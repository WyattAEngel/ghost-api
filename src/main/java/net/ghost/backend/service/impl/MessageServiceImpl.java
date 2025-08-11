package net.ghost.backend.service.impl;

import lombok.AllArgsConstructor;
import net.ghost.backend.dto.MessageDto;
import net.ghost.backend.entity.Message;
import net.ghost.backend.mapper.MessageMapper;
import net.ghost.backend.repository.MessageRepository;
import net.ghost.backend.service.MessageService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MessageServiceImpl implements MessageService {

    private MessageRepository messageRepository;

    @Override
    public MessageDto createMessage(MessageDto messageDto) {

        Message message = MessageMapper.mapToMessage(messageDto);
        Message savedMessage = messageRepository.save(message);

        return MessageMapper.mapToMessageDto(savedMessage);
    }
}
