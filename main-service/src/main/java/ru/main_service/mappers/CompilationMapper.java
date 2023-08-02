package ru.main_service.mappers;

import ru.main_service.model.Compilation;
import ru.main_service.model.dto.CompilationDto;
import ru.main_service.model.dto.CompilationNewDto;
import ru.main_service.model.dto.EventShortDto;

import java.util.Set;

public class CompilationMapper {

    public static Compilation mapToModel(CompilationNewDto newCompilationDto) {
        Compilation compilation = new Compilation();
        compilation.setPinned(newCompilationDto.isPinned());
        compilation.setTitle(newCompilationDto.getTitle());
        return compilation;
    }

    public static CompilationDto mapToDto(Compilation compilation, Set<EventShortDto> events) {
        CompilationDto compilationDto = new CompilationDto();
        compilationDto.setId(compilation.getId());
        compilationDto.setPinned(compilation.getPinned());
        compilationDto.setTitle(compilation.getTitle());
        compilationDto.setEvents(events);
        return compilationDto;
    }
}
