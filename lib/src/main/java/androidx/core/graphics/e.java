package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.e;
import androidx.core.content.res.h;
import androidx.core.provider.g;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final k f2226a;

    /* renamed from: b, reason: collision with root package name */
    private static final q.e f2227b;

    public static class a extends g.c {

        /* renamed from: a, reason: collision with root package name */
        private h.e f2228a;

        public a(h.e eVar) {
            this.f2228a = eVar;
        }

        @Override // androidx.core.provider.g.c
        public void a(int i10) {
            h.e eVar = this.f2228a;
            if (eVar != null) {
                eVar.f(i10);
            }
        }

        @Override // androidx.core.provider.g.c
        public void b(Typeface typeface) {
            h.e eVar = this.f2228a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f2226a = i10 >= 29 ? new j() : i10 >= 28 ? new i() : i10 >= 26 ? new h() : (i10 < 24 || !g.j()) ? new f() : new g();
        f2227b = new q.e(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        return f2226a.b(context, cancellationSignal, bVarArr, i10);
    }

    public static Typeface c(Context context, e.b bVar, Resources resources, int i10, String str, int i11, int i12, h.e eVar, Handler handler, boolean z10) {
        Typeface typefaceA;
        if (bVar instanceof e.C0023e) {
            e.C0023e c0023e = (e.C0023e) bVar;
            Typeface typefaceG = g(c0023e.c());
            if (typefaceG != null) {
                if (eVar != null) {
                    eVar.d(typefaceG, handler);
                }
                return typefaceG;
            }
            boolean z11 = !z10 ? eVar != null : c0023e.a() != 0;
            int iD = z10 ? c0023e.d() : -1;
            typefaceA = androidx.core.provider.g.c(context, c0023e.b(), i12, z11, iD, h.e.e(handler), new a(eVar));
        } else {
            typefaceA = f2226a.a(context, (e.c) bVar, resources, i12);
            if (eVar != null) {
                if (typefaceA != null) {
                    eVar.d(typefaceA, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f2227b.d(e(resources, i10, str, i11, i12), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface d(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface typefaceD = f2226a.d(context, resources, i10, str, i12);
        if (typefaceD != null) {
            f2227b.d(e(resources, i10, str, i11, i12), typefaceD);
        }
        return typefaceD;
    }

    private static String e(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface f(Resources resources, int i10, String str, int i11, int i12) {
        return (Typeface) f2227b.c(e(resources, i10, str, i11, i12));
    }

    private static Typeface g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }
}
