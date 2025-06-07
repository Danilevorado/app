package e;

import android.content.Context;
import android.content.Intent;
import e.a;
import rb.h;

/* loaded from: classes.dex */
public final class c extends a {
    @Override // e.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String str) {
        h.e(context, "context");
        h.e(str, "input");
        return b.f23002a.a(new String[]{str});
    }

    @Override // e.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public a.C0121a b(Context context, String str) {
        h.e(context, "context");
        h.e(str, "input");
        if (androidx.core.content.a.a(context, str) == 0) {
            return new a.C0121a(Boolean.TRUE);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0026  */
    @Override // e.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Boolean c(int r5, android.content.Intent r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L2c
            r0 = -1
            if (r5 == r0) goto L6
            goto L2c
        L6:
            java.lang.String r5 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
            int[] r5 = r6.getIntArrayExtra(r5)
            r6 = 1
            r0 = 0
            if (r5 == 0) goto L26
            int r1 = r5.length
            r2 = r0
        L12:
            if (r2 >= r1) goto L22
            r3 = r5[r2]
            if (r3 != 0) goto L1a
            r3 = r6
            goto L1b
        L1a:
            r3 = r0
        L1b:
            if (r3 == 0) goto L1f
            r5 = r6
            goto L23
        L1f:
            int r2 = r2 + 1
            goto L12
        L22:
            r5 = r0
        L23:
            if (r5 != r6) goto L26
            goto L27
        L26:
            r6 = r0
        L27:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            return r5
        L2c:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.c(int, android.content.Intent):java.lang.Boolean");
    }
}
