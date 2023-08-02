package ru.main_service.model.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.PositiveOrZero;
import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EventFullDto {

    Long id;

    String annotation;

    CategoryDto category;

    Integer confirmedRequests;

    LocalDateTime createdOn;

    String description;

    String eventDate;

    UserDto initiator;

    Location location;

    boolean paid;

    @PositiveOrZero
    Integer participantLimit;

    LocalDateTime publishedOn;

    @Value("${some.key:true}")
    boolean requestModeration;

    String state;

    String title;

    Long views;

    @Data
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class Location {

        Double lat;

        Double lon;
    }
}
