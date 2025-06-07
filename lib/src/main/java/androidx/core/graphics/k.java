package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap f2245a = new ConcurrentHashMap();

    class a implements b {
        a() {
        }

        @Override // androidx.core.graphics.k.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(g.b bVar) {
            return bVar.e();
        }

        @Override // androidx.core.graphics.k.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(g.b bVar) {
            return bVar.f();
        }
    }

    private interface b {
        int a(Object obj);

        boolean b(Object obj);
    }

    k() {
    }

    private static Object e(Object[] objArr, int i10, b bVar) {
        return f(objArr, (i10 & 1) == 0 ? 400 : 700, (i10 & 2) != 0, bVar);
    }

    private static Object f(Object[] objArr, int i10, boolean z10, b bVar) {
        Object obj = null;
        int i11 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(bVar.a(obj2) - i10) * 2) + (bVar.b(obj2) == z10 ? 0 : 1);
            if (obj == null || i11 > iAbs) {
                obj = obj2;
                i11 = iAbs;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, e.c cVar, Resources resources, int i10);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10);

    protected Typeface c(Context context, InputStream inputStream) {
        File fileE = l.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (l.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        File fileE = l.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (l.c(fileE, resources, i10)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    protected g.b g(g.b[] bVarArr, int i10) {
        return (g.b) e(bVarArr, i10, new a());
    }
}
