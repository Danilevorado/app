package com.pushwoosh.internal.utils;

import a9.i;
import a9.l;
import k9.h;

/* loaded from: classes2.dex */
public class NotificationPermissionActivity extends PermissionActivity {
    @Override // com.pushwoosh.internal.utils.PermissionActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        h.h("PermissionActivity", "onRequestPermissionsResult");
        if (i10 != 1) {
            h.x("PermissionActivity", "Unrecognized request code " + i10);
        } else {
            PermissionActivity.a(strArr, iArr);
            i.e(new l(PermissionActivity.f22629m, PermissionActivity.f22630n));
        }
        finish();
    }
}
