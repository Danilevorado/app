package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class bg {

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f6461d = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a, reason: collision with root package name */
    private final String f6462a = "ad.doubleclick.net";

    /* renamed from: b, reason: collision with root package name */
    private final String[] f6463b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: c, reason: collision with root package name */
    private final xf f6464c;

    public bg(xf xfVar) {
        this.f6464c = xfVar;
    }

    private final Uri g(Uri uri, String str) throws cg {
        String str2;
        Objects.requireNonNull(uri);
        try {
            try {
                if (uri.getHost().equals(this.f6462a)) {
                    if (uri.toString().contains("dc_ms=")) {
                        throw new cg("Parameter already exists: dc_ms");
                    }
                    String string = uri.toString();
                    int iIndexOf = string.indexOf(";adurl");
                    if (iIndexOf != -1) {
                        int i10 = iIndexOf + 1;
                        str2 = string.substring(0, i10) + "dc_ms=" + str + ";" + string.substring(i10);
                    } else {
                        String encodedPath = uri.getEncodedPath();
                        int iIndexOf2 = string.indexOf(encodedPath);
                        str2 = string.substring(0, encodedPath.length() + iIndexOf2) + ";dc_ms=" + str + ";" + string.substring(iIndexOf2 + encodedPath.length());
                    }
                    return Uri.parse(str2);
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new cg("Query parameter already exists: ms");
            }
            String string2 = uri.toString();
            int iIndexOf3 = string2.indexOf("&adurl");
            if (iIndexOf3 == -1) {
                iIndexOf3 = string2.indexOf("?adurl");
            }
            if (iIndexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i11 = iIndexOf3 + 1;
            return Uri.parse(string2.substring(0, i11) + "ms=" + str + "&" + string2.substring(i11));
        } catch (UnsupportedOperationException unused2) {
            throw new cg("Provided Uri is not in a valid state");
        }
    }

    public final Uri a(Uri uri, Context context, View view, Activity activity) throws cg {
        try {
            return g(uri, this.f6464c.h(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new cg("Provided Uri is not in a valid state");
        }
    }

    public final Uri b(Uri uri, Context context) {
        return g(uri, this.f6464c.e(context));
    }

    public final xf c() {
        return this.f6464c;
    }

    public final void d(MotionEvent motionEvent) {
        this.f6464c.a(motionEvent);
    }

    public final boolean e(Uri uri) {
        if (f(uri)) {
            String[] strArr = f6461d;
            for (int i10 = 0; i10 < 3; i10++) {
                if (uri.getPath().endsWith(strArr[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f(Uri uri) {
        Objects.requireNonNull(uri);
        try {
            String host = uri.getHost();
            String[] strArr = this.f6463b;
            for (int i10 = 0; i10 < 3; i10++) {
                if (host.endsWith(strArr[i10])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
