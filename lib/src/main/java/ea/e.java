package ea;

import android.content.Context;

/* loaded from: classes2.dex */
public class e {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23249a;

        static {
            int[] iArr = new int[ga.a.values().length];
            f23249a = iArr;
            try {
                iArr[ga.a.IN_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23249a[ga.a.RICH_MEDIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private Context a() {
        return c9.a.b();
    }

    public d b(ga.b bVar) {
        if (a() == null) {
            k9.h.k("Incorrect state of app. Context is null");
            return null;
        }
        int i10 = a.f23249a[bVar.c().ordinal()];
        return i10 != 1 ? i10 != 2 ? new b(a(), y7.b.b()) : bVar.e() ? new f(a(), bVar.d()) : new h(a(), bVar.a()) : (bVar.b() == null || !bVar.b().v()) ? new b(a(), y7.b.b()) : new c(a());
    }

    public void c(ga.b bVar) {
        try {
            d dVarB = b(bVar);
            if (dVarB != null) {
                dVarB.a(bVar.b());
            }
        } catch (Throwable th) {
            k9.h.k(th.getMessage());
        }
    }
}
