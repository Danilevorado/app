package yb;

/* loaded from: classes2.dex */
public abstract class u extends c {
    protected final String U() {
        u uVarY;
        u uVarB = l.b();
        if (this == uVarB) {
            return "Dispatchers.Main";
        }
        try {
            uVarY = uVarB.y();
        } catch (UnsupportedOperationException unused) {
            uVarY = null;
        }
        if (this == uVarY) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public abstract u y();
}
