package w4;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.u2;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final u2 f27939a;

    public a(u2 u2Var) {
        this.f27939a = u2Var;
    }

    public static a k(Context context, String str, String str2, String str3, Bundle bundle) {
        return u2.s(context, str, str2, str3, bundle).p();
    }

    public void a(String str) {
        this.f27939a.E(str);
    }

    public void b(String str, String str2, Bundle bundle) {
        this.f27939a.F(str, str2, bundle);
    }

    public void c(String str) {
        this.f27939a.G(str);
    }

    public long d() {
        return this.f27939a.n();
    }

    public String e() {
        return this.f27939a.u();
    }

    public String f() {
        return this.f27939a.v();
    }

    public List g(String str, String str2) {
        return this.f27939a.z(str, str2);
    }

    public String h() {
        return this.f27939a.w();
    }

    public String i() {
        return this.f27939a.x();
    }

    public String j() {
        return this.f27939a.y();
    }

    public int l(String str) {
        return this.f27939a.m(str);
    }

    public Map m(String str, String str2, boolean z10) {
        return this.f27939a.A(str, str2, z10);
    }

    public void n(String str, String str2, Bundle bundle) {
        this.f27939a.H(str, str2, bundle);
    }

    public void o(Bundle bundle) {
        this.f27939a.o(bundle, false);
    }

    public Bundle p(Bundle bundle) {
        return this.f27939a.o(bundle, true);
    }

    public void q(Bundle bundle) {
        this.f27939a.b(bundle);
    }

    public void r(Bundle bundle) {
        this.f27939a.c(bundle);
    }

    public void s(Activity activity, String str, String str2) {
        this.f27939a.d(activity, str, str2);
    }

    public void t(String str, String str2, Object obj) {
        this.f27939a.e(str, str2, obj, true);
    }
}
