package k;

import java.util.HashMap;
import java.util.Map;
import k.b;

/* loaded from: classes.dex */
public class a extends b {

    /* renamed from: q, reason: collision with root package name */
    private HashMap f24559q = new HashMap();

    public boolean contains(Object obj) {
        return this.f24559q.containsKey(obj);
    }

    @Override // k.b
    protected b.c f(Object obj) {
        return (b.c) this.f24559q.get(obj);
    }

    @Override // k.b
    public Object l(Object obj, Object obj2) {
        b.c cVarF = f(obj);
        if (cVarF != null) {
            return cVarF.f24565n;
        }
        this.f24559q.put(obj, k(obj, obj2));
        return null;
    }

    @Override // k.b
    public Object n(Object obj) {
        Object objN = super.n(obj);
        this.f24559q.remove(obj);
        return objN;
    }

    public Map.Entry o(Object obj) {
        if (contains(obj)) {
            return ((b.c) this.f24559q.get(obj)).f24567p;
        }
        return null;
    }
}
