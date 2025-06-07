package com.onesignal;

import com.onesignal.e3;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class n1 {

    /* renamed from: a, reason: collision with root package name */
    private long f22114a;

    /* renamed from: b, reason: collision with root package name */
    private int f22115b;

    /* renamed from: c, reason: collision with root package name */
    private int f22116c;

    /* renamed from: d, reason: collision with root package name */
    private long f22117d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f22118e;

    n1() {
        this.f22114a = -1L;
        this.f22115b = 0;
        this.f22116c = 1;
        this.f22117d = 0L;
        this.f22118e = false;
    }

    n1(int i10, long j10) {
        this.f22116c = 1;
        this.f22117d = 0L;
        this.f22118e = false;
        this.f22115b = i10;
        this.f22114a = j10;
    }

    n1(JSONObject jSONObject) throws JSONException {
        long jIntValue;
        this.f22114a = -1L;
        this.f22115b = 0;
        this.f22116c = 1;
        this.f22117d = 0L;
        this.f22118e = true;
        Object obj = jSONObject.get("limit");
        Object obj2 = jSONObject.get("delay");
        if (obj instanceof Integer) {
            this.f22116c = ((Integer) obj).intValue();
        }
        if (obj2 instanceof Long) {
            jIntValue = ((Long) obj2).longValue();
        } else if (!(obj2 instanceof Integer)) {
            return;
        } else {
            jIntValue = ((Integer) obj2).intValue();
        }
        this.f22117d = jIntValue;
    }

    int a() {
        return this.f22115b;
    }

    long b() {
        return this.f22114a;
    }

    void c() {
        this.f22115b++;
    }

    boolean d() {
        if (this.f22114a < 0) {
            return true;
        }
        long jB = e3.B0().b() / 1000;
        long j10 = jB - this.f22114a;
        e3.a(e3.z.DEBUG, "OSInAppMessage lastDisplayTime: " + this.f22114a + " currentTimeInSeconds: " + jB + " diffInSeconds: " + j10 + " displayDelay: " + this.f22117d);
        return j10 >= this.f22117d;
    }

    public boolean e() {
        return this.f22118e;
    }

    void f(int i10) {
        this.f22115b = i10;
    }

    void g(n1 n1Var) {
        h(n1Var.b());
        f(n1Var.a());
    }

    void h(long j10) {
        this.f22114a = j10;
    }

    boolean i() {
        boolean z10 = this.f22115b < this.f22116c;
        e3.a(e3.z.DEBUG, "OSInAppMessage shouldDisplayAgain: " + z10);
        return z10;
    }

    public String toString() {
        return "OSInAppMessageDisplayStats{lastDisplayTime=" + this.f22114a + ", displayQuantity=" + this.f22115b + ", displayLimit=" + this.f22116c + ", displayDelay=" + this.f22117d + '}';
    }
}
