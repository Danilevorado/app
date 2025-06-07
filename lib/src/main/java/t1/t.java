package t1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import t1.i;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private final Class f27292a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.core.util.e f27293b;

    /* renamed from: c, reason: collision with root package name */
    private final List f27294c;

    /* renamed from: d, reason: collision with root package name */
    private final String f27295d;

    public t(Class cls, Class cls2, Class cls3, List list, androidx.core.util.e eVar) {
        this.f27292a = cls;
        this.f27293b = eVar;
        this.f27294c = (List) n2.k.c(list);
        this.f27295d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v b(com.bumptech.glide.load.data.e eVar, r1.h hVar, int i10, int i11, i.a aVar, List list) throws q {
        int size = this.f27294c.size();
        v vVarA = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                vVarA = ((i) this.f27294c.get(i12)).a(eVar, i10, i11, hVar, aVar);
            } catch (q e5) {
                list.add(e5);
            }
            if (vVarA != null) {
                break;
            }
        }
        if (vVarA != null) {
            return vVarA;
        }
        throw new q(this.f27295d, new ArrayList(list));
    }

    public v a(com.bumptech.glide.load.data.e eVar, r1.h hVar, int i10, int i11, i.a aVar) {
        List list = (List) n2.k.d(this.f27293b.b());
        try {
            return b(eVar, hVar, i10, i11, aVar, list);
        } finally {
            this.f27293b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f27294c.toArray()) + '}';
    }
}
