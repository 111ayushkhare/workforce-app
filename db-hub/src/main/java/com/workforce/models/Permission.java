package com.workforce.models;

import com.workforce.constants.PermissionConstants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "permissions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Permission {
    @Id
    @Column(
            name = "id",
            unique = true,
            nullable = false
    )
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(
            name = "name",
            length = PermissionConstants.NAME_MAX_LENGTH,
            columnDefinition = PermissionConstants.NAME_COLUMN_DEF,
            nullable = false
    )
    private String name;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(
            name = "resource_id",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "fk_permissions_resource")
    )
    private Resource resourceId;

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
