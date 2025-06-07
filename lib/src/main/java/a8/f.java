package a8;

import eb.l;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class f implements x7.a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f232a;

    /* renamed from: b, reason: collision with root package name */
    private final l f233b;

    public f(Set set, cb.a aVar) {
        this.f232a = set;
        this.f233b = aVar.h();
    }

    @Override // x7.a
    public byte[] a() {
        return this.f233b.d(this.f232a);
    }

    @Override // x7.a
    public Object getValue() {
        return new HashSet(this.f232a);
    }
}
