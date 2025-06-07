package androidx.core.text;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final androidx.core.text.d f2350a = new C0032e(null, false);

    /* renamed from: b, reason: collision with root package name */
    public static final androidx.core.text.d f2351b = new C0032e(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final androidx.core.text.d f2352c;

    /* renamed from: d, reason: collision with root package name */
    public static final androidx.core.text.d f2353d;

    /* renamed from: e, reason: collision with root package name */
    public static final androidx.core.text.d f2354e;

    /* renamed from: f, reason: collision with root package name */
    public static final androidx.core.text.d f2355f;

    private static class a implements c {

        /* renamed from: b, reason: collision with root package name */
        static final a f2356b = new a(true);

        /* renamed from: a, reason: collision with root package name */
        private final boolean f2357a;

        private a(boolean z10) {
            this.f2357a = z10;
        }

        @Override // androidx.core.text.e.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int iA = e.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                        i10++;
                        z10 = z10;
                    } else if (!this.f2357a) {
                        return 1;
                    }
                } else if (this.f2357a) {
                    return 0;
                }
                z10 = true;
                i10++;
                z10 = z10;
            }
            if (z10) {
                return this.f2357a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        static final b f2358a = new b();

        private b() {
        }

        @Override // androidx.core.text.e.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int iB = 2;
            while (i10 < i12 && iB == 2) {
                iB = e.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return iB;
        }
    }

    private interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    private static abstract class d implements androidx.core.text.d {

        /* renamed from: a, reason: collision with root package name */
        private final c f2359a;

        d(c cVar) {
            this.f2359a = cVar;
        }

        private boolean c(CharSequence charSequence, int i10, int i11) {
            int iA = this.f2359a.a(charSequence, i10, i11);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return b();
            }
            return false;
        }

        @Override // androidx.core.text.d
        public boolean a(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f2359a == null ? b() : c(charSequence, i10, i11);
        }

        protected abstract boolean b();
    }

    /* renamed from: androidx.core.text.e$e, reason: collision with other inner class name */
    private static class C0032e extends d {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f2360b;

        C0032e(c cVar, boolean z10) {
            super(cVar);
            this.f2360b = z10;
        }

        @Override // androidx.core.text.e.d
        protected boolean b() {
            return this.f2360b;
        }
    }

    private static class f extends d {

        /* renamed from: b, reason: collision with root package name */
        static final f f2361b = new f();

        f() {
            super(null);
        }

        @Override // androidx.core.text.e.d
        protected boolean b() {
            return androidx.core.text.f.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f2358a;
        f2352c = new C0032e(bVar, false);
        f2353d = new C0032e(bVar, true);
        f2354e = new C0032e(a.f2356b, false);
        f2355f = f.f2361b;
    }

    static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
