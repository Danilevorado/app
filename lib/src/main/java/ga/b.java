package ga;

import k9.h;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final q9.b f23902a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23903b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23904c;

    /* renamed from: d, reason: collision with root package name */
    private final ga.a f23905d;

    /* renamed from: e, reason: collision with root package name */
    private long f23906e;

    /* renamed from: ga.b$b, reason: collision with other inner class name */
    public static class C0137b {

        /* renamed from: a, reason: collision with root package name */
        private q9.b f23907a;

        /* renamed from: b, reason: collision with root package name */
        private String f23908b = "";

        /* renamed from: c, reason: collision with root package name */
        private boolean f23909c = false;

        /* renamed from: d, reason: collision with root package name */
        private ga.a f23910d = ga.a.IN_APP;

        /* renamed from: e, reason: collision with root package name */
        private long f23911e = 0;

        public C0137b a(long j10) {
            this.f23911e = j10;
            return this;
        }

        C0137b b(ga.a aVar) {
            this.f23910d = aVar;
            return this;
        }

        public C0137b c(String str) {
            if (str == null) {
                return this;
            }
            try {
                return d(q9.b.d(str)).b(ga.a.RICH_MEDIA);
            } catch (p8.a e5) {
                h.n("Can't parse richMedia: " + str, e5);
                return this;
            }
        }

        public C0137b d(q9.b bVar) {
            this.f23907a = bVar;
            return this;
        }

        public C0137b e(boolean z10) {
            this.f23909c = z10;
            return this;
        }

        public b f() {
            return new b(this.f23907a, this.f23908b, this.f23909c, this.f23910d, this.f23911e);
        }

        public C0137b g(String str) {
            this.f23908b = str;
            return this;
        }
    }

    private b(q9.b bVar, String str, boolean z10, ga.a aVar, long j10) {
        this.f23902a = bVar;
        this.f23903b = str;
        this.f23904c = z10;
        this.f23905d = aVar;
        this.f23906e = j10;
    }

    public long a() {
        return this.f23906e;
    }

    public q9.b b() {
        return this.f23902a;
    }

    public ga.a c() {
        return this.f23905d;
    }

    public String d() {
        return this.f23903b;
    }

    public boolean e() {
        return this.f23904c;
    }
}
