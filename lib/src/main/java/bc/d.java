package bc;

/* loaded from: classes2.dex */
public abstract class d {
    public static final void a(int i10) {
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(rb.h.j("Expected positive parallelism level, but got ", Integer.valueOf(i10)).toString());
        }
    }
}
