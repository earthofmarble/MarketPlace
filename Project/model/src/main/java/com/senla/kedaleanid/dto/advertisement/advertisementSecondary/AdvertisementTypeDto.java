package com.senla.kedaleanid.dto.advertisement.advertisementSecondary;

import com.senla.kedaleanid.dto.IModelDto;
import com.senla.kedaleanid.utility.mapper.annotation.Convertible;
import com.senla.kedaleanid.utility.mapper.annotation.ReferencedField;

import javax.validation.constraints.NotNull;

/**
 * Created by earthofmarble on Sep, 2019
 */
@Convertible
public class AdvertisementTypeDto implements IModelDto {
    @ReferencedField(name = "typeId")
    @NotNull(groups = AdvertisementFilterDto.AdvFilterGroup.class)
    private Integer id;
    private String typeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

}
