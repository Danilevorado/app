package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class u {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f2953a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f2954b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private p f2955c;

    u() {
    }

    void a(Fragment fragment) {
        if (this.f2953a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f2953a) {
            this.f2953a.add(fragment);
        }
        fragment.f2683x = true;
    }

    void b() {
        this.f2954b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.f2954b.get(str) != null;
    }

    void d(int i10) {
        for (t tVar : this.f2954b.values()) {
            if (tVar != null) {
                tVar.t(i10);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f2954b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (t tVar : this.f2954b.values()) {
                printWriter.print(str);
                if (tVar != null) {
                    Fragment fragmentK = tVar.k();
                    printWriter.println(fragmentK);
                    fragmentK.h(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f2953a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = (Fragment) this.f2953a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    Fragment f(String str) {
        t tVar = (t) this.f2954b.get(str);
        if (tVar != null) {
            return tVar.k();
        }
        return null;
    }

    Fragment g(int i10) {
        for (int size = this.f2953a.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f2953a.get(size);
            if (fragment != null && fragment.I == i10) {
                return fragment;
            }
        }
        for (t tVar : this.f2954b.values()) {
            if (tVar != null) {
                Fragment fragmentK = tVar.k();
                if (fragmentK.I == i10) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment h(String str) {
        if (str != null) {
            for (int size = this.f2953a.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f2953a.get(size);
                if (fragment != null && str.equals(fragment.K)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (t tVar : this.f2954b.values()) {
            if (tVar != null) {
                Fragment fragmentK = tVar.k();
                if (str.equals(fragmentK.K)) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment i(String str) {
        Fragment fragmentJ;
        for (t tVar : this.f2954b.values()) {
            if (tVar != null && (fragmentJ = tVar.k().j(str)) != null) {
                return fragmentJ;
            }
        }
        return null;
    }

    int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.S;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f2953a.indexOf(fragment);
        for (int i10 = iIndexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = (Fragment) this.f2953a.get(i10);
            if (fragment2.S == viewGroup && (view2 = fragment2.T) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f2953a.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f2953a.get(iIndexOf);
            if (fragment3.S == viewGroup && (view = fragment3.T) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    List k() {
        ArrayList arrayList = new ArrayList();
        for (t tVar : this.f2954b.values()) {
            if (tVar != null) {
                arrayList.add(tVar);
            }
        }
        return arrayList;
    }

    List l() {
        ArrayList arrayList = new ArrayList();
        for (t tVar : this.f2954b.values()) {
            arrayList.add(tVar != null ? tVar.k() : null);
        }
        return arrayList;
    }

    t m(String str) {
        return (t) this.f2954b.get(str);
    }

    List n() {
        ArrayList arrayList;
        if (this.f2953a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2953a) {
            arrayList = new ArrayList(this.f2953a);
        }
        return arrayList;
    }

    p o() {
        return this.f2955c;
    }

    void p(t tVar) {
        Fragment fragmentK = tVar.k();
        if (c(fragmentK.f2677r)) {
            return;
        }
        this.f2954b.put(fragmentK.f2677r, tVar);
        if (fragmentK.O) {
            if (fragmentK.N) {
                this.f2955c.f(fragmentK);
            } else {
                this.f2955c.n(fragmentK);
            }
            fragmentK.O = false;
        }
        if (m.F0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragmentK);
        }
    }

    void q(t tVar) {
        Fragment fragmentK = tVar.k();
        if (fragmentK.N) {
            this.f2955c.n(fragmentK);
        }
        if (((t) this.f2954b.put(fragmentK.f2677r, null)) != null && m.F0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragmentK);
        }
    }

    void r() {
        Iterator it = this.f2953a.iterator();
        while (it.hasNext()) {
            t tVar = (t) this.f2954b.get(((Fragment) it.next()).f2677r);
            if (tVar != null) {
                tVar.m();
            }
        }
        for (t tVar2 : this.f2954b.values()) {
            if (tVar2 != null) {
                tVar2.m();
                Fragment fragmentK = tVar2.k();
                if (fragmentK.f2684y && !fragmentK.f0()) {
                    q(tVar2);
                }
            }
        }
    }

    void s(Fragment fragment) {
        synchronized (this.f2953a) {
            this.f2953a.remove(fragment);
        }
        fragment.f2683x = false;
    }

    void t() {
        this.f2954b.clear();
    }

    void u(List list) {
        this.f2953a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment fragmentF = f(str);
                if (fragmentF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (m.F0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentF);
                }
                a(fragmentF);
            }
        }
    }

    ArrayList v() {
        ArrayList arrayList = new ArrayList(this.f2954b.size());
        for (t tVar : this.f2954b.values()) {
            if (tVar != null) {
                Fragment fragmentK = tVar.k();
                s sVarR = tVar.r();
                arrayList.add(sVarR);
                if (m.F0(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragmentK + ": " + sVarR.f2944y);
                }
            }
        }
        return arrayList;
    }

    ArrayList w() {
        synchronized (this.f2953a) {
            if (this.f2953a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(this.f2953a.size());
            Iterator it = this.f2953a.iterator();
            while (it.hasNext()) {
                Fragment fragment = (Fragment) it.next();
                arrayList.add(fragment.f2677r);
                if (m.F0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.f2677r + "): " + fragment);
                }
            }
            return arrayList;
        }
    }

    void x(p pVar) {
        this.f2955c = pVar;
    }
}
