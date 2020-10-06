package com.example.amoniacairlines

object Constants {
    const val DB_NAME = "Amoniac.db"
    const val DB_VERSION = 1

    const val TABLE_USER = "Users"

    const val U_ID = "UserID"
    const val U_NAMA = "nama"
    const val U_PHOTO ="photo"
    const val U_LAHIR = "Tgl_Lahir"
    const val U_ALAMAT = "alamat"
    const val U_TELP = "telepon"
    const val U_EMAIL = "email"
    const val U_PASSWORD = "password"
    const val U_ADD_TIME = "add_time"
    const val U_UPDATE_TIME = "update_time"

    const val CREATE_USER = (
            "CREATE TABLE " + TABLE_USER +"("
                + U_ID          + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + U_NAMA        + " TEXT,"
                + U_PHOTO       + " TEXT,"
                + U_LAHIR       + " TEXT,"
                + U_ALAMAT      + " TEXT,"
                + U_TELP        + " TEXT,"
                + U_EMAIL       + " TEXT,"
                + U_PASSWORD    + " TEXT,"
                + U_ADD_TIME    + " TEXT,"
                + U_UPDATE_TIME + " TEXT"
                +")"
            )
}