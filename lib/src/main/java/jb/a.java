package jb;

import rb.h;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: jb.a$a, reason: collision with other inner class name */
    public static final class C0149a extends Thread {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ qb.a f24558m;

        C0149a(qb.a aVar) {
            this.f24558m = aVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f24558m.a();
        }
    }

    public static final Thread a(boolean z10, boolean z11, ClassLoader classLoader, String str, int i10, qb.a aVar) {
        h.e(aVar, "block");
        C0149a c0149a = new C0149a(aVar);
        if (z11) {
            c0149a.setDaemon(true);
        }
        if (i10 > 0) {
            c0149a.setPriority(i10);
        }
        if (str != null) {
            c0149a.setName(str);
        }
        if (classLoader != null) {
            c0149a.setContextClassLoader(classLoader);
        }
        if (z10) {
            c0149a.start();
        }
        return c0149a;
    }

    public static /* synthetic */ Thread b(boolean z10, boolean z11, ClassLoader classLoader, String str, int i10, qb.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        boolean z13 = z11;
        ClassLoader classLoader2 = (i11 & 4) != 0 ? null : classLoader;
        String str2 = (i11 & 8) != 0 ? null : str;
        if ((i11 & 16) != 0) {
            i10 = -1;
        }
        return a(z12, z13, classLoader2, str2, i10, aVar);
    }
}
