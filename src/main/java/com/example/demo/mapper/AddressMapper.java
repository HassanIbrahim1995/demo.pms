package com.example.demo.mapper;

import com.example.demo.dto.ProfileDTO;
import com.example.demo.model.Profile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileMapper extends EntityMapper<ProfileDTO, Profile> {
}

