package a8;

/* loaded from: classes2.dex */
public final class b implements x7.a {

    /* renamed from: a, reason: collision with root package name */
    private final float f224a;

    /* renamed from: b, reason: collision with root package name */
    private final eb.f f225b;

    public b(float f5, cb.a aVar) {
        this.f224a = f5;
        this.f225b = aVar.d();
    }

    @Override // x7.a
    public byte[] a() {
        return this.f225b.d(this.f224a);
    }

    @Override // x7.a
    public Object getValue() {
        return Float.valueOf(this.f224a);
    }
}
