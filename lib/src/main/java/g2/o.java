package g2;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class o extends Fragment {

    /* renamed from: m, reason: collision with root package name */
    private final g2.a f23795m;

    /* renamed from: n, reason: collision with root package name */
    private final q f23796n;

    /* renamed from: o, reason: collision with root package name */
    private final Set f23797o;

    /* renamed from: p, reason: collision with root package name */
    private com.bumptech.glide.k f23798p;

    /* renamed from: q, reason: collision with root package name */
    private o f23799q;

    /* renamed from: r, reason: collision with root package name */
    private Fragment f23800r;

    private class a implements q {
        a() {
        }

        @Override // g2.q
        public Set a() {
            Set<o> setB = o.this.b();
            HashSet hashSet = new HashSet(setB.size());
            for (o oVar : setB) {
                if (oVar.e() != null) {
                    hashSet.add(oVar.e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + o.this + "}";
        }
    }

    public o() {
        this(new g2.a());
    }

    o(g2.a aVar) {
        this.f23796n = new a();
        this.f23797o = new HashSet();
        this.f23795m = aVar;
    }

    private void a(o oVar) {
        this.f23797o.add(oVar);
    }

    private Fragment d() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f23800r;
    }

    private boolean g(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void h(Activity activity) {
        l();
        o oVarI = com.bumptech.glide.b.c(activity).k().i(activity);
        this.f23799q = oVarI;
        if (equals(oVarI)) {
            return;
        }
        this.f23799q.a(this);
    }

    private void i(o oVar) {
        this.f23797o.remove(oVar);
    }

    private void l() {
        o oVar = this.f23799q;
        if (oVar != null) {
            oVar.i(this);
            this.f23799q = null;
        }
    }

    Set b() {
        if (equals(this.f23799q)) {
            return Collections.unmodifiableSet(this.f23797o);
        }
        if (this.f23799q == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (o oVar : this.f23799q.b()) {
            if (g(oVar.getParentFragment())) {
                hashSet.add(oVar);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    g2.a c() {
        return this.f23795m;
    }

    public com.bumptech.glide.k e() {
        return this.f23798p;
    }

    public q f() {
        return this.f23796n;
    }

    void j(Fragment fragment) {
        this.f23800r = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        h(fragment.getActivity());
    }

    public void k(com.bumptech.glide.k kVar) {
        this.f23798p = kVar;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            h(activity);
        } catch (IllegalStateException e5) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e5);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f23795m.c();
        l();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        l();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f23795m.d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f23795m.e();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + d() + "}";
    }
}
