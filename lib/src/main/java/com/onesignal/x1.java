package com.onesignal;

import android.content.Context;
import android.net.Uri;
import java.security.SecureRandom;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class x1 {

    /* renamed from: a, reason: collision with root package name */
    private s1 f22504a;

    /* renamed from: b, reason: collision with root package name */
    private Context f22505b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f22506c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f22507d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f22508e;

    /* renamed from: f, reason: collision with root package name */
    private Long f22509f;

    /* renamed from: g, reason: collision with root package name */
    private CharSequence f22510g;

    /* renamed from: h, reason: collision with root package name */
    private CharSequence f22511h;

    /* renamed from: i, reason: collision with root package name */
    private Uri f22512i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f22513j;

    /* renamed from: k, reason: collision with root package name */
    private Integer f22514k;

    /* renamed from: l, reason: collision with root package name */
    private Uri f22515l;

    x1(Context context) {
        this.f22505b = context;
    }

    x1(Context context, s1 s1Var, JSONObject jSONObject) {
        this.f22505b = context;
        this.f22506c = jSONObject;
        r(s1Var);
    }

    x1(Context context, JSONObject jSONObject) {
        this(context, new s1(jSONObject), jSONObject);
    }

    Integer a() {
        return Integer.valueOf(this.f22504a.e());
    }

    String b() {
        return e3.k0(this.f22506c);
    }

    CharSequence c() {
        CharSequence charSequence = this.f22510g;
        return charSequence != null ? charSequence : this.f22504a.f();
    }

    public Context d() {
        return this.f22505b;
    }

    public JSONObject e() {
        return this.f22506c;
    }

    public s1 f() {
        return this.f22504a;
    }

    public Uri g() {
        return this.f22515l;
    }

    public Integer h() {
        return this.f22513j;
    }

    public Uri i() {
        return this.f22512i;
    }

    public Long j() {
        return this.f22509f;
    }

    CharSequence k() {
        CharSequence charSequence = this.f22511h;
        return charSequence != null ? charSequence : this.f22504a.m();
    }

    boolean l() {
        return this.f22504a.h() != null;
    }

    boolean m() {
        return this.f22508e;
    }

    public boolean n() {
        return this.f22507d;
    }

    public void o(Context context) {
        this.f22505b = context;
    }

    void p(boolean z10) {
        this.f22508e = z10;
    }

    public void q(JSONObject jSONObject) {
        this.f22506c = jSONObject;
    }

    public void r(s1 s1Var) {
        if (s1Var != null && !s1Var.o()) {
            s1 s1Var2 = this.f22504a;
            s1Var.t((s1Var2 == null || !s1Var2.o()) ? new SecureRandom().nextInt() : this.f22504a.e());
        }
        this.f22504a = s1Var;
    }

    public void s(Integer num) {
        this.f22514k = num;
    }

    public void t(Uri uri) {
        this.f22515l = uri;
    }

    public String toString() {
        return "OSNotificationGenerationJob{jsonPayload=" + this.f22506c + ", isRestoring=" + this.f22507d + ", isNotificationToDisplay=" + this.f22508e + ", shownTimeStamp=" + this.f22509f + ", overriddenBodyFromExtender=" + ((Object) this.f22510g) + ", overriddenTitleFromExtender=" + ((Object) this.f22511h) + ", overriddenSound=" + this.f22512i + ", overriddenFlags=" + this.f22513j + ", orgFlags=" + this.f22514k + ", orgSound=" + this.f22515l + ", notification=" + this.f22504a + '}';
    }

    public void u(CharSequence charSequence) {
        this.f22510g = charSequence;
    }

    public void v(Integer num) {
        this.f22513j = num;
    }

    public void w(Uri uri) {
        this.f22512i = uri;
    }

    public void x(CharSequence charSequence) {
        this.f22511h = charSequence;
    }

    public void y(boolean z10) {
        this.f22507d = z10;
    }

    public void z(Long l10) {
        this.f22509f = l10;
    }
}
