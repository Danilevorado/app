package r1;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    private static final b f26445e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Object f26446a;

    /* renamed from: b, reason: collision with root package name */
    private final b f26447b;

    /* renamed from: c, reason: collision with root package name */
    private final String f26448c;

    /* renamed from: d, reason: collision with root package name */
    private volatile byte[] f26449d;

    class a implements b {
        a() {
        }

        @Override // r1.g.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public interface b {
        void a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    private g(String str, Object obj, b bVar) {
        this.f26448c = n2.k.b(str);
        this.f26446a = obj;
        this.f26447b = (b) n2.k.d(bVar);
    }

    public static g a(String str, Object obj, b bVar) {
        return new g(str, obj, bVar);
    }

    private static b b() {
        return f26445e;
    }

    private byte[] d() {
        if (this.f26449d == null) {
            this.f26449d = this.f26448c.getBytes(f.f26444a);
        }
        return this.f26449d;
    }

    public static g e(String str) {
        return new g(str, null, b());
    }

    public static g f(String str, Object obj) {
        return new g(str, obj, b());
    }

    public Object c() {
        return this.f26446a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f26448c.equals(((g) obj).f26448c);
        }
        return false;
    }

    public void g(Object obj, MessageDigest messageDigest) {
        this.f26447b.a(d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.f26448c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f26448c + "'}";
    }
}
