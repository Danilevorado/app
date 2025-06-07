package com.onesignal;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import com.onesignal.a;
import com.onesignal.e3;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
class s2 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f22404b = "com.onesignal.s2";

    /* renamed from: a, reason: collision with root package name */
    private final c f22405a;

    class a extends m.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.m f22406a;

        a(androidx.fragment.app.m mVar) {
            this.f22406a = mVar;
        }

        @Override // androidx.fragment.app.m.l
        public void e(androidx.fragment.app.m mVar, Fragment fragment) {
            super.e(mVar, fragment);
            if (fragment instanceof androidx.fragment.app.d) {
                this.f22406a.o1(this);
                s2.this.f22405a.c();
            }
        }
    }

    interface b {
        void a(String str, a.c cVar);
    }

    interface c {
        void c();
    }

    s2(c cVar) {
        this.f22405a = cVar;
    }

    boolean b(Context context) {
        if (!(context instanceof androidx.appcompat.app.c)) {
            return false;
        }
        androidx.fragment.app.m mVarH = ((androidx.appcompat.app.c) context).H();
        mVarH.Z0(new a(mVarH), true);
        List listS0 = mVarH.s0();
        int size = listS0.size();
        if (size <= 0) {
            return false;
        }
        Fragment fragment = (Fragment) listS0.get(size - 1);
        return fragment.l0() && (fragment instanceof androidx.fragment.app.d);
    }

    boolean c() {
        if (e3.T() == null) {
            e3.i1(e3.z.WARN, "OSSystemConditionObserver curActivity null");
            return false;
        }
        try {
            if (b(e3.T())) {
                e3.i1(e3.z.WARN, "OSSystemConditionObserver dialog fragment detected");
                return false;
            }
        } catch (NoClassDefFoundError e5) {
            e3.i1(e3.z.INFO, "AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: " + e5);
        }
        com.onesignal.a aVarB = com.onesignal.b.b();
        boolean zJ = b3.j(new WeakReference(e3.T()));
        if (zJ && aVarB != null) {
            aVarB.d(f22404b, this.f22405a);
            e3.i1(e3.z.WARN, "OSSystemConditionObserver keyboard up detected");
        }
        return !zJ;
    }
}
