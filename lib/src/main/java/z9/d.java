package z9;

import android.os.Bundle;

/* loaded from: classes2.dex */
abstract class d implements b {
    d() {
    }

    @Override // z9.b
    public final boolean a(Bundle bundle) {
        if (g8.e.e(bundle)) {
            return b(bundle, g8.e.s(bundle));
        }
        return false;
    }

    protected abstract boolean b(Bundle bundle, String str);
}
