package broadr;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

/**
 * Entity mapped to table REGISTRATION_MESSAGE.
 */
public class RegistrationMessage {

    private Long id;
    private String uuid;
    private String email;

    public RegistrationMessage() {
    }

    public RegistrationMessage(Long id) {
        this.id = id;
    }

    public RegistrationMessage(Long id, String uuid, String email) {
        this.id = id;
        this.uuid = uuid;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
