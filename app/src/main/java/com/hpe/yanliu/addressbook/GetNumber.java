package com.hpe.yanliu.addressbook;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanliu on 2016/2/15.
 */
public class GetNumber {
    //集合是封装数据的精髓啊
    public static List<PhoneInfo> lists = new ArrayList<PhoneInfo>();

    public static String getNumber(Context context){
        Cursor cursor = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null,null,null,null);
        //phoneNumber储存要获取的通讯录数据
        String phoneNumber;
        //获取联系人
        String phoneName;
        while (cursor.moveToNext()){
            phoneNumber = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
            //注意获取联系人的字段
            phoneName = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
            PhoneInfo phoneInfo = new PhoneInfo(phoneName,phoneNumber);
            //放入集合之中
            lists.add(phoneInfo);

        }
        return null;
    }
}
