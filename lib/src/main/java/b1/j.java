package b1;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f4351a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile j f4352b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final int f4353c = 20;

    public static class a extends j {

        /* renamed from: d, reason: collision with root package name */
        private final int f4354d;

        public a(int i10) {
            super(i10);
            this.f4354d = i10;
        }

        @Override // b1.j
        public void a(String str, String str2) {
            if (this.f4354d <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // b1.j
        public void b(String str, String str2, Throwable th) {
            if (this.f4354d <= 3) {
                Log.d(str, str2, th);
            }
        }

        @Override // b1.j
        public void c(String str, String str2) {
            if (this.f4354d <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // b1.j
        public void d(String str, String str2, Throwable th) {
            if (this.f4354d <= 6) {
                Log.e(str, str2, th);
            }
        }

        @Override // b1.j
        public void f(String str, String str2) {
            if (this.f4354d <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // b1.j
        public void g(String str, String str2, Throwable th) {
            if (this.f4354d <= 4) {
                Log.i(str, str2, th);
            }
        }

        @Override // b1.j
        public void j(String str, String str2) {
            if (this.f4354d <= 2) {
                Log.v(str, str2);
            }
        }

        @Override // b1.j
        public void k(String str, String str2) {
            if (this.f4354d <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // b1.j
        public void l(String str, String str2, Throwable th) {
            if (this.f4354d <= 5) {
                Log.w(str, str2, th);
            }
        }
    }

    public j(int i10) {
    }

    public static j e() {
        j jVar;
        synchronized (f4351a) {
            if (f4352b == null) {
                f4352b = new a(3);
            }
            jVar = f4352b;
        }
        return jVar;
    }

    public static void h(j jVar) {
        synchronized (f4351a) {
            f4352b = jVar;
        }
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i10 = f4353c;
        if (length >= i10) {
            str = str.substring(0, i10);
        }
        sb2.append(str);
        return sb2.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2, Throwable th);

    public abstract void j(String str, String str2);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, Throwable th);
}
