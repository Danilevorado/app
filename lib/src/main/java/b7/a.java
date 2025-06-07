package b7;

import android.app.LoaderManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.CursorLoader;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Log;
import androidx.fragment.app.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a extends CursorLoader {

    /* renamed from: b, reason: collision with root package name */
    private static final ArrayList f4508b;

    /* renamed from: c, reason: collision with root package name */
    private static final ArrayList f4509c;

    /* renamed from: d, reason: collision with root package name */
    private static final ArrayList f4510d;

    /* renamed from: e, reason: collision with root package name */
    private static final List f4511e;

    /* renamed from: a, reason: collision with root package name */
    private a7.a f4512a;

    static {
        ArrayList arrayList = new ArrayList();
        f4508b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        f4509c = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        f4510d = arrayList3;
        f4511e = Arrays.asList("_id", "_display_name", "_data", "_size", "date_added", "mime_type", "bucket_id", "bucket_display_name", "height", "width", "duration");
        arrayList.addAll(Arrays.asList("image/jpeg", "image/png", "image/jpg", "image/gif"));
        arrayList2.addAll(Arrays.asList("audio/mpeg", "audio/mp3", "audio/x-ms-wma", "audio/x-wav", "audio/amr", "audio/3gp"));
        arrayList3.addAll(Arrays.asList("video/mpeg", "video/mp4"));
    }

    a(Context context, a7.a aVar) {
        super(context);
        this.f4512a = aVar;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        String strG = aVar.g();
        if (strG != null) {
            sb2.append("_data");
            sb2.append(" LIKE ?");
            String str = File.separator;
            strG = strG.endsWith(str) ? strG : strG + str;
            arrayList.add(strG + "%");
        }
        if (aVar.z()) {
            arrayList.addAll(f4508b);
        }
        if (aVar.x()) {
            arrayList.addAll(f4509c);
        }
        if (aVar.A()) {
            arrayList.addAll(f4510d);
        }
        if (sb2.length() != 0) {
            sb2.append(" and ");
        }
        sb2.append("(");
        int size = strG == null ? arrayList.size() : arrayList.size() - 1;
        if (size > 0) {
            sb2.append("mime_type");
            sb2.append(" = ?");
            for (int i10 = 1; i10 < size; i10++) {
                sb2.append(" or ");
                sb2.append("mime_type");
                sb2.append(" = ?");
            }
        }
        String[] strArrJ = aVar.j();
        if (aVar.y() && strArrJ != null && strArrJ.length > 0) {
            if (size > 0) {
                sb2.append(" or ");
            }
            sb2.append("_data");
            sb2.append(" LIKE ?");
            int length = strArrJ.length;
            arrayList.add("%." + strArrJ[0].replace(".", ""));
            for (int i11 = 1; i11 < length; i11++) {
                sb2.append(" or ");
                sb2.append("_data");
                sb2.append(" LIKE ?");
                strArrJ[i11] = strArrJ[i11].replace(".", "");
                arrayList.add("%." + strArrJ[i11]);
            }
        }
        List listE = e();
        if (listE.size() > 0) {
            sb2.append(") and (");
            sb2.append("_data");
            sb2.append(" NOT LIKE ? ");
            arrayList.add(((String) listE.get(0)) + "%");
            int size2 = listE.size();
            for (int i12 = 0; i12 < size2; i12++) {
                sb2.append(" and ");
                sb2.append("_data");
                sb2.append(" NOT LIKE ? ");
                arrayList.add(((String) listE.get(i12)) + "%");
            }
        }
        sb2.append(")");
        ArrayList arrayList2 = new ArrayList(f4511e);
        if (sb2.length() != 0) {
            if (b(aVar)) {
                arrayList2.add("album_id");
            }
            if (c(aVar)) {
                arrayList2.add("media_type");
            }
            setProjection((String[]) arrayList2.toArray(new String[0]));
            setUri(d(aVar));
            setSortOrder("date_added DESC");
            setSelection(sb2.toString());
            setSelectionArgs((String[]) arrayList.toArray(new String[0]));
        }
    }

    public static c7.a a(ContentResolver contentResolver, Uri uri, a7.a aVar) {
        Cursor cursorQuery = contentResolver.query(uri, (String[]) f4511e.toArray(new String[0]), null, null, null);
        if (cursorQuery == null || !cursorQuery.moveToFirst()) {
            return null;
        }
        return b.a(cursorQuery, aVar, uri);
    }

    private static boolean b(a7.a aVar) {
        return Build.VERSION.SDK_INT < 29 || !(!aVar.x() || aVar.y() || aVar.z() || aVar.A());
    }

    private static boolean c(a7.a aVar) {
        return Build.VERSION.SDK_INT < 29 || (!aVar.x() && (aVar.y() || aVar.z() || aVar.A()));
    }

    static Uri d(a7.a aVar) {
        return (Build.VERSION.SDK_INT < 29 || !aVar.x() || aVar.y() || aVar.z() || aVar.A()) ? MediaStore.Files.getContentUri("external") : MediaStore.Audio.Media.getContentUri("external");
    }

    private List e() {
        Cursor cursorQuery = getContext().getContentResolver().query(MediaStore.Files.getContentUri("external"), new String[]{"_data"}, Build.VERSION.SDK_INT < 29 ? "bucket_id IS NOT NULL) GROUP BY (bucket_id" : "bucket_id IS NOT NULL", null, "_data ASC");
        if (cursorQuery == null) {
            Log.e("FilePicker", "IgnoreFolders Cursor NULL");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (cursorQuery.moveToFirst()) {
                do {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
                    String strB = d7.a.b(string);
                    if (!f(strB, arrayList) && d7.a.d(string, this.f4512a)) {
                        arrayList.add(strB);
                    }
                } while (cursorQuery.moveToNext());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        cursorQuery.close();
        return arrayList;
    }

    private boolean f(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static void g(e eVar, c cVar, a7.a aVar, boolean z10) {
        if (!aVar.y() && !aVar.A() && !aVar.x() && !aVar.z()) {
            cVar.a(null);
            return;
        }
        b bVar = new b(eVar, cVar, aVar);
        LoaderManager loaderManager = eVar.getLoaderManager();
        if (z10) {
            loaderManager.restartLoader(0, null, bVar);
        } else {
            loaderManager.initLoader(0, null, bVar);
        }
    }
}
