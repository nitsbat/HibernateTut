package org.bisht.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "User")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    private String username;

    @Temporal(TemporalType.DATE)
    private Date date;

    @ElementCollection
    @JoinTable(name = "User_Address", joinColumns = {
            @JoinColumn(name = "User_Id")})
    private Set<Address> addressLists = new HashSet<>();

    public Set<Address> getAddressLists() {
        return addressLists;
    }

    public void setAddressLists(Set<Address> addressLists) {
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
