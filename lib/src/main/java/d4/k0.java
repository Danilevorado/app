package d4;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class k0 extends Fragment implements f {

    /* renamed from: p, reason: collision with root package name */
    private static final WeakHashMap f22910p = new WeakHashMap();

    /* renamed from: m, reason: collision with root package name */
    private final Map f22911m = Collections.synchronizedMap(new q.a());

    /* renamed from: n, reason: collision with root package name */
    private int f22912n = 0;

    /* renamed from: o, reason: collision with root package name */
    private Bundle f22913o;

    public static k0 f(Activity activity) {
        k0 k0Var;
        WeakHashMap weakHashMap = f22910p;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (k0Var = (k0) weakReference.get()) != null) {
            return k0Var;
        }
        try {
            k0 k0Var2 = (k0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (k0Var2 == null || k0Var2.isRemoving()) {
                k0Var2 = new k0();
                activity.getFragmentManager().beginTransaction().add(k0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(k0Var2));
            return k0Var2;
        } catch (ClassCastException e5) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e5);
        }
    }

    @Override // d4.f
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f22911m.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f22911m.put(str, lifecycleCallback);
        if (this.f22912n > 0) {
            new r4.e(Looper.getMainLooper()).post(new j0(this, lifecycleCallback, str));
        }
    }

    @Override // d4.f
    public final LifecycleCallback d(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f22911m.get(str));
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f22911m.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // d4.f
    public final Activity e() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = this.f22911m.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22912n = 1;
        this.f22913o = bundle;
        for (Map.Entry entry : this.f22911m.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f22912n = 5;
        Iterator it = this.f22911m.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f22912n = 3;
        Iterator it = this.f22911m.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f22911m.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f22912n = 2;
        Iterator it = this.f22911m.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f22912n = 4;
        Iterator it = this.f22911m.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }
}
