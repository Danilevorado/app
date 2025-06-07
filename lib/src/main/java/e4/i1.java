package e4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: f, reason: collision with root package name */
    private static final Uri f23169f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    private final String f23170a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23171b;

    /* renamed from: c, reason: collision with root package name */
    private final ComponentName f23172c;

    /* renamed from: d, reason: collision with root package name */
    private final int f23173d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f23174e;

    public i1(String str, String str2, int i10, boolean z10) {
        p.f(str);
        this.f23170a = str;
        p.f(str2);
        this.f23171b = str2;
        this.f23172c = null;
        this.f23173d = 4225;
        this.f23174e = z10;
    }

    public final ComponentName a() {
        return this.f23172c;
    }

    public final Intent b(Context context) {
        Bundle bundleCall;
        if (this.f23170a == null) {
            return new Intent().setComponent(this.f23172c);
        }
        if (this.f23174e) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", this.f23170a);
            try {
                bundleCall = context.getContentResolver().call(f23169f, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e5) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e5.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f23170a)));
            }
        }
        return intent == null ? new Intent(this.f23170a).setPackage(this.f23171b) : intent;
    }

    public final String c() {
        return this.f23171b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return o.a(this.f23170a, i1Var.f23170a) && o.a(this.f23171b, i1Var.f23171b) && o.a(this.f23172c, i1Var.f23172c) && this.f23174e == i1Var.f23174e;
    }

    public final int hashCode() {
        return o.b(this.f23170a, this.f23171b, this.f23172c, 4225, Boolean.valueOf(this.f23174e));
    }

    public final String toString() {
        String str = this.f23170a;
        if (str != null) {
            return str;
        }
        p.l(this.f23172c);
        return this.f23172c.flattenToString();
    }
}
