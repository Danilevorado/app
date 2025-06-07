package a8;

import eb.g;

/* loaded from: classes2.dex */
public final class c implements x7.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f226a;

    /* renamed from: b, reason: collision with root package name */
    private final g f227b;

    public c(int i10, cb.a aVar) {
        this.f226a = i10;
        this.f227b = aVar.e();
    }

    @Override // x7.a
    public byte[] a() {
        return this.f227b.e(this.f226a);
    }

    @Override // x7.a
    public Object getValue() {
        return Integer.valueOf(this.f226a);
    }
}
