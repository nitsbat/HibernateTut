package org.bisht.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "User_Table")
public class UserDetails {

    @Id
    private int userId;

    @Transient
    private String username;

    @Temporal(TemporalType.DATE)
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
