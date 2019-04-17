package com.aew.crud_users.model;

import java.io.Serializable;

import javax.validation.constraints.Email;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.bson.types.ObjectId;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModelProperty;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents all the user’s information.
 * 
 * @author Adrian E. Wilgenhoff
 * @version 1.0
 * 
 */

@Document
@Data
@NoArgsConstructor
@Builder
public class User implements Serializable {

    private static final long serialVersionUID = 332873396325975251L;

    @Id
    @ApiModelProperty(notes = "The database generated user ID")
    private ObjectId _id;

    @ApiModelProperty(notes = "The username of the User", required = true)
    private String username;

    @JsonIgnore
    @ApiModelProperty(notes = "The password for loggin of the User", required = true)
    private String password;

    @ApiModelProperty(notes = "The name of the User", required = true)
    private String name;

    @ApiModelProperty(notes = "The lastname of the User", required = true)
    private String lastname;

    @ApiModelProperty(notes = "The address of the User", required = true)
    private String address;

    @ApiModelProperty(notes = "The city of the User", required = true)
    private String city;

    @Email(message = "Email should be valid")
    @ApiModelProperty(notes = "The email of the User", required = true)
    private String email;

    @ApiModelProperty(notes = "The telephone number of the User", required = true)
    private String telephone;

    @ApiModelProperty(notes = "The dni of the User", required = true)
    private long dni;

    /**
     * Construye un Usuario con sus datos personales.
     * 
     * @param username  valor utilizado para configurar el campo "username" del
     *                  usuario.
     * @param password  valor utilizado para configurar la contraseña de loggin del
     *                  usuario.
     * @param name      valor utilizado para configurar el nombre real del usuario.
     * @param lastname  valor utilizado para configurar el apellido real del
     *                  usuario..
     * @param address   valor utilizado para configurar la direcccion donde vive el
     *                  usuario.
     * @param city      valor utilizado para configurar la ciudad de residencia del
     *                  usuario.
     * @param email     valor utilizado para configurar el correo electronico del
     *                  usuario.
     * @param telephone valor utilizado para configurar el numero de telefono del
     *                  usuario.
     * @param dni       valor utilizado para configurar el dni del usuario.
     */

    public User(ObjectId id, String username, String password, String name, String lastname, String address,
            String city, String email, String telephone, Long dni) {
        this._id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.email = email;
        this.telephone = telephone;
        this.dni = dni;
    }

}
