package g2;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final Set f23812a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Set f23813b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private boolean f23814c;

    public boolean a(j2.c cVar) {
        boolean z10 = true;
        if (cVar == null) {
            return true;
        }
        boolean zRemove = this.f23812a.remove(cVar);
        if (!this.f23813b.remove(cVar) && !zRemove) {
            z10 = false;
        }
        if (z10) {
            cVar.clear();
        }
        return z10;
    }

    public void b() {
        Iterator it = n2.l.i(this.f23812a).iterator();
        while (it.hasNext()) {
            a((j2.c) it.next());
        }
        this.f23813b.clear();
    }

    public void c() {
        this.f23814c = true;
        for (j2.c cVar : n2.l.i(this.f23812a)) {
            if (cVar.isRunning() || cVar.j()) {
                cVar.clear();
                this.f23813b.add(cVar);
            }
        }
    }

    public void d() {
        this.f23814c = true;
        for (j2.c cVar : n2.l.i(this.f23812a)) {
            if (cVar.isRunning()) {
                cVar.pause();
                this.f23813b.add(cVar);
            }
        }
    }

    public void e() {
        for (j2.c cVar : n2.l.i(this.f23812a)) {
            if (!cVar.j() && !cVar.d()) {
                cVar.clear();
                if (this.f23814c) {
                    this.f23813b.add(cVar);
                } else {
                    cVar.h();
                }
            }
        }
    }

    public void f() {
        this.f23814c = false;
        for (j2.c cVar : n2.l.i(this.f23812a)) {
            if (!cVar.j() && !cVar.isRunning()) {
                cVar.h();
            }
        }
        this.f23813b.clear();
    }

    public void g(j2.c cVar) {
        this.f23812a.add(cVar);
        if (!this.f23814c) {
            cVar.h();
            return;
        }
        cVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f23813b.add(cVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f23812a.size() + ", isPaused=" + this.f23814c + "}";
    }
}
