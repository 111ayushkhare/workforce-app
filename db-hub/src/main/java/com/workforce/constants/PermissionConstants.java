package com.workforce.constants;

public final class PermissionConstants {
    public static final short NAME_MAX_LENGTH = 50;

    public static final String NAME_COLUMN_DEF = "VARCHAR(" + NAME_MAX_LENGTH + ") CHECK (name <> '')";
}
