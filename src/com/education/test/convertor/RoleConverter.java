package com.education.test.convertor;

import javax.persistence.AttributeConverter;

import com.education.test.enumType.Role;

public class RoleConverter implements AttributeConverter<Role, Integer>{

	@Override
	public Integer convertToDatabaseColumn(Role attribute) {
		if(attribute == null)
			return null;
		
		return attribute.getCode();
	}

	@Override
	public Role convertToEntityAttribute(Integer dbData) {
		if(dbData == null)
			return null;
		
		return Role.fromCode(dbData);
	}

}
