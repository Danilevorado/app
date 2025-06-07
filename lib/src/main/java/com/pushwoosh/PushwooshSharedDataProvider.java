package com.pushwoosh;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import n7.l;

/* loaded from: classes.dex */
public class PushwooshSharedDataProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (getContext() == null) {
            return null;
        }
        l9.a.b(this, l.i().e().c());
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI(getContext().getApplicationContext().getPackageName() + "." + getClass().getSimpleName(), "hwid", 1);
        if (uriMatcher.match(uri) != 1) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"hwid"});
        if (str2 != null) {
            if (str2.compareTo(g9.a.h(getContext().getApplicationContext().getPackageName())) < 0) {
                matrixCursor.addRow(new String[]{w7.a.d()});
            } else {
                matrixCursor.addRow(new String[]{w7.a.e()});
            }
        }
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
