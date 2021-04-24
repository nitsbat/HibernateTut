package org.bisht.model;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "User")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    private String username;

    @Temporal(TemporalType.DATE)
    private Date date;

    @ElementCollection(fetch = FetchType.EAGER)
    @JoinTable(name = "User_Address", joinColumns = {
            @JoinColumn(name = "User_Id")})
    private List<Address> addressLists = new ArrayList<>();

    public List<Address> getAddressLists() {
        return addressLists;
    }

    public void setAddressLists(List<Address> addressLists) {
        this.addressLists = addressLists;
    }

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

    @Override
    public String toString() {
        return "UserDetails{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", date=" + date +
                '}';
    }
}
