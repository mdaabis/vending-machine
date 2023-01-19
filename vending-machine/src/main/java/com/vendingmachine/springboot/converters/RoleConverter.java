package com.vendingmachine.springboot.converters;

import com.vendingmachine.springboot.utils.Role;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;


@Converter(autoApply = true)
public class RoleConverter implements AttributeConverter<Role, String>
{
    @Override
    public String convertToDatabaseColumn(Role role) {
        return role.getRole();
    }

    @Override
    public Role convertToEntityAttribute(String roleString) {
        return Role.getRoleEnum(roleString);
    }
}
