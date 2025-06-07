package t1;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final Class f27208a;

    /* renamed from: b, reason: collision with root package name */
    private final List f27209b;

    /* renamed from: c, reason: collision with root package name */
    private final f2.e f27210c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.core.util.e f27211d;

    /* renamed from: e, reason: collision with root package name */
    private final String f27212e;

    interface a {
        v a(v vVar);
    }

    public i(Class cls, Class cls2, Class cls3, List list, f2.e eVar, androidx.core.util.e eVar2) {
        this.f27208a = cls;
        this.f27209b = list;
        this.f27210c = eVar;
        this.f27211d = eVar2;
        this.f27212e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v b(com.bumptech.glide.load.data.e eVar, int i10, int i11, r1.h hVar) {
        List list = (List) n2.k.d(this.f27211d.b());
        try {
            return c(eVar, i10, i11, hVar, list);
        } finally {
            this.f27211d.a(list);
        }
    }

    private v c(com.bumptech.glide.load.data.e eVar, int i10, int i11, r1.h hVar, List list) throws q {
        int size = this.f27209b.size();
        v vVarA = null;
        for (int i12 = 0; i12 < size; i12++) {
            r1.j jVar = (r1.j) this.f27209b.get(i12);
            try {
                if (jVar.b(eVar.a(), hVar)) {
                    vVarA = jVar.a(eVar.a(), i10, i11, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e5) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e5);
                }
                list.add(e5);
            }
            if (vVarA != null) {
                break;
            }
        }
        if (vVarA != null) {
            return vVarA;
        }
        throw new q(this.f27212e, new ArrayList(list));
    }

    public v a(com.bumptech.glide.load.data.e eVar, int i10, int i11, r1.h hVar, a aVar) {
        return this.f27210c.a(aVar.a(b(eVar, i10, i11, hVar)), hVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f27208a + ", decoders=" + this.f27209b + ", transcoder=" + this.f27210c + '}';
    }
}
