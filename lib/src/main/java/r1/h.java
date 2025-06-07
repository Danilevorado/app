package r1;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    private final q.a f26450b = new n2.b();

    private static void f(g gVar, Object obj, MessageDigest messageDigest) {
        gVar.g(obj, messageDigest);
    }

    @Override // r1.f
    public void b(MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f26450b.size(); i10++) {
            f((g) this.f26450b.i(i10), this.f26450b.m(i10), messageDigest);
        }
    }

    public Object c(g gVar) {
        return this.f26450b.containsKey(gVar) ? this.f26450b.get(gVar) : gVar.c();
    }

    public void d(h hVar) {
        this.f26450b.j(hVar.f26450b);
    }

    public h e(g gVar, Object obj) {
        this.f26450b.put(gVar, obj);
        return this;
    }

    @Override // r1.f
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f26450b.equals(((h) obj).f26450b);
        }
        return false;
    }

    @Override // r1.f
    public int hashCode() {
        return this.f26450b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f26450b + '}';
    }
}
