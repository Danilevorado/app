package l3;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.nk0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f25075a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup.LayoutParams f25076b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f25077c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f25078d;

    public n(nk0 nk0Var) throws l {
        this.f25076b = nk0Var.getLayoutParams();
        ViewParent parent = nk0Var.getParent();
        this.f25078d = nk0Var.E();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new l("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f25077c = viewGroup;
        this.f25075a = viewGroup.indexOfChild(nk0Var.z());
        viewGroup.removeView(nk0Var.z());
        nk0Var.b1(true);
    }
}
