package r2;

import java.util.Set;

/* loaded from: classes.dex */
final class p implements p2.g {

    /* renamed from: a, reason: collision with root package name */
    private final Set f26524a;

    /* renamed from: b, reason: collision with root package name */
    private final o f26525b;

    /* renamed from: c, reason: collision with root package name */
    private final s f26526c;

    p(Set set, o oVar, s sVar) {
        this.f26524a = set;
        this.f26525b = oVar;
        this.f26526c = sVar;
    }

    @Override // p2.g
    public p2.f a(String str, Class cls, p2.b bVar, p2.e eVar) {
        if (this.f26524a.contains(bVar)) {
            return new r(this.f26525b, str, bVar, eVar, this.f26526c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f26524a));
    }
}
