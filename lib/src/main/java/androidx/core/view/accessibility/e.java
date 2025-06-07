package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2408a;

    static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        final e f2409a;

        a(e eVar) {
            this.f2409a = eVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            d dVarB = this.f2409a.b(i10);
            if (dVarB == null) {
                return null;
            }
            return dVarB.w0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i10) {
            List listC = this.f2409a.c(str, i10);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(((d) listC.get(i11)).w0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f2409a.f(i10, i11, bundle);
        }
    }

    static class b extends a {
        b(e eVar) {
            super(eVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            d dVarD = this.f2409a.d(i10);
            if (dVarD == null) {
                return null;
            }
            return dVarD.w0();
        }
    }

    static class c extends b {
        c(e eVar) {
            super(eVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f2409a.a(i10, d.x0(accessibilityNodeInfo), str, bundle);
        }
    }

    public e() {
        this.f2408a = Build.VERSION.SDK_INT >= 26 ? new c(this) : new b(this);
    }

    public e(Object obj) {
        this.f2408a = obj;
    }

    public void a(int i10, d dVar, String str, Bundle bundle) {
    }

    public d b(int i10) {
        return null;
    }

    public List c(String str, int i10) {
        return null;
    }

    public d d(int i10) {
        return null;
    }

    public Object e() {
        return this.f2408a;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }
}
