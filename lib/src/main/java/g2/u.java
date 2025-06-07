package g2;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class u implements m {

    /* renamed from: m, reason: collision with root package name */
    private final Set f23842m = Collections.newSetFromMap(new WeakHashMap());

    public void i() {
        this.f23842m.clear();
    }

    public List j() {
        return n2.l.i(this.f23842m);
    }

    public void k(k2.h hVar) {
        this.f23842m.add(hVar);
    }

    public void l(k2.h hVar) {
        this.f23842m.remove(hVar);
    }

    @Override // g2.m
    public void onDestroy() {
        Iterator it = n2.l.i(this.f23842m).iterator();
        while (it.hasNext()) {
            ((k2.h) it.next()).onDestroy();
        }
    }

    @Override // g2.m
    public void onStart() {
        Iterator it = n2.l.i(this.f23842m).iterator();
        while (it.hasNext()) {
            ((k2.h) it.next()).onStart();
        }
    }

    @Override // g2.m
    public void onStop() {
        Iterator it = n2.l.i(this.f23842m).iterator();
        while (it.hasNext()) {
            ((k2.h) it.next()).onStop();
        }
    }
}
