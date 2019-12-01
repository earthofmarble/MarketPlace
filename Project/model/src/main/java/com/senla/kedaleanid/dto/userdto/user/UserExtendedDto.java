package com.senla.kedaleanid.dto.userdto.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.senla.kedaleanid.dto.IModelDto;
import com.senla.kedaleanid.dto.advertisement.advertisement.AdvertisementDto;
import com.senla.kedaleanid.dto.userdto.userSecondary.UserPhotoDto;
import com.senla.kedaleanid.model.user.UserRole;
import com.senla.kedaleanid.utility.mapper.annotation.Convertible;
import com.senla.kedaleanid.utility.mapper.annotation.ReferencedField;
import com.senla.kedaleanid.utility.mapper.enumeration.PropertyType;

import java.util.List;

/**
 * Created by earthofmarble on Sep, 2019
 */
@JacksonXmlRootElement
@Convertible
public class UserExtendedDto implements IModelDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @ReferencedField(type = PropertyType.COMPOSITE)
    private UserPhotoDto photoUrl;
    private UserRole role;
    private Integer rating;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @ReferencedField(name = "advertisements", type = PropertyType.COLLECTION, thisContainsClass = AdvertisementDto.class)
    private List<AdvertisementDto> advertisements;

    public List<AdvertisementDto> getAdvertisements() {
        return advertisements;
    }

    public void setAdvertisements(List<AdvertisementDto> advertisements) {
        this.advertisements = advertisements;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserPhotoDto getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(UserPhotoDto photoUrl) {
        this.photoUrl = photoUrl;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

}
