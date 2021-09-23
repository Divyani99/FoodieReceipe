package com.example.homep1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Logdb.db";
    public static final String TABLE_NAME = "Login";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "Name";
    public static final String COL_3 = "UserName";
    public static final String COL_5 = "Pass";
    public static final String COL_6 = "ConPass";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create Table Login(ID integer Primary Key AutoIncrement,Name Text, UserName Text,Pass Text,ConPass Text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }

    public long addUser(String Name, String UserName, String Pass, String ConPass) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Name", Name);
        contentValues.put("UserName", UserName);
        contentValues.put("Pass", Pass);
        contentValues.put("ConPass", ConPass);

        long log = db.insert("Login", null, contentValues);
        db.close();
        return log;
    }
    public boolean checkUser (String UserName,String Pass)
    {
        String[] columns={COL_1};
        SQLiteDatabase db=getReadableDatabase();
        String selection=COL_3+ "=? AND "+COL_5+ "=? ";
        String[] selectionArgs={UserName,Pass};
        Cursor cursor=db.query(TABLE_NAME,columns,selection,selectionArgs,null,null,null);
        int count=cursor.getCount();
        cursor.close();
        db.close();
        if (count>0)
            return true;
        else

            return false;

    }
}