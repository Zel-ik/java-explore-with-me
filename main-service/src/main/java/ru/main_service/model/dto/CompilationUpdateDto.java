package ru.main_service.model.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Size;
import java.util.Set;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CompilationUpdateDto {
    Set<Long> events;

    boolean pinned;

    @Size(min = 1, max = 50)
    String title;
}
