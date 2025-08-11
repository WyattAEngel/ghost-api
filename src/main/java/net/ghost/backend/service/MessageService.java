package net.ghost.backend.service;

import net.ghost.backend.dto.MessageDto;

public interface MessageService {
    MessageDto createMessage(MessageDto messageDto);

}
