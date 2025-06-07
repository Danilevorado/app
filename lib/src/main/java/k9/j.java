package k9;

/* loaded from: classes2.dex */
public abstract class j {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.Class r5, android.content.Context r6, java.lang.String[] r7) {
        /*
            r0 = 0
            int r1 = r7.length     // Catch: java.lang.Exception -> L19
            r2 = r0
            r3 = r2
        L4:
            if (r2 >= r1) goto L21
            r4 = r7[r2]     // Catch: java.lang.Exception -> L17
            if (r3 != 0) goto L13
            int r3 = androidx.core.content.a.a(r6, r4)     // Catch: java.lang.Exception -> L17
            if (r3 == 0) goto L11
            goto L13
        L11:
            r3 = r0
            goto L14
        L13:
            r3 = 1
        L14:
            int r2 = r2 + 1
            goto L4
        L17:
            r0 = move-exception
            goto L1c
        L19:
            r1 = move-exception
            r3 = r0
            r0 = r1
        L1c:
            java.lang.String r1 = "an error occurred while trying to requestPermissions"
            k9.h.n(r1, r0)
        L21:
            if (r3 == 0) goto L3c
            java.lang.String r0 = "RequestPermissionHelper"
            java.lang.String r1 = "Request permissions"
            k9.h.h(r0, r1)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r6, r5)
            r5 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r5)
            java.lang.String r5 = "extra_permissions"
            r0.putExtra(r5, r7)
            r6.startActivity(r0)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.j.a(java.lang.Class, android.content.Context, java.lang.String[]):void");
    }
}
