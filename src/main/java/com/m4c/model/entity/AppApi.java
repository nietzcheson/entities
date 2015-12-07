package com.m4c.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.m4c.model.base.StringTools;
import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.annotations.GenericGenerator;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.persistence.*;
import java.security.Key;
import java.util.Date;

/**
 * Created by Usuario on 03/12/2015.
 */
@Entity
@Table(name = "M4CAPPAPI")
@javax.persistence.SequenceGenerator(name="SEQ_APP_API", sequenceName="SEQ_APP_API",allocationSize=1)
public class AppApi {

    //Clave de la aplicacion



    public  Long id;
    //Nombre de la aplicación

    public String name;
    //Token publico

    public String publicToken = StringTools.generaToken(16);
    //Token privado

    public String secretToken = StringTools.generaToken(16);
    //Fecha de creacion

    public Date createdAt = new Date();
    //Bandera que determina si la aplicación podra consumir el Servicio Web

    public Integer active = 1;
    @JsonProperty("publicKey")
    public String publicKey;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_APP_API")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "PUBLIC_TOKEN")
    @JsonIgnore
    public String getPublicToken() {
        return publicToken;
    }

    public void setPublicToken(String publicToken) {
        this.publicToken = publicToken;
    }
    @Column(length = 16,name = "SECRET_TOKEN")
    @JsonIgnore
    public String getSecretToken() {
        return secretToken;
    }

    public void setSecretToken(String secretToken) {
        this.secretToken = secretToken;
    }
    @Column(name = "DATECREATED")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone="UTC" )
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Column(name = "ACTIVE")
    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }
    @Transient
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * Metodo para generar el token de una aplicación.
     * @return
     */
    public String generatePublicToken() throws Exception {
        /*
        Paso1: Concatenamos los parametros name y publicToken
        Paso2: Encriptamos la cadena del paso 1, con el metodo AES y con el secretToken
        Paso3: El resultado del paso 2 se generar en MD5 para acotar la cadena a 32 Caracteres.
         */


        return DigestUtils.md5Hex(encrypt(name + publicToken, secretToken));
    }
    static String IV = "AAAAAAAAAAAAAAAA";
    public static byte[] encrypt(String plainText, String encryptionKey) throws Exception {
        byte[] encrypted = null;
        try {

            byte[] raw = new byte[]{'T', 'h', 'i', 's', 'I', 's', 'A', 'S', 'e', 'c', 'r', 'e', 't', 'K', 'e', 'y'};
            Key skeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            byte[] iv = new byte[cipher.getBlockSize()];

            IvParameterSpec ivParams = new IvParameterSpec(iv);
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec,ivParams);
            encrypted  = cipher.doFinal(plainText.getBytes());
            System.out.println("encrypted string:" + encrypted.length);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return encrypted;
    }
    public String toString() {
        return name;
    }


}

