package b5;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
final class e0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f4466a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Queue f4467b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4468c;

    e0() {
    }

    public final void a(d0 d0Var) {
        synchronized (this.f4466a) {
            if (this.f4467b == null) {
                this.f4467b = new ArrayDeque();
            }
            this.f4467b.add(d0Var);
        }
    }

    public final void b(i iVar) {
        d0 d0Var;
        synchronized (this.f4466a) {
            if (this.f4467b != null && !this.f4468c) {
                this.f4468c = true;
                while (true) {
                    synchronized (this.f4466a) {
                        d0Var = (d0) this.f4467b.poll();
                        if (d0Var == null) {
                            this.f4468c = false;
                            return;
                        }
                    }
                    d0Var.c(iVar);
                }
            }
        }
    }
}
