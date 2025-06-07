package s1;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
class e {

    /* renamed from: f, reason: collision with root package name */
    private static final a f26729f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final a f26730a;

    /* renamed from: b, reason: collision with root package name */
    private final d f26731b;

    /* renamed from: c, reason: collision with root package name */
    private final u1.b f26732c;

    /* renamed from: d, reason: collision with root package name */
    private final ContentResolver f26733d;

    /* renamed from: e, reason: collision with root package name */
    private final List f26734e;

    e(List list, a aVar, d dVar, u1.b bVar, ContentResolver contentResolver) {
        this.f26730a = aVar;
        this.f26731b = dVar;
        this.f26732c = bVar;
        this.f26733d = contentResolver;
        this.f26734e = list;
    }

    e(List list, d dVar, u1.b bVar, ContentResolver contentResolver) {
        this(list, f26729f, dVar, bVar, contentResolver);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0048: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:27:0x0048 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String b(android.net.Uri r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            s1.d r2 = r6.f26731b     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24
            android.database.Cursor r2 = r2.a(r7)     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24
            if (r2 == 0) goto L1c
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.SecurityException -> L1a java.lang.Throwable -> L47
            if (r3 == 0) goto L1c
            r3 = 0
            java.lang.String r7 = r2.getString(r3)     // Catch: java.lang.SecurityException -> L1a java.lang.Throwable -> L47
            r2.close()
            return r7
        L1a:
            r3 = move-exception
            goto L26
        L1c:
            if (r2 == 0) goto L21
            r2.close()
        L21:
            return r1
        L22:
            r7 = move-exception
            goto L49
        L24:
            r3 = move-exception
            r2 = r1
        L26:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L41
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r4.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = "Failed to query for thumbnail for Uri: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L47
            r4.append(r7)     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L47
            android.util.Log.d(r0, r7, r3)     // Catch: java.lang.Throwable -> L47
        L41:
            if (r2 == 0) goto L46
            r2.close()
        L46:
            return r1
        L47:
            r7 = move-exception
            r1 = r2
        L49:
            if (r1 == 0) goto L4e
            r1.close()
        L4e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.e.b(android.net.Uri):java.lang.String");
    }

    private boolean c(File file) {
        return this.f26730a.a(file) && 0 < this.f26730a.c(file);
    }

    int a(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.f26733d.openInputStream(uri);
                int iB = com.bumptech.glide.load.a.b(this.f26734e, inputStreamOpenInputStream, this.f26732c);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return iB;
            } catch (IOException | NullPointerException e5) {
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e5);
                }
                if (inputStreamOpenInputStream == null) {
                    return -1;
                }
                try {
                    inputStreamOpenInputStream.close();
                    return -1;
                } catch (IOException unused2) {
                    return -1;
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    public InputStream d(Uri uri) throws Throwable {
        String strB = b(uri);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        File fileB = this.f26730a.b(strB);
        if (!c(fileB)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileB);
        try {
            return this.f26733d.openInputStream(uriFromFile);
        } catch (NullPointerException e5) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e5));
        }
    }
}
