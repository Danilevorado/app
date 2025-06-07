package d8;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Future f22979a;

    /* renamed from: b, reason: collision with root package name */
    private final ha.c f22980b;

    a(Future future, ha.c cVar) {
        this.f22979a = future;
        this.f22980b = cVar;
    }

    public Object a(Object obj) {
        try {
            return this.f22979a.get();
        } catch (Exception e5) {
            this.f22980b.a(e5);
            return obj;
        }
    }

    public void b() throws ExecutionException, InterruptedException {
        try {
            this.f22979a.get();
        } catch (Exception e5) {
            throw new ja.a(e5);
        }
    }

    public Object c() {
        try {
            return this.f22979a.get();
        } catch (Exception e5) {
            throw new ja.a(e5);
        }
    }

    public boolean d() throws ExecutionException, InterruptedException {
        try {
            this.f22979a.get();
            return true;
        } catch (Exception e5) {
            this.f22980b.a(e5);
            return false;
        }
    }
}
