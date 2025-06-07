package z9;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes2.dex */
class e extends d {

    /* renamed from: a, reason: collision with root package name */
    private final ka.d f28923a = ka.e.f();

    e() {
    }

    @Override // z9.d
    protected boolean b(Bundle bundle, String str) {
        if (!TextUtils.equals("setLogLevel", str)) {
            return false;
        }
        this.f28923a.q().b(g8.e.H(bundle));
        return true;
    }
}
