package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f961m = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z0 z0VarU = z0.u(context, attributeSet, f961m);
        setBackgroundDrawable(z0VarU.g(0));
        z0VarU.w();
    }
}
