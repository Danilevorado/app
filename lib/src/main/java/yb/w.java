package yb;

/* loaded from: classes2.dex */
public final class w extends c {

    /* renamed from: n, reason: collision with root package name */
    public static final w f28625n = new w();

    private w() {
    }

    @Override // yb.c
    public void c(kb.e eVar, Runnable runnable) {
        a5.a.a(eVar.get(x.f28626m));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // yb.c
    public boolean e(kb.e eVar) {
        return false;
    }

    @Override // yb.c
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
