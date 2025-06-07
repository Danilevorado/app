package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class i3 extends s3 {
    i3(int i10) {
        super(i10, null);
    }

    @Override // com.google.android.gms.internal.play_billing.s3
    public final void a() {
        if (!j()) {
            for (int i10 = 0; i10 < b(); i10++) {
                Map.Entry entryG = g(i10);
                if (((g1) entryG.getKey()).h()) {
                    entryG.setValue(Collections.unmodifiableList((List) entryG.getValue()));
                }
            }
            for (Map.Entry entry : c()) {
                if (((g1) entry.getKey()).h()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
