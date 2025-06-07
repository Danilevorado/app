package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.d;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final View.AccessibilityDelegate f2368c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    private final View.AccessibilityDelegate f2369a;

    /* renamed from: b, reason: collision with root package name */
    private final View.AccessibilityDelegate f2370b;

    /* renamed from: androidx.core.view.a$a, reason: collision with other inner class name */
    static final class C0033a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        final a f2371a;

        C0033a(a aVar) {
            this.f2371a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2371a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            androidx.core.view.accessibility.e eVarB = this.f2371a.b(view);
            if (eVarB != null) {
                return (AccessibilityNodeProvider) eVarB.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2371a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            androidx.core.view.accessibility.d dVarX0 = androidx.core.view.accessibility.d.x0(accessibilityNodeInfo);
            dVarX0.o0(w.V(view));
            dVarX0.g0(w.Q(view));
            dVarX0.l0(w.p(view));
            dVarX0.s0(w.I(view));
            this.f2371a.g(view, dVarX0);
            dVarX0.e(accessibilityNodeInfo.getText(), view);
            List listC = a.c(view);
            for (int i10 = 0; i10 < listC.size(); i10++) {
                dVarX0.b((d.a) listC.get(i10));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2371a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2371a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f2371a.j(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            this.f2371a.l(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2371a.m(view, accessibilityEvent);
        }
    }

    static class b {
        static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i10, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i10, bundle);
        }
    }

    public a() {
        this(f2368c);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2369a = accessibilityDelegate;
        this.f2370b = new C0033a(this);
    }

    static List c(View view) {
        List list = (List) view.getTag(y.c.H);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrP = androidx.core.view.accessibility.d.p(view.createAccessibilityNodeInfo().getText());
            for (int i10 = 0; clickableSpanArrP != null && i10 < clickableSpanArrP.length; i10++) {
                if (clickableSpan.equals(clickableSpanArrP[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(y.c.I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2369a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public androidx.core.view.accessibility.e b(View view) {
        AccessibilityNodeProvider accessibilityNodeProviderA = b.a(this.f2369a, view);
        if (accessibilityNodeProviderA != null) {
            return new androidx.core.view.accessibility.e(accessibilityNodeProviderA);
        }
        return null;
    }

    View.AccessibilityDelegate d() {
        return this.f2370b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f2369a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, androidx.core.view.accessibility.d dVar) {
        this.f2369a.onInitializeAccessibilityNodeInfo(view, dVar.w0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f2369a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2369a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i10, Bundle bundle) {
        List listC = c(view);
        boolean zB = false;
        int i11 = 0;
        while (true) {
            if (i11 >= listC.size()) {
                break;
            }
            d.a aVar = (d.a) listC.get(i11);
            if (aVar.b() == i10) {
                zB = aVar.d(view, bundle);
                break;
            }
            i11++;
        }
        if (!zB) {
            zB = b.b(this.f2369a, view, i10, bundle);
        }
        return (zB || i10 != y.c.f28380a || bundle == null) ? zB : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i10) {
        this.f2369a.sendAccessibilityEvent(view, i10);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f2369a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
