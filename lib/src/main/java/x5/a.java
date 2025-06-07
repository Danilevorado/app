package x5;

import java.util.Set;

/* loaded from: classes.dex */
abstract class a implements e {
    a() {
    }

    @Override // x5.e
    public Object a(Class cls) {
        h6.b bVarC = c(cls);
        if (bVarC == null) {
            return null;
        }
        return bVarC.get();
    }

    @Override // x5.e
    public Set b(Class cls) {
        return (Set) d(cls).get();
    }
}
