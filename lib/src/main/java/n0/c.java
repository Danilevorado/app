package n0;

import androidx.lifecycle.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import qb.l;
import rb.h;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final List f25448a = new ArrayList();

    public final void a(vb.a aVar, l lVar) {
        h.e(aVar, "clazz");
        h.e(lVar, "initializer");
        this.f25448a.add(new f(pb.a.a(aVar), lVar));
    }

    public final g0.b b() {
        Object[] array = this.f25448a.toArray(new f[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        f[] fVarArr = (f[]) array;
        return new b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
