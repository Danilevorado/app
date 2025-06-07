package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* loaded from: classes.dex */
public abstract class i6 {

    /* renamed from: a, reason: collision with root package name */
    private static final q.a f19004a = new q.a();

    public static synchronized Uri a(String str) {
        q.a aVar = f19004a;
        Uri uri = (Uri) aVar.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        aVar.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
