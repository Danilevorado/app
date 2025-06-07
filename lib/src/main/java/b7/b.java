package b7;

import android.app.LoaderManager;
import android.content.ContentUris;
import android.content.Context;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes.dex */
class b implements LoaderManager.LoaderCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private Context f4513a;

    /* renamed from: b, reason: collision with root package name */
    private c f4514b;

    /* renamed from: c, reason: collision with root package name */
    private a7.a f4515c;

    b(Context context, c cVar, a7.a aVar) {
        this.f4513a = context;
        this.f4514b = cVar;
        this.f4515c = aVar;
    }

    static c7.a a(Cursor cursor, a7.a aVar, Uri uri) {
        int i10;
        c7.a aVar2 = new c7.a();
        aVar2.B(cursor.getString(cursor.getColumnIndex("_data")));
        long length = cursor.getLong(cursor.getColumnIndex("_size"));
        if (length == 0 && aVar2.f() != null) {
            length = new File(cursor.getString(cursor.getColumnIndex("_data"))).length();
            if (length <= 0 && aVar.D()) {
                return null;
            }
        }
        aVar2.C(length);
        aVar2.x(cursor.getLong(cursor.getColumnIndex("_id")));
        aVar2.A(cursor.getString(cursor.getColumnIndex("_display_name")));
        aVar2.B(cursor.getString(cursor.getColumnIndex("_data")));
        aVar2.r(cursor.getLong(cursor.getColumnIndex("date_added")));
        aVar2.z(cursor.getString(cursor.getColumnIndex("mime_type")));
        aVar2.j(cursor.getString(cursor.getColumnIndex("bucket_id")));
        aVar2.m(cursor.getString(cursor.getColumnIndex("bucket_display_name")));
        if (uri == null) {
            uri = ContentUris.withAppendedId(a.d(aVar), aVar2.b());
        }
        aVar2.E(uri);
        aVar2.v(cursor.getLong(cursor.getColumnIndex("duration")));
        if (TextUtils.isEmpty(aVar2.e())) {
            String strF = aVar2.f() != null ? aVar2.f() : "";
            aVar2.A(strF.substring(strF.lastIndexOf(47) + 1));
        }
        int columnIndex = cursor.getColumnIndex("media_type");
        if (columnIndex >= 0) {
            aVar2.y(cursor.getInt(columnIndex));
        }
        if ((aVar2.c() == 0 || aVar2.c() > 3) && aVar2.d() != null) {
            aVar2.y(b(aVar2.d()));
        }
        aVar2.w(cursor.getLong(cursor.getColumnIndex("height")));
        aVar2.F(cursor.getLong(cursor.getColumnIndex("width")));
        int columnIndex2 = cursor.getColumnIndex("album_id");
        if (columnIndex2 >= 0 && (i10 = cursor.getInt(columnIndex2)) >= 0) {
            aVar2.D(ContentUris.withAppendedId(Uri.parse("content://media/external/audio/albumart"), i10));
        }
        return aVar2;
    }

    private static int b(String str) {
        if (str.startsWith("image/")) {
            return 1;
        }
        if (str.startsWith("video/")) {
            return 3;
        }
        return str.startsWith("audio/") ? 2 : 0;
    }

    @Override // android.app.LoaderManager.LoaderCallbacks
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onLoadFinished(Loader loader, Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor.moveToFirst()) {
            do {
                c7.a aVarA = a(cursor, this.f4515c, null);
                if (aVarA != null) {
                    arrayList.add(aVarA);
                }
            } while (cursor.moveToNext());
        }
        this.f4514b.a(arrayList);
    }

    @Override // android.app.LoaderManager.LoaderCallbacks
    public Loader onCreateLoader(int i10, Bundle bundle) {
        return new a(this.f4513a, this.f4515c);
    }

    @Override // android.app.LoaderManager.LoaderCallbacks
    public void onLoaderReset(Loader loader) {
    }
}
