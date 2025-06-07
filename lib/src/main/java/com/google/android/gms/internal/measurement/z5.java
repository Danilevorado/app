package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* loaded from: classes.dex */
public final class z5 {

    /* renamed from: a, reason: collision with root package name */
    private final q.g f19424a;

    z5(q.g gVar) {
        this.f19424a = gVar;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        q.g gVar = (q.g) this.f19424a.get(uri.toString());
        if (gVar == null) {
            return null;
        }
        return (String) gVar.get("".concat(String.valueOf(str3)));
    }
}
