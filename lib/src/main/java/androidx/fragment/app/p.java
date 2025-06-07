package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
final class p extends f0 {

    /* renamed from: k, reason: collision with root package name */
    private static final g0.b f2924k = new a();

    /* renamed from: g, reason: collision with root package name */
    private final boolean f2928g;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f2925d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f2926e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f2927f = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private boolean f2929h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f2930i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f2931j = false;

    class a implements g0.b {
        a() {
        }

        @Override // androidx.lifecycle.g0.b
        public f0 a(Class cls) {
            return new p(true);
        }

        @Override // androidx.lifecycle.g0.b
        public /* synthetic */ f0 b(Class cls, n0.a aVar) {
            return h0.b(this, cls, aVar);
        }
    }

    p(boolean z10) {
        this.f2928g = z10;
    }

    static p j(j0 j0Var) {
        return (p) new g0(j0Var, f2924k).a(p.class);
    }

    @Override // androidx.lifecycle.f0
    protected void d() {
        if (m.F0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2929h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f2925d.equals(pVar.f2925d) && this.f2926e.equals(pVar.f2926e) && this.f2927f.equals(pVar.f2927f);
    }

    void f(Fragment fragment) {
        if (this.f2931j) {
            if (m.F0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f2925d.containsKey(fragment.f2677r)) {
                return;
            }
            this.f2925d.put(fragment.f2677r, fragment);
            if (m.F0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    void g(Fragment fragment) {
        if (m.F0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        p pVar = (p) this.f2926e.get(fragment.f2677r);
        if (pVar != null) {
            pVar.d();
            this.f2926e.remove(fragment.f2677r);
        }
        j0 j0Var = (j0) this.f2927f.get(fragment.f2677r);
        if (j0Var != null) {
            j0Var.a();
            this.f2927f.remove(fragment.f2677r);
        }
    }

    Fragment h(String str) {
        return (Fragment) this.f2925d.get(str);
    }

    public int hashCode() {
        return (((this.f2925d.hashCode() * 31) + this.f2926e.hashCode()) * 31) + this.f2927f.hashCode();
    }

    p i(Fragment fragment) {
        p pVar = (p) this.f2926e.get(fragment.f2677r);
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(this.f2928g);
        this.f2926e.put(fragment.f2677r, pVar2);
        return pVar2;
    }

    Collection k() {
        return new ArrayList(this.f2925d.values());
    }

    j0 l(Fragment fragment) {
        j0 j0Var = (j0) this.f2927f.get(fragment.f2677r);
        if (j0Var != null) {
            return j0Var;
        }
        j0 j0Var2 = new j0();
        this.f2927f.put(fragment.f2677r, j0Var2);
        return j0Var2;
    }

    boolean m() {
        return this.f2929h;
    }

    void n(Fragment fragment) {
        if (this.f2931j) {
            if (m.F0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f2925d.remove(fragment.f2677r) != null) && m.F0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    void o(boolean z10) {
        this.f2931j = z10;
    }

    boolean p(Fragment fragment) {
        if (this.f2925d.containsKey(fragment.f2677r)) {
            return this.f2928g ? this.f2929h : !this.f2930i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f2925d.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f2926e.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f2927f.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
