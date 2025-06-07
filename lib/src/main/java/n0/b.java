package n0;

import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import rb.h;

/* loaded from: classes.dex */
public final class b implements g0.b {

    /* renamed from: b, reason: collision with root package name */
    private final f[] f25447b;

    public b(f... fVarArr) {
        h.e(fVarArr, "initializers");
        this.f25447b = fVarArr;
    }

    @Override // androidx.lifecycle.g0.b
    public /* synthetic */ f0 a(Class cls) {
        return h0.a(this, cls);
    }

    @Override // androidx.lifecycle.g0.b
    public f0 b(Class cls, a aVar) {
        h.e(cls, "modelClass");
        h.e(aVar, "extras");
        f0 f0Var = null;
        for (f fVar : this.f25447b) {
            if (h.a(fVar.a(), cls)) {
                Object objC = fVar.b().c(aVar);
                f0Var = objC instanceof f0 ? (f0) objC : null;
            }
        }
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
