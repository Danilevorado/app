package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.core.provider.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator f2284a = new Comparator() { // from class: androidx.core.provider.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return d.g((byte[]) obj, (byte[]) obj2);
        }
    };

    static class a {
        static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    private static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static List d(e eVar, Resources resources) {
        return eVar.b() != null ? eVar.b() : androidx.core.content.res.e.c(resources, eVar.c());
    }

    static g.a e(Context context, e eVar, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoF = f(context.getPackageManager(), eVar, context.getResources());
        return providerInfoF == null ? g.a.a(1, null) : g.a.a(0, h(context, eVar, providerInfoF.authority, cancellationSignal));
    }

    static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) throws PackageManager.NameNotFoundException {
        String strE = eVar.e();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strE, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strE);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(eVar.f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strE + ", but package was not " + eVar.f());
        }
        List listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listB, f2284a);
        List listD = d(eVar, resources);
        for (int i10 = 0; i10 < listD.size(); i10++) {
            ArrayList arrayList = new ArrayList((Collection) listD.get(i10));
            Collections.sort(arrayList, f2284a);
            if (c(listB, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        int length;
        int length2;
        if (bArr.length == bArr2.length) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                if (bArr[i10] != bArr2[i10]) {
                    length = bArr[i10];
                    length2 = bArr2[i10];
                }
            }
            return 0;
        }
        length = bArr.length;
        length2 = bArr2.length;
        return length - length2;
    }

    static g.b[] h(Context context, e eVar, String str, CancellationSignal cancellationSignal) {
        int i10;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursorA = null;
        try {
            int i11 = 0;
            cursorA = a.a(context.getContentResolver(), uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{eVar.g()}, null, cancellationSignal);
            if (cursorA != null && cursorA.getCount() > 0) {
                int columnIndex = cursorA.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursorA.getColumnIndex("_id");
                int columnIndex3 = cursorA.getColumnIndex("file_id");
                int columnIndex4 = cursorA.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorA.getColumnIndex("font_weight");
                int columnIndex6 = cursorA.getColumnIndex("font_italic");
                while (cursorA.moveToNext()) {
                    int i12 = columnIndex != -1 ? cursorA.getInt(columnIndex) : i11;
                    int i13 = columnIndex4 != -1 ? cursorA.getInt(columnIndex4) : i11;
                    int i14 = i12;
                    Uri uriWithAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorA.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorA.getLong(columnIndex3));
                    int i15 = columnIndex5 != -1 ? cursorA.getInt(columnIndex5) : 400;
                    if (columnIndex6 == -1 || cursorA.getInt(columnIndex6) != 1) {
                        i10 = i14;
                        z10 = false;
                    } else {
                        i10 = i14;
                        z10 = true;
                    }
                    arrayList2.add(g.b.a(uriWithAppendedId, i13, i15, z10, i10));
                    i11 = 0;
                }
                arrayList = arrayList2;
            }
            return (g.b[]) arrayList.toArray(new g.b[0]);
        } finally {
            if (cursorA != null) {
                cursorA.close();
            }
        }
    }
}
