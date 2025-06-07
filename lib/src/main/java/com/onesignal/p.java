package com.onesignal;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final a f22194a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static b f22195b = b.MainUI;

    public static final class a {

        /* renamed from: com.onesignal.p$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0112a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f22196a;

            static {
                int[] iArr = new int[b.values().length];
                iArr[b.MainUI.ordinal()] = 1;
                iArr[b.Background.ordinal()] = 2;
                f22196a = iArr;
            }
        }

        static final class b extends rb.i implements qb.a {

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ Runnable f22197n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Runnable runnable) {
                super(0);
                this.f22197n = runnable;
            }

            @Override // qb.a
            public /* bridge */ /* synthetic */ Object a() {
                d();
                return hb.q.f24177a;
            }

            public final void d() {
                this.f22197n.run();
            }
        }

        private a() {
        }

        public /* synthetic */ a(rb.f fVar) {
            this();
        }

        public final b a() {
            return p.f22195b;
        }

        public final void b(Runnable runnable) {
            rb.h.e(runnable, "runnable");
            int i10 = C0112a.f22196a[a().ordinal()];
            if (i10 == 1) {
                OSUtils.S(runnable);
            } else {
                if (i10 != 2) {
                    return;
                }
                jb.a.b(false, false, null, null, 0, new b(runnable), 31, null);
            }
        }
    }

    public enum b {
        MainUI,
        Background
    }
}
