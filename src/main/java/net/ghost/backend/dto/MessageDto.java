package net.ghost.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MessageDto {
    private Long id;
    private String content;
    private String datetime;
    private String user;

//    public MessageDto(Long id, String content, String datetime, String user){
//        this.id = id;
//        this.content = content;
//        this.datetime = datetime;
//        this.user = user;
//    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getDatetime() {
        return datetime;
    }

    public String getUser() {
        return user;
    }
}
