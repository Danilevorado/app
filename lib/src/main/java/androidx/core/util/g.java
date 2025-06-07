package androidx.core.util;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: c, reason: collision with root package name */
    private final Object f2367c;

    public g(int i10) {
        super(i10);
        this.f2367c = new Object();
    }

    @Override // androidx.core.util.f, androidx.core.util.e
    public boolean a(Object obj) {
        boolean zA;
        synchronized (this.f2367c) {
            zA = super.a(obj);
        }
        return zA;
    }

    @Override // androidx.core.util.f, androidx.core.util.e
    public Object b() {
        Object objB;
        synchronized (this.f2367c) {
            objB = super.b();
        }
        return objB;
    }
}
