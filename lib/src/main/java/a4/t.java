package a4;

import android.os.Bundle;

/* loaded from: classes.dex */
final class t extends u {
    t(int i10, int i11, Bundle bundle) {
        super(i10, 2, bundle);
    }

    @Override // a4.u
    final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new v(4, "Invalid response to one way request", null));
        }
    }

    @Override // a4.u
    final boolean b() {
        return true;
    }
}
