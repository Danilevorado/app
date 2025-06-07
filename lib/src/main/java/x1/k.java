package x1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import x1.m;

/* loaded from: classes.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28169a;

    public static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        private final Context f28170a;

        public a(Context context) {
            this.f28170a = context;
        }

        @Override // x1.n
        public m b(q qVar) {
            return new k(this.f28170a);
        }
    }

    private static class b implements com.bumptech.glide.load.data.d {

        /* renamed from: o, reason: collision with root package name */
        private static final String[] f28171o = {"_data"};

        /* renamed from: m, reason: collision with root package name */
        private final Context f28172m;

        /* renamed from: n, reason: collision with root package name */
        private final Uri f28173n;

        b(Context context, Uri uri) {
            this.f28172m = context;
            this.f28173n = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public r1.a e() {
            return r1.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void f(com.bumptech.glide.g gVar, d.a aVar) {
            Cursor cursorQuery = this.f28172m.getContentResolver().query(this.f28173n, f28171o, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    cursorQuery.close();
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.d(new File(string));
                return;
            }
            aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f28173n));
        }
    }

    public k(Context context) {
        this.f28169a = context;
    }

    @Override // x1.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a a(Uri uri, int i10, int i11, r1.h hVar) {
        return new m.a(new m2.b(uri), new b(this.f28169a, uri));
    }

    @Override // x1.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return s1.b.b(uri);
    }
}
