package com.workforce.models;


import com.workforce.constants.UserConstants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @Column(
            name = "id",
            unique = true,
            nullable = false
    )
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(
            name = "firstname",
            length = UserConstants.FIRSTNAME_MAX_LENGTH,
            columnDefinition = UserConstants.FIRSTNAME_COLUMN_DEF,
            nullable = false
    )
    private String firstname;

    @Column(
            name = "lastname",
            length = UserConstants.LASTNAME_MAX_LENGTH,
            columnDefinition = UserConstants.LASTNAME_COLUMN_DEF,
            nullable = false
    )
    private String lastname;

    @Column(
            name = "email",
            length = UserConstants.EMAIL_MAX_LENGTH,
            columnDefinition = UserConstants.EMAIL_COLUMN_DEF,
            nullable = false,
            unique = true
    )
    private String email;

    @Column(
            name = "phone",
            length = UserConstants.PHONE_MAX_LENGTH,
            columnDefinition = UserConstants.PHONE_COLUMN_DEF,
            nullable = false,
            unique = true
    )
    private String phone;

    @Column(
            name = "address",
            length = UserConstants.ADDRESS_MAX_LENGTH,
            columnDefinition = UserConstants.ADDRESS_COLUMN_DEF
    )
    private String address;

    @Column(
            name = "user_type",
            length = UserConstants.USER_TYPE_MAX_LENGTH,
            columnDefinition = UserConstants.USER_TYPE_COLUMN_DEF
    )
    private String userType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "role_id",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "fk_users_role"),
            nullable = false
    )
    private Role roleId;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @PrePersist
    protected void onCreate() {
        isDeleted = false;
        createdAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
}
