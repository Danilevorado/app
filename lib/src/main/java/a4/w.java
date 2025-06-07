package a4;

import android.os.Bundle;

/* loaded from: classes.dex */
final class w extends u {
    w(int i10, int i11, Bundle bundle) {
        super(i10, 1, bundle);
    }

    @Override // a4.u
    final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // a4.u
    final boolean b() {
        return false;
    }
}
