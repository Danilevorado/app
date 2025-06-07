package a8;

import eb.h;

/* loaded from: classes2.dex */
public final class d implements x7.a {

    /* renamed from: a, reason: collision with root package name */
    private final long f228a;

    /* renamed from: b, reason: collision with root package name */
    private final h f229b;

    public d(long j10, cb.a aVar) {
        this.f228a = j10;
        this.f229b = aVar.f();
    }

    @Override // x7.a
    public byte[] a() {
        return this.f229b.d(this.f228a);
    }

    @Override // x7.a
    public Object getValue() {
        return Long.valueOf(this.f228a);
    }
}
