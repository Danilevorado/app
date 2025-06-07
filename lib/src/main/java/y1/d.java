package y1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import r1.h;
import x1.m;
import x1.n;
import x1.q;

/* loaded from: classes.dex */
public final class d implements m {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28441a;

    /* renamed from: b, reason: collision with root package name */
    private final m f28442b;

    /* renamed from: c, reason: collision with root package name */
    private final m f28443c;

    /* renamed from: d, reason: collision with root package name */
    private final Class f28444d;

    private static abstract class a implements n {

        /* renamed from: a, reason: collision with root package name */
        private final Context f28445a;

        /* renamed from: b, reason: collision with root package name */
        private final Class f28446b;

        a(Context context, Class cls) {
            this.f28445a = context;
            this.f28446b = cls;
        }

        @Override // x1.n
        public final m b(q qVar) {
            return new d(this.f28445a, qVar.d(File.class, this.f28446b), qVar.d(Uri.class, this.f28446b), this.f28446b);
        }
    }

    public static final class b extends a {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    public static final class c extends a {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: y1.d$d, reason: collision with other inner class name */
    private static final class C0214d implements com.bumptech.glide.load.data.d {

        /* renamed from: w, reason: collision with root package name */
        private static final String[] f28447w = {"_data"};

        /* renamed from: m, reason: collision with root package name */
        private final Context f28448m;

        /* renamed from: n, reason: collision with root package name */
        private final m f28449n;

        /* renamed from: o, reason: collision with root package name */
        private final m f28450o;

        /* renamed from: p, reason: collision with root package name */
        private final Uri f28451p;

        /* renamed from: q, reason: collision with root package name */
        private final int f28452q;

        /* renamed from: r, reason: collision with root package name */
        private final int f28453r;

        /* renamed from: s, reason: collision with root package name */
        private final h f28454s;

        /* renamed from: t, reason: collision with root package name */
        private final Class f28455t;

        /* renamed from: u, reason: collision with root package name */
        private volatile boolean f28456u;

        /* renamed from: v, reason: collision with root package name */
        private volatile com.bumptech.glide.load.data.d f28457v;

        C0214d(Context context, m mVar, m mVar2, Uri uri, int i10, int i11, h hVar, Class cls) {
            this.f28448m = context.getApplicationContext();
            this.f28449n = mVar;
            this.f28450o = mVar2;
            this.f28451p = uri;
            this.f28452q = i10;
            this.f28453r = i11;
            this.f28454s = hVar;
            this.f28455t = cls;
        }

        private m.a c() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f28449n.a(h(this.f28451p), this.f28452q, this.f28453r, this.f28454s);
            }
            return this.f28450o.a(g() ? MediaStore.setRequireOriginal(this.f28451p) : this.f28451p, this.f28452q, this.f28453r, this.f28454s);
        }

        private com.bumptech.glide.load.data.d d() {
            m.a aVarC = c();
            if (aVarC != null) {
                return aVarC.f28182c;
            }
            return null;
        }

        private boolean g() {
            return this.f28448m.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        private File h(Uri uri) {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.f28448m.getContentResolver().query(uri, f28447w, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f28455t;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d dVar = this.f28457v;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f28456u = true;
            com.bumptech.glide.load.data.d dVar = this.f28457v;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public r1.a e() {
            return r1.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void f(g gVar, d.a aVar) {
            try {
                com.bumptech.glide.load.data.d dVarD = d();
                if (dVarD == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f28451p));
                    return;
                }
                this.f28457v = dVarD;
                if (this.f28456u) {
                    cancel();
                } else {
                    dVarD.f(gVar, aVar);
                }
            } catch (FileNotFoundException e5) {
                aVar.c(e5);
            }
        }
    }

    d(Context context, m mVar, m mVar2, Class cls) {
        this.f28441a = context.getApplicationContext();
        this.f28442b = mVar;
        this.f28443c = mVar2;
        this.f28444d = cls;
    }

    @Override // x1.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a a(Uri uri, int i10, int i11, h hVar) {
        return new m.a(new m2.b(uri), new C0214d(this.f28441a, this.f28442b, this.f28443c, uri, i10, i11, hVar, this.f28444d));
    }

    @Override // x1.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && s1.b.b(uri);
    }
}
