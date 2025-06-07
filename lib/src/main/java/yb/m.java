package yb;

/* loaded from: classes2.dex */
public abstract class m extends c {

    /* renamed from: n, reason: collision with root package name */
    private long f28613n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f28614o;

    public static /* synthetic */ void W(m mVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        mVar.V(z10);
    }

    private final long y(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    protected long U() {
        return Long.MAX_VALUE;
    }

    public final void V(boolean z10) {
        this.f28613n += y(z10);
        if (z10) {
            return;
        }
        this.f28614o = true;
    }

    public final boolean X() {
        return true;
    }

    public final boolean Y() {
        return false;
    }
}
