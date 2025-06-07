package com.pushwoosh.internal.utils;

import a9.i;
import a9.m;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.b;
import java.util.ArrayList;
import java.util.List;
import k9.h;
import k9.k;

/* loaded from: classes2.dex */
public class PermissionActivity extends k {

    /* renamed from: m, reason: collision with root package name */
    public static List f22629m;

    /* renamed from: n, reason: collision with root package name */
    public static List f22630n;

    public static void a(String[] strArr, int[] iArr) {
        List list;
        String str;
        f22629m = new ArrayList();
        f22630n = new ArrayList();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (iArr.length <= i10 || iArr[i10] != 0) {
                list = f22630n;
                str = strArr[i10];
            } else {
                list = f22629m;
                str = strArr[i10];
            }
            list.add(str);
        }
    }

    @Override // k9.k, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String[] strArr = (String[]) intent.getCharSequenceArrayExtra("extra_permissions");
        if (strArr == null) {
            finish();
        } else {
            b.r(this, strArr, 1);
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        h.h("PermissionActivity", "onRequestPermissionsResult");
        if (i10 != 1) {
            h.x("PermissionActivity", "Unrecognized request code " + i10);
        } else {
            a(strArr, iArr);
            i.e(new m(f22629m, f22630n));
        }
        finish();
    }
}
