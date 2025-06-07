package g2;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class a implements l {

    /* renamed from: a, reason: collision with root package name */
    private final Set f23790a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private boolean f23791b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23792c;

    a() {
    }

    @Override // g2.l
    public void a(m mVar) {
        this.f23790a.add(mVar);
        if (this.f23792c) {
            mVar.onDestroy();
        } else if (this.f23791b) {
            mVar.onStart();
        } else {
            mVar.onStop();
        }
    }

    @Override // g2.l
    public void b(m mVar) {
        this.f23790a.remove(mVar);
    }

    void c() {
        this.f23792c = true;
        Iterator it = n2.l.i(this.f23790a).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onDestroy();
        }
    }

    void d() {
        this.f23791b = true;
        Iterator it = n2.l.i(this.f23790a).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onStart();
        }
    }

    void e() {
        this.f23791b = false;
        Iterator it = n2.l.i(this.f23790a).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onStop();
        }
    }
}
