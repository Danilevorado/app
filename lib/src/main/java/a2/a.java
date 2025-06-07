package a2;

import android.content.res.Resources;

/* loaded from: classes.dex */
public class a implements r1.j {

    /* renamed from: a, reason: collision with root package name */
    private final r1.j f2a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f3b;

    public a(Resources resources, r1.j jVar) {
        this.f3b = (Resources) n2.k.d(resources);
        this.f2a = (r1.j) n2.k.d(jVar);
    }

    @Override // r1.j
    public t1.v a(Object obj, int i10, int i11, r1.h hVar) {
        return u.e(this.f3b, this.f2a.a(obj, i10, i11, hVar));
    }

    @Override // r1.j
    public boolean b(Object obj, r1.h hVar) {
        return this.f2a.b(obj, hVar);
    }
}
