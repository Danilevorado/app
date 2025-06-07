package g2;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class t extends Fragment {

    /* renamed from: n0, reason: collision with root package name */
    private final g2.a f23835n0;

    /* renamed from: o0, reason: collision with root package name */
    private final q f23836o0;

    /* renamed from: p0, reason: collision with root package name */
    private final Set f23837p0;

    /* renamed from: q0, reason: collision with root package name */
    private t f23838q0;

    /* renamed from: r0, reason: collision with root package name */
    private com.bumptech.glide.k f23839r0;

    /* renamed from: s0, reason: collision with root package name */
    private Fragment f23840s0;

    private class a implements q {
        a() {
        }

        @Override // g2.q
        public Set a() {
            Set<t> setM1 = t.this.M1();
            HashSet hashSet = new HashSet(setM1.size());
            for (t tVar : setM1) {
                if (tVar.P1() != null) {
                    hashSet.add(tVar.P1());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + t.this + "}";
        }
    }

    public t() {
        this(new g2.a());
    }

    public t(g2.a aVar) {
        this.f23836o0 = new a();
        this.f23837p0 = new HashSet();
        this.f23835n0 = aVar;
    }

    private void L1(t tVar) {
        this.f23837p0.add(tVar);
    }

    private Fragment O1() {
        Fragment fragmentI = I();
        return fragmentI != null ? fragmentI : this.f23840s0;
    }

    private static androidx.fragment.app.m R1(Fragment fragment) {
        while (fragment.I() != null) {
            fragment = fragment.I();
        }
        return fragment.D();
    }

    private boolean S1(Fragment fragment) {
        Fragment fragmentO1 = O1();
        while (true) {
            Fragment fragmentI = fragment.I();
            if (fragmentI == null) {
                return false;
            }
            if (fragmentI.equals(fragmentO1)) {
                return true;
            }
            fragment = fragment.I();
        }
    }

    private void T1(Context context, androidx.fragment.app.m mVar) {
        X1();
        t tVarK = com.bumptech.glide.b.c(context).k().k(mVar);
        this.f23838q0 = tVarK;
        if (equals(tVarK)) {
            return;
        }
        this.f23838q0.L1(this);
    }

    private void U1(t tVar) {
        this.f23837p0.remove(tVar);
    }

    private void X1() {
        t tVar = this.f23838q0;
        if (tVar != null) {
            tVar.U1(this);
            this.f23838q0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void B0() {
        super.B0();
        this.f23840s0 = null;
        X1();
    }

    Set M1() {
        t tVar = this.f23838q0;
        if (tVar == null) {
            return Collections.emptySet();
        }
        if (equals(tVar)) {
            return Collections.unmodifiableSet(this.f23837p0);
        }
        HashSet hashSet = new HashSet();
        for (t tVar2 : this.f23838q0.M1()) {
            if (S1(tVar2.O1())) {
                hashSet.add(tVar2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    g2.a N1() {
        return this.f23835n0;
    }

    public com.bumptech.glide.k P1() {
        return this.f23839r0;
    }

    @Override // androidx.fragment.app.Fragment
    public void Q0() {
        super.Q0();
        this.f23835n0.d();
    }

    public q Q1() {
        return this.f23836o0;
    }

    @Override // androidx.fragment.app.Fragment
    public void R0() {
        super.R0();
        this.f23835n0.e();
    }

    void V1(Fragment fragment) {
        androidx.fragment.app.m mVarR1;
        this.f23840s0 = fragment;
        if (fragment == null || fragment.v() == null || (mVarR1 = R1(fragment)) == null) {
            return;
        }
        T1(fragment.v(), mVarR1);
    }

    public void W1(com.bumptech.glide.k kVar) {
        this.f23839r0 = kVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void q0(Context context) {
        super.q0(context);
        androidx.fragment.app.m mVarR1 = R1(this);
        if (mVarR1 == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                T1(v(), mVarR1);
            } catch (IllegalStateException e5) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e5);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + O1() + "}";
    }

    @Override // androidx.fragment.app.Fragment
    public void y0() {
        super.y0();
        this.f23835n0.c();
        X1();
    }
}
