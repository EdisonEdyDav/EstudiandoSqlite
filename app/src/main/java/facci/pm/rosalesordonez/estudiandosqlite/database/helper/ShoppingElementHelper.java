package facci.pm.rosalesordonez.estudiandosqlite.database.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import facci.pm.rosalesordonez.estudiandosqlite.database.entities.ShoppingItemDB;

public class ShoppingElementHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "ShoppingElements.db";

    public ShoppingElementHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ShoppingItemDB.ShoppingElementEntry.CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(ShoppingItemDB.ShoppingElementEntry.DELETE_TABLE);
        onCreate(db);

    }

}
