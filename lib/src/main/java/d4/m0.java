package d4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class m0 extends Fragment implements f {

    /* renamed from: q0, reason: collision with root package name */
    private static final WeakHashMap f22918q0 = new WeakHashMap();

    /* renamed from: n0, reason: collision with root package name */
    private final Map f22919n0 = Collections.synchronizedMap(new q.a());

    /* renamed from: o0, reason: collision with root package name */
    private int f22920o0 = 0;

    /* renamed from: p0, reason: collision with root package name */
    private Bundle f22921p0;

    public static m0 N1(androidx.fragment.app.e eVar) {
        m0 m0Var;
        WeakHashMap weakHashMap = f22918q0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(eVar);
        if (weakReference != null && (m0Var = (m0) weakReference.get()) != null) {
            return m0Var;
        }
        try {
            m0 m0Var2 = (m0) eVar.H().i0("SupportLifecycleFragmentImpl");
            if (m0Var2 == null || m0Var2.i0()) {
                m0Var2 = new m0();
                eVar.H().l().d(m0Var2, "SupportLifecycleFragmentImpl").g();
            }
            weakHashMap.put(eVar, new WeakReference(m0Var2));
            return m0Var2;
        } catch (ClassCastException e5) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e5);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void O0() {
        super.O0();
        this.f22920o0 = 3;
        Iterator it = this.f22919n0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void P0(Bundle bundle) {
        super.P0(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f22919n0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void Q0() {
        super.Q0();
        this.f22920o0 = 2;
        Iterator it = this.f22919n0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void R0() {
        super.R0();
        this.f22920o0 = 4;
        Iterator it = this.f22919n0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }

    @Override // d4.f
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f22919n0.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f22919n0.put(str, lifecycleCallback);
        if (this.f22920o0 > 0) {
            new r4.e(Looper.getMainLooper()).post(new l0(this, lifecycleCallback, str));
        }
    }

    @Override // d4.f
    public final LifecycleCallback d(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f22919n0.get(str));
    }

    @Override // d4.f
    public final /* synthetic */ Activity e() {
        return k();
    }

    @Override // androidx.fragment.app.Fragment
    public final void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.h(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f22919n0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void o0(int i10, int i11, Intent intent) {
        super.o0(i10, i11, intent);
        Iterator it = this.f22919n0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void t0(Bundle bundle) {
        super.t0(bundle);
        this.f22920o0 = 1;
        this.f22921p0 = bundle;
        for (Map.Entry entry : this.f22919n0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void y0() {
        super.y0();
        this.f22920o0 = 5;
        Iterator it = this.f22919n0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }
}
