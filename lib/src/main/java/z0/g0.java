package z0;

import android.view.View;
import android.view.WindowId;

/* loaded from: classes.dex */
class g0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    private final WindowId f28699a;

    g0(View view) {
        this.f28699a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof g0) && ((g0) obj).f28699a.equals(this.f28699a);
    }

    public int hashCode() {
        return this.f28699a.hashCode();
    }
}
