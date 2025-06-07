package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class a extends v implements m.o {

    /* renamed from: t, reason: collision with root package name */
    final m f2723t;

    /* renamed from: u, reason: collision with root package name */
    boolean f2724u;

    /* renamed from: v, reason: collision with root package name */
    int f2725v;

    a(m mVar) {
        super(mVar.q0(), mVar.t0() != null ? mVar.t0().h().getClassLoader() : null);
        this.f2725v = -1;
        this.f2723t = mVar;
    }

    private static boolean z(v.a aVar) {
        Fragment fragment = aVar.f2976b;
        return (fragment == null || !fragment.f2683x || fragment.T == null || fragment.M || fragment.L || !fragment.h0()) ? false : true;
    }

    boolean A() {
        for (int i10 = 0; i10 < this.f2958c.size(); i10++) {
            if (z((v.a) this.f2958c.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public void B() {
        if (this.f2974s != null) {
            for (int i10 = 0; i10 < this.f2974s.size(); i10++) {
                ((Runnable) this.f2974s.get(i10)).run();
            }
            this.f2974s = null;
        }
    }

    void C(Fragment.g gVar) {
        for (int i10 = 0; i10 < this.f2958c.size(); i10++) {
            v.a aVar = (v.a) this.f2958c.get(i10);
            if (z(aVar)) {
                aVar.f2976b.F1(gVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.Fragment D(java.util.ArrayList r6, androidx.fragment.app.Fragment r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.f2958c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList r2 = r5.f2958c
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.v$a r2 = (androidx.fragment.app.v.a) r2
            int r3 = r2.f2975a
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.j$c r3 = r2.f2981g
            r2.f2982h = r3
            goto L32
        L22:
            androidx.fragment.app.Fragment r7 = r2.f2976b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.Fragment r2 = r2.f2976b
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.Fragment r2 = r2.f2976b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.D(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    @Override // androidx.fragment.app.m.o
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (m.F0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2964i) {
            return true;
        }
        this.f2723t.e(this);
        return true;
    }

    @Override // androidx.fragment.app.v
    public int f() {
        return q(false);
    }

    @Override // androidx.fragment.app.v
    public int g() {
        return q(true);
    }

    @Override // androidx.fragment.app.v
    public void h() {
        j();
        this.f2723t.b0(this, false);
    }

    @Override // androidx.fragment.app.v
    public void i() {
        j();
        this.f2723t.b0(this, true);
    }

    @Override // androidx.fragment.app.v
    void k(int i10, Fragment fragment, String str, int i11) {
        super.k(i10, fragment, str, i11);
        fragment.E = this.f2723t;
    }

    @Override // androidx.fragment.app.v
    public v l(Fragment fragment) {
        m mVar = fragment.E;
        if (mVar == null || mVar == this.f2723t) {
            return super.l(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void p(int i10) {
        if (this.f2964i) {
            if (m.F0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f2958c.size();
            for (int i11 = 0; i11 < size; i11++) {
                v.a aVar = (v.a) this.f2958c.get(i11);
                Fragment fragment = aVar.f2976b;
                if (fragment != null) {
                    fragment.D += i10;
                    if (m.F0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f2976b + " to " + aVar.f2976b.D);
                    }
                }
            }
        }
    }

    int q(boolean z10) {
        if (this.f2724u) {
            throw new IllegalStateException("commit already called");
        }
        if (m.F0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new a0("FragmentManager"));
            r("  ", printWriter);
            printWriter.close();
        }
        this.f2724u = true;
        this.f2725v = this.f2964i ? this.f2723t.i() : -1;
        this.f2723t.Y(this, z10);
        return this.f2725v;
    }

    public void r(String str, PrintWriter printWriter) {
        s(str, printWriter, true);
    }

    public void s(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2966k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2725v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2724u);
            if (this.f2963h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2963h));
            }
            if (this.f2959d != 0 || this.f2960e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2959d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2960e));
            }
            if (this.f2961f != 0 || this.f2962g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2961f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2962g));
            }
            if (this.f2967l != 0 || this.f2968m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2967l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2968m);
            }
            if (this.f2969n != 0 || this.f2970o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2969n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2970o);
            }
        }
        if (this.f2958c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f2958c.size();
        for (int i10 = 0; i10 < size; i10++) {
            v.a aVar = (v.a) this.f2958c.get(i10);
            switch (aVar.f2975a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f2975a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f2976b);
            if (z10) {
                if (aVar.f2977c != 0 || aVar.f2978d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2977c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2978d));
                }
                if (aVar.f2979e != 0 || aVar.f2980f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2979e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2980f));
                }
            }
        }
    }

    void t() {
        int size = this.f2958c.size();
        for (int i10 = 0; i10 < size; i10++) {
            v.a aVar = (v.a) this.f2958c.get(i10);
            Fragment fragment = aVar.f2976b;
            if (fragment != null) {
                fragment.G1(false);
                fragment.E1(this.f2963h);
                fragment.I1(this.f2971p, this.f2972q);
            }
            switch (aVar.f2975a) {
                case 1:
                    fragment.z1(aVar.f2977c, aVar.f2978d, aVar.f2979e, aVar.f2980f);
                    this.f2723t.i1(fragment, false);
                    this.f2723t.g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2975a);
                case 3:
                    fragment.z1(aVar.f2977c, aVar.f2978d, aVar.f2979e, aVar.f2980f);
                    this.f2723t.b1(fragment);
                    break;
                case 4:
                    fragment.z1(aVar.f2977c, aVar.f2978d, aVar.f2979e, aVar.f2980f);
                    this.f2723t.C0(fragment);
                    break;
                case 5:
                    fragment.z1(aVar.f2977c, aVar.f2978d, aVar.f2979e, aVar.f2980f);
                    this.f2723t.i1(fragment, false);
                    this.f2723t.m1(fragment);
                    break;
                case 6:
                    fragment.z1(aVar.f2977c, aVar.f2978d, aVar.f2979e, aVar.f2980f);
                    this.f2723t.x(fragment);
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    fragment.z1(aVar.f2977c, aVar.f2978d, aVar.f2979e, aVar.f2980f);
                    this.f2723t.i1(fragment, false);
                    this.f2723t.k(fragment);
                    break;
                case 8:
                    this.f2723t.k1(fragment);
                    break;
                case 9:
                    this.f2723t.k1(null);
                    break;
                case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                    this.f2723t.j1(fragment, aVar.f2982h);
                    break;
            }
            if (!this.f2973r && aVar.f2975a != 1 && fragment != null && !m.P) {
                this.f2723t.N0(fragment);
            }
        }
        if (this.f2973r || m.P) {
            return;
        }
        m mVar = this.f2723t;
        mVar.O0(mVar.f2883q, true);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2725v >= 0) {
            sb2.append(" #");
            sb2.append(this.f2725v);
        }
        if (this.f2966k != null) {
            sb2.append(" ");
            sb2.append(this.f2966k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    void u(boolean z10) {
        for (int size = this.f2958c.size() - 1; size >= 0; size--) {
            v.a aVar = (v.a) this.f2958c.get(size);
            Fragment fragment = aVar.f2976b;
            if (fragment != null) {
                fragment.G1(true);
                fragment.E1(m.f1(this.f2963h));
                fragment.I1(this.f2972q, this.f2971p);
            }
            switch (aVar.f2975a) {
                case 1:
                    fragment.z1(aVar.f2977c, aVar.f2978d, aVar.f2979e, aVar.f2980f);
                    this.f2723t.i1(fragment, true);
                    this.f2723t.b1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2975a);
                case 3:
                    fragment.z1(aVar.f2977c, aVar.f2978d, aVar.f2979e, aVar.f2980f);
                    this.f2723t.g(fragment);
                    break;
                case 4:
                    fragment.z1(aVar.f2977c, aVar.f2978d, aVar.f2979e, aVar.f2980f);
                    this.f2723t.m1(fragment);
                    break;
                case 5:
                    fragment.z1(aVar.f2977c, aVar.f2978d, aVar.f2979e, aVar.f2980f);
                    this.f2723t.i1(fragment, true);
                    this.f2723t.C0(fragment);
                    break;
                case 6:
                    fragment.z1(aVar.f2977c, aVar.f2978d, aVar.f2979e, aVar.f2980f);
                    this.f2723t.k(fragment);
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    fragment.z1(aVar.f2977c, aVar.f2978d, aVar.f2979e, aVar.f2980f);
                    this.f2723t.i1(fragment, true);
                    this.f2723t.x(fragment);
                    break;
                case 8:
                    this.f2723t.k1(null);
                    break;
                case 9:
                    this.f2723t.k1(fragment);
                    break;
                case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                    this.f2723t.j1(fragment, aVar.f2981g);
                    break;
            }
            if (!this.f2973r && aVar.f2975a != 3 && fragment != null && !m.P) {
                this.f2723t.N0(fragment);
            }
        }
        if (this.f2973r || !z10 || m.P) {
            return;
        }
        m mVar = this.f2723t;
        mVar.O0(mVar.f2883q, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.Fragment v(java.util.ArrayList r17, androidx.fragment.app.Fragment r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList r5 = r0.f2958c
            int r5 = r5.size()
            if (r4 >= r5) goto Lba
            java.util.ArrayList r5 = r0.f2958c
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.v$a r5 = (androidx.fragment.app.v.a) r5
            int r6 = r5.f2975a
            r7 = 0
            r8 = 1
            if (r6 == r8) goto Lb2
            r9 = 2
            r10 = 3
            r11 = 9
            if (r6 == r9) goto L58
            if (r6 == r10) goto L41
            r9 = 6
            if (r6 == r9) goto L41
            r7 = 7
            if (r6 == r7) goto Lb2
            r7 = 8
            if (r6 == r7) goto L31
            goto Lb7
        L31:
            java.util.ArrayList r6 = r0.f2958c
            androidx.fragment.app.v$a r7 = new androidx.fragment.app.v$a
            r7.<init>(r11, r3)
            r6.add(r4, r7)
            int r4 = r4 + 1
            androidx.fragment.app.Fragment r3 = r5.f2976b
            goto Lb7
        L41:
            androidx.fragment.app.Fragment r6 = r5.f2976b
            r1.remove(r6)
            androidx.fragment.app.Fragment r5 = r5.f2976b
            if (r5 != r3) goto Lb7
            java.util.ArrayList r3 = r0.f2958c
            androidx.fragment.app.v$a r6 = new androidx.fragment.app.v$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r7
            goto Lb7
        L58:
            androidx.fragment.app.Fragment r6 = r5.f2976b
            int r9 = r6.J
            int r12 = r17.size()
            int r12 = r12 - r8
            r13 = 0
        L62:
            if (r12 < 0) goto La2
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r15 = r14.J
            if (r15 != r9) goto L9f
            if (r14 != r6) goto L72
            r13 = r8
            goto L9f
        L72:
            if (r14 != r3) goto L81
            java.util.ArrayList r3 = r0.f2958c
            androidx.fragment.app.v$a r15 = new androidx.fragment.app.v$a
            r15.<init>(r11, r14)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r7
        L81:
            androidx.fragment.app.v$a r15 = new androidx.fragment.app.v$a
            r15.<init>(r10, r14)
            int r2 = r5.f2977c
            r15.f2977c = r2
            int r2 = r5.f2979e
            r15.f2979e = r2
            int r2 = r5.f2978d
            r15.f2978d = r2
            int r2 = r5.f2980f
            r15.f2980f = r2
            java.util.ArrayList r2 = r0.f2958c
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r8
        L9f:
            int r12 = r12 + (-1)
            goto L62
        La2:
            if (r13 == 0) goto Lac
            java.util.ArrayList r2 = r0.f2958c
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lb7
        Lac:
            r5.f2975a = r8
            r1.add(r6)
            goto Lb7
        Lb2:
            androidx.fragment.app.Fragment r2 = r5.f2976b
            r1.add(r2)
        Lb7:
            int r4 = r4 + r8
            goto L7
        Lba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.v(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    public String w() {
        return this.f2966k;
    }

    boolean x(int i10) {
        int size = this.f2958c.size();
        for (int i11 = 0; i11 < size; i11++) {
            Fragment fragment = ((v.a) this.f2958c.get(i11)).f2976b;
            int i12 = fragment != null ? fragment.J : 0;
            if (i12 != 0 && i12 == i10) {
                return true;
            }
        }
        return false;
    }

    boolean y(ArrayList arrayList, int i10, int i11) {
        if (i11 == i10) {
            return false;
        }
        int size = this.f2958c.size();
        int i12 = -1;
        for (int i13 = 0; i13 < size; i13++) {
            Fragment fragment = ((v.a) this.f2958c.get(i13)).f2976b;
            int i14 = fragment != null ? fragment.J : 0;
            if (i14 != 0 && i14 != i12) {
                for (int i15 = i10; i15 < i11; i15++) {
                    a aVar = (a) arrayList.get(i15);
                    int size2 = aVar.f2958c.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        Fragment fragment2 = ((v.a) aVar.f2958c.get(i16)).f2976b;
                        if ((fragment2 != null ? fragment2.J : 0) == i14) {
                            return true;
                        }
                    }
                }
                i12 = i14;
            }
        }
        return false;
    }
}
