package com.example.amoniacairlines

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast
import java.lang.Exception

class DBhandlerAmoniac(context: Context): SQLiteOpenHelper(context, Constants.DB_NAME, null, Constants.DB_VERSION) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(Constants.CREATE_USER)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

    fun addUser(mCtx: Context, userModel: UserModel){
        val DATAUSER = ContentValues()
        DATAUSER.put(Constants.U_NAMA, userModel.nama)
        DATAUSER.put(Constants.U_PHOTO, userModel.photo)
        DATAUSER.put(Constants.U_LAHIR, userModel.tgllahir)
        DATAUSER.put(Constants.U_ALAMAT, userModel.alamat)
        DATAUSER.put(Constants.U_TELP, userModel.telepon)
        DATAUSER.put(Constants.U_EMAIL, userModel.email)
        DATAUSER.put(Constants.U_PASSWORD, userModel.password)
        DATAUSER.put(Constants.U_ADD_TIME, userModel.add_time)
        DATAUSER.put(Constants.U_UPDATE_TIME, userModel.update_time)

        val db = this.writableDatabase
        try {
            db.insert(Constants.TABLE_USER, null, DATAUSER)
            Toast.makeText(mCtx, "Sukses Menambahkan Data", Toast.LENGTH_SHORT).show()
        } catch (e: Exception){
            Toast.makeText(mCtx, e.message, Toast.LENGTH_SHORT).show()
        }
        db.close()
    }
}