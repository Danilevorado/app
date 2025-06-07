package q0;

import androidx.room.i0;

/* loaded from: classes.dex */
public abstract class g extends m {
    public g(i0 i0Var) {
        super(i0Var);
    }

    protected abstract void g(u0.k kVar, Object obj);

    public final void h(Object obj) {
        u0.k kVarA = a();
        try {
            g(kVarA, obj);
            kVarA.R();
        } finally {
            f(kVarA);
        }
    }
}
