package a8;

import eb.k;

/* loaded from: classes2.dex */
public final class e implements x7.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f230a;

    /* renamed from: b, reason: collision with root package name */
    private final k f231b;

    public e(String str, cb.a aVar) {
        this.f230a = str;
        this.f231b = aVar.g();
    }

    @Override // x7.a
    public byte[] a() {
        return this.f231b.d(this.f230a);
    }

    @Override // x7.a
    public Object getValue() {
        return this.f230a;
    }
}
