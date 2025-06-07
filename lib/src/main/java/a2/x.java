package a2;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes.dex */
public class x implements r1.j {

    /* renamed from: a, reason: collision with root package name */
    private final c2.e f92a;

    /* renamed from: b, reason: collision with root package name */
    private final u1.d f93b;

    public x(c2.e eVar, u1.d dVar) {
        this.f92a = eVar;
        this.f93b = dVar;
    }

    @Override // r1.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public t1.v a(Uri uri, int i10, int i11, r1.h hVar) {
        t1.v vVarA = this.f92a.a(uri, i10, i11, hVar);
        if (vVarA == null) {
            return null;
        }
        return n.a(this.f93b, (Drawable) vVarA.get(), i10, i11);
    }

    @Override // r1.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri, r1.h hVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
