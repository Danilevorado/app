package b4;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class h0 extends j0 {

    /* renamed from: f, reason: collision with root package name */
    private final Callable f4426f;

    /* synthetic */ h0(Callable callable, g0 g0Var) {
        super();
        this.f4426f = callable;
    }

    @Override // b4.j0
    final String a() {
        try {
            return (String) this.f4426f.call();
        } catch (Exception e5) {
            throw new RuntimeException(e5);
        }
    }
}
