package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.core.provider.g;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
abstract class f {

    /* renamed from: a, reason: collision with root package name */
    static final q.e f2291a = new q.e(16);

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f2292b = h.a("fonts-androidx", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    static final Object f2293c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final q.g f2294d = new q.g();

    class a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2295a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f2296b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.e f2297c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2298d;

        a(String str, Context context, androidx.core.provider.e eVar, int i10) {
            this.f2295a = str;
            this.f2296b = context;
            this.f2297c = eVar;
            this.f2298d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return f.c(this.f2295a, this.f2296b, this.f2297c, this.f2298d);
        }
    }

    class b implements androidx.core.util.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.a f2299a;

        b(androidx.core.provider.a aVar) {
            this.f2299a = aVar;
        }

        @Override // androidx.core.util.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f2299a.b(eVar);
        }
    }

    class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2300a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f2301b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.e f2302c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2303d;

        c(String str, Context context, androidx.core.provider.e eVar, int i10) {
            this.f2300a = str;
            this.f2301b = context;
            this.f2302c = eVar;
            this.f2303d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f2300a, this.f2301b, this.f2302c, this.f2303d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements androidx.core.util.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2304a;

        d(String str) {
            this.f2304a = str;
        }

        @Override // androidx.core.util.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(e eVar) {
            synchronized (f.f2293c) {
                q.g gVar = f.f2294d;
                ArrayList arrayList = (ArrayList) gVar.get(this.f2304a);
                if (arrayList == null) {
                    return;
                }
                gVar.remove(this.f2304a);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((androidx.core.util.a) arrayList.get(i10)).a(eVar);
                }
            }
        }
    }

    static final class e {

        /* renamed from: a, reason: collision with root package name */
        final Typeface f2305a;

        /* renamed from: b, reason: collision with root package name */
        final int f2306b;

        e(int i10) {
            this.f2305a = null;
            this.f2306b = i10;
        }

        e(Typeface typeface) {
            this.f2305a = typeface;
            this.f2306b = 0;
        }

        boolean a() {
            return this.f2306b == 0;
        }
    }

    private static String a(androidx.core.provider.e eVar, int i10) {
        return eVar.d() + "-" + i10;
    }

    private static int b(g.a aVar) {
        int i10 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] bVarArrB = aVar.b();
        if (bVarArrB != null && bVarArrB.length != 0) {
            i10 = 0;
            for (g.b bVar : bVarArrB) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i10;
    }

    static e c(String str, Context context, androidx.core.provider.e eVar, int i10) {
        q.e eVar2 = f2291a;
        Typeface typeface = (Typeface) eVar2.c(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            g.a aVarE = androidx.core.provider.d.e(context, eVar, null);
            int iB = b(aVarE);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceB = androidx.core.graphics.e.b(context, null, aVarE.b(), i10);
            if (typefaceB == null) {
                return new e(-3);
            }
            eVar2.d(str, typefaceB);
            return new e(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    static Typeface d(Context context, androidx.core.provider.e eVar, int i10, Executor executor, androidx.core.provider.a aVar) {
        String strA = a(eVar, i10);
        Typeface typeface = (Typeface) f2291a.c(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f2293c) {
            q.g gVar = f2294d;
            ArrayList arrayList = (ArrayList) gVar.get(strA);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(bVar);
            gVar.put(strA, arrayList2);
            c cVar = new c(strA, context, eVar, i10);
            if (executor == null) {
                executor = f2292b;
            }
            h.b(executor, cVar, new d(strA));
            return null;
        }
    }

    static Typeface e(Context context, androidx.core.provider.e eVar, androidx.core.provider.a aVar, int i10, int i11) {
        String strA = a(eVar, i10);
        Typeface typeface = (Typeface) f2291a.c(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i11 == -1) {
            e eVarC = c(strA, context, eVar, i10);
            aVar.b(eVarC);
            return eVarC.f2305a;
        }
        try {
            e eVar2 = (e) h.c(f2292b, new a(strA, context, eVar, i10), i11);
            aVar.b(eVar2);
            return eVar2.f2305a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }
}
