package b1;

import android.net.Uri;
import android.os.Build;
import ib.f0;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: i, reason: collision with root package name */
    public static final C0075b f4322i = new C0075b(null);

    /* renamed from: j, reason: collision with root package name */
    public static final b f4323j = new b(null, false, false, false, false, 0, 0, null, 255, null);

    /* renamed from: a, reason: collision with root package name */
    private final k f4324a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f4325b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4326c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4327d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f4328e;

    /* renamed from: f, reason: collision with root package name */
    private final long f4329f;

    /* renamed from: g, reason: collision with root package name */
    private final long f4330g;

    /* renamed from: h, reason: collision with root package name */
    private final Set f4331h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f4332a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f4333b;

        /* renamed from: d, reason: collision with root package name */
        private boolean f4335d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f4336e;

        /* renamed from: c, reason: collision with root package name */
        private k f4334c = k.NOT_REQUIRED;

        /* renamed from: f, reason: collision with root package name */
        private long f4337f = -1;

        /* renamed from: g, reason: collision with root package name */
        private long f4338g = -1;

        /* renamed from: h, reason: collision with root package name */
        private Set f4339h = new LinkedHashSet();

        public final b a() {
            Set setB;
            long j10;
            long j11;
            if (Build.VERSION.SDK_INT >= 24) {
                setB = ib.r.q(this.f4339h);
                j10 = this.f4337f;
                j11 = this.f4338g;
            } else {
                setB = f0.b();
                j10 = -1;
                j11 = -1;
            }
            return new b(this.f4334c, this.f4332a, this.f4333b, this.f4335d, this.f4336e, j10, j11, setB);
        }

        public final a b(k kVar) {
            rb.h.e(kVar, "networkType");
            this.f4334c = kVar;
            return this;
        }
    }

    /* renamed from: b1.b$b, reason: collision with other inner class name */
    public static final class C0075b {
        private C0075b() {
        }

        public /* synthetic */ C0075b(rb.f fVar) {
            this();
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f4340a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f4341b;

        public c(Uri uri, boolean z10) {
            rb.h.e(uri, "uri");
            this.f4340a = uri;
            this.f4341b = z10;
        }

        public final Uri a() {
            return this.f4340a;
        }

        public final boolean b() {
            return this.f4341b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!rb.h.a(c.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            rb.h.c(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            c cVar = (c) obj;
            return rb.h.a(this.f4340a, cVar.f4340a) && this.f4341b == cVar.f4341b;
        }

        public int hashCode() {
            return (this.f4340a.hashCode() * 31) + b1.c.a(this.f4341b);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(b bVar) {
        rb.h.e(bVar, "other");
        boolean z10 = bVar.f4325b;
        boolean z11 = bVar.f4326c;
        this(bVar.f4324a, z10, z11, bVar.f4327d, bVar.f4328e, bVar.f4329f, bVar.f4330g, bVar.f4331h);
    }

    public b(k kVar, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set set) {
        rb.h.e(kVar, "requiredNetworkType");
        rb.h.e(set, "contentUriTriggers");
        this.f4324a = kVar;
        this.f4325b = z10;
        this.f4326c = z11;
        this.f4327d = z12;
        this.f4328e = z13;
        this.f4329f = j10;
        this.f4330g = j11;
        this.f4331h = set;
    }

    public /* synthetic */ b(k kVar, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set set, int i10, rb.f fVar) {
        this((i10 & 1) != 0 ? k.NOT_REQUIRED : kVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) == 0 ? z13 : false, (i10 & 32) != 0 ? -1L : j10, (i10 & 64) == 0 ? j11 : -1L, (i10 & 128) != 0 ? f0.b() : set);
    }

    public final long a() {
        return this.f4330g;
    }

    public final long b() {
        return this.f4329f;
    }

    public final Set c() {
        return this.f4331h;
    }

    public final k d() {
        return this.f4324a;
    }

    public final boolean e() {
        return !this.f4331h.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !rb.h.a(b.class, obj.getClass())) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f4325b == bVar.f4325b && this.f4326c == bVar.f4326c && this.f4327d == bVar.f4327d && this.f4328e == bVar.f4328e && this.f4329f == bVar.f4329f && this.f4330g == bVar.f4330g && this.f4324a == bVar.f4324a) {
            return rb.h.a(this.f4331h, bVar.f4331h);
        }
        return false;
    }

    public final boolean f() {
        return this.f4327d;
    }

    public final boolean g() {
        return this.f4325b;
    }

    public final boolean h() {
        return this.f4326c;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f4324a.hashCode() * 31) + (this.f4325b ? 1 : 0)) * 31) + (this.f4326c ? 1 : 0)) * 31) + (this.f4327d ? 1 : 0)) * 31) + (this.f4328e ? 1 : 0)) * 31;
        long j10 = this.f4329f;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f4330g;
        return ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f4331h.hashCode();
    }

    public final boolean i() {
        return this.f4328e;
    }
}
