package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;

/* loaded from: classes.dex */
public abstract class g {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f2307a;

        /* renamed from: b, reason: collision with root package name */
        private final b[] f2308b;

        public a(int i10, b[] bVarArr) {
            this.f2307a = i10;
            this.f2308b = bVarArr;
        }

        static a a(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] b() {
            return this.f2308b;
        }

        public int c() {
            return this.f2307a;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f2309a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2310b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2311c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f2312d;

        /* renamed from: e, reason: collision with root package name */
        private final int f2313e;

        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f2309a = (Uri) androidx.core.util.h.f(uri);
            this.f2310b = i10;
            this.f2311c = i11;
            this.f2312d = z10;
            this.f2313e = i12;
        }

        static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f2313e;
        }

        public int c() {
            return this.f2310b;
        }

        public Uri d() {
            return this.f2309a;
        }

        public int e() {
            return this.f2311c;
        }

        public boolean f() {
            return this.f2312d;
        }
    }

    public static class c {
        public abstract void a(int i10);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return androidx.core.graphics.e.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, eVar, cancellationSignal);
    }

    public static Typeface c(Context context, e eVar, int i10, boolean z10, int i11, Handler handler, c cVar) {
        androidx.core.provider.a aVar = new androidx.core.provider.a(cVar, handler);
        return z10 ? f.e(context, eVar, aVar, i10, i11) : f.d(context, eVar, i10, null, aVar);
    }
}
