package com.workforce.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "role_permissions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RolePermissions {
    @Id
    @Column(
            name = "id",
            unique = true,
            nullable = false
    )
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "role_id",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "fk_role_role_permissions"),
            nullable = false
    )
    private Role roleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "permissions_id",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "fk_permissions_role_permissions"),
            nullable = false
    )
    private Permission permissionId;

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
