package com.m4c.model.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Juan on 1/28/2015.
 */
@Entity
@Table(name = "m4ccatlanguages")
@NamedQueries({
        @NamedQuery(
                name = "com.m4c.model.entity.Language.findAll",
                query = "SELECT l FROM Language l"
        )
})
public class Language implements Serializable {

    public static final String TAG = Language.class.getSimpleName();

    @Id
    @Column(name = "code")
    private String code;

    @Column(name = "english_name")
    private String englishName;

    @Column(name = "active")
    private boolean active;

    @Column(name = "default_locale")
    private String defaultLocale;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getDefaultLocale() {
        return defaultLocale;
    }

    public void setDefaultLocale(String defaultLocale) {
        this.defaultLocale = defaultLocale;
    }

    public Language(String englishName, boolean active, String defaultLocale) {
        this.englishName = englishName;
        this.active = active;
        this.defaultLocale = defaultLocale;
    }

    public Language() {
        englishName = null;
        active = false;
        defaultLocale = null;
    }
}
