package com.exam.ExamBackend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_roles")
public class UserRoles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userRoleId;

    //user
    @ManyToOne(fetch = FetchType.LAZY)
    private Users user;

    //role
    @ManyToOne(fetch = FetchType.LAZY)
    private Roles role;

    public UserRoles() {
    }

    public UserRoles(Users user, Roles role) {
        this.user = user;
        this.role = role;
    }

    public long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
}
