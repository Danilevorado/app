package l3;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
final class m extends RelativeLayout {

    /* renamed from: m, reason: collision with root package name */
    final m3.t f25073m;

    /* renamed from: n, reason: collision with root package name */
    boolean f25074n;

    public m(Context context, String str, String str2, String str3) {
        super(context);
        m3.t tVar = new m3.t(context, str);
        this.f25073m = tVar;
        tVar.o(str2);
        tVar.n(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f25074n) {
            return false;
        }
        this.f25073m.m(motionEvent);
        return false;
    }
}
