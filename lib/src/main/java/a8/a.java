package a8;

/* loaded from: classes2.dex */
public final class a implements x7.a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f222a;

    /* renamed from: b, reason: collision with root package name */
    private final eb.a f223b;

    public a(boolean z10, cb.a aVar) {
        this.f222a = z10;
        this.f223b = aVar.a();
    }

    @Override // x7.a
    public byte[] a() {
        return this.f223b.d(this.f222a);
    }

    @Override // x7.a
    public Object getValue() {
        return Boolean.valueOf(this.f222a);
    }
}
