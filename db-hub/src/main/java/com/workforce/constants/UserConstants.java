package com.workforce.constants;


public final class UserConstants {
    //Prevent instantiation
    private UserConstants() {}

    public static final short FIRSTNAME_MAX_LENGTH = 50;
    public static final short LASTNAME_MAX_LENGTH = 50;
    public static final short EMAIL_MAX_LENGTH = 100;
    public static final short PHONE_MAX_LENGTH = 13;
    public static final short ADDRESS_MAX_LENGTH = 150;
    public static final short USER_TYPE_MAX_LENGTH = 25;

    public static final String FIRSTNAME_COLUMN_DEF = "VARCHAR(" + FIRSTNAME_MAX_LENGTH + ") CHECK (firstname <> '')";
    public static final String LASTNAME_COLUMN_DEF = "VARCHAR(" + LASTNAME_MAX_LENGTH + ") CHECK (lastname <> '')";
    public static final String EMAIL_COLUMN_DEF = "VARCHAR(" + EMAIL_MAX_LENGTH + ") CHECK (email <> '')";
    public static final String PHONE_COLUMN_DEF = "VARCHAR(" + PHONE_MAX_LENGTH + ") CHECK (phone <> '')";
    public static final String ADDRESS_COLUMN_DEF = "VARCHAR(" + ADDRESS_MAX_LENGTH + ") CHECK (address <> '')";
    public static final String USER_TYPE_COLUMN_DEF = "VARCHAR(" + USER_TYPE_MAX_LENGTH + ") CHECK (user_type <> '')";
}
